//TUKAR NILAI ANTARA DUA POSISI PADA ARR1
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray13Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int posisi1, posisi2, temp=0;

		System.out.print("Bilangan pada arr1 adalah: ");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println("Masukkan posisi yang akan ditukar ");
		System.out.println("posisi ke- : ");
		posisi1 = keyboard.nextInt(); 
		System.out.println("dengan posisi ke- : ");
		posisi2 = keyboard.nextInt();

		if (posisi1 > numbers.length || posisi2 > numbers.length){
			System.out.println("Index tersebut tidak ditemukan");
		}
		else{
			temp = numbers[posisi1-1];
			numbers[posisi1-1] = numbers[posisi2-1];
			numbers[posisi2-1] = temp;
		}
	
			System.out.println("Posisi ditukar: ");
			for ( int num : numbers) {
			System.out.print(num + " ");

		}
	}
	}	
