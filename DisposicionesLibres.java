package practica;

import java.awt.*;

import javax.swing.*;

public class DisposicionesLibres {

	public static void main(String[] args) {
		
		JFrame Ventana = new MarcoLibre();
		
		Ventana.setVisible(true);
		

	}

}

class MarcoLibre extends JFrame {
	
	public MarcoLibre() {

		setTitle("Disposiciones Libres");
		
		setBounds(600,100,400,250);
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Image miIcono = pantalla.getImage("src/practica/images/te.png");
		
		this.setIconImage(miIcono);
		
		JPanel lamina = new LaminaLibre();
		
		add(lamina);
		

	}
}

class LaminaLibre extends JPanel {
	
	public LaminaLibre() {
		
		setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Nombre: ");
		
		JLabel etiqueta2 = new JLabel("Apellido: ");
		
		JTextField c_nombre = new JTextField();		
		
		JTextField c_apellido = new JTextField();		
		
		etiqueta1.setBounds(40, 50, 100, 25);
		
		etiqueta2.setBounds(40, 100, 100, 25);
		
		c_nombre.setBounds(100, 50, 200, 25);
		
		c_apellido.setBounds(100, 100, 200, 25);
		
		add(etiqueta1);
		
		add(etiqueta2);
		
		add(c_nombre);
		
		add(c_apellido);
						
	}
}
