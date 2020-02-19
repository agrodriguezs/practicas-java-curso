import javax.swing.*;
	
public class Entradas_Ejemplo2 {

	public static void main(String[] args) {
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String edad =JOptionPane.showInputDialog("Introduce tu edad, por favor");
		int edad_usuario = Integer.parseInt(edad);
		System.out.println("Hola! " + nombre_usuario + " te vez muy bien para tener "+ edad_usuario + " años");
		edad_usuario++;
		System.out.println("El año que viene cumples "  + edad_usuario + " años");

	}

}
