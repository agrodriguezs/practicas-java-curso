import javax.swing.*;

public class Calcular_Peso {

	public static void main(String[] args) {
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Escribe tu genero (H/M)");
	
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura"));
		int pesoideal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoideal = altura-100;
		}else {
			pesoideal = altura-110;
		}
		System.out.println("Hola, tu peso ideal es " + pesoideal + " Kg." );	
	}
}
