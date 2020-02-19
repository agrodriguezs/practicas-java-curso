package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventosVentanas {

	public static void main(String[] args) {
		
		MarcoEventos mimarco = new MarcoEventos("ventana 1");
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	/*	MarcoEventos mimarco2 = new MarcoEventos("ventana 2");
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);*/
		
		mimarco.setBounds(200,200,500,300);
		
	//	mimarco2.setBounds(700,200,500,300);
		
		mimarco.setVisible(true);
		
	//	mimarco2.setVisible(true);

	}
}
class MarcoEventos extends JFrame  {
	
	private static final long serialVersionUID = 1L;

	public MarcoEventos(String nombre) {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		
		add(new LaminaEvento());
			
		
		setIconImage(miIcono);	
		
		setTitle(nombre);
			
		addWindowListener(new M_Ventana(nombre));
		addMouseListener(new M_Raton(nombre));
		addKeyListener(new M_Teclado(nombre));
		//addWindowStateListener(new CambiodeEstado());
		
		//addKeyListener(new CambioEstadoTeclado());
		
		//addMouseListener(new CambiodelRaton());
	}
 
}


class LaminaEvento extends JPanel  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		cajaTexto1 = new JTextField();
		cajaTexto2 = new JTextField();
		cajaTexto1.setBounds(10, 10, 200, 20);
		cajaTexto2.setBounds(10, 30, 200, 20);
		add(cajaTexto1);
		add(cajaTexto2);;
		cajaTexto1.addFocusListener(new EnFoco());
	}
	private class EnFoco implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("tengo el foco");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("perdi el foco");
			
			cajaTexto1 = (JTextField)e.getSource();
			String esmail = cajaTexto1.getText();
			boolean comprobacion = false;
			System.out.println(esmail);
			for (int i=0; i<esmail.length(); i++) {
				
				if (esmail.charAt(i) == '@') {
					
					comprobacion = true;
				}
			
			}
			System.out.println(esmail.length());
			if ((comprobacion == true )&& (esmail.length() != 0) ) {
				
				System.out.println("Esta correcto el email");
			}else if ((comprobacion == false )&& (esmail.length() != 0) ) {
			
				System.out.println("Esta incorrecto el email!!");
			}
	
		}
	
		
	}
	JTextField cajaTexto1; 
	JTextField cajaTexto2;
}

class CambiodeEstado implements WindowStateListener {

	public void windowStateChanged(WindowEvent e) {
	//	System.out.println("la ventana ha cambiado de estado");
	//	System.out.println(e.getNewState());
		if (e.getNewState()==Frame.MAXIMIZED_HORIZ) {
			System.out.println("la ventana ha maximizado horizontalmente");
		}
		else if (e.getNewState()==Frame.MAXIMIZED_VERT) {
			System.out.println("la ventana ha maximizado verticalmente");
		}
		else if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("la ventana ha maximizado");
		}
		else if (e.getNewState()==Frame.NORMAL) {
			System.out.println("la ventana esta normal");
		}
		else if (e.getNewState()==Frame.ICONIFIED) {
			System.out.println("la ventana ha minimizado");
		}
	}
}

class CambioEstadoTeclado implements KeyListener {

	public void keyPressed(KeyEvent e) {
		System.out.println("han presionado la tecla " + e.getKeyChar());
	}

	public void keyReleased(KeyEvent e) {
		System.out.println("han dejado de presionar la tecla " + e.getKeyChar());
	}

	public void keyTyped(KeyEvent e) {
		System.out.println("han usado la tecla " + e.getKeyChar());
	}
	
}

class CambiodelRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

		System.out.println("el mouse a cliqueado");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("el mouse ha entrado");
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("el mouse ha salido");
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("el mouse ha presionado");
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
		{
			System.out.println("el mouse ha cliqueado el boton izquierdo");
		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("el mouse ha released");
	
	}
}

class M_Ventana extends WindowAdapter { //implements WindowListener  {
	
	public M_Ventana(String nombre) {
		this.nombre = nombre;
	}
	
	public void windowClosed(WindowEvent e) {
	
		System.out.println(nombre + " cerrada");
	}
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println(nombre + " maximizada");
	}
	public void windowIconified(WindowEvent e) {
		
		System.out.println(nombre + " minimizada");
	}
	public void windowOpened(WindowEvent e) {
		
		System.out.println(nombre + " abierta");
	}
	
	private String nombre;
}

class M_Raton extends MouseAdapter  {
	
	public M_Raton(String nombre) {
		this.nombre = nombre;
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("el mouse ha cliqueado en " + nombre);
		
	}
	
	public void mousePressed(MouseEvent e) {
	//	System.out.println("el mouse ha presionado");
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
		{
			System.out.println("el mouse ha cliqueado el boton izquierdo");
		}
		System.out.println("el mouse ha presionado");
		if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK)
		{
			System.out.println("ha cliqueado la rueda del medio del raton");
		}
		if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
		{
			System.out.println("el mouse ha cliqueado el boton derecho");
		}
		
	}
	
	private String nombre;
}

class M_Teclado extends KeyAdapter  {
	
	public M_Teclado(String nombre) {
		this.nombre = nombre;
	}
		
	public void keyTyped(KeyEvent e) {
		
		System.out.println("Se ha pulsado la tecla "+ e.getKeyChar() + " en " + nombre);
		
	}
	
	private String nombre;
}
