// ilham 07-03-2018

import java.util.Scanner;

public class LatihanSoalNoDelapan {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		System.out.print("Masukkan angka : ");
		input = keyboard.nextInt();
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("#");
			}				
			System.out.println("");
		}
	}
}
