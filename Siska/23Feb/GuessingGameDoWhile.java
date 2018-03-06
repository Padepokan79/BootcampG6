import java.util.Scanner;

public class GuessingGameDoWhile{
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		int komputer, guess, temp, rounds, win;
		
		rounds = 1;
		win = 0;
		rounds = 1;
		win = 0;
		//rounde 1-10
		do {
			komputer = 1 + (int) (Math.random()*10);
			System.out.println (komputer);
			System.out.println ("Rounds: " + rounds);
			System.out.println ("I am thinking of a number from 1 to 10.");
			System.out.println ("You must guess what it is in three tries.");
			System.out.println ("Enter a guess : ");
			guess = keyboard.nextInt ();
			temp = 0;
		//3x mencoba
		do {
			if (komputer - guess == 1 || guess - komputer == 1) {
				System.out.println ("hot");
				guess = keyboard.nextInt();
			}
			else if (komputer - guess == 2 || guess - komputer == 2){
				System.out.println ("warm");
				guess = keyboard.nextInt();
			}
			else if (komputer - guess >= 3 || guess - komputer >= 3){
				System.out.println ("cold");
				guess = keyboard.nextInt();
				}
				temp++;
			}
		while (komputer != guess && temp < 2);
			//jika menang dan kalah
			if (komputer == guess){
			System.out.println ("RIGHT!");
			System.out.println ("You have won the game");
			win++;
			}
			else {
				System.out.println ("wrong");
				System.out.println ("The correct number was "+ komputer);
				System.out.println ("You have lost the game"); 
			} 
			System.out.println ("\nYou have won " + win + " out of " + rounds+"\n");
			rounds++;
		}

		while (rounds <= 10);
			//jika menang berapa kali
			if (win <= 7){
				System.out.println ("You are : amateurs");
			}
			else if (win == 8){
				System.out.println ("You are : advanced");
			}
			else if (win == 9){
				System.out.println ("You are : professional");
			}
			else if (win == 10){
				System.out.println ("You are : hackers");
			}
		}
	}