package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {
	public static void main(String[] args) {
		
		Coche micoche = new Coche(); //INSTANCIAR UNA CLASE
		
		micoche.establece_color(JOptionPane.showInputDialog("Escriba el color del coche"));
		
//		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.establece_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero ?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.establece_asientos(JOptionPane.showInputDialog("Tiene climatizador ?"));
		
		System.out.println(micoche.dime_climatizador());
	}

	

	
}
