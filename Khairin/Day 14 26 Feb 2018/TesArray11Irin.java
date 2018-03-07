//TAMPILKAN BILANGAN2 YANG SAMA2 ADA DI ARR1 DAN ARR3
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray11Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] numbers3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};


		System.out.print("Bilangan pada arr1 adalah: ");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}

		System.out.print("Bilangan pada arr3 adalah: ");
		for ( int num2 : numbers3 ) {
			System.out.print(num2 + " ");
		}

		for ( int index=0; index < numbers.length; index++){
			for ( int index3=0; index3 < numbers3.length; index3++) {
				if (numbers[index] == numbers3[index3]){
				System.out.println("Bilangan yang sama: " +  numbers3[index3]);
			}
			}
		}
	}

}

