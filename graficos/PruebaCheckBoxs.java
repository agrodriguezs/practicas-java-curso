package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//prueba de video 92 y 93
public class PruebaCheckBoxs {

	public static void main(String[] args) {
		JFrame ventana = new MarcoCheckBox();

	}

}
class MarcoCheckBox extends JFrame {
	 public MarcoCheckBox(){
			
			setBounds(650,100,500,300);
			setTitle("Area de Texto");
			setLayout(new BorderLayout());
			
			laminaCheckBox = new JPanel();	
			palabras = new JLabel("Adriana Gabriela Rodriguez Sanabria", JLabel.CENTER );
			Font letra = new Font("Serif",Font.PLAIN, tamano);
			palabras.setFont(letra);
			add(palabras, BorderLayout.NORTH);
			
			negrita = new JCheckBox("negritas");
			cursiva = new JCheckBox("cursivas");
			negrita.addActionListener(new EventoCheckBoxs());
			cursiva.addActionListener(new EventoCheckBoxs());
			laminaCheckBox.add(negrita);
			laminaCheckBox.add(cursiva);
			tamanoLetra = new ButtonGroup();

			botonRadio("grande", false, 24);
			botonRadio("mediana", false, 16);
			botonRadio("peque", false, 12);
			tamano = 16;
			add(laminaCheckBox, BorderLayout.SOUTH);

			setVisible(true);
			
	 }
	 private class EventoCheckBoxs implements ActionListener  {

		public void actionPerformed(ActionEvent e) {
			
			tipo = 0;
			if (negrita.isSelected()) {
				tipo += Font.BOLD;
			}
			if (cursiva.isSelected()) {
				tipo += Font.ITALIC;
			}
			System.out.println(tamano);
			palabras.setFont(new Font("Serif", tipo, tamano));
		}
		 
	 }
	 
	 public void botonRadio(String nombre, boolean selecto, final int tamagno) {
		 
		 	JRadioButton boton= new JRadioButton(nombre, selecto);
			tamanoLetra.add(boton);
			laminaCheckBox.add(boton);
			boton.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					tamano = tamagno;
					System.out.println("dsdsds"+ tamano);
					System.out.println(tamano);
					palabras.setFont(new Font("Serif", tipo, tamagno));
				}
				 
		 });
	 }
	 private ButtonGroup tamanoLetra;
	 private JPanel laminaCheckBox, laminaTexto;
	 private JCheckBox negrita, cursiva;
	 private JLabel palabras;
	 private int tipo, tamano;
}