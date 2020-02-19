package graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new EVentana();

	}

}

class EVentana extends JFrame {
	EVentana(){
		setBounds(100,100,600,300);
		setTitle("Eventos en Campos de Texto");
		
		JPanel formulario = new EPanel();
		add(formulario);
		
		setVisible(true);
	}
	
}
class EPanel extends JPanel {
	EPanel(){
		JTextField campo = new JTextField(20);
		Document informacion = campo.getDocument();
		informacion.addDocumentListener(new EventosDeTexto());
		add(campo);
	}
	
	private class EventosDeTexto implements DocumentListener {

		public void changedUpdate(DocumentEvent e) {
			System.out.println("estas cambiando el texto");
			
		}

		public void insertUpdate(DocumentEvent e) {
			System.out.println("estas escribiendo");
			
		}

		public void removeUpdate(DocumentEvent e) {
			System.out.println("estas borrando");
			
		}
		
	}
}
