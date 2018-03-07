//TAMPILKAN NILAI MINIMUM ARR1
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray8Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int min=0;

		for ( int num : numbers) {
			System.out.print(num + " ");

		}

		for ( int index=0; index < numbers.length; index++){
			if ( index == 0){
				min = numbers[0];
			}
			if ( min > numbers[index]) {
				min = numbers[index];
			}
		} 
		System.out.println("Nilai minimum arr1 adalah: " + min);
	}

}

