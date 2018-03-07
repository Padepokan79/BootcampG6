// ilham 06-03-2018

import java.util.Scanner;

public class LatihanSoalNoSepuluh {
	public static void main(String[] args) {
		int[] number = {0, 0, 80, 49, 0, 13, 57, 0, 0, 61, 0, 72, 0, 34, 26};
		int tempNumber = 0;

		System.out.println("Nilai array: ");
		for (int n : number) {
			System.out.print(n + " ");	
		}

		System.out.println("\n\nMengurutkan dari terkecil dan simpan aangka 0 di akhir array.");

		for (int i = 1; i < number.length; i++) {
			for (int j = 0; j < number.length-i; j++) {
				if (number[j] > number[j+1]) {
					tempNumber = number[j];
					number[j] = number[j+1];
					number[j+1] = tempNumber;
				}
			}
		}

		for (int i = 1; i < number.length; i++) {
			for (int j = 0; j < number.length-i; j++) {
				if (number[j] == 0) {
					tempNumber = number[j];
					number[j] = number[j+1];
					number[j+1] = tempNumber;
				}
			}
		}

		System.out.println("Nilai array setelah di urut: ");
		for (int n : number) {
			System.out.print(n + " ");	
		}
	}
}