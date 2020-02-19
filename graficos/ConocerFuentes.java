package graficos;
import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class ConocerFuentes {

	public static void main(String[] args) {
		String fuente = JOptionPane.showInputDialog("Introduce la fuente a buscar");
		boolean siesta = false;
		
		String [] misfuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
		
		for (String mifuente : misfuentes) {
			//System.out.println(mifuente);
			if (mifuente.equals(fuente)) {
				siesta = true;
			}
		}
		if (siesta) {
			System.out.println("la fuente " + fuente + " esta instalada");
		}
		else {
			System.out.println("la fuente " + fuente + " NO esta instalada");
		}

	}

}
