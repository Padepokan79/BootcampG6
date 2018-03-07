import java.util.Scanner;
import java.util.Random;

public class PigGameDiceYudhis {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner dan Random
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		// Inisialisasi variable
		int totSkorPemain = 0, totSkorKomp = 0, skorRondePemain, daduKomputer, ronde = 1, daduPemain, lemparanPemain, batasMenang = 100;
		String yesNo;

		// Proses permainan Pig_
		do {
			// Ronde
			System.out.println("Ronde " + ronde + "\n");

			// Lemparan dadu komputer
			System.out.println("Komputer memiliki skor " + totSkorKomp);

			for (int i = 1; i <= 3 ; i++) {
				daduKomputer = rand.nextInt(5)+1;

				tampilDadu(daduKomputer);

				if (i != 3) {
					System.out.println("Komputer melempar dadu lagi.");
				}

				totSkorKomp = totSkorKomp + daduKomputer;
			}

			System.out.println("Komputer mengakhiri ronde dengan total skor " + totSkorKomp + ".\n");

			// Lemparan dadu pemain
			if (totSkorKomp < batasMenang) {
				System.out.println("Pemain memiliki skor " + totSkorPemain);

				// Reset variable lemparan, skorRondePemain, yesNo
				lemparanPemain = 1;
				skorRondePemain = 0;
				yesNo = "";

				do {
					daduPemain = rand.nextInt(5)+1;

					tampilDadu(daduPemain);

					if (daduPemain == 1) {
						System.out.println("Ini mengakhiri giliran pemain.");
					} else {
						skorRondePemain = skorRondePemain + daduPemain;

						System.out.println("Pemain memiliki skor sementara " + (totSkorPemain + skorRondePemain) + " sejauh ini.");
						System.out.print("Ingin lempar dadu lagi? (y/n) "); yesNo = input.next();

						if (yesNo.equalsIgnoreCase("n")) {
							totSkorPemain = totSkorPemain + skorRondePemain;
						} else {
							lemparanPemain++;
						}
					}

				} while (daduPemain != 1 && yesNo.equalsIgnoreCase("y"));

				System.out.println("Pemain mengakhiri ronde dengan total skor " + totSkorPemain + ".\n");
			}

			ronde++;

		} while (totSkorKomp < batasMenang && totSkorPemain < batasMenang);

		// Hasil permainan
		if (totSkorPemain > totSkorKomp) {
			System.out.println("Skor pemain: " + totSkorPemain);
			System.out.println("Skor komputer: " + totSkorKomp);
			System.out.println("Pemain menang.");
		} else {
			System.out.println("Skor komputer: " + totSkorKomp);
			System.out.println("Skor pemain: " + totSkorPemain);
			System.out.println("Komputer menang.");
		}
	}

	public static void tampilDadu (int lempar) {
		System.out.println("+---+");
		if ( lempar == 1 ) {
			System.out.println("|   |");
			System.out.println("| o |");
			System.out.println("|   |");
		} else if ( lempar == 2 ) {
			System.out.println("|o  |");
			System.out.println("|   |");
			System.out.println("|  o|");
		} else if ( lempar == 3 ) {
			System.out.println("|o  |");
			System.out.println("| o |");
			System.out.println("|  o|");
		} else if ( lempar == 4 ) {
			System.out.println("|o o|");
			System.out.println("|   |");
			System.out.println("|o o|");
		} else if ( lempar == 5 ) {
			System.out.println("|o o|");
			System.out.println("| o |");
			System.out.println("|o o|");
		} else if ( lempar == 6 ) {
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println("|o o|");
		}
		System.out.println("+---+");
	} 
}
