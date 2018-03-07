// ilham 07-03-2018

import java.util.Scanner;

public class LatihanSoalNoTigaBelas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] huruf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
//		String[] tempHuruf = huruf;
		String input;
		int geser;

		System.out.println("Nilai array: ");
		for (String n : huruf) {
			System.out.print(n + " ");	
		}

		System.out.print("\nMasukkan Kata: ");
		input = keyboard.next();
		System.out.print("Geser berapa ke kiri: ");
		geser = keyboard.nextInt();

		for (int h = 0; h < input.length(); h++) {	
			for (int i = 0; i < huruf.length; i++) {
				if (huruf[i].equalsIgnoreCase(input.substring(h,h+1))) {
					if (i - geser < 0) {
						System.out.print(huruf[huruf.length + i - geser] + " ");
					} else {
						System.out.print(huruf[i - geser] + " ");
					}
				}
			}
		}

/*
		for (int i = 0; i < huruf.length; i++) {
			if (i - geser < 0) {
				huruf[huruf.length + i - geser] = tempHuruf[i];
			}
			else {
				huruf[i - geser] = tempHuruf[i];
			}
		}

		System.out.println("\nNilai array setelah di geser: ");
		for (String n : huruf) {
			System.out.print(n + " ");	
		}
*/
	}
}