// ilham 02-03-2018

import java.util.Scanner;

public class LatihanSoalNoEmpatBelas {
	public static void main(String[] args) {
		String[] jawaban = {"A", "C", "B", "D", "C", "D", "B", "B", "A", "A"};
		String[] roni = {"B","D","B","D","C","D","B","B","D","A",};
		String[] dino = {"A","D","B","D","C","D","A","B","D","A",};
		int nilaiRoni = 0, nilaiDino = 0;

		System.out.println("Jawaban yang Benar: ");
		for (String n : jawaban) {
			System.out.print(n + " ");	
		}

		System.out.println("\nJawaban roni: ");
		for (String n : roni) {
			System.out.print(n + " ");	
		}

		System.out.println("\nJawaban dino: ");
		for (String n : dino) {
			System.out.print(n + " ");	
		}


		for (int i = 0; i < jawaban.length; i++) {
			if (roni[i].equals(jawaban[i])) {
				nilaiRoni += 1;
			}
			if (dino[i].equals(jawaban[i])) {
				nilaiDino += 1;
			}
		}
		System.out.println("\n\nMenentukan Nilai");
		System.out.println("\nNilai roni: " + nilaiRoni);
		System.out.println("\nNilai dino: " + nilaiDino);

	}
}