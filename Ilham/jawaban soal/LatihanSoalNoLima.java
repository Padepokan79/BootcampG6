// ilham 07-03-2018

import java.util.Scanner;

public class LatihanSoalNoLima {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input;
		int nilai;
		
		System.out.print("Masukkan angka (kurang dari 5): ");
		input = keyboard.nextInt();
		
		if (input > 5) {
			input = 5;
			System.out.println("Inputan tidak bisa lebih dari 4");
		}
		for (int i = 0; i <= input; i++) {
			nilai = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(nilai + " ");
				nilai = nilai * (i-j) / (j+1);
			}		
			System.out.println("");
		}
	}
}