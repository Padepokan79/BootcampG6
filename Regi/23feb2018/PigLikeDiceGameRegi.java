import java.util.Scanner;
import java.util.Random;

public class PigLikeDiceGameRegi {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int com, player, comSkor, playerSkor, comSkorTotal = 0, playerSkorTotal = 0, compSkorTmp, playerSkorTmp, ronde = 1;
		String lempar = "";

		do {
			compSkorTmp = 0;
			System.out.println( "\n---------------------------");
			System.out.println( "\nRonde " + ronde );
			System.out.println( "\n---------------------------");
			System.out.println( "\n\nGiliran Komputer" );
			System.out.println( "\nKomputer melempar dadu" );

			for ( com = 1 ; com <= 3 ; com ++ ) {
				comSkor = rand.nextInt(6)+1;
				compSkorTmp = compSkorTmp + comSkor;
				System.out.println( "\nDadu " + com + ": " + comSkor );
			}

			System.out.println( "\nJumlah dadu komputer: " + compSkorTmp );

			comSkorTotal = comSkorTotal + compSkorTmp;
			System.out.println( "\nTotal skor komputer: "+ comSkorTotal );
			System.out.println( "\n---------------------------");

			if ( comSkorTotal < 100 ) {
				player = 1;
				playerSkorTmp = 0;
				System.out.println( "\nGiliran Pemain");

				do {				
					System.out.println( "\n\nLemparan ke " + player );
					System.out.println( "\nPemain melempar dadu" );
					playerSkor = rand.nextInt(6)+1;
					System.out.println( "\nDadu pemain: " + playerSkor );
					
					if ( playerSkor == 1 ) {
						playerSkorTmp = 0;
						System.out.println( "\nKesempatan anda habis." );
						System.out.println( "\nSkor anda di ronde ini menjadi: " + playerSkorTmp );
					}

					else {
						playerSkorTmp = playerSkorTmp + playerSkor;
						System.out.println( "\nSkor anda sementara: " + playerSkorTmp );

						if( playerSkorTotal < 100 ) {
							System.out.print( "\nAnda ingin main lagi (y/n) ? " );
							lempar = keyboard.next();
						}

					}

					player ++;
				} while ( playerSkor != 1 && ( playerSkorTotal + playerSkorTmp ) < 100 && lempar.equalsIgnoreCase ( "y" ) ) ;

				playerSkorTotal = playerSkorTotal + playerSkorTmp;
				System.out.println( "\nTotal skor anda: " + playerSkorTotal );
			}

			ronde ++;
		} while ( comSkorTotal < 100 && playerSkorTotal < 100 );

		if ( comSkorTotal > playerSkorTotal ) {
			System.out.println( "\nKomputer Menang" );
			System.out.println( "\nSkor: " + comSkorTotal );
		}

		else {
			System.out.println( "\nAnda Menang" );
			System.out.println( "\nSkor: " + playerSkorTotal );
		}

	}
}