import java.util.Scanner;
import java.util.Random;

public class PigDicesIrin {
	public static void main( String[]  args ){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int compTotScore=0, playerTotScore=0, win = 100;
		int compScore, playerScore;
		int round=1, j = 1;
		String ulang = "";

		do { 
			System.out.println("\nRONDE " + (round) + "====================================================================");
			int compRoundScore = 0;
			int playerRoundScore = 0;
			//KOMPUTER MAIN
			System.out.println("\nKomputer main:");
			for (int i = 1; i<4; i++ ){
				compScore = rand.nextInt(6)+1;
				System.out.println("Komputer melempar dadu: ");
				System.out.println("Dadu ke- " + i + " adalah " + compScore);
				compRoundScore = compRoundScore + compScore;
				compTotScore = compTotScore + compScore;
			}
			
			System.out.println("Jumlah nilai dadu komputer " + compRoundScore + "\n");

			System.out.println("Total skor komputer pada ronde ini adalah " + compTotScore + "\n");
			
			//PLAYER MAIN
			if(compTotScore < menang){
				do {  
					playerScore = 0;
					System.out.println("\nGiliran Pemain:");
					System.out.println("Lemparan ke- " + j);
					System.out.println("Pemain melempar dadu: ");
					playerScore = rand.nextInt(6)+1;
					System.out.println("Dadu pemain adalah " + playerScore);
					playerRoundScore = playerRoundScore + playerScore;
					if (playerScore == 1) { 
						playerRoundScore = 0;
						System.out.println("Jumlah nilai dadu pemain ronde " + round + " adalah " + playerRoundScore);
						System.out.println("\nKESEMPATAN PEMAIN HABIS");

					} else if (playerScore != 1 ) {  
						System.out.println("Jumlah nilai dadu pemain ronde " + round + " adalah " + playerRoundScore );
						System.out.println("\nApakah Anda mau melempar dadu lagi? (Y/T)");
						ulang = keyboard.next();
						
					}
					j++;			
				} while(ulang.equalsIgnoreCase("y") && playerScore != 1 );
			}

			playerTotScore = playerTotScore + playerRoundScore;
			System.out.println("\nTotal skor pemain saat ini adalah " + playerTotScore);			
		
			round++;
		} while (compTotScore<win && playerTotScore<win);

		if (compTotScore > playerTotScore){
			System.out.println("\nANDA KALAH!,\n---------------------------------------------------------------\nSKOR AKHIR ANDA ADALAH " + playerTotScore);
			System.out.println("KOMPUER MENANG!, SKOR AKHIR KOMPUTER ADALAH " + compTotScore);
		}
		else {
			System.out.println("\nANDA MENANG!,\n---------------------------------------------------------------\nSKOR AKHIR ANDA ADALAH " + playerTotScore);
			System.out.println("KOMPUER KALAH!, SKOR AKHIR KOMPUTER ADALAH " + compTotScore);
		}
	}
}