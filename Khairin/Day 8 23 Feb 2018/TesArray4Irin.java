//TERIMA NILAI DAN UBAH NILAI UNTUK SUATU POSISI PADA ARR1
import java.util.Scanner;

public class TesArray4Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int toFind, change;
		boolean kondisi = false;

		for ( int num : numbers) {
			System.out.print(num + " ");

		}

		System.out.println("\nSebutkan sebuah bilangan? ");
		toFind = keyboard.nextInt();

		for ( int index=0; index < numbers.length; index++){
			if ( numbers[index] == toFind) {
				System.out.println( toFind + " ditemukan" ); 
				System.out.println("Ubah dengan nilai berapa? " );
				change = keyboard.nextInt();
				numbers[index] = change;

				kondisi = true;
			}
		}

		System.out.println("Nilai array baru: ");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}	
		
		if ( kondisi == false){				
			System.out.println( toFind + " Tidak ditemukan" ); 	
		} 
	}
}

