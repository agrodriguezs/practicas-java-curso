package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoBotones extends JFrame  {
	
	private static final long serialVersionUID = 1L;

	public MarcoBotones() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		setBounds(700,300,500,300);
		setTitle("Eventos");
		Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);	
				
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
		miLamina.setBackground(SystemColor.window);
	}
}

class LaminaBotones extends JPanel  {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	LaminaBotones(){
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(Azul);
		
		botonAmarillo.addActionListener(Amarillo);
		
		botonRojo.addActionListener(Rojo);
	}
	
	private class ColorFondo implements ActionListener  {
		
		public ColorFondo(Color c) {
			
			colorfondo = c;
		}
		public void actionPerformed(ActionEvent e) {
				setBackground(colorfondo);

		}
		private Color colorfondo;
	}
	
	private static final long serialVersionUID = 1L;

	
}
