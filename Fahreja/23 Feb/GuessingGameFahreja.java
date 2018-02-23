import java.util.Scanner;
import java.util.Random;
public class GuessingGameFahreja{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int nomber, tebak, round, winrate, kesempatan;

		round = 1;
		winrate = 0;

		do {

			nomber = rand.nextInt(10)+1;
			tebak = 0;
			kesempatan = 1;

			System.out.println("angka = " +nomber);
			System.out.println("Round" + round +"\n");
			System.out.println("I'm thinking of a number from 1-10.");
			System.out.println("You must guess what it is in three tries");
			System.out.println("Enter a guess ");

			

				
			do {
				tebak = keyboard.nextInt();
				
				if ( tebak == nomber){
					System.out.print("You Won the Round \n");
					winrate++;
				}else{
					if (kesempatan == 3) {
						System.out.println("Wrong");
					}
					else if (tebak -  nomber == 1 || nomber - tebak == 1 ) {
						System.out.print("Hot \n");
					}
					else if (tebak -  nomber == 2 || nomber - tebak == 2 ){
						System.out.print("Warm \n");
				
					}else if (tebak -  nomber >= 3 || nomber - tebak >= 3) {
						System.out.print("Cold \n");
					}

				}
				kesempatan++;
			}while (tebak != nomber && kesempatan <= 3);
				

			if (tebak == nomber) {
				System.out.println("The Corect Number Was 1");
			}
			System.out.println("You Have Won " +winrate+ " out of "+round+" Round");	
			round++;
		
		} while (round != 11);


		if (winrate == 7){
			System.out.print("Your Ranting : Amateur");
		}else if (winrate == 8) {
			System.out.print("Your Ranting : Advanced");
		}else if (winrate == 9) {
			System.out.print("Your Ranting : Professionals");
		}else if (winrate == 10) {
			System.out.print("Your Ranting : Hackers");
		}

	}
	
}