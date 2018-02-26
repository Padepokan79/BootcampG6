import java.util.Scanner;

public class SoalArray11 {
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
		for ( int j = 0 ; j < arr3.length ; j ++ ) {
			System.out.print( arr3[j] + " " );
		}
		System.out.println();

		System.out.print( "\nBilangan2 yang sama2 ada di arr1 dan arr3 adalah: " );
		for ( int k = 0 ; k < arr1.length ; k ++ ) {
			for ( int l = 0 ; l < arr3.length ; l ++ ) {
				if ( arr1[k] == ( arr3[l] ) ) {
					System.out.print( arr1[k] + " " );
				}
			}
		}
		System.out.println();

	}
}