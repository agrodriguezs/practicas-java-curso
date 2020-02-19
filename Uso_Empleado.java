package poo;
import java.util.*;

public class Uso_Empleado  {

	public static void main(String[] args) {
		
	/*	Empleado empleado1 = new Empleado("Adriana Rodriguez", 45000, 2000,03,02);
		Empleado empleado2 = new Empleado("Luilimar Barboza", 46000, 2000,04,12);
		Empleado empleado3 = new Empleado("Silvie Arismendi", 45000, 2001,03,30);
		
		empleado1.subesueldo(5);
		empleado2.subesueldo(5);
		empleado3.subesueldo(5);
		
		System.out.println("Nombre: " + empleado1.dame_nombre() 
		+ ", Sueldo: " + empleado1.dame_sueldo() 
		 + ", Fecha de Ingreso: " +  empleado1.dame_fecha_contrato());
		
		System.out.println("Nombre: " + empleado2.dame_nombre() 
        + ", Sueldo: " + empleado2.dame_sueldo() 
        + ", Fecha de Ingreso: " +  empleado2.dame_fecha_contrato());
		
		System.out.println("Nombre: " + empleado3.dame_nombre() 
        + ", Sueldo: " + empleado3.dame_sueldo() 
        + ", Fecha de Ingreso: " +  empleado3.dame_fecha_contrato());
        
     */
		
		Jefe	jefe1 = new Jefe("Arturo Hernandez", 15000, 2011,07,27);
		jefe1.asignaIncentivo(5000);
		Empleado2 [] misEmpleados = new Empleado2[4];
		misEmpleados[0] = new Empleado2("Adriana Rodriguez", 45000, 2000,03,02);
		misEmpleados[1] = new Empleado2("Luilimar Barboza", 46000, 2000,04,12);
		misEmpleados[2] = new Empleado2("Silvie Arismendi", 45000, 2001,03,30);
		misEmpleados[3] = jefe1;
	
		/*for (int i=0; i<3; i++) {
			misEmpleados[i].subesueldo(5);
		}
		for (int i=0; i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dame_nombre() 
	        + ", Sueldo: " + misEmpleados[i].dame_sueldo() 
	        + ", Fecha de Ingreso: " +  misEmpleados[i].dame_fecha_contrato());
		}*/
		for (Empleado2 e: misEmpleados) {
		e.subesueldo(5);
		}
		for (Empleado2 e: misEmpleados) {
			System.out.println("Nombre: " + e.dame_nombre() + ", Sueldo: " + e.dame_sueldo() 
	        + ", Fecha de Ingreso: " +  e.dame_fecha_contrato() + " su ID es " + e.dame_id());
		}
	}
}

class Empleado2 {
	Empleado2(String nom, double sue, int anho, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anho, mes-1, dia);
		altaContrato = calendario.getTime();
		id = idSiguiente;
		idSiguiente++;
		
		
	}
	private final String nombre; //constante, no puede variar durante el programa
	private int id;
	private static int idSiguiente=1;
	private double sueldo;
	private Date altaContrato;
	public String dame_nombre() {
		return nombre;
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
class Jefe extends Empleado2 {
	Jefe(String nom, double sue, int anho, int mes, int dia){
		super(nom, sue, anho, mes, dia);
	}
	public double dame_sueldo() {
		
		return super.dame_sueldo() + incentivo;
	}
	public void asignaIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	private double incentivo;
	
}
	

