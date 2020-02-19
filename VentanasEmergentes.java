package practica;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class VentanasEmergentes {

	public static void main(String[] args) {
		
	JFrame Ventana = new MarcoEmergentes();
		
		Ventana.setVisible(true);
		

	}

}

class MarcoEmergentes extends JFrame {
	
	public MarcoEmergentes() {
		
		setLayout(new BorderLayout());
		
		setTitle("Ventanas Emergentes");
		
		setBounds(650,100,500,150);
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Image miIcono = pantalla.getImage("src/practica/images/codigo.png");
		
		this.setIconImage(miIcono);
		
		JPanel panela = new LaminaEmergente();

		add(panela, BorderLayout.CENTER);
		
	}
}

class LaminaEmergente extends JPanel {
	
	public LaminaEmergente() {
					
	boton1 = new JButton("Boton 1");
	
	boton1.addActionListener(new eventoBoton());
	
	boton2 = new JButton("Boton 2");
	
	boton2.addActionListener(new eventoBoton());
	
	boton3 = new JButton("Boton 3");
	
	boton3.addActionListener(new eventoBoton());
	
	boton4 = new JButton("Boton 4");
	
	boton4.addActionListener(new eventoBoton());
	
	add(boton1);
	
	add(boton2);
	
	add(boton3);
	
	add(boton4);
		
	}
	
	class eventoBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == boton1) {
				
				//System.out.println("has pulsado el boton 1");
				JOptionPane.showMessageDialog(LaminaEmergente.this, "Mensaje del boton 1", "Message", 1);
				
			}else if (e.getSource() == boton2) {
				
				//System.out.println("has pulsado el boton 2");
				JOptionPane.showInputDialog(LaminaEmergente.this, "Mensaje del boton 2", "InputDialog", 3);
				
			}else if (e.getSource() == boton3) {
				
				//System.out.println("has pulsado el boton 3");
				JOptionPane.showConfirmDialog(LaminaEmergente.this, "Ud esta Loco ?", "ConfirmDialog", 0);
				
			}else {
				
				//System.out.println("has pulsado el boton 4");
				
				Toolkit pantalla = Toolkit.getDefaultToolkit();
				//Image miIcono = pantalla.getImage("src/practica/images/androide.png");
				Icon miIcono = new ImageIcon("src/practica/images/taxi.png");
				JOptionPane.showOptionDialog(LaminaEmergente.this, "mensaje boton 4", "OptionDialog", 1, 1, miIcono, null, null);
				
			}
			
		}
		
	}
	
	private JButton boton1, boton2, boton3, boton4;
}


