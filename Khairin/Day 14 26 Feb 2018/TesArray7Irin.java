//COPY ISI ARR1 KE ARR2
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray7Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] numbers2 = new int[10];
		int toFind;
		boolean kondisi = false;

		System.out.println("Isi Arr1 :");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}


		for ( int index=0; index < numbers2.length; index++){
			numbers2[index] = numbers[index];
		}

		System.out.println("\nIsi Arr2 :");
		for ( int num : numbers2) {
			System.out.print(num + " ");
		}
	}
}

