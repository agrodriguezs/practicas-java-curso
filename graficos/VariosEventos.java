package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosEventos {

	public static void main(String[] args) {
		miVentana ventana = new miVentana();
	}
}

class miVentana extends JFrame  {
	public miVentana()  {
		setBounds(300,200,600,300); 	
		miPanel lamina = new miPanel();
		miPanel0 lamina0 = new miPanel0();
		setTitle("Varios Layout"); 
		add(lamina0, BorderLayout.NORTH);
		add(lamina, BorderLayout.CENTER);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class miPanel0 extends JPanel  {
	public miPanel0()  {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("uno"));
		add(new JButton("dos"));
		add(new JButton("tres"));
	}
}

class miPanel extends JPanel  {
	public miPanel()  {
		setLayout(new BorderLayout(0,10));
		add(new JButton("Amarillo"), BorderLayout.NORTH);		
		add(new JButton("Azul"), BorderLayout.SOUTH);
		add(new JButton("Rojo"), BorderLayout.CENTER);
		add(new JButton("Morado"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
	}
}