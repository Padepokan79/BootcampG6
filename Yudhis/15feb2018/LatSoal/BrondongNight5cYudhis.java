import java.util.Scanner;

public class BrondongNight5cYudhis{
	public static void main(String[] args) {

		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		String nama, hari, jkelamin;
		int umur;
		double penampilan;
		boolean kriteria, hari_benar, cowok, cewek;

		// Masukan variabel yg digunakan
		System.out.print("Siapa nama anda? "); nama = input.nextLine();
		System.out.print("Hari apa anda akan reservasi? "); hari = input.next();
		System.out.print("Jenis kelamin (Cewek / Cowok)? "); jkelamin = input.next();
		System.out.print("Berapa rasio penampilan anda dengan skala (0.0 - 10.0)? "); penampilan = input.nextDouble();
		System.out.print("Berapa umur anda? "); umur = input.nextInt();

		// Proses pengecekan kriteria
		hari_benar = hari.equalsIgnoreCase("selasa");
		cewek = jkelamin.equalsIgnoreCase("cewek");
		cowok = jkelamin.equalsIgnoreCase("cowok");

		kriteria = (hari_benar && ((cewek && umur >= 30 && umur <= 45 && penampilan >= 8) || (cowok && umur >= 20 && umur <= 25 && penampilan < 8)));

		System.out.println("\nBolehkah \"" + nama + "\" masuk Brondong Night 5C? " + kriteria);
	}
}