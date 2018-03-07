// ilham 06-03-2018

import java.util.Scanner;

public class LatihanSoalNoEnamBelas {
	public static void main(String[] args) {
		int[] numbers = {2, 6, 8, 6, 8, 10};

		for (int n : numbers) {
			System.out.print(n + " ");	
		}
		System.out.println("\nMenampilkan Matrix dari nilai array: ");
		for (int i = 1; i <= numbers.length; i++) {
			System.out.print(numbers[i-1] + " ");	
			if (i == (numbers.length/2)) {
				System.out.println();	
			}
		}
	}
}