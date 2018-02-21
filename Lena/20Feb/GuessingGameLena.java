import java.util.Scanner;
import java.util.Random;

public class GuessingGameLena{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int angka;
		int val = rand.nextInt(10)+1;

		System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what is in three tries.\nEnter a guess: ");
		angka = keyboard.nextInt();

		for ( int i = 0 ; i < 3 ; i++ ){
			if(angka == val){
				System.out.println("Right!\nYou have won the game.");
				break;
			}else if(angka != val && i<2){
				System.out.println("Wrong!");
				angka = keyboard.nextInt();				
			}
			else{
				System.out.println("Wrong!\nThe corret number was "+val+"\nYou have lost the game.");
			}
		}
	}
}