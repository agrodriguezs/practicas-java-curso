package practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;

public class EditorSeleccion {

	public static void main(String[] args) {
		JFrame editor = new EditorSeleccionFrame();
		
		editor.setVisible(true);
	}

}

class EditorSeleccionFrame extends JFrame {
	
	public EditorSeleccionFrame(){
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Image miIcono = mipantalla.getImage("src/practica/images/editar-texto.png");
		
		this.setIconImage(miIcono);
		
		setTitle("Editor de Seleccion del Texto");
		
		setBounds(670,130,600,450);
		
		JPanel laminaEditor = new EditorSeleccionPanel();
		
		add(laminaEditor);
		

	}
}

class EditorSeleccionPanel extends JPanel {
	
	public EditorSeleccionPanel(){
		
		area= new JTextPane();
		
	    JPopupMenu menuEmergente = new JPopupMenu();
		
		JMenuItem negritaE = new JMenuItem("Negrita", new ImageIcon("src/practica/images/negrita.png"));
		menuEmergente.add(negritaE);
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		
		JMenuItem cursivaE = new JMenuItem("Cursiva", new ImageIcon("src/practica/images/italico.png"));
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		menuEmergente.add(cursivaE);
		
		area.setComponentPopupMenu(menuEmergente);
		
		Font inicio = new Font("Serif", Font.PLAIN, 14);
		
		setLayout(new BorderLayout());
		
		JPanel MenuPanel = new JPanel();
		
		JMenuBar MenuBarra = new JMenuBar();
		
		tamano_letra = new ButtonGroup();
		
		tipo_letra = new ButtonGroup();
		
		//---------------------------------------------------------------
		fuente = new JMenu("Fuente");
		
		CrearOpcionMenu("Caladea", fuente ,"Caladea", inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Calibri Light", fuente , "Calibri Light", inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Comic Sans MS", fuente , "Comic Sans MS", inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Ink Free", fuente , "Ink Free", inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Noto Mono", fuente ,"Noto Mono", inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Verdana", fuente ,"Verdana",  inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Times New Roman", fuente , "Times New Roman", inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Source Code Pro", fuente ,"Source Code Pro", inicio.getStyle(), inicio.getSize(), " ", KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		
		//---------------------------------------------------------------
		estilo = new JMenu("Estilo");		
		
		CrearOpcionMenu("Negrita", estilo , inicio.getName(), Font.BOLD,   inicio.getSize(), "src/practica/images/negrita.png", KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("Cursiva", estilo , inicio.getName(), Font.ITALIC, inicio.getSize(), "src/practica/images/italico.png", KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
	
		//---------------------------------------------------------------
		tamagno = new JMenu("Tamaño");
		
		CrearOpcionMenu("14", tamagno , inicio.getName(), inicio.getStyle(), 14, " ", KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("18", tamagno , inicio.getName(), inicio.getStyle(), 18, " ", KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("24", tamagno , inicio.getName(), inicio.getStyle(), 24, " ", KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("28", tamagno , inicio.getName(), inicio.getStyle(), 28, " ", KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_DOWN_MASK));
		CrearOpcionMenu("32", tamagno , inicio.getName(), inicio.getStyle(), 32, " ", KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.CTRL_DOWN_MASK));

		//---------------------------------------------------------------
		
		MenuBarra.add(fuente);
		
		MenuBarra.add(estilo);
		
		MenuBarra.add(tamagno);
		
		MenuBarra.setSize(new Dimension(150,40));
		MenuPanel.add(MenuBarra);
		
		add(MenuPanel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		//--------------------------------
		//Creacion de Barra de Herramientas Lateral
		
		barra = new JToolBar();
		
		
		
		configuraBarra("src/practica/images/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
		
		configuraBarra("src/practica/images/italico.png").addActionListener(new StyledEditorKit.ItalicAction());
		
		configuraBarra("src/practica/images/subrayado.png").addActionListener(new StyledEditorKit.UnderlineAction());
		
		barra.addSeparator();
		
		configuraBarra("src/practica/images/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("IzqTexto", 0));
		
		configuraBarra("src/practica/images/centrado.png").addActionListener(new StyledEditorKit.AlignmentAction("CentrarTexto", 1));
		
		configuraBarra("src/practica/images/derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("derTexto", 2));
		
		configuraBarra("src/practica/images/justify.png").addActionListener(new StyledEditorKit.AlignmentAction("JustificarTexto", 3));
		
	
		barra.addSeparator();
		
		configuraBarra("src/practica/images/bolaazul.png").addActionListener(new StyledEditorKit.ForegroundAction("azulito", Color.BLUE));
		
		configuraBarra("src/practica/images/bolaroja.png").addActionListener(new StyledEditorKit.ForegroundAction("rojito", Color.RED));
		
		configuraBarra("src/practica/images/bolaamarilla.png").addActionListener(new StyledEditorKit.ForegroundAction("amarillito", Color.YELLOW));
		
		barra.setOrientation(1);
		
		add(barra, BorderLayout.WEST);
		
	}
	
	private JButton configuraBarra(String ruta) {
		
		JButton boton = new JButton(new ImageIcon(ruta));
		
		barra.add(boton);
		
		return boton;
		
	}
	
	private void CrearOpcionMenu(String nombre, JMenu menu, String tipoletra, int stilo, int tamano, String rutaIcono, KeyStroke conbinacionLetras ) {
		
		
		//opcionMenu.setMinimumSize(new Dimension(150,40));
		
		
		String menupulsado = menu.getText();
	//	System.out.println("mira " +menupulsado);
		
		if (menupulsado.equals("Fuente")) {
			JRadioButtonMenuItem opcionMenu1 = new JRadioButtonMenuItem(nombre, new ImageIcon(rutaIcono));
			//JMenuItem opcionMenu = new JMenuItem(nombre, new ImageIcon(rutaIcono));
			
			opcionMenu1.addActionListener(new StyledEditorKit.FontFamilyAction("cambiarLetra", tipoletra));
			
			opcionMenu1.setAccelerator(conbinacionLetras);
			
			tipo_letra.add(opcionMenu1);
			
			menu.add(opcionMenu1);
		}
		else if (menupulsado.equals("Estilo")) {
			
			JMenuItem opcionMenu2 = new JMenuItem(nombre, new ImageIcon(rutaIcono));
			
			if (stilo == Font.BOLD) {
				
				opcionMenu2.addActionListener(new StyledEditorKit.BoldAction());	
			
			}else if (stilo == Font.ITALIC) {
				
				opcionMenu2.addActionListener(new StyledEditorKit.ItalicAction());	
			}
			
			opcionMenu2.setAccelerator(conbinacionLetras);
			
			menu.add(opcionMenu2);
	
		}
		else if (menupulsado.equals("Tamaño")) {
			
			JRadioButtonMenuItem opcionMenu3 = new JRadioButtonMenuItem(nombre, new ImageIcon(rutaIcono));
			
			opcionMenu3.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamano", tamano));
			
			opcionMenu3.setAccelerator(conbinacionLetras);
			
			tamano_letra.add(opcionMenu3);
			
			menu.add(opcionMenu3);
			
		}
	}
	
	private JTextPane area;
	private JMenu fuente, estilo, tamagno;
	private JButton bcentro, bizq, bder, bjustify, bnegrita, bitalica, bsubrayado, bazul, bamarillo, brojo;
	private JToolBar barra;
	private ButtonGroup tamano_letra, tipo_letra;
}