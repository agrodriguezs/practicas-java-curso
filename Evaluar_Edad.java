import java.util.Scanner;

public class Evaluar_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu edad, por favor");
		int edad_usuario = entrada.nextInt();
		System.out.println("tu edad es "+ edad_usuario);
		
		if(edad_usuario < 18 ) {
			
			System.out.println("Eres un adolecente");
			
		} else if(edad_usuario < 40 ) {
			
			System.out.println("Eres joven");
			
		} else if (edad_usuario < 65 ) {
			
			System.out.println("Eres Maduro");
			
		} else {
			
			System.out.println("Cuidate");
		}
	}

}
