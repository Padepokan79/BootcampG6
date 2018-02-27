import java.util.Scanner;

public class SoalArray12 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];
		
		System.out.print("\nArr1: ");
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}
		System.out.println();

		System.out.print("\nArr3: ");
		for ( int i = 0 ; i < arr3.length ; i ++ ) {
			System.out.print( arr3[i] + " " );
		}
		System.out.println();

		System.out.print("\nArr4 awal: ");
		for ( int i = 0 ; i < arr4.length ; i ++ ) {
			System.out.print( arr4[i] + " " );
		}
		System.out.println();

		System.out.println( "\nHasil penjumlahan elemen arr1 dan arr3: " );
		for ( int k = 0 ; k < arr4.length ; k ++ ) {
				arr4[k] = arr1[k] + arr3[k];
		}

		System.out.print("\nArr4 yang baru: ");
		for ( int k = 0 ; k < arr4.length ; k ++ ) {
			System.out.print( arr4[k] + " " );
		}
		System.out.println();

	}
}