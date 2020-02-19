
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double acumulado;
		double interes = 0.10;
		
		double [][] saldo = new double[6][5];
		
		for (int i=0;i<5;i++) {
			acumulado = 10000;
			saldo[0][i] = acumulado;		
			for (int j=1;j<6;j++) {
				acumulado = acumulado+(acumulado*interes);
				saldo[j][i] = acumulado;
			}
			interes = interes + 0.01;
		}
		for (double [] fila:saldo) {
			System.out.println();
			for(double elemento:fila) {
				System.out.printf("%1.2f", elemento);
				System.out.print(" ");
			} 
		}
	}

}
