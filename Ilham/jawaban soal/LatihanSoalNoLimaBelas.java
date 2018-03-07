// ilham 06-03-2018

import java.util.Scanner;

public class LatihanSoalNoLimaBelas {
	public static void main(String[] args) {
		int[] numbers = {3, -4 , 2, 1, 0, -8,-12, 11, 200, -34, 21};

		for (int n : numbers) {
			System.out.print(n + " ");	
		}
		System.out.println("\nMenampilkan nilai negatif: ");
		for (int n : numbers) {
			if (n < 0) {
				System.out.print(n + " ");	
			}
		}
	}
}