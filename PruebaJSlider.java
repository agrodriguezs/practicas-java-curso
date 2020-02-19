import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class PruebaJSlider {

	public static void main(String[] args) {

		JFrame ventana = new SliderVentana();
		ventana.setVisible(true);

	}

}

class SliderVentana extends JFrame {
	public SliderVentana()  {
		setBounds(560,100,500,200);
		setTitle("Prueba de JSlider");
		JPanel lamina = new SliderPanel();
		add(lamina);
		
		
	}
}

class SliderPanel extends JPanel {
	public SliderPanel()  {
		//JSpinner del Video 97 
		String listaFuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//String lista[]= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diriembre"};
		
		JSpinner control0 = new JSpinner(new SpinnerListModel(listaFuentes));
		
		//para alinear el contenido del spinner
		
		JSpinner spinner = new JSpinner();
		
		JSpinner.DefaultEditor sEditor = (JSpinner.DefaultEditor)spinner.getEditor();
		
		JSpinner.DefaultEditor tEditor = (JSpinner.DefaultEditor)control0.getEditor();
		
		JFormattedTextField text = (JFormattedTextField)sEditor.getComponent(0);
		
		JFormattedTextField text0 = (JFormattedTextField)tEditor.getComponent(0);
		
		text.setHorizontalAlignment(JFormattedTextField.CENTER);
		
		text0.setHorizontalAlignment(JFormattedTextField.CENTER);
		
		spinner.setPreferredSize(new Dimension(50, 20)); 
		
		//JSlider del Video 96
		JSlider control = new JSlider();
		control.setPreferredSize(new Dimension(400, 100)); 
		
		control0.setPreferredSize(new Dimension(100, 20)); 
		
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintTrack(true);
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		add(control0);
		add(control);
		
		add(spinner);
		
		JSpinner controlito = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				return super.getNextValue();
			}
		});
		Dimension d = new Dimension(200,20);
		controlito.setPreferredSize(d);
		add(controlito);
	}
}
