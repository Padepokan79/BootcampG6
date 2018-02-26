import java.util.Scanner;

public class Soal4 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];
		int pos = 0, bil;
		boolean found;

		System.out.print("\nArr1: ");

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}

		System.out.println();
		System.out.print( "\nPosisi berapa yang ingin anda ubah: " );
		pos = keyboard.nextInt();
		
		while ( pos > arr1.length ) {
			System.out.println( "\nMaaf tidak ada posisi ke " + pos );
			System.out.print( "\nPosisi berapa yang ingin anda ubah: " );
			pos = keyboard.nextInt();
		}

		if ( pos <= arr1.length ) {
			System.out.print( "\nMasukan bilangan baru: " );
			bil = keyboard.nextInt();

			for ( int i = 0 ; i < arr1.length ; i ++ ) {
				if ( (pos - 1) == i ) {
					arr1[i] = bil;
				} 
			}

			System.out.print("\nArr1 setelah diubah: ");

			for ( int i = 0 ; i < arr1.length ; i ++ ) {
				System.out.print( arr1[i] + " " );
			}
			
			System.out.println();
		}
	}
}