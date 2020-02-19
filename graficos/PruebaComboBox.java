package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaComboBox {

	public static void main(String[] args) {
		JFrame ventana = new MarcoComboBox();
	}

}
class MarcoComboBox extends JFrame {
	public MarcoComboBox(){
		
		setBounds(650,100,500,300);
		setTitle("Pruebas de ComboBox");
		setLayout(new BorderLayout());
		
		laminaComboBox = new JPanel();
		String listaFuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		combo = new JComboBox(listaFuentes);
	
		/*combo.addItem("Serif");
		combo.addItem("Sans Serif");
		combo.addItem("Dialog");
		combo.addItem("Monospaced");
		combo.addItem("Verdana");*/
		
		combo.addActionListener(new EventoCombo());
		
		laminaComboBox.add(combo);
		palabras = new JLabel("Adriana Gabriela Rodriguez Sanabria", JLabel.CENTER );
		Font letra = new Font("Serif",Font.PLAIN, 18);
		palabras.setFont(letra);
		add(laminaComboBox, BorderLayout.NORTH);
		add(palabras, BorderLayout.CENTER);

		setVisible(true);
	}
	
	class EventoCombo implements ActionListener  {

		public void actionPerformed(ActionEvent e) {
			
			palabras.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN, 18));
		}
		
	}
	
	private JLabel palabras;
	private JComboBox combo;
	private JPanel laminaComboBox;
}