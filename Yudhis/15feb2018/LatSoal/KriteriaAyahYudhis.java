import java.util.Scanner;

public class KriteriaAyahYudhis{
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		int umurPi, umurPa;
		double gaji, penampilan;
		boolean kriteria;

		// Masukan variabel yg digunakan
		System.out.print("Berapa umur putri anda? "); umurPi = input.nextInt();
		System.out.print("Berapa umur calon pasangan? "); umurPa = input.nextInt();
		System.out.print("Berapa rasio ketampanan calon pasangan dengan skala (0.0 - 10.0)? "); penampilan = input.nextDouble();
		System.out.print("Berapa gaji calon pasangan? "); gaji = input.nextDouble();

		// Proses pengecekan kriteria
		kriteria = (((umurPi-umurPa) <= 5 && (umurPi-umurPa) >= -5) && (penampilan >= 8 || gaji >= 5000000));

		System.out.println("Diperbolehkan menjadi pasangan anak perempuannya? " + kriteria);
	}
}