package poo;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.Timer;

public class PruebaTemporiZador2 {

	public static void main(String[] args) {
		
		Reloj mireloj = new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		
	}
}

class Reloj {
	public void enMarcha(int intervalo, final boolean sonido) {
		
		class DameLaHora2 implements ActionListener  {
			
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				
				System.out.println("TE PONGO LA HORA CADA 3 SEGUNDOS " + ahora);
				
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
		}
		ActionListener oyente = new DameLaHora2();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}

}
