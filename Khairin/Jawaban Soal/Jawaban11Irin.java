/*Soal no 11

Given value

contoh array : 0 1 2 3 4 5 6 7 8 9 10

(contoh : 10)

masukan nlai : 10

hasil : 10 adalah kombinasi dari
0 dan 10, 1 dan 9, 2 dan 8, 3 dan 7, 4 dan 6, 5 dan 5*/

import java.util.Scanner;

public class Jawaban11Irin {
	public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

	System.out.println("Masukkan niai : ");
	value = keyboard.nextInt();
	int[] array = new int[value+1];


		for(i=0 ; i <= value ; i++){
			array[i] = i;
		}

		System.out.println("Nilai " + array + "adalah kombinasi dari : " );
	}	
}