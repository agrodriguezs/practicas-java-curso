package poo;

import java.util.Date;
import javax.swing.Timer;

import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.*;



public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(5000, oyente);
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "no parara hasta que aceptes");
		 System.exit(0);
		

	}

	
}

class DameLaHora implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Date ahora  = new Date();
		System.out.println("te pongo la hora cada 5 segundos " + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
	
}