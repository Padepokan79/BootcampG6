import java.util.Scanner;
// Siska Pitriani 23 Februari 2018
public class GameDice{
	public static void main(String []args){
		Scanner keyboard = new Scanner (System.in);
		int dadu, scorePlayer, scoreComputer, scoreperRoundeplayer;
		String pertanyaan;

		scorePlayer=0; scoreComputer=0; scoreperRoundeplayer = 0;
		do {
			for (int i = 1; i<=3; i++){
				dadu = 1 + (int) (Math.random()*6);
				scoreComputer = scoreComputer + dadu;
				System.out.println ("Score dadu : " + dadu);
			}
				System.out.println ("Total Score Computer : " + scoreComputer);	
			if (scoreComputer < 100){
				do {
					dadu = 1 + (int) (Math.random()*6);
					System.out.println ("");
					System.out.println ("Giliran anda \nScore dadu anda :"+ dadu);
					if (dadu == 1){
						scoreperRoundeplayer = 0;
						pertanyaan ="n";
					}
					else {
						scoreperRoundeplayer = scoreperRoundeplayer + dadu ;
						System.out.println ("Score sementara di Rounde ini adalah " + scoreperRoundeplayer);
						System.out.print (" Apakah mau melempar dadu lagi (y/n) ?");
						pertanyaan = keyboard.next();
					}
				} while (pertanyaan.equalsIgnoreCase ("y"));
				scorePlayer = scorePlayer + scoreperRoundeplayer;
				System.out.println ("Total Score Player : " + scorePlayer);
				System.out.println();
			}
		} while (scorePlayer < 100 && scoreComputer < 100);
		if (scorePlayer >= 100){
			System.out.println ();
			System.out.println ("You won score: " + scorePlayer);
			System.out.println ("computer score: " + scoreComputer);
		}
		else {
			System.out.println ();
			System.out.println ("Computer won score: " + scoreComputer);
			System.out.println ("your score: " + scorePlayer);
		}
	}
}