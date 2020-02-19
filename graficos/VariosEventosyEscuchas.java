package graficos;

import java.awt.event.*;

import javax.swing.*;

public class VariosEventosyEscuchas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaEventos ventana = new VentanaEventos();
	}
	
}

class VentanaEventos extends JFrame {
	
	public VentanaEventos(){
		setBounds(550,150,500,300);
		setTitle("Varios Eventos y Escuchas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		LaminaEventos LaminadeBotones = new LaminaEventos();
		add(LaminadeBotones);
	}
}

class LaminaEventos extends JPanel {
	
	public LaminaEventos(){
		JButton boton_nuevo = new JButton("Nueva ventana");
		boton_cerrar = new JButton("Cerrar ventanas");
		boton_nuevo.addActionListener(new OyenteMarco());
		add(boton_nuevo);
		add(boton_cerrar);
	}
	
	class OyenteMarco implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			VentanaEmergente ventanaNew = new VentanaEmergente(boton_cerrar);
			
		}
	}
	
	public JButton boton_cerrar;
}





class VentanaEmergente extends JFrame {
	
	public VentanaEmergente(JButton boton_principal){
		contador++;
		setBounds(20*contador,30*contador,300,200);
		setTitle("Ventana " + contador );
		setVisible(true);
		boton_principal.addActionListener(new OyenteCerrar());
	}
	class OyenteCerrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			contador = 0;
			dispose();
			
			
		}
	}
	private static int contador;
}
