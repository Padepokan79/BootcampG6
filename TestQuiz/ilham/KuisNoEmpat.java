// ilham 08-03-2018

import java.util.Scanner;

public class KuisNoEmpat {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputanSementara;
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] tempArr;
		int banyakShift;

		System.out.print("Shift ke kiri Sebanyak: ");
		inputanSementara = keyboard.nextLine();

		while ( !(inputanSementara.matches("[0-9]*")) || inputanSementara.length() == 0 || Integer.valueOf(inputanSementara) < 1 || Integer.valueOf(inputanSementara) > 10 ) {
			if (!inputanSementara.matches("[0-9]*")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka positif.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();
			}
			// jika input kosong
			else if (inputanSementara.length() == 0) {
				System.out.println("Maaf, input harus di isi.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			else if (Integer.valueOf(inputanSementara) < 1) {
				System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			else if (Integer.valueOf(inputanSementara) > 10) {
				System.out.println("Maaf, Pergeseran tidak boleh lebih dari 10.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
		}

		banyakShift = Integer.valueOf(inputanSementara);

		tampilArray(deretAngka);

		tempArr = deretAngka;
		deretAngka = new int[tempArr.length];

		for (int indexArray = 0; indexArray < deretAngka.length; indexArray++) {
			if (indexArray < banyakShift) {
				deretAngka[deretAngka.length-banyakShift+indexArray] = tempArr[indexArray];
			}
			else {
				deretAngka[indexArray-banyakShift] = tempArr[indexArray];		
			}			
		}		

		System.out.println();
		tampilArray(deretAngka);

	}

	public static void tampilArray(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}