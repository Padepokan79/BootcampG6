public class JawabanNo16{
	public static void main (String[]args){
		int nilai [][] = new int [2][3];
		nilai [0] [0] = 2 ;
		nilai [0] [1] = 6 ; 
		nilai [0] [2] = 8 ;
		nilai [1] [0] = 6 ; 
		nilai [1] [1] = 8 ;
		nilai [1] [2] = 10 ;

		for (int b = 0; b < nilai.length; b++){
			for (int k = 0; k < nilai[0].length; k++){
				System.out.print (nilai[b][k] + " ");
			}
			System.out.println ();
		}
		
	}
}