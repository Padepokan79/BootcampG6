public class SoalNo16{
	public static void main(String[] args) {
		int [][] matrix = new int [2][3]; 
		matrix [0][0]= 2;
		matrix [0][1] = 6;
		matrix [0][2] = 8;
		matrix [1][0] = 6;
		matrix [1][1] = 8;
		matrix [1][2] = 10;

		System.out.println("16. Buatlah matrix menggunakan array!\n");
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}
}