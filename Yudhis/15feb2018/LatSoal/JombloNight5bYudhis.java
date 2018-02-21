import java.util.Scanner;

public class JombloNight5bYudhis{
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		String nama, hari;
		int umur;
		double penampilan;
		boolean kriteria, hari_benar;

		// Masukan variabel yg digunakan
		System.out.print("Siapa nama anda? "); nama = input.nextLine();
		System.out.print("Hari apa anda akan reservasi? "); hari = input.next();
		System.out.print("Berapa rasio penampilan anda dengan skala (0.0 - 10.0)? "); penampilan = input.nextDouble();
		System.out.print("Berapa umur anda? "); umur = input.nextInt();

		// Proses pengecekan kriteria
		hari_benar = hari.equalsIgnoreCase("sabtu");

		kriteria = (hari_benar && umur >= 21 && umur <= 30 && penampilan >= 8);

		System.out.println("\nBolehkah \"" + nama + "\" masuk Jomblo Night 5B? " + kriteria);
	}
}