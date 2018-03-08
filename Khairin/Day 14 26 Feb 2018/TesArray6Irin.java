//SISIP SUATU BILANGAN PADA POSISI TERTENTU PADA ARR1
//int[] arr2 = new int[10];
//int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
//int[] arr4 = new int[10];

import java.util.Scanner;

public class TesArray6Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] temp = new int[numbers.length+1];
		int input, index=0, sisip, posisi;
		boolean kondisi = false;

		//MENAMPILKAN ISI ARRAY NUMBERS
		for ( int num : numbers) {
			System.out.print(num + " ");
		}

		//USER MENGINPUT POSISI YANG INGIN DIPILIH DAN DISISIPKAN
		System.out.println("\nPilih posisi ke berapa?");
		posisi = keyboard.nextInt();
		System.out.println("\nSisipkan nilai untuk posisi tersebut: ");
		sisip = keyboard.nextInt();


		//PROSES PENGECEKKAN POSISI YANG DIPILIH DAN DISIMPAN PADA ARRAY TEMP
		for (int b = 0 ; b < temp.length ; b++){
			if( b == (posisi-1)){
				temp[b]= sisip;
			}
			else{
				temp[b] = numbers[index];
				index++;
			}

		}

		//INISIALISASI LENGTH DARI ARRAY NUMBERS
		numbers =  new int[temp.length];

		//MEMINDAHKAN NILAI DARI ARRAY TEMP KE ARRAY NUMBERS
		for (int b = 0 ; b < temp.length ; b++){
			numbers[b] = temp[b];
		}

		//MENAMPILKAN NILAI ARRAY NUMBERS YANG TELAH DIISI POSISINYA
		for ( int b = 0 ; b < numbers.length ; b++){
		System.out.print(numbers[b] + " " );
		}

	} 
}

