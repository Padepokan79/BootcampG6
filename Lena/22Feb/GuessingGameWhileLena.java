import java.util.Scanner;

public class GuessingGameWhileLena{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//inisialisasi
		int secret = 1 + (int) (10 * Math.random());
		int chance = 0;
		int guess;

		System.out.println(secret);

		System.out.print("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.\nEnter a guess:\n> ");
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
		}
	}
}