import java.util.Scanner;

public class MelodiesMemoriYudhis{
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		String nama, hari;
		int umur;
		boolean kriteria, hari_benar;

		// Masukan variabel yg digunakan
		System.out.print("Siapa nama anda? "); nama = input.nextLine();
		System.out.print("Hari apa anda akan reservasi? "); hari = input.next();
		System.out.print("Berapa umur anda? "); umur = input.nextInt();

		// Proses pengecekan kriteria
		hari_benar = hari.equalsIgnoreCase("jum'at");

		kriteria = (hari_benar && umur > 40);

		System.out.println("\nBolehkah \"" + nama + "\" masuk Melodies Memori? " + kriteria);
	}
}