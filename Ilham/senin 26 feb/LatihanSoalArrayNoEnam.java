// Ilham galang 26 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoEnam {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int[] tempArr = new int[arr1.length+1];
		int posisi,bilangan;

		System.out.println("6. Sisip suatu bilangan pada posisi tertentu pada arr1! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}

		System.out.print("\nMasukkan suatu bilangan: ");
		bilangan = keyboard.nextInt();
		System.out.print("Posisi yang ingin di tambahkan(1-11): ");
		posisi = keyboard.nextInt();

		for (int i = 0; i < tempArr.length; i++) {
			if (i < posisi-1) {
				tempArr[i] = arr1[i];
			} else if (i == posisi-1) {
				tempArr[i] = bilangan;
			} else {
				tempArr[i] = arr1[i-1];
			}
		}

		arr1 = new int[tempArr.length];
		arr1 = tempArr;

		System.out.println("Nilai array pada arr1 setelah di tambah: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}

	}
}
