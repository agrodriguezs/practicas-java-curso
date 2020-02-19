package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona [] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado("Maria Hernandez", 98535, 2007, 10, 5);
		lasPersonas[1] = new Alumno("Jose Chinchilla", "Ingenieria Naval");
		
		for (Persona p : lasPersonas) {
		
			System.out.println(p.damenombre() + " " + p.dameDescripcion());
		}
		

	}
	
}

	abstract class Persona {
		public Persona(String nom){
			nombre = nom;
		}
		private String nombre; //constante, no puede variar durante el programa
		
		public String damenombre() {
			return nombre;
		}
		
		public abstract String dameDescripcion();
		
	}
	class Empleado extends Persona {
		public Empleado(String nom, double sue, int anho, int mes, int dia) {
			super(nom);
			sueldo = sue;
			GregorianCalendar calendario = new GregorianCalendar(anho, mes-1, dia);
			altaContrato = calendario.getTime();
			id = idSiguiente;
			idSiguiente++;
		}

		private int id;
		private static int idSiguiente=1;
		private double sueldo;
		private Date altaContrato;

		public String dameDescripcion() {
			
			return "Este Empleado tiene un id: " +id+ " y recibe un sueldo de " + sueldo;
			
		}
		
		public double dame_sueldo() {
			return sueldo;
		}
		public int dame_id() {
			return id;
		}
		public Date dame_fecha_contrato() {
			return altaContrato;
		}
		public void subesueldo(double porcentaje) {
			double aumento = sueldo*porcentaje/100;
			sueldo += aumento;
		}
	}
	
	class Alumno extends Persona {
		
		public Alumno(String nom, String car) {
			super(nom);
			carrera = car;
		}

		private String carrera;

		public String dameDescripcion() {
			
			return "Esta cursando la carrera de " + carrera;
			
		}

	}

