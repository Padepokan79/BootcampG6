import java.util.Scanner;

public class LadiesNight5aYudhis{
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		String nama, hari, jkelamin;
		int umur;
		boolean kriteria, hari_benar, jkelamin_benar;

		// Masukan variabel yg digunakan
		System.out.print("Siapa nama anda? "); nama = input.nextLine();
		System.out.print("Hari apa anda akan reservasi? "); hari = input.next();
		System.out.print("Jenis kelamin (Cewek / Cowok)? "); jkelamin = input.next();
		System.out.print("Berapa umur anda? "); umur = input.nextInt();

		// Proses pengecekan kriteria
		hari_benar = hari.equalsIgnoreCase("kamis");
		jkelamin_benar = jkelamin.equalsIgnoreCase("cewek");

		kriteria = (hari_benar && jkelamin_benar && umur >= 21 && umur <= 30);

		System.out.println("\nBolehkah \"" + nama + "\" masuk Ladies Night 5a? " + kriteria);
	}
}