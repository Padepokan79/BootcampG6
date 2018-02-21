import java.util.Scanner;

public class KriteriaIbuYudhis{
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		int umur;
		double gaji, penampilan;
		boolean kriteria;

		// Masukan variabel yg digunakan
		System.out.print("Berapa umur anda? "); umur = input.nextInt();
		System.out.print("Berapa rasio ketampanan anda dengan skala (0.0 - 10.0)? "); penampilan = input.nextDouble();
		System.out.print("Berapa gaji anda? "); gaji = input.nextDouble();

		// Proses pengecekan kriteria
		kriteria = (umur >= 17 && umur < 30 && penampilan >= 8 && gaji >= 5000000);

		System.out.println("Diperbolehkan menjadi pasangan anak perempuannya? " + kriteria);
	}
}