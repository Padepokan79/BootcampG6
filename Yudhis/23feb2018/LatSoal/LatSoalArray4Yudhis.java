import java.util.Scanner;

public class LatSoalArray4Yudhis {
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		// Inisialisasi variable
		int angkaGanti, indeks = 0, posisi;

		// Tampilan arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		// Proses penggantian nilai indeks
		System.out.print("\nMasukkan bilangan pengganti: "); angkaGanti = input.nextInt();
		System.out.print("Masukkan posisi yg ingin diubah: "); posisi = input.nextInt();
		
		for (int a1 : arr1) {
			if (indeks == posisi-1) {
				arr1[indeks] = angkaGanti;
			}

			indeks++;
		}

		// Tampilan arr1 pengubah
		System.out.print("arr1 pengganti : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

	}
}