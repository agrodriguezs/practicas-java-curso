
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//del video 86 y 87 del Curso de Java de Youtube
public class PruebaCampoTexto {

	public static void main(String[] args) {
		JFrame ventana = new FrameFormulario();
	}

}

class FrameFormulario extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameFormulario() {
		JPanel formulario = new Formulario();
		
		add(formulario);
		setTitle("Campos de Texto");
		setBounds(100,100,500,300);
		setVisible(true);
	}
}

class Formulario extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Formulario() {
		setLayout(new BorderLayout());
		JPanel subpanel = new JPanel();
		subpanel.setLayout(new FlowLayout());
		JLabel etiqueta1 = new JLabel("email: ");
	    respuesta = new JLabel(" ", JLabel.CENTER);
	    respuesta.setBackground(null);
	    campo1 = new JTextField(20);	
		boton1 = new JButton("enviar a Consola");
		boton1.addActionListener( new eventoBoton());
		subpanel.add(etiqueta1);
		subpanel.add(campo1, BorderLayout.CENTER);
		subpanel.add(boton1,BorderLayout.EAST);
		add(subpanel,BorderLayout.NORTH);
		add(respuesta,BorderLayout.CENTER);
	}
	
	class eventoBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int correcto = 0; 
			String email = campo1.getText().trim();
			for (int i=0; i<email.length();i++) {
				if(email.charAt(i)=='@') {
					correcto += 1;
				}
			}
			if (correcto == 1) {
				
				respuesta.setText("El correo electronico esta correcto");	
				respuesta.setBackground(Color.WHITE);
				respuesta.setForeground(Color.GREEN.darker().darker());
			}else {
				
				respuesta.setText("El correo electronico esta  incorrecto");	
				respuesta.setBackground(Color.WHITE);
				respuesta.setForeground(Color.RED.darker());
			}
				
			//campo1.setText(null);
			
		}
		
	}
	
	JTextField campo1;
	JButton boton1;
	JLabel respuesta;
	
}