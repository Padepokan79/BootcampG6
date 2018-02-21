import java.util.Scanner;

public class ShallowGrandfatherIlham {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int umur;
		double gaji, penampilan;
		boolean hasil;

		System.out.print("Masukkan Umur Anda : ");
		umur = keyboard.nextInt();

		System.out.print("Masukkan Gaji Anda (dalam sebulan) : Rp.");
		gaji = keyboard.nextDouble();

		System.out.print("Seberapa Ganteng Anda (dalam skala 1.0 s/d 10.0) : ");
		penampilan = keyboard.nextDouble();

		hasil = (umur > 30 && ((penampilan > 8 || !(penampilan > 8)) && gaji > 5000000));

		System.out.println("Apakah Lolos ? " + hasil);
	}
}