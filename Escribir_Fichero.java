package leyendo;

import java.io.*;

public class Escribir_Fichero {

	public static void main(String[] args) {

		Escribiendo agregarDatos = new Escribiendo();
		
		agregarDatos.escribir();

	}

}

class Escribiendo {
	
	public void escribir() {
		
		String frase = "Es mejor, hablar con personas proactivas y que buscan soluciones y no trabas";
		
		try {
			FileWriter escritura = new FileWriter("D:/ejemplos/prueba_de_escritura.txt", true);
			
			/*for (int i=0; i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
			}*/
			
			escritura.write(frase);
			
			escritura.close();
			
		} catch (IOException e) {
			System.out.println("El archivo no se encuentra");
			e.printStackTrace();
		}
		
	}
}