import javax.swing.JOptionPane;

public class Uso_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] Paises = new String[8];
		
	/*	Paises[0] = "Venezuela";
		Paises[1] = "Nicaragua";
		Paises[2] = "Espana";
		Paises[3] = "Mexico";
		Paises[4] = "Panama";
		Paises[5] = "Estados Unidos";
		Paises[6] = "Colombia";
		Paises[7] = "Aruba";*/
	 
	/*	 String [] Paises = {"Venezuela","Nicaragua","Espana","Mexico", "Panama", "Estados Unidos","Colombia"};*/
		for (int i=0;i<8;i++) {
			Paises[i] = JOptionPane.showInputDialog("Escribe el nombre de un pais");
		}
		
		
		for (int i=0;i<Paises.length;i++) {
			System.out.println("El Pais " + (i+1) + " " + Paises[i]);
		}

	}

}

	