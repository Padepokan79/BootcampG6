import java.util.Scanner;

public class TesArray3Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int toFind;
		boolean kondisi = false;

		for ( int num : numbers) {
			System.out.print(num + " ");

		}

		System.out.println("\nSebutkan sebuah bilangan? ");
		toFind = keyboard.nextInt();

		for ( int index=0; index < numbers.length; index++){
			if ( numbers[index] == toFind) {
				System.out.println("Bilangan " + toFind + " berada di posisi ke- " + (index+1) );
				kondisi = true;
			}
		}
		
		if ( kondisi == false){				
			System.out.println( toFind + " Tidak ditemukan" ); 	
		} 
	}
}

