import java.util.Scanner;

public class LatSoalArray2Yudhis {
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		// Inisialisasi variable
		int angkaCari;
		boolean ketemu = false;

		// Tampilan arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		// Proses pencarian bilangan di arr1
		System.out.print("\nMasukkan bilangan yg dicari: "); angkaCari = input.nextInt();
		for (int a1 : arr1) {
			if (a1 == angkaCari) {
				ketemu = true;
				System.out.print(a1 + " ditemukan di arr1.");
			}
		}

		if (ketemu == false) {
			System.out.println(angkaCari + " tidak ditemukan di arr1.");
		}

	}
}