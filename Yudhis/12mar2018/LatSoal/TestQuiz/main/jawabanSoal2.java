package main;

import java.util.Scanner;

public class jawabanSoal2 {
	private static Scanner input;

	public void soal2() {

		input = new Scanner(System.in);

		// Inisialisasi variable
		int batas = 0, angka;
		boolean inputBenar = false;

		// Input batas baris
		while (inputBenar == false) {
			System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : "); String strBatas = input.nextLine();

			if (strBatas.matches("[ ]*") && strBatas.length() == 1) {
				System.out.println("Anda belum memasukkan batas.");
				System.out.println("Silahkan input kembali.");
			} else if (strBatas.length() == 0) {
				System.out.println("Anda belum memasukkan batas.");
				System.out.println("Silahkan input kembali.");
			} else if (strBatas.matches("[0-9-]*")) {
				if (Integer.valueOf(strBatas) <= 20 && Integer.valueOf(strBatas) >= 2) {
					batas = batas + Integer.valueOf(strBatas);

					inputBenar = true;
				} else if (Integer.valueOf(strBatas) > 20) {
					System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.");
					System.out.println("Silahkan input kembali.");
				} else {
					System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
			}
		}

		// Loop untuk menampilkan hasil Segitiga Paskal
		for(int i = 0; i < batas; i++) {

            angka = 1;

			for(int j = 0; j <= i; j++) {
				 System.out.print(angka + " ");
                 angka = angka * (i - j) / (j + 1);
			}

			System.out.println();
		}
	}
}