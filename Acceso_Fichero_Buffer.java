package leyendo;

import java.io.*;

public class Acceso_Fichero_Buffer {
	public static void main(String[] args) {
		Leer_Fichero_Buffer accediendo = new Leer_Fichero_Buffer();
		accediendo.leer();
	}

}
class Leer_Fichero_Buffer {
	
	public static void leer() {

			try {
				
				entrada = new FileReader("D:/ejemplos/archivo_grande.txt");
				
				BufferedReader mibuffer = new BufferedReader(entrada);
				
				String linea = " ";
				
				while (linea != null) {
				
					linea = mibuffer.readLine();
					
					System.out.println(linea);
					
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
