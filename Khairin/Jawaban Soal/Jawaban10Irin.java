/*Soal no 10
Original Array : {0,0,80,49,0,13,57,0,0,61,0,72,0,34,26}
urutkan dari kecil ke besar dan simpan angka 0 di akhir array*/

import java.util.Scanner;

public class Jawaban10Irin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {0,0,80,49,0,13,57,0,0,61,0,72,0,34,26};
		int temp = 0, nol = 0;

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
				if ( numbers[a-1] == 0){
					nol = numbers[a-1];
					numbers[a-1] = numbers[a];
					numbers[a] = nol;
				}

			}
		}
		System.out.println("\n\nUrutan Array Baru: ");
		for ( int num : numbers) {
		System.out.print(num + " ");
		}
	} 

}