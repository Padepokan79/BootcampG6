// ilham 07-03-2018

import java.util.Scanner;

public class LatihanSoalNoSebelas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int nilai;
		boolean stop = true;

		System.out.print("Masukkan Nilai: ");
		nilai = keyboard.nextInt();
		System.out.println("Hasil: " + nilai + " adalah kombinasi dari: ");

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length && stop; j++) {
				if (numbers[i] + numbers[j] == nilai) {
					if (numbers[i] == numbers[j] || numbers[i+1] == numbers[j]) {
						stop = false;
					}
					System.out.print(numbers[i] + " dan " + numbers[j] + " , ");
				}
			}
		}
	}
}