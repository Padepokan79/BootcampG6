import java.util.Scanner;

public class NomberSembilan{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		//Fahreja
		int bilangan, jumlahAngka = 0, jumlahArray;
		int[] tampung = new int[0];

		System.out.print("Masukan jumlah array : ");
		jumlahArray = nilai.nextInt();
		tampung = new int [jumlahArray];
		System.out.println("");

		for (int i = 0; i < tampung.length ; i++ ) {
			System.out.print("Masukan Nilai : ");
			bilangan = nilai.nextInt();
			tampung[i] = bilangan;
		}
		System.out.println("\nNilai array yang telah di tampung :");
		for (int angka : tampung) {
			System.out.print(angka+" ");
			jumlahAngka = jumlahAngka + angka;
		}

		System.out.println("\nJumlah nilai");
		System.out.print(jumlahAngka);
	}
}
	