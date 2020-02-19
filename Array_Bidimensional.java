
public class Array_Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	vnew int[3][4];
		
		Matrix[0][0] = 4;
		Matrix[0][1] = 84;
		Matrix[0][2] = 1;
		Matrix[0][3] = 54;
		
		Matrix[1][0] = 42;
		Matrix[1][1] = 64;
		Matrix[1][2] = 13;
		Matrix[1][3] = 574;
		
		Matrix[2][0] = 44;
		Matrix[2][1] = 844;
		Matrix[2][2] = 41;
		Matrix[2][3] = 454;*/
		
		int [][] Matrix = {	{1,2,3,4},	{5,6,7,8},	{9,2,4,7} };
		
	/*	for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(Matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	*/
		for (int [] fila: Matrix) {
			System.out.println();
			for (int elemento: fila) {
				System.out.print(elemento + " ");
			}
		}
		
	}

}
