package practica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EditordeTexto {

	public static void main(String[] args) {

		JFrame editor = new EditorFrame();
		
		editor.setVisible(true);

	}

}

class EditorFrame extends JFrame {
	
	public EditorFrame(){
		
		setTitle("Editor de Texto");
		
		setBounds(670,130,600,450);
		
		JPanel laminaEditor = new EditorPanel();
		
		add(laminaEditor);
	}
}

class EditorPanel extends JPanel {
	
	public EditorPanel(){
		
		area= new JTextPane();
		
		Font inicio = new Font("Serif", Font.PLAIN, 14);
		
		setLayout(new BorderLayout());
		
		JPanel MenuPanel = new JPanel();
		
		JMenuBar MenuBarra = new JMenuBar();
		
		//---------------------------------------------------------------
		fuente = new JMenu("Fuente");
		
		CrearOpcionMenu("Caladea", fuente ,"Caladea", inicio.getStyle(), inicio.getSize());
		CrearOpcionMenu("Calibri Light", fuente , "Calibri Light", inicio.getStyle(), inicio.getSize());
		CrearOpcionMenu("Comic Sans MS", fuente , "Comic Sans MS", inicio.getStyle(), inicio.getSize());
		CrearOpcionMenu("Ink Free", fuente , "Ink Free", inicio.getStyle(), inicio.getSize());
		CrearOpcionMenu("Noto Mono", fuente ,"Noto Mono", inicio.getStyle(), inicio.getSize());
		CrearOpcionMenu("Verdana", fuente ,"Verdana",  inicio.getStyle(), inicio.getSize());
		CrearOpcionMenu("Times New Roman", fuente , "Times New Roman", inicio.getStyle(), inicio.getSize());
		CrearOpcionMenu("Source Code Pro", fuente ,"Source Code Pro", inicio.getStyle(), inicio.getSize());
		
		//---------------------------------------------------------------
		estilo = new JMenu("Estilo");		
		
		CrearOpcionMenu("Negrita", estilo , inicio.getName(), Font.BOLD,   inicio.getSize());
		CrearOpcionMenu("Cursiva", estilo , inicio.getName(), Font.ITALIC, inicio.getSize());
	
		//---------------------------------------------------------------
		tamagno = new JMenu("Tamaño");
		
		CrearOpcionMenu("14", tamagno , inicio.getName(), inicio.getStyle(), 14);
		CrearOpcionMenu("18", tamagno , inicio.getName(), inicio.getStyle(), 18);
		CrearOpcionMenu("24", tamagno , inicio.getName(), inicio.getStyle(), 24);
		CrearOpcionMenu("28", tamagno , inicio.getName(), inicio.getStyle(), 28);
		CrearOpcionMenu("32", tamagno , inicio.getName(), inicio.getStyle(), 32);

		//---------------------------------------------------------------
		
		MenuBarra.add(fuente);
		
		MenuBarra.add(estilo);
		
		MenuBarra.add(tamagno);
		
		MenuPanel.add(MenuBarra);
		
		add(MenuPanel, BorderLayout.NORTH);
		
		area = new JTextPane();
		add(area, BorderLayout.CENTER);
		
	}
	
	private void CrearOpcionMenu(String nombre, JMenu menu, String tipoletra, int stilo, int tamano) {
		
		JMenuItem opcionMenu = new JMenuItem(nombre);
		menu.add(opcionMenu);
		String menupulsado = menu.getActionCommand();

		opcionMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
		
	
				if (menupulsado.equals("Fuente")) {
					area.setFont(new Font(tipoletra, area.getFont().getStyle(), area.getFont().getSize()));
				}
				else if (menupulsado.equals("Estilo")) {
					
					if (((area.getFont().getStyle() == Font.BOLD)&&(stilo == Font.ITALIC))||((area.getFont().getStyle() == Font.ITALIC)&&(stilo == Font.BOLD))) {
						area.setFont(new Font(area.getFont().getFamily(), 3, area.getFont().getSize()));
					
					}else if((area.getFont().getStyle() == 3)&&(stilo == Font.ITALIC)) {
						area.setFont(new Font(area.getFont().getFamily(), Font.BOLD, area.getFont().getSize()));
					
					}else if ((area.getFont().getStyle() == 3)&&(stilo == Font.BOLD)) {
						area.setFont(new Font(area.getFont().getFamily(), Font.ITALIC, area.getFont().getSize()));
					
					}else if((area.getFont().getStyle() == 2)&&(stilo == Font.ITALIC)) {
						area.setFont(new Font(area.getFont().getFamily(), Font.PLAIN, area.getFont().getSize()));
					
					}else if ((area.getFont().getStyle() == 1)&&(stilo == Font.BOLD)) {
						area.setFont(new Font(area.getFont().getFamily(), Font.PLAIN, area.getFont().getSize()));
					
					}else{
						area.setFont(new Font(area.getFont().getFamily(), stilo, area.getFont().getSize()));
					
					}
					
				}
				else if (menupulsado.equals("Tamaño")) {
					area.setFont(new Font(area.getFont().toString(), area.getFont().getStyle(), tamano));
				}
				System.out.println("La fuente es: " + area.getFont().getFamily() + ", " +  area.getFont().getStyle() + ", " +  area.getFont().getSize() );
			}
			
		});
		
	}
	
	private JTextPane area;
	private JMenu fuente, estilo, tamagno;
}