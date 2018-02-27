import java.util.Scanner;

public class SoalArray6 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];
		int[] temp = new int [10];
		int pos = 0, bil;

		System.out.print("\nArr1: ");

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			temp[i] = arr1[i];
		}

		System.out.println();
		System.out.print( "\nDi posisi ke berapa anda ingin menyisipkan bilangan: " );
		pos = keyboard.nextInt();
		
		while ( pos > arr1.length ) {
			System.out.println( "\nMaaf tidak ada posisi ke " + pos );
			System.out.print( "\nDi posisi ke berapa anda ingin menyisipkan bilangan: " );
			pos = keyboard.nextInt();
		}

		if ( pos <= arr1.length ) {
			System.out.print( "\nMasukan bilangan yang ingin disisipkan: " );
			bil = keyboard.nextInt();

			arr1 = new int [11];
			int j = 0;

			for ( int i = 0 ; i < arr1.length ; i ++ ) {
				if ( i != ( pos - 1 ) ) {
					arr1[i] = temp[j];
					j ++;
				}
				else {
					arr1[j] = bil;
				}
			}
			
			System.out.print( "\nPosisi arr1 yang baru: " );

			for ( int i = 0 ; i < arr1.length ; i ++ ) {
				System.out.print( arr1[i] + " " );
			}
		}
		System.out.println();
	}
}