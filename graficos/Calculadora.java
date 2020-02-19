package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {

	public static void main(String[] args) {

		FrameCalculadora calculadora = new FrameCalculadora();
	}

}

class FrameCalculadora extends JFrame  {
	public FrameCalculadora()  {
		setBounds(500,300,450,300); 
		setTitle("CALCULADORA"); 
		PanelCalculadora lamina = new PanelCalculadora();
		add(lamina);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class PanelCalculadora extends JPanel  {
	public PanelCalculadora()  {
		setLayout(new BorderLayout());
		inicio = true;
	//	resultado = 0;
		ultimaOperacion = "=";
		pantalla = new JTextField("0");
		//pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		botones = new JPanel();
		add(botones, BorderLayout.CENTER);
		botones.setLayout(new GridLayout(4,4));
		ActionListener insertar = new ponerNumero();
		ActionListener orden = new hacerOrden();
		crearBoton("7", insertar);
		crearBoton("8", insertar);
		crearBoton("9", insertar);
		crearBoton("/", orden);
		crearBoton("4", insertar);
		crearBoton("5", insertar);
		crearBoton("6", insertar);
		crearBoton("*", orden);
		crearBoton("1", insertar);
		crearBoton("2", insertar);
		crearBoton("3", insertar);
		crearBoton("-", orden);
		crearBoton("0", insertar);
		crearBoton(",", insertar);
		crearBoton("=", orden);
		crearBoton("+", orden);

	}
	
	private void  crearBoton(String etiqueta, ActionListener oyente)  {
		JButton boton = new JButton(etiqueta);
		boton.addActionListener(oyente);
		botones.add(boton);
		
	}
	
    private class ponerNumero implements ActionListener  {

		public void actionPerformed(ActionEvent e) {
			if (inicio) {
				pantalla.setText("");
				inicio = false;
			}
			pantalla.setText(pantalla.getText() + e.getActionCommand());

		}

	}
    
    private class hacerOrden implements ActionListener  {

		public void actionPerformed(ActionEvent e) {
			
			
			String operacion = e.getActionCommand();
			
			
			System.out.println(operacion);
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion = operacion;

			inicio = true;
			
			
		}
		public void calcular(double x) {
			if (ultimaOperacion== "+") {
				resultado += x;
			}
			else if (ultimaOperacion== "-") {
				resultado -= x;
			}
			else if (ultimaOperacion== "*") {
				resultado *= x;
			}
			else if (ultimaOperacion== "/") {
				resultado /= x;
			}
			else if (ultimaOperacion== "=") {
				resultado = x;
			}
				
				pantalla.setText("" + resultado);

			
		}

	}
	
	private JPanel botones;
	private JTextField pantalla;
	private boolean inicio;
	private double resultado;
	private String ultimaOperacion; 
}