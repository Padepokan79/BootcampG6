// Ilham galang 26 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoTigabelas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int posisiSatu, posisiDua, tempArr;

		System.out.println("13. Tukar nilai antara dua posisi pada arr1! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}

		System.out.print("\nMasukkan posisi pertama yang ingin ditukar: ");
		posisiSatu = keyboard.nextInt();
		System.out.print("Masukkan posisi kedua yang ingin ditukar: ");
		posisiDua = keyboard.nextInt();

		tempArr = arr1[posisiSatu-1];
		arr1[posisiSatu-1] = arr1[posisiDua-1];
		arr1[posisiDua-1] = tempArr;

		System.out.println("Nilai array pada arr1 setelah di tambah: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}

	}
}
