//MENGURUTKAN NILAI PADA ARR1
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray14Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int temp=0;

		System.out.print("Bilangan pada arr1 adalah: ");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}

		for ( int index=0; index < numbers.length; index++){
			for (int a = 1; a< (numbers.length-index); a++){
				if ( numbers[a-1] > numbers[a]){
				temp = numbers[a-1];
				numbers[a-1] = numbers[a];
				numbers[a] = temp;
			}
			}
		}
		System.out.println("\nUrutan Nilai dari yang terkecil: ");
		for ( int num : numbers) {
		System.out.println(num + " ");
		}
	} 

}
	
