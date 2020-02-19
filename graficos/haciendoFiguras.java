package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class haciendoFiguras {

	public static void main(String[] args) {
		
		Marco mimarco = new Marco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class Marco extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Marco() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alto = tamanoPantalla.height;
		int ancho = tamanoPantalla.width;
		
		setSize(ancho/2, alto/2);
		setLocation(ancho/4, alto/4);
		setTitle("Ventana con Figuras");
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);	
				
		LaminaconDibujo miLamina = new LaminaconDibujo();
		add(miLamina);
		miLamina.setBackground(SystemColor.window);
	}
}

class LaminaconDibujo extends JPanel  {
	    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50,50, 200, 200);			//dibuja un rectangulo
		//g.drawLine(150,150, 300, 200);		//dibuja una Linea
		//g.drawArc(50,100,100, 200,120, 150); 	//dibuja un arco
		Color micolor = new Color(109,172,59);  //establecer un color
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(5,5,400,300);
		
		g2.setPaint(micolor.darker().darker()); //indicar el color a utilizar en la figura
		
		g2.draw(rectangulo);
		
		g2.setPaint(micolor.darker());
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		//g2.draw(elipse);
		
		g2.setPaint(micolor.brighter());
		g2.fill(elipse);
		
		
		Line2D linea = new Line2D.Double(5,5,400,300);
		g2.draw(linea);
		
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
				
		double centroenX = rectangulo.getCenterX();
				
		double radio = centroenX/2;
		
		double centroenY = rectangulo.getCenterY();	
		
		circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
		
		g2.draw(circulo);
		
		
	}
	
}
