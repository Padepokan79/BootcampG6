package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int angkaDicari = 0;
		int banyakHasil = 0;
		
		array.add(4);
		array.add(3);
		array.add(2);
		array.add(4);
		array.add(2);
		array.add(6);
		array.add(2);
		array.add(5);
		array.add(5);
		array.add(7);
		array.add(5);
		array.add(3);
		array.add(5);
		array.add(3);
		array.add(3);
		array.add(23);
		array.add(4);
		array.add(6);
		array.add(4);
		array.add(3);
		array.add(4);
		array.add(4);
		array.add(2);
		array.add(2);
		
		System.out.print("Array : ");
		for (Integer a : array) {
			System.out.print(a + " ");
		}
		
		System.out.print("\nMasukkan angka yang dicari : "); angkaDicari = angkaDicari + input.nextInt();
		
		for (Integer a : array) {
			if (a > angkaDicari) {
				banyakHasil++;
			}
		}
		
		System.out.println("Yang lebih dari angka " + angkaDicari + " ada " + banyakHasil + ", yaitu : ");
		for (Integer a : array) {
			if (a > angkaDicari) {
				System.out.print(a + " ");
			}
		}
	}

}
