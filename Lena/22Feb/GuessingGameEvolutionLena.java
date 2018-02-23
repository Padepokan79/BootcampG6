import java.util.Scanner;

public class GuessingGameEvolutionLena{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//inisialisasi
		int won = 0;
		int round = 0;
		int secret, guess, chance;

		//perulangan untuk 10 ronde
		while (round < 10){
			System.out.println("\nRound "+(round+1)+" :\n");

			//inisialisasi
			chance = 0;
			secret = 1 + (int) (10 * Math.random());
			System.out.println(secret);

			System.out.print("\nI am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.\nEnter a guess:\n> ");
			guess = keyboard.nextInt();

			//perulangan jika tebakan salah dan kesempatan <3
			while (secret != guess && chance<3){

				//jika kesempatan menebak sudah habis
				if (chance == 2){
					System.out.println("Wrong\nThe correct number was "+secret+"\nYou have lost the game.");
				}

				//jika range tebakan >= 3
				else if ((secret - guess) >= 3 || (guess - secret) >= 3){
					System.out.print("Cold\n> ");
					guess = keyboard.nextInt();
				}

				//jika range tebakan = 2
				else if ((secret - guess) == 2 || (guess - secret) == 2){
					System.out.print("Warm\n> ");
					guess = keyboard.nextInt();
				}

				//jika range tebakan = 1
				else if ((secret - guess) == 1 || (guess - secret) == 1){
					System.out.print("Hot\n> ");
					guess = keyboard.nextInt();
				}

				chance++;
			}

			//jika tebakan benar
			if(secret == guess){
				System.out.println("Right!\nYou have won the game.");
				won++;
			}

			round++;

			//menampilkan jumlah menang sementara
			System.out.println("\nYou have won "+won+" out of "+ round+"\n");
		}

		//menampilkan rating
		System.out.print("\nYour Rating: ");
		if(won <= 7){
			System.out.print(" Amateur");
		}
		else if(won == 8){
			System.out.print(" Advanced");
		}
		else if(won == 9){
			System.out.print(" Professional");
		}
		else{
			System.out.print(" hackers");
		}
	}
}