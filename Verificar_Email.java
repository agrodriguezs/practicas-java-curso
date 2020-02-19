import javax.swing.JOptionPane;

public class Verificar_Email {
	
	public static void main(String[] args) {
	
		int arroba = 0;
		boolean punto = false;
		
		String email = JOptionPane.showInputDialog("Escribe tu correo electronico");
		
		for(int i=0;i<email.length();i++) {
			
			if (email.charAt(i)=='@') {
				arroba++;
			}
			if (email.charAt(i)=='.') {
				punto = true;
			}
		}
		if (arroba==1 && punto==true) {
			System.out.println("EL email es correcto");
		}else {
			System.out.println("EL email es incorrecto");
		}
		
		
	}
}
