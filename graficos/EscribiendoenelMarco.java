package graficos;

import java.awt.*;

import javax.swing.*;

public class EscribiendoenelMarco {

	public static void main(String[] args) {

		MarcoCenter mimarco = new MarcoCenter();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);


	}

}

class MarcoCenter extends JFrame  {
	
	public MarcoCenter() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alto = tamanoPantalla.height;
		int ancho = tamanoPantalla.width;
		
		setSize(ancho/2, alto/2);
		setLocation(ancho/4, alto/4);
		setTitle("Titulo");
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);	
				
		Lamina miLamina = new Lamina();
		add(miLamina);
		miLamina.setForeground(Color.CYAN);
		

	}
	
}

class Lamina extends JPanel  {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font miFuente = new Font("Arial", Font.BOLD, 26);
		g.setFont(miFuente);
		g.drawString("Hola Mundo", 100, 100);
		g.setFont(new Font("Couriel", Font.ITALIC, 56));
		g.drawString("Mi vida es hermosa", 100, 200);
	}
	
}
