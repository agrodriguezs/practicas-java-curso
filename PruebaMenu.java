package practica;

import javax.swing.*;

public class PruebaMenu {

	public static void main(String[] args) {

		JFrame marco = new FrameMenu();
		marco.setVisible(true);

	}

}
class FrameMenu extends JFrame {
	public FrameMenu() {
		setTitle("Prueba de Menú");
		setBounds(630,200,700,500);
		JPanel lamina = new PanelMenu();
		add(lamina);
	}
}

class PanelMenu extends JPanel {
	public PanelMenu() {
		JMenuBar barraMenu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu window = new JMenu("Window");
		JMenu help = new JMenu("Help");
				
		JMenuItem new1 = new JMenuItem("New");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem close = new JMenuItem("Close");
		JMenuItem exit = new JMenuItem("Exit");
		
		file.add(new1);
		file.add(save);
		file.add(close);
		file.addSeparator();
		file.add(exit);
		
		JMenuItem copy = new JMenuItem("Copy", new ImageIcon("src/practica/images/copiar.gif"));
		JMenuItem cute = new JMenuItem("Cute", new ImageIcon("src/practica/images/cortar.gif"));
		JMenuItem paste = new JMenuItem("Paste", new ImageIcon("src/practica/images/pegar.gif"));
		JMenuItem finder = new JMenuItem("Finder");
		
		edit.add(copy);
		//edit.add
		edit.add(cute);
		edit.add(paste);
		edit.addSeparator();
		edit.add(finder);
		
		JMenuItem editor = new JMenuItem("Editor");
		JMenuItem preferences = new JMenuItem("Preferences");
	
		window.add(editor);
		window.add(preferences);
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenu opcion2 = new JMenu("Opcion 2");
		JMenuItem opcion21 = new JMenuItem("Opcion 2.1");
		JMenuItem opcion22 = new JMenuItem("Opcion 2.2");
		JMenuItem opcion23 = new JMenuItem("Opcion 2.3");
		JMenuItem opcion24 = new JMenuItem("Opcion 2.4");
		
		opcion2.add(opcion21);
		opcion2.add(opcion22);
		opcion2.add(opcion23);
		opcion2.add(opcion24);
		
		help.add(opcion1);
		help.addSeparator();
		help.add(opcion2);
		
		barraMenu.add(file);
		barraMenu.add(edit);
		barraMenu.add(window);
		barraMenu.add(help);
		
		add(barraMenu);
	}
}