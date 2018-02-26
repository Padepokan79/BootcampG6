import java.util.Scanner;

public class LatSoalArray13Yudhis {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 77};

		// Inisialisasi variable
		int posisi1, posisi2, angka1 = 0, angka2 = 0;

		// Tampilan arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		// Masukan posisi yang akan ditukar
		System.out.print("\nMasukkan posisi pertama : "); posisi1 = input.nextInt();
		System.out.print("Masukkan posisi kedua : "); posisi2 = input.nextInt();

		angka1 = arr1[posisi1-1];
		angka2 = arr1[posisi2-1];

		arr1[posisi1-1] = angka2;
		arr1[posisi2-1] = angka1;

		// Tampilan hasil tukar nilai arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

	}
}