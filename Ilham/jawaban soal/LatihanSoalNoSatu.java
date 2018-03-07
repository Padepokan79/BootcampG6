// ilham 07-03-2018

import java.util.Scanner;

public class LatihanSoalNoSatu {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int batas = 0;

		System.out.print("Masukkan Batas: ");
		batas = keyboard.nextInt();

		System.out.println("Bilangan prima: ");
		for (int i = 2; i <= batas; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.print(i + " ");
			} 
			else if ( !(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) ) {
				System.out.print(i + " ");
			}
		}

	}
}