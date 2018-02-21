import java.util.Scanner;

public class KriteriaNenekYudhis{
	public static void main(String[] args) {

		// Inisialisasi variabel yg diperlukan
		Scanner input = new Scanner(System.in);
		int umur;
		double gaji, ketampanan;
		boolean kriteria;

		// Masukan variabel yg digunakan
		System.out.print("Berapa umur anda? "); umur = input.nextInt();
		System.out.print("Berapa rasio ketampanan anda dengan skala (0.0 - 10.0)? "); ketampanan = input.nextDouble();
		System.out.print("Berapa gaji anda? "); gaji = input.nextDouble();

		// Proses pengecekan kriteria
		kriteria = (umur > 27 && umur < 42 && (ketampanan > 7 || gaji > 500000));

		System.out.println("Diperbolehkan menjadi pasangan cucu perempuannya? " + kriteria);
	}
}