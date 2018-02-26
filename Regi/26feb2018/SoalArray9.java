import java.util.Scanner;

public class SoalArray9 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] arr2 = new int [10];
		int[] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79 };
		int[] arr4 = new int [10];

		int max = arr1[0];
		
		System.out.print("\nArr1: ");
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}
		System.out.println();

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			if ( arr1[i] > max ) {
				max = arr1[i];
			}
		}
		
		System.out.print("\nNilai maksimum arr1 adalah: " + max );
		System.out.println();
	}
}