package practica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PracticaSwing {

	public static void main(String[] args) {

		JFrame Ventana = new PracticaVentana();
	
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Ventana.setVisible(true);

	}

}

class PracticaVentana extends JFrame {
	
	PracticaVentana(){
		
		setTitle("Practica Ventanas Emergentes");
		
		setBounds(600,100,600,450);
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Image miIcono = pantalla.getImage("src/practica/images/te.png");
		
		this.setIconImage(miIcono);
		
		JPanel lamina = new LaminaOpciones();
		
		add(lamina);
		
		
		
	}
}

class LaminaOpciones extends JPanel {
	
	public LaminaOpciones() {
		
		setLayout(new BorderLayout());
		
		//------------------------------------------
		
		JPanel laminaTitulo = new JPanel();
        
		JLabel titulo = new JLabel("Practica de Swing");
		
		titulo.setFont(new Font("verdana", Font.BOLD, 20));
		
		laminaTitulo.add(titulo);
		
		//------------------------------------------
		
		JPanel laminaContenido = new JPanel();
		laminaContenido.setLayout(new GridLayout(2,3));
		
		BoxTipo = Box.createVerticalBox();
		BoxTipo.setBorder(BorderFactory.createTitledBorder("Tipo"));
		GTipo = new ButtonGroup();
		botonRadio("Mensaje", GTipo, BoxTipo, false);
		botonRadio("Confirmar", GTipo, BoxTipo, false);
		botonRadio("Option", GTipo, BoxTipo, false);
		botonRadio("Entrada", GTipo, BoxTipo, false);
		
		BoxTipoMensaje = Box.createVerticalBox();
		BoxTipoMensaje.setBorder(BorderFactory.createTitledBorder("Tipo de Mensaje"));
		GTipoMensaje = new ButtonGroup(); 
		botonRadio("ERROR_MESSAGE", GTipoMensaje, BoxTipoMensaje, false);
		botonRadio("INFORMATION_MESSAGE", GTipoMensaje, BoxTipoMensaje, false);
		botonRadio("WARNING_MESSAGE", GTipoMensaje, BoxTipoMensaje, false);
		botonRadio("QUESTION_MESSAGE", GTipoMensaje, BoxTipoMensaje, false);
		botonRadio("PLAIN_MESSAGE", GTipoMensaje, BoxTipoMensaje, false);
		
		BoxMensaje = Box.createVerticalBox();
		BoxMensaje.setBorder(BorderFactory.createTitledBorder("Mensaje"));
		GMensaje = new ButtonGroup(); 
		botonRadio("Cadena", GMensaje, BoxMensaje, false);
		botonRadio("Icono", GMensaje, BoxMensaje, false);
		botonRadio("Componente", GMensaje, BoxMensaje, false);
		botonRadio("Otros", GMensaje, BoxMensaje, false);
		botonRadio("Object []", GMensaje, BoxMensaje, false);

		BoxConfirmar = Box.createVerticalBox();
		BoxConfirmar.setBorder(BorderFactory.createTitledBorder("Confirmar"));
		GConfirmar = new ButtonGroup(); 
		botonRadio("DEFAULT_OPTION", GConfirmar, BoxConfirmar, false);
		botonRadio("YES_NO_OPTION", GConfirmar, BoxConfirmar, false);
		botonRadio("YES_NO_CANCEL_OPTION", GConfirmar, BoxConfirmar, false);
		botonRadio("OK_CANCEL_OPTION", GConfirmar, BoxConfirmar, false);
		
		
		BoxOption = Box.createVerticalBox();
		BoxOption.setBorder(BorderFactory.createTitledBorder("Opciones"));
		GOption = new ButtonGroup();
		botonRadio("String", GOption, BoxOption, false);
		botonRadio("Iconos", GOption, BoxOption, false);
		botonRadio("Objetc []", GOption, BoxOption, false);
		
		BoxEntrada = Box.createVerticalBox();
		BoxEntrada.setBorder(BorderFactory.createTitledBorder("Tipo de Entrada"));
		GEntrada = new ButtonGroup();
		botonRadio("Campo de Texto", GEntrada, BoxEntrada, false);
		botonRadio("Combo Box", GEntrada, BoxEntrada, false);
		
		laminaContenido.add(BoxTipo);
		laminaContenido.add(BoxTipoMensaje);
		laminaContenido.add(BoxMensaje);
		laminaContenido.add(BoxConfirmar);
		laminaContenido.add(BoxOption);
		laminaContenido.add(BoxEntrada);
		
		//------------------------------------------
		
		JPanel laminaBoton = new JPanel();
		
		enviar = new JButton("Crear Vetana");
		
		enviar.addActionListener(new CrearVentana());

		laminaBoton.add(enviar);
		
		//------------------------------------------
		
		add(laminaTitulo, BorderLayout.NORTH);
		
		add(laminaContenido, BorderLayout.CENTER);
		
		add(laminaBoton, BorderLayout.SOUTH);
	
	}
	
	 public void botonRadio(String nombre, ButtonGroup grupo, Box caja, boolean selecto) {
		 
		 	JRadioButton boton= new JRadioButton(nombre, selecto);
		 	
			grupo.add(boton);
			
			caja.add(boton);
	}
	 
	 class CrearVentana implements ActionListener  {

		public void actionPerformed(ActionEvent e) {
			
			System.out.println(GTipo.getElements());
			
			/*if (GTipo.getSelection()) {

				JOptionPane.showMessageDialog(LaminaOpciones.this, "Mensaje del boton 1", "Message", 1);
				
			}else if (e.getSource() == boton2) {

				JOptionPane.showInputDialog(LaminaOpciones.this, "Mensaje del boton 2", "InputDialog", 3);
				
			}else if (e.getSource() == boton3) {

				JOptionPane.showConfirmDialog(LaminaOpciones.this, "Ud esta Loco ?", "ConfirmDialog", 0);
				
			}else {
			
				Toolkit pantalla = Toolkit.getDefaultToolkit();
				Icon miIcono = new ImageIcon("src/practica/images/taxi.png");
				JOptionPane.showOptionDialog(LaminaOpciones.this, "mensaje boton 4", "OptionDialog", 1, 1, miIcono, null, null);
				
			}*/
			
		}
		 
	 }
	 
	 private ButtonGroup GTipo, GTipoMensaje, GMensaje, GConfirmar, GOption, GEntrada;
	 private Box BoxTipo, BoxTipoMensaje, BoxMensaje, BoxConfirmar, BoxOption, BoxEntrada;
	 private String vTipo, vTipoMensaje, vMensaje, vConfirmar, cOpcion, vEntrada;
	 private JButton enviar;
}


