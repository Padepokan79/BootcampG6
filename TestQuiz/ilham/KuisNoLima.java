// ilham 08-03-2018

import java.util.Scanner;

public class KuisNoLima {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputanSementara;
		int[] number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] tempArr;
		int angka, posisi;

		System.out.println("Deretan Number: ");
		tampilArray(number1);		
		
		System.out.print("Masukan Angka yang mau disisipkan: ");
		inputanSementara = keyboard.nextLine();

		while ( !(inputanSementara.matches("[0-9]*")) || inputanSementara.length() == 0) {
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
		}

		angka = Integer.valueOf(inputanSementara);

		System.out.print("Sisipkan pada posisi ke: ");
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
				System.out.println("Maaf, input posisi tidak boleh kurang dari 1.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			else if (Integer.valueOf(inputanSementara) > 10) {
				System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
		}

		posisi = Integer.valueOf(inputanSementara);

		tempArr = number1;
		number1 = new int[tempArr.length+1];

		for (int indexArray = 0; indexArray < number1.length; indexArray++) {
			if (indexArray < (posisi-1)) {
				number1[indexArray] = tempArr[indexArray];
			}
			else if (indexArray == (posisi-1)) {
				number1[indexArray] = angka;
			}
			else {
				number1[indexArray] = tempArr[indexArray-1];
			}
		}

		System.out.println();
		tampilArray(number1);

	}

	public static void tampilArray(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}