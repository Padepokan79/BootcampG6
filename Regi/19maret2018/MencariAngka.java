package SembilanBelasMaret2018;

import java.util.ArrayList;

import java.util.Scanner;

public class MencariAngka {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		
		ArrayList<Integer> angka = new ArrayList<Integer>();
		ArrayList<Integer> posisi = new ArrayList<Integer>();
		
		angka.add(4);
		angka.add(3);
		angka.add(2);
		angka.add(4);
		angka.add(2);
		
		angka.add(6);
		angka.add(2);
		angka.add(5);
		angka.add(5);
		angka.add(7);
		
		angka.add(5);
		angka.add(3);
		angka.add(5);
		angka.add(3);
		angka.add(3);
		
		angka.add(23);
		angka.add(4);
		angka.add(6);
		angka.add(4);
		angka.add(3);
		
		angka.add(4);
		angka.add(4);
		angka.add(2);
		angka.add(2);
		
		for (int i = 0; i < angka.size(); i++) {
			System.out.print(angka.get(i) + " ");
		}
		
		System.out.println("\n\nMasukan Angka yang dicari : ");
		int cari = keyboard.nextInt();
		
		int jumlah = 0;
		
		for (int i = 0; i < angka.size(); i++) {
			if (cari == angka.get(i)) {
				jumlah++;
				posisi.add(i+1);
			}			
		}
		System.out.print("\nAngka " + cari + " ada " + jumlah + ", ditemukan pada posisi\n" + posisi + " ");
	}

}
