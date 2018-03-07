//JUMLAHKAN ELEMEN ARR1 DAN ARR3 SIMPAN PADA ARR4

//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray12Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] numbers3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arr4 = new int[10];


		System.out.print("Bilangan pada arr1 adalah: ");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}

		System.out.print("Bilangan pada arr3 adalah: ");
		for ( int num2 : numbers3 ) {
			System.out.print(num2 + " ");
		}
		System.out.println("\nBilangan pada arr4 adalah: ");
		for ( int index=0; index < arr4.length; index++){
			arr4[index] = numbers[index] + numbers3[index];
			System.out.println(arr4[index] + " ");
		}
	}
}
