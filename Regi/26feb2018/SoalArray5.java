import java.util.Scanner;

public class SoalArray5 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];
		int[] temp = new int [9];
		int pos = 0;

		System.out.print("\nArr1: ");

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}

		System.out.println();
		System.out.print( "\nPosisi berapa yang ingin anda hapus: " );
		pos = keyboard.nextInt();
		
		while ( pos > arr1.length ) {
			System.out.println( "\nMaaf tidak ada posisi ke " + pos );
			System.out.print( "\nPosisi berapa yang ingin anda hapus: " );
			pos = keyboard.nextInt();
		}

		if ( pos <= arr1.length ) {
			int j = 0;
			for ( int i = 0 ; i < arr1.length ; i ++ ) {
				if ( i != ( pos - 1 ) ) {
					temp[j] = arr1[i];
					j ++;
				}
			}

			System.out.print( "\nPosisi arr1 yang baru: " );

			arr1 = new int [9];
			for ( int i = 0 ; i < arr1.length ; i ++ ) {
				arr1[i] = temp[i];
				System.out.print( arr1[i] + " " );
			}
		}
		System.out.println();
	}
}