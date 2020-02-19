
public class Pruebas_con_String {

	public static void main(String[] args) {

		String nombre = "Maria Alejandra Elianette";
		int ultimaLetra = nombre.length();
		
		String alumno1 = "Jose Alejandro";
		String alumno2 = "jose dAlejandro";
		
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
		System.out.println("Mi nombre es " + nombre);
			
		System.out.println("El nombre " +  nombre + " tiene " + nombre.length() + " letras ");
	
		System.out.println("La primera letra de mi nombre es "+ nombre.charAt(0));
			
		System.out.println("La ultima letra de mi nombre es "+ nombre.charAt(ultimaLetra-1));
		
		String frase = "Hoy es un gran dia para aprender a programar en Java";
		String subfrase = frase.substring(0, 23) +   " irnos a la playa y olvidarnos de todo";
		
		System.out.println(subfrase);

	}

}
