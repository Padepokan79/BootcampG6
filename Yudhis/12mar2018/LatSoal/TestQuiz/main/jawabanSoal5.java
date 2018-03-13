package main;

import java.util.Scanner;

public class jawabanSoal5 {
	private static Scanner input;

	public void soal5() {

		input = new Scanner(System.in);
		
		// Inisialisasi variable
		int [] number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] temp = new int [number1.length+1];
		int sisipan = 0, posisi = 0, indeks = 0;
		boolean inputBenar = false;

		System.out.println("Deretan number : ");
		for (int n : number1) {
			System.out.print(n + " ");
		}
		System.out.println();

		// Input angka sisipan
		while (inputBenar == false) {
			System.out.print("Masukan Angka yang mau disisipkan: "); String strSisipan = input.nextLine();

			if (strSisipan.matches("[ ]*") && strSisipan.length() == 1) {
				System.out.println("Anda belum memasukkan sisipan.");
				System.out.println("Silahkan input kembali.");
			} else if (strSisipan.length() == 0) {
				System.out.println("Anda belum memasukkan sisipan.");
				System.out.println("Silahkan input kembali.");
			} else if (strSisipan.matches("[0-9-]*")) {
				sisipan = sisipan + Integer.valueOf(strSisipan);

				inputBenar = true;
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
			}
		}

		// Set boolean untuk cek input selanjutnya
		inputBenar = false;

		// Input posisi
		while (inputBenar == false) {
			System.out.print("Sisipkan pada posisi ke : "); String strPosisi = input.nextLine();

			if (strPosisi.matches("[ ]*") && strPosisi.length() == 1) {
				System.out.println("Anda belum memasukkan posisi.");
				System.out.println("Silahkan input kembali.");
			} else if (strPosisi.length() == 0) {
				System.out.println("Anda belum memasukkan posisi.");
				System.out.println("Silahkan input kembali.");
			} else if (strPosisi.matches("[0-9-]*")) {
				if (Integer.valueOf(strPosisi) <= 10 && Integer.valueOf(strPosisi) >= 1) {
					posisi = posisi + Integer.valueOf(strPosisi);

					inputBenar = true;
				} else if (Integer.valueOf(strPosisi) > 10) {
					System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");
					System.out.println("Silahkan input kembali.");
				} else {
					System.out.println("Maaf, input posisi tidak boleh kurang dari 1.");
					System.out.println("Silahkan input kembali.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
			}
		}

		// Memasukkan sisipan ke dalam array
		for (int i = 0; i < temp.length; i++) {
			if (i == posisi-1) {
				temp[i] = sisipan;
			} else {
				temp[i] = number1[indeks];
				indeks++;
			}
		}

		// Definisi ulang array number1
		number1 = new int [temp.length];

		for (int i = 0; i < number1.length; i++) {
			number1[i] = temp[i];
		}

		for (int n : number1) {
			System.out.print(n + " ");
		}

	}
}