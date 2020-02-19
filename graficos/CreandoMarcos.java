package graficos;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
	
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		
		//el programa cierra al cerrar la ventana
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame  {
	public miMarco()  {
		//setSize(600,400);				//fija ancho y alto de la ventana
		//setLocation(300,200);			//fija posicion en pantalla 
		setBounds(300,200,300,300); 	//fija posicion en pantalla y ancho y alto de la ventana
		setTitle("Ventana de Adriana"); //fija titulo a la ventana
	//	setResizable(false);			//no permite que se modifique el alto y ancho de la ventana
	//	setExtendedState(Frame.MAXIMIZED_BOTH); 		//maximiza la ventana
	}
}

