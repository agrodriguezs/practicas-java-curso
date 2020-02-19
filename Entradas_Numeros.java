import javax.swing.*;
public class Entradas_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("Introduce un Numero!");
		double x = Double.parseDouble(num1);
		System.out.printf("La raiz cuadrada de " + x + " es ");
		System.out.printf("%1.4f", Math.sqrt(x));

	}

}
