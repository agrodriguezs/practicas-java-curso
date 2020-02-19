package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ValidarPassword {

	public static void main(String[] args) {
		
		JFrame ventana = new FrameValidador();

	}

}
class FrameValidador extends JFrame {
	FrameValidador() {
		setTitle("Validar Password");
		setBounds(500,100,700,200);
		
		JPanel formulario = new PanelValidador();
		add(formulario);
		setVisible(true);
	}
}

class PanelValidador extends JPanel {
	PanelValidador() {
		setLayout(new BorderLayout());
		JPanel rejilla = new JPanel();
		rejilla.setLayout(new GridLayout(2,3));
		JButton enviar = new JButton("enviar formulario");
		JLabel etiquetaUsuario = new JLabel("Usuario: ", JLabel.RIGHT);
		JLabel etiquetaPass = new JLabel("Passwords: ", JLabel.RIGHT);
		JLabel InstruccionesUsuario = new JLabel("menos de 15", JLabel.LEFT);
		JLabel InstruccionesPass = new JLabel("entre 8 -12caracteres", JLabel.LEFT);
		cUsuario = new JTextField(20);
		cPass = new JPasswordField(12);
		cPass.getDocument().addDocumentListener(new EventoPassword());
		rejilla.add(etiquetaUsuario);
		rejilla.add(cUsuario);
		rejilla.add(InstruccionesUsuario);
		rejilla.add(etiquetaPass);
		rejilla.add(cPass);
		rejilla.add(InstruccionesPass);
		//add(rejilla);
		add(rejilla, BorderLayout.NORTH);
		add(enviar, BorderLayout.SOUTH);
		
	}
	private class EventoPassword implements DocumentListener {

		public void changedUpdate(DocumentEvent e) {
			
		}

		public void insertUpdate(DocumentEvent e) {

			if (cPass.getPassword().length <8 || cPass.getPassword().length >12) {
				cPass.setBackground(Color.WHITE);
				cPass.setForeground(Color.RED.darker());
			}else {
				cPass.setBackground(Color.WHITE);
				cPass.setForeground(Color.BLACK);
			}
		}

		public void removeUpdate(DocumentEvent e) {
			if (cPass.getPassword().length <8 || cPass.getPassword().length >12) {
				cPass.setBackground(Color.WHITE);
				cPass.setForeground(Color.RED.darker());
			}else {
				cPass.setBackground(Color.WHITE);
				cPass.setForeground(Color.BLACK);
			}
		}
		
	}
	JTextField cUsuario;
	JPasswordField  cPass;
	
}