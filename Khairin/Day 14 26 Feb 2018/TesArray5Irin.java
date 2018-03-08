//HAPUS SUATU POSISI DARI ARR1
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray5Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] temp = new int[numbers.length-1];
		int input, index=0;
		boolean kondisi = false;

		//MENAMPILKAN ISI ARRAY NUMBERS
		for ( int num : numbers) {
			System.out.print(num + " ");
		}

		//USER MENGINPUT POSISI YANG INGIN DIHAPUS
		System.out.println("\nHapus posisi ke berapa?");
		input = keyboard.nextInt();

		//PROSES PENGECEKKAN POSISI YANG INGIN DIHAPUS DAN DISIMPAN PADA ARRAY TEMP
		for (int i = 0 ; i < numbers.length ; i++){
			if (i != (input-1)) {
			temp[index] = numbers[i];
			index++;
			}
		}

		//INISIALISASI LENGTH DARI ARRAY NUMBERS
		numbers =  new int[temp.length];

		//MEMINDAHKAN NILAI DARI ARRAY TEMP KE ARRAY NUMBERS
		for (int i = 0 ; i < temp.length ; i++){
			numbers[i] = temp[i];
		}

		//MENAMPILKAN NILAI ARRAY NUMBERS YANG TELAH DIHAPUS POSISINYA
		for ( int i = 0 ; i < numbers.length ; i++){
		System.out.print(numbers[i] + " " );
		}

	} 
}

