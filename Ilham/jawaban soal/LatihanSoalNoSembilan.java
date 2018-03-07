// ilham 07-03-2018

import java.util.Scanner;

public class LatihanSoalNoSembilan {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr;
		int jumlahArr=0, banyakArr;

		System.out.print("Jumlah angka yang ingin dimasukkan: ");
		banyakArr = keyboard.nextInt();
		System.out.println();
		arr = new int[banyakArr];

		for (int i = 1; i <= banyakArr; i++) {
			System.out.print("masukkan angka " + i + ": ");
			arr[i-1] = keyboard.nextInt();

			jumlahArr += arr[i-1];
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("\nJumlah = " + jumlahArr);
	}
}