import java.util.Scanner;

public class LatSoalArray6Yudhis {
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] temp = new int[arr1.length];

		// Inisialisasi variable
		int angkaBaru, posisi, indeks = 0;

		// Tampilan arr1 dan penyalinan arr1 ke temp
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		temp = arr1;

		// Proses penyisipan nilai array
		System.out.print("\nMasukkan posisi yg akan disisipkan: "); posisi = input.nextInt();
		System.out.print("Masukkan bilangan yg akan disisipkan: "); angkaBaru = input.nextInt();
		
		arr1 = new int[temp.length+1];
		indeks = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (i != posisi-1) {
				arr1[i] = temp[indeks];
				indeks++;
			} else {
				arr1[indeks] = angkaBaru;
			}
		}		

		// Tampilan arr1 hasil
		System.out.print("Hasil operasi arr1 : ");	
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

	}
}