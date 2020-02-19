package leyendo;

import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.leer();
	}

}
class Leer_Fichero {
	
	public static void leer() {

			try {
				
			entrada = new FileReader("D:/ejemplos/prueba.txt");
				
				int c = 0;
				
				while (c!=-1) {
				
					c = entrada.read();
					
					char caracter = (char)c;
					
					System.out.print(caracter);
					
				}
				
			}catch(IOException e) {
				
				System.out.println("no se encuentra el archivo en la ruta especificada");
			
				e.printStackTrace();
				
			}finally {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
	}
	static FileReader entrada;
}
