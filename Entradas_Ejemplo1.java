import java.util.Scanner;

public class Entradas_Ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario = entrada.nextLine();
		System.out.println("Introduce tu edad, por favor");
		int edad_usuario = entrada.nextInt();
		System.out.println("Hola! " + nombre_usuario + " te vez muy bien para tener "+ edad_usuario + " a�os");
		System.out.println("El a�o que viene cumples "  + (edad_usuario+1) + " a�os");
	}

}
