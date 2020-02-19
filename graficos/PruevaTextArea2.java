package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//video 91 del curso de Java
public class PruevaTextArea2 {

	public static void main(String[] args) {
		JFrame ventana = new MarcoArea();
		
	}
}
class MarcoArea extends JFrame {
	 public MarcoArea(){
			laminaBotones = new JPanel();	
			
			setBounds(650,100,500,300);
			setTitle("Area de Texto");
			setLayout(new BorderLayout());
			botonInsertar = new JButton("Insertar Texto");
			botonInsertar.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					areaTexto.append("En algun lugar de la Mancha que no me quiero acordar el nombre...");
				}
				
			});
			botonSaltoLinea = new JButton("Insertar Salto de Linea");
			botonSaltoLinea.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					areaTexto.setLineWrap(!areaTexto.getLineWrap());
				}
				
			});
			areaTexto = new JTextArea(12,20);
			laminaTexto = new JScrollPane(areaTexto);	
			laminaBotones.add(botonInsertar);
			laminaBotones.add(botonSaltoLinea);
			add(laminaTexto, BorderLayout.NORTH);
			add(laminaBotones, BorderLayout.SOUTH);
			setVisible(true);
			
	 }
	 private JPanel laminaBotones;
	 private JScrollPane laminaTexto;
	 private JButton botonInsertar, botonSaltoLinea;
	 private JTextArea areaTexto;
}