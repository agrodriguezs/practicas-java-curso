package graficos;
import java.awt.*;

import javax.swing.*;

public class CrandoMarcoCentrado {

	public static void main(String[] args) {

		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame  {
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alto = tamanoPantalla.height;
		int ancho = tamanoPantalla.width;
		
		setSize(ancho/2, alto/2);
		setLocation(ancho/4, alto/4);
		setTitle("Titulo");
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);	
	}
	
	
	
	
	
	
}
