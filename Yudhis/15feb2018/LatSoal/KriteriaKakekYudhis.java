import java.util.Scanner;

public class KriteriaKakekYudhis{
	public static void main(String[] args) {

		// Inisialisasi variabel yg diperlukan
		Scanner input = new Scanner(System.in);
		int umur;
		double gaji;
		boolean kriteria;

		// Masukan variabel yg digunakan
		System.out.print("Berapa umur anda? "); umur = input.nextInt();
		System.out.print("Berapa gaji anda? "); gaji = input.nextDouble();

		// Proses pengecekan kriteria
		kriteria = (umur >= 30 && gaji > 5000000);

		System.out.println("Diperbolehkan menjadi pasangan cucu perempuannya? " + kriteria);
	}
}