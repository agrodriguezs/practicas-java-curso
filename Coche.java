package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_total;
	private String color;
	private int peso_plataforma;
	private boolean asientos_cuero, climatizador;
	
	public Coche () {
		ruedas = 4;
		largo = 4233;
		ancho = 52432;
		motor = 1234;
		peso_plataforma = 423423;
	}
	public String  dime_largo() {  		//getter
		return "El largo del coche es " + largo;
	}
	public String  dime_color() {   	//getter
		return "El color del coche es " + color;
	}
	public void establece_color(String color_coche) { 	//setter
		color = color_coche;
	}
	public String  dime_peso_coche() {   	//getter
		return "El peso del coche es " + peso_total;
	}
	public void establece_asientos(String asientos_coche) { 	//setter
		
		if (asientos_coche.equalsIgnoreCase("si")) {
			asientos_cuero = true;
		}else  {
			asientos_cuero = false;
		}
	}
	public String  dime_asientos() {   	//getter
		if (asientos_cuero == true) {
			return "tiene asientos de cuero";
		}else  {
			return "tiene asientos de serie";
		}
	}
	public void establece_climatizador(String climatizador) { 	//setter
		
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else  {
			this.climatizador = false;
		}
	}
	public String  dime_climatizador() {   	//getter
		if (asientos_cuero) {
			return "tiene climatizador";
		}else  {
			return "tiene aire acondicionado";
		}
	}
}
