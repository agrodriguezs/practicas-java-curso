import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaconImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoparaImagen mimarco = new MarcoparaImagen();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoparaImagen extends JFrame  {
	
	public MarcoparaImagen() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alto = tamanoPantalla.height;
		int ancho = tamanoPantalla.width;
		
		setSize(ancho/2, alto/2);
		setLocation(ancho/4, alto/4);
		setTitle("Ventana con Imagen");
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);	
				
		LaminaconImagen miLamina  = new LaminaconImagen();
		add(miLamina);
		miLamina.setBackground(SystemColor.window);
		miLamina.setForeground(Color.CYAN);
		
	}
	
}

class LaminaconImagen extends JPanel  {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		File miImagen = new File("src/graficos/taxi.png");
		
		try {
			
			imagen = ImageIO.read(miImagen);
			
		}
		catch(IOException e )  {
			
			System.out.println("La imagen no se encuentra");
		}
		int anchoImg = imagen.getWidth(this);
		int altoImg = imagen.getHeight(this);
		
		g.drawImage(imagen, 5, 5, null);
		for (int i=0; i<300; i++)		 {
			for (int j=0; j<200; j++)		 {
				g.copyArea(0,0,anchoImg,altoImg,anchoImg*i,altoImg*j);
			}
		}
		
		}
	
	Image imagen;
	
}
