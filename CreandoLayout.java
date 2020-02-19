package practica;

import java.awt.*;

import javax.swing.*;

public class CreandoLayout {

	public static void main(String[] args) {
		
		JFrame Ventana = new MarcoLibre3();
		
		Ventana.setVisible(true);
		

	}

}

class MarcoLibre3 extends JFrame {
	
	public MarcoLibre3() {
		
		setTitle("MILAYOUt");
		
		setBounds(600,100,400,250);
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Image miIcono = pantalla.getImage("src/practica/images/te.png");
		
		this.setIconImage(miIcono);
		
		JPanel lamina = new LaminaLibre2();
		
		add(lamina);
		setVisible(true);
		

	}
}

class LaminaLibre2 extends JPanel {
	
	public LaminaLibre2() {
		
		setLayout(new ordenLayout());
		
		JLabel etiqueta1 = new JLabel("Nombre: ");
		
		JLabel etiqueta2 = new JLabel("Apellido: ");
		
		JLabel etiqueta3 = new JLabel("Genero: ");
		
		
		JTextField c_genero = new JTextField();	
		
		JTextField c_nombre = new JTextField();		
		
		JTextField c_apellido = new JTextField();		
		
		
		add(etiqueta1);
		
		add(c_nombre);
		
		add(etiqueta2);
		
		add(c_apellido);
		
		add(etiqueta3);
		
		add(c_genero);
						
	}
}

class ordenLayout implements LayoutManager {

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container parent) {
		
		int d = parent.getWidth();
		
		x = d/2;
		
		int contador = 0;
		
		int n = parent.getComponentCount();
		
		for (int i=0; i<n; i++) {
			
			
			contador++;
			
			Component c = parent.getComponent(i);
			
			c.setBounds(x-100, y, 100, 20);
			
			x += 100;
			
			if (contador%2==0) {
				
				x= d/2;
				y+=30;
			}
			
		}
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	private int x = 20;
	private int y = 20;
}
