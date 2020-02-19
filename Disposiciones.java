package practica;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class Disposiciones {

	public static void main(String[] args) {
		
		JFrame Ventana = new MarcoCaja();
		
		Ventana.setVisible(true);
		

	}

}

class MarcoCaja extends JFrame {
	
	public MarcoCaja() {
		

		
		setTitle("Disposiciones de Cajas");
		
		setBounds(600,100,300,350);
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Image miIcono = pantalla.getImage("src/practica/images/atomo.png");
		
		this.setIconImage(miIcono);
		
		Box cajaH1 = Box.createHorizontalBox();
		Box cajaH2 = Box.createHorizontalBox();
		Box cajaH3 = Box.createHorizontalBox();
		Box cajaH4 = Box.createHorizontalBox();
		
		JButton boton1 = new JButton("Aceptar");
		JButton boton2 = new JButton("Cancelar");
		

		JLabel etiqueta1 = new JLabel("Usuario:");
		JLabel etiqueta2 = new JLabel("Password:");
		
		JTextField texto1 = new JTextField(10);
		JTextField texto2 = new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		cajaH1.add(etiqueta1);
		cajaH1.add(Box.createHorizontalStrut(10));
		cajaH1.add(texto1);
		
		cajaH2.add(etiqueta2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);
		
		cajaH3.add(Box.createHorizontalStrut(30));
		cajaH3.add(boton1);
		cajaH3.add(Box.createHorizontalGlue());
		cajaH3.add(boton2);
		cajaH3.add(Box.createHorizontalStrut(30));
		Box cajaVertical = Box.createVerticalBox();

	
		
		add(cajaVertical, BorderLayout.CENTER);
		
		JPanel ejemploMuelle = new LaminaMuelle();
		
		cajaH4.add(ejemploMuelle);
		
		cajaVertical.add(Box.createVerticalStrut(30));
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
		cajaVertical.add(Box.createVerticalStrut(30));
		cajaVertical.add(cajaH4);
		cajaVertical.add(Box.createVerticalStrut(30));
		
		
	}
}

class LaminaMuelle extends JPanel {
	
	public LaminaMuelle() {
					
		JButton botonUno = new JButton("UNO");
		JButton botonDos = new JButton("DOS");
		JButton botonTres = new JButton("TRES");
		
		Spring muelle = Spring.constant(0, 10, 250);
		
		SpringLayout miLayout = new SpringLayout();
		
		setLayout(miLayout);
		
		this.add(botonUno);
		this.add(botonDos);
		this.add(botonTres);
		
		miLayout.putConstraint(SpringLayout.WEST, botonUno, muelle, SpringLayout.WEST, this);
		
		miLayout.putConstraint(SpringLayout.WEST, botonDos, muelle, SpringLayout.EAST, botonUno);
		
		miLayout.putConstraint(SpringLayout.WEST, botonTres, muelle, SpringLayout.EAST, botonDos);
		
		miLayout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, botonTres);
		
		
	}
}
