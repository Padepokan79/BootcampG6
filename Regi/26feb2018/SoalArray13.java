import java.util.Scanner;

public class SoalArray13 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];
		int pos1, pos2, temp = 0;

		System.out.print("\nArr1: ");

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}

		System.out.println();
		System.out.print( "\nBilangan di posisi ke: " );
		pos1 = keyboard.nextInt();
		System.out.print( "\nDi tukar ke posisi: " );
		pos2 = keyboard.nextInt();

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			if ( (pos1 - 1) == i ) {
				temp = arr1[pos1 - 1];
				arr1[pos1 - 1] = arr1[pos2 - 1];
				arr1[pos2 - 1] = temp;
			}
		}

		System.out.print( "\nHasil penukaran: " );
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}
		System.out.println();
	}
}