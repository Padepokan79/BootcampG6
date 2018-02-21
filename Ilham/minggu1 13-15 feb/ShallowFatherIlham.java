import java.util.Scanner;

public class ShallowFatherIlham {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int umurL, umurP;
		double gaji, penampilan;
		boolean hasil;

		System.out.print("Masukkan Umur Perempuan : ");
		umurP = keyboard.nextInt();

		System.out.print("Masukkan Umur Anda : ");
		umurL = keyboard.nextInt();

		System.out.print("Masukkan Gaji Anda (dalam sebulan) : Rp.");
		gaji = keyboard.nextDouble();

		System.out.print("Seberapa Ganteng Anda (dalam skala 1.0 s/d 10.0) : ");
		penampilan = keyboard.nextDouble();

		hasil = (umurL >= umurP-5 && umurL < umurP+5 && (penampilan >= 8 || gaji >= 5000000));

		System.out.println("Apakah Lolos ? " + hasil);
	}
}