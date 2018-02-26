import java.util.Scanner;

public class LatSoalArray5Yudhis {
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] temp = new int[arr1.length-1];

		// Inisialisasi variable
		int angkaHapus, posisi, indeks = 0;

		// Tampilan arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		// Proses penyalinan nilai array dan masukan nilai array baru
		System.out.print("\nMasukkan posisi yg akan dihapus: "); posisi = input.nextInt();
		
		for (int i = 0; i < arr1.length; i++) {
			if (i != posisi-1) {
				temp[indeks] = arr1[i];
				indeks++;
			}
		}

		arr1 = new int[temp.length];
		indeks = 0;

		for (int t : temp) {
			arr1[indeks] = temp[indeks];
			indeks++;
		}

		// Tampilan arr1 hasil
		System.out.print("Hasil operasi arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

	}
}