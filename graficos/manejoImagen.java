package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class manejoImagen {

	public static void main(String[] args) {
		
		MarcoImagen mimarco = new MarcoImagen();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}
class MarcoImagen extends JFrame  {
	
	private static final long serialVersionUID = 1L;

	public MarcoImagen() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alto = tamanoPantalla.height;
		int ancho = tamanoPantalla.width;
		
		setSize(ancho/2, alto/2);
		setLocation(ancho/4, alto/4);
		setTitle("Ventana con Imagen");
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);	
				
		LaminaconImagen miLamina = new LaminaconImagen();
		add(miLamina);
		miLamina.setBackground(SystemColor.window);
	}
}

class LaminaconImagen extends JPanel  {

	public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	//File miImagen = new File("src/graficos/taxi.png");
    	try {
    		imagen = ImageIO.read(new File("src/graficos/taxi.png"));
    	}
    	catch (IOException e) {
    		System.out.println("hay un error de carga de la imagen");
    	}
    	
    	g.drawImage(imagen, 40,40, imagen.getWidth(null), imagen.getHeight(null),  null);
	}
	
	private static final long serialVersionUID = 1L;
	private Image imagen;
}
