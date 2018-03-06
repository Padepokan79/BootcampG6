import java.util.Scanner;

public class TesArray2Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int toFind;
		boolean kondisi = false;


			System.out.print("Sebutkan sebuah bilangan? ");
			toFind = keyboard.nextInt();

			for ( int index=0; index < numbers.length; index++) {
				if ( numbers[index] == toFind) {
					System.out.println( numbers[index] + " ditemukan" );
					kondisi = true;
				}
				}
				if ( kondisi == false){				
				System.out.println( toFind + " Tidak ditemukan" ); 	
				} 
	}
}