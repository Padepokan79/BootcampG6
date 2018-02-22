import java.util.Scanner;
import java.util.Random;

public class GuesGame{
	public static void main (String [] args){
	Scanner keyboard = new Scanner (System.in);
	Random rand = new Random ();

	int kom, user;
	kom=rand.nextInt(10)+1;
	String hasil="salah";

	System.out.println ("I am thinking of a number from 1 to 10.");
	System.out.println ("You must guess what it is in three tries.");
	System.out.println ("Enter a guess: ");
	
	for (int a = 0; a <=2 ; a++){
		user = keyboard.nextInt();
		if (user==kom) {
		System.out.println ("RIGHT!");
		hasil = "benar";
		System.out.println ("You have won the game");
		break;
		}
		else {
			System.out.println ("Wrong");
			hasil = "salah";
		}
		
		}
		if (hasil.equalsIgnoreCase ("salah")){
	System.out.println ("The correct number was" + kom);
	System.out.println ("You have lost the game");
	}
	}
}