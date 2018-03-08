// ilham 07-03-2018

import java.util.Random;

public class LatihanSoalNoTiga {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[9];
		int indeks = 0;

		for (int i = 0; i < 9; i++) {
			numbers[i] = rand.nextInt(10);
		}

		for (int i =0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(numbers[indeks] + " ");
				indeks++;
			}
			System.out.println();
		}
	}
}