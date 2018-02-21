import java.util.Scanner;

public class ClubReservationYudhis{
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		String nama, hari, jKelamin;
		int umur;
		double penampilan;
		boolean kriteria = false;

		// Masukan variabel yg digunakan
		System.out.print("Siapa nama anda? "); nama = input.nextLine();
		System.out.print("Hari apa anda akan reservasi? "); hari = input.next();
		System.out.print("Jenis kelamin (Cewek / Cowok)? "); jKelamin = input.next();
		System.out.print("Berapa rasio penampilan anda dengan skala (0.0 - 10.0)? "); penampilan = input.nextDouble();
		System.out.print("Berapa umur anda? "); umur = input.nextInt();

		// Pengecekan kriteria hari dan jenis kelamin
		if ((hari.equalsIgnoreCase("senin") || hari.equalsIgnoreCase("selasa") || hari.equalsIgnoreCase("rabu") || 
			hari.equalsIgnoreCase("kamis") || hari.equalsIgnoreCase("jum'at") || hari.equalsIgnoreCase("sabtu") ||
			hari.equalsIgnoreCase("minggu")) && 
			(jKelamin.equalsIgnoreCase("cewek") || jKelamin.equalsIgnoreCase("cowok"))) {

				// Pengecekan kriteria reservasi Ladies Night 5a
				if (hari.equalsIgnoreCase("kamis") && jKelamin.equalsIgnoreCase("cewek") && umur >= 21 && umur <= 30 && penampilan >= 8) {
					kriteria = true;
					System.out.println("\nKriteria \"" + nama + "\" terpenuhi untuk kategori Ladies Night 5a.");
					System.out.println("\nReservasi diterima.");
				} 

				// Pengecekan kriteria reservasi Melodies Memori
				if (hari.equalsIgnoreCase("jum'at") && umur > 40) {
					kriteria = true;
					System.out.println("\nKriteria \"" + nama + "\" terpenuhi untuk kategori Melodies Memori.");
					System.out.println("\nReservasi diterima.");
				}

				// Pengecekan kriteria reservasi Jomblo Night 5b
				if (hari.equalsIgnoreCase("sabtu") && umur >= 21 && umur <= 30 && penampilan >= 8) {
					kriteria = true;
					System.out.println("\nKriteria \"" + nama + "\" terpenuhi untuk kategori Jomblo Night 5b.");
					System.out.println("\nReservasi diterima.");
				}

				// Pengecekan kriteria reservasi Brondong Night 5c dan Umum
				if (hari.equalsIgnoreCase("selasa") && ((jKelamin.equalsIgnoreCase("cewek") && umur >= 30 && umur <= 45 && penampilan >= 8) 
					|| (jKelamin.equalsIgnoreCase("cowok") && umur >= 20 && umur <= 25 && penampilan < 8))) {
					kriteria = true;
					System.out.println("\nKriteria \"" + nama + "\" terpenuhi untuk kategori Brondong Night 5c.");
					System.out.println("\nReservasi diterima.");
				}

				// Pengecekan kriteria reservasi Umum dan penolakan reservasi
				if (hari.equalsIgnoreCase("senin") || hari.equalsIgnoreCase("rabu") || hari.equalsIgnoreCase("minggu")) {
					kriteria = true;
					System.out.println("\nKriteria \"" + nama + "\" terpenuhi untuk kategori Umum.");
					System.out.println("\nReservasi diterima.");
				}

		} else {
			System.out.println("\nMasukan hari atau jenis kelamin tidak sesuai.");
		}

		// Kriteria tidak sesuai manapun
		if (kriteria == false) {
			System.out.println("\nKriteria \"" + nama + "\" tidak memenuhi kategori manapun.");
			System.out.println("\nReservasi ditolak.");
		}
	}
}