package SoalCariAngka;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCariAngka {

	public static void main(String[] args) {
		int cari;
		Scanner input = new Scanner (System.in);
		System.out.println("Masukan Angka yang dicari: ");
		cari = input.nextInt();
		
		ArrayList<Integer> bilangan = new ArrayList<Integer>();
		bilangan.add(4);
		bilangan.add(3);
		bilangan.add(2);
		bilangan.add(4);
		bilangan.add(2);
		bilangan.add(6);
		bilangan.add(5);
		bilangan.add(5);
		bilangan.add(7);
		bilangan.add(5);
		bilangan.add(3);
		bilangan.add(5);
		bilangan.add(3);
		bilangan.add(3);
		bilangan.add(23);
		bilangan.add(4);
		bilangan.add(6);
		bilangan.add(4);
		bilangan.add(3);
		bilangan.add(4);
		bilangan.add(4);
		bilangan.add(2);
		bilangan.add(2);
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for (int index = 0; index < bilangan.size(); index++ ) {
			if (bilangan.get(index) > cari) {
				output.add(bilangan.get(index));
			}
		}
		System.out.println("Yang lebih dari Angka " + cari + " Ada " + output.size() + " ,yaitu : "  );
		for (Integer t : output) {
			System.out.println(t);
		}
	}

}
