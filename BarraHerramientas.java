package practica;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class BarraHerramientas {

	public static void main(String[] args) {
		
		Marco_Barra mimarco=new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class Marco_Barra extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/practica/images/bolaazul.png"), Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/practica/images/bolaamarilla.png"), Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/practica/images/bolaroja.png"), Color.RED);
		
		Action accionSalir=new AbstractAction("Salir", new ImageIcon("src/practica/images/salida.png")) {
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
			
		};
		
		JMenuBar barraMenu = new JMenuBar();
		
		JMenu menuPrincipal = new JMenu("Color");
		
		menuPrincipal.add(accionAzul);
		
		menuPrincipal.add(accionAmarillo);
		
		menuPrincipal.add(accionRojo);
		
		menuPrincipal.addSeparator();
		
		menuPrincipal.add(accionSalir);
		
		barraMenu.add(menuPrincipal);
		
		setJMenuBar(barraMenu);
	
		//Construcion de Barra de Herramientas
		
		JToolBar barraTools = new JToolBar();

		barraTools.add(accionAzul);
		
		barraTools.add(accionAmarillo);
		
		barraTools.add(accionRojo);
		
		barraTools.addSeparator();
		
		barraTools.add(accionSalir);
		
		add(barraTools, BorderLayout.NORTH);
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}
		
	}
	private JPanel lamina;
}



