import java.util.*;

public class Juego_de_Azar {

	public static void main(String[] args) {
		int aleatorio = (int)Math.round(Math.random()*100);
		int numero = 0;
		int intentos = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(numero!=aleatorio) {
			
			System.out.print("Introduce un numero: ");
			numero = entrada.nextInt();
			intentos++;
			if (aleatorio < numero) {		
				System.out.println("El numero es menor");
			}
			if (aleatorio > numero) {	
				
				System.out.println("El numero es mayor");
			}
		}
		System.out.println("Correcto! has acertado! el numero era " + aleatorio + " lo has conseguido en el " + intentos + " intento.");
		entrada.close();
	}

}
