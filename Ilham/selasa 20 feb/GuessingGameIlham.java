import java.util.Random;
import java.util.Scanner;

public class GuessingGameIlham {
	public static void main(String[] args) {
		//Inisialisasi
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		//Inisialisasi
		int kesempatan, batasKesempatan, myNumber, tebakan;
		String jawaban;

		//Deklarasi
		batasKesempatan = 3; // batas kesempatan menebak
		jawaban = "salah"; // keadaan sementaran jawaban (benar/salah)
		myNumber = rand.nextInt(10)+1; // angka yang dirandom

		// menampilkan output
		System.out.println("Guessing Game\n");
		System.out.println(myNumber);
		System.out.println("I am thinking of a number from 1 to 10. \nYou must guess what it is in three tries.\nEnter a guess: ");

		// ulang jika jawaban salah && kesempatan kurang dari sama dengan 3
		for (kesempatan = 1; (jawaban.equals("salah") && kesempatan <= 3); kesempatan++) {
			// input tebakan user
			tebakan = keyboard.nextInt();

			// cek apakah tebakan benar?
			if (tebakan == myNumber) {
				// jika benar
				System.out.println("RIGHT!");
				System.out.println("You have won the game.");
				jawaban = "benar";
			} else {
				// jika salah
				System.out.println("Wrong");
			}
		}
		// tampilkan jika user salah menebak setelah 3 kali kesempatan
		if (jawaban.equals("salah")) {
			System.out.println("The correct number was " + myNumber);
			System.out.println("You have lost the game.");
		}
	}
}