import javax.swing.*;

public class Ejemplo_de_Bucle_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Adriana";
		String pass ="";
		
		
		
		while(clave.equals(pass)==false){
			
			pass= JOptionPane.showInputDialog("Introduzca la contraseņa, por favor");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseņa Incorrecta");
			}
		}
		System.out.println("Contraseņa Correcta, Acceso Permitido"
				+ "");

	}

}
