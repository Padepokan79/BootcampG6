// Ilham Galang 23 02 2018

import java.util.Scanner;

public class PigGameDice {
	public static void main(String[] args) {
		// Inisialisasi
		Scanner keyboard = new Scanner(System.in);
		int dadu, scorePlayer, scoreComputer, scorePerRondePlayer,giliran;
		String pertanyaan;

		// Deklarasi
		scoreComputer = 0; // score pertama computer
		scorePlayer = 0; // score pertama player

		// perulangan saat score comuter dan player di bawah 100
		do {
			System.out.println("Giliran Computer");
			// lempar dadu computer (3 kali)
			for (giliran = 1; giliran <= 3; giliran++) {
				// kocok dadu
				dadu = 1 + (int)(Math.random()*6);
				scoreComputer += dadu;
				System.out.println("Dadu " + giliran + " : " + dadu);
			}
			// output score computer saat ini
			System.out.println("Score Computer Saat Ini : " + scoreComputer);

			// cek apakah score computer masih di bawah computer
			if (scoreComputer < 100) {
				// jika ya, lakukan pengocokan dadu untuk player
				//reset giliran
				giliran = 1;
				// score per ronde di reset
				scorePerRondePlayer = 0;
				do {
					// kocok dadu
					dadu = 1 + (int)(Math.random()*6);
					System.out.println("\n Giliran anda " + giliran + ", \nDadu yang di dapat: " + dadu);
					// jika player mendapat dadu 1
					if (dadu == 1) {
						// giliran player berakhir dan score ronde ini hangus
						scorePerRondePlayer = 0;
						pertanyaan = "n";				
					} else {
						// jika mendapat dadu selain 1
						scorePerRondePlayer += dadu;
						System.out.println("Score Player Pada Ronde Ini : " + scorePerRondePlayer);
						System.out.print("Apakah ingin melempar lagi(y/n) : ");
						// tanya apakah mau lanjut atau tidak
						pertanyaan = keyboard.next();
					}				
					giliran++;
				} while (pertanyaan.equals("y")); // lanjut jika y
				// hitung score player
				scorePlayer += scorePerRondePlayer;
				System.out.println("Score Player Saat Ini : " + scorePlayer);
				System.out.println();
			}
		} while (scorePlayer < 100 && scoreComputer < 100);
		System.out.println();

		// cek pemenang nya
		if (scorePlayer >= 100) {
			System.out.println("You Win\n Score Anda : " + scorePlayer);
			System.out.println("Score Computer : " + scoreComputer);
		} else {
			System.out.println("You Lose\n Score Anda : " + scorePlayer);
			System.out.println("Score Computer : " + scoreComputer);
		}
	}
}