//TAMPILKAN NILAI MAKSIMUM ARR1

//TAMPILKAN NILAI MINIMUM ARR1
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray9Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int max=0;

		for ( int num : numbers) {
			System.out.print(num + " ");

		}

		for ( int index=0; index < numbers.length; index++){
			if ( index == 0){
				max = numbers[0];
			}
			if ( max < numbers[index]) {
				max = numbers[index];
			}
		} 
		System.out.println("\nNilai maximum arr1 adalah: " + max);
	}

}

