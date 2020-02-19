package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploTextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new TAVentana();
	}

}

class TAVentana extends JFrame {
	TAVentana(){
		JPanel area = new TAPanel();	
		setBounds(650,100,500,160);
		setTitle("Area de Texto");
		add(area);
		setVisible(true);
	}
}

class TAPanel extends JPanel {
	TAPanel(){
		JButton boton = new JButton("Enviar a Consola");
		boton.addActionListener(new botonEvento());
		narracion = new JTextArea(5,30);
		narracion.setLineWrap(true);
		JScrollPane areaNarracion = new JScrollPane(narracion);
		add(areaNarracion);
		add(boton);
		
	}
	private class botonEvento implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println(narracion.getText());
		}
		
	}
	JTextArea narracion;
}