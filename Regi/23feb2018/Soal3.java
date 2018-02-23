import java.util.Scanner;

public class Soal3 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];
		int toFind;

		// jumlah
		for ( int i = 0 ; i < arr3.length ; i ++ ) {
			System.out.print( arr3[i] + " " );
		}
		System.out.println();

		System.out.print( "Masukan nilai yang anda cari: " );
		toFind = keyboard.nextInt();

		for ( int i = 0 ; i < arr3.length ; i ++ ) {
			if ( toFind == arr3[i] ) {
				System.out.print( toFind + " berada di index ke " + i );
			}
		}

		System.out.println();
		for ( int i = 0 ; i < arr3.length ; i ++ ) {
			if ( toFind == arr3[i] ) {
				System.out.print( toFind + " berada di posisi ke " + (i + 1) );
			}
		}
		
	}
}