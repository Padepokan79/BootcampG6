import java.util.Scanner;
import java.util.Random;

public class RandomIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int tebakan, jawaban; 

		jawaban = rand.nextInt(10)+1;
	
		System.out.println("I am thinking of a number from 1 to 10. ");
		System.out.println("You must guess what it is in three tries.");
		System.out.println("Enter a guess:");

		for (int kesempatan = 1; kesempatan <= 3; kesempatan++) {
			tebakan = keyboard.nextInt();
			System.out.println("Kesempatan ke : " + kesempatan );
			if ( tebakan == jawaban ){
				System.out.println("RIGHT! \nYou have won the game." );
				break;
			}
			else if (tebakan != jawaban){
				System.out.println("wrong");
			}
		}

		System.out.println("Game Over, the correct answer is " + jawaban );			
	}
}
