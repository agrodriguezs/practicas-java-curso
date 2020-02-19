package practica;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class MenuEmergente {

	public static void main(String[] args) {

		FrameMenuEmergete ventana = new FrameMenuEmergete();
		

	}

}

class FrameMenuEmergete extends JFrame {
	
	public FrameMenuEmergete() {
		
Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Image logo = mipantalla.getImage("src/practica/images/milogo.png");
		
		this.setIconImage(logo);
		
		setTitle("Prueba de Menu Emergente");
		
		setBounds(670,130,600,450);
		
		PanelMenuEmergete marco = new PanelMenuEmergete();	
		
		add(marco);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
	}
}

class PanelMenuEmergete extends JPanel {

	public PanelMenuEmergete() {
		
		JPopupMenu menuEmergente = new JPopupMenu();
		
		JMenuItem opcion1 = new JMenuItem("primera opcion");
		menuEmergente.add(opcion1);
		
		JMenuItem opcion2 = new JMenuItem("segunda opcion");
		menuEmergente.add(opcion2);
		
		JMenuItem opcion3 = new JMenuItem("tercera opcion");
		menuEmergente.add(opcion3);
		
		setComponentPopupMenu(menuEmergente);
		
		
		
	}
}
