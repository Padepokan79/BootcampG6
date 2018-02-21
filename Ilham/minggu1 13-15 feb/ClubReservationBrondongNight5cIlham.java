import java.util.Scanner;

public class ClubReservationBrondongNight5cIlham {
	public static void main(String[] args) {

		//deklarasi variabel
		Scanner keyboard = new Scanner(System.in);
		int umur;
		double penampilan;
		String nama, hari, jenisKelamin;
		boolean hasil;

		System.out.println("Club Reservation : Brondong Night 5c");
		System.out.println("--------------------------------------------------------");

		//input nama
		System.out.print("Masukkan Nama Anda : ");
		nama = keyboard.next();

		//input hari
		System.out.print("Masukkan Hari : ");
		hari = keyboard.next();

		//input jenis kelamin
		System.out.print("Masukkan Jenis Kelamin (cewek atau cowok): ");
		jenisKelamin = keyboard.next();

		//input penampilan
		System.out.print("Masukkan Penampilan Anda (dalam skala 1.0 s/d 10.0) : ");
		penampilan = keyboard.nextDouble();

		//input umur
		System.out.print("Masukkan Usia Anda : ");
		umur = keyboard.nextInt();

		//proses hasil
		hasil = (hari.equalsIgnoreCase("selasa") && ((jenisKelamin.equalsIgnoreCase("cewek") && penampilan >= 8 && umur >= 30 && umur <= 40) || (jenisKelamin.equalsIgnoreCase("cowok") && penampilan < 8 && umur >= 20 && umur <= 25)));

		System.out.println ("Hallo " + nama + ", Reservation : " + hasil);

	}
}