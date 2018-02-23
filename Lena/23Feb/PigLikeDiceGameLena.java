/* @author  : lenawidiani
 * @version : Feb 23, 2018
 */

import java.util.Scanner;
import java.util.Random;

public class PigLikeDiceGameLena{
	public static void main(String[] args) {

		//inisialisasi
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int computerTotalScore=0, playerTotalScore=0;
		int computerScore,playerScore,playerTempScore;
		int round=1;
		String lempar="";

		//perulangan dilakukan selama skor < 100
		do{
			//KOMPUTER
			int computerTempScore=0;
			System.out.println("RONDE "+round+"\nKOMPUTER TURN\n\nKomputer melempar dadu:");

			//untuk mendapatkan skor dadu komputer dalam 3 kali lemparan
			for ( int i=1 ; i<=3 ; i++ ) {
				computerScore = rand.nextInt(6)+1;
				computerTempScore = computerTempScore + computerScore;
				System.out.println("Dadu ke "+i+" : " + computerScore);
			}
			System.out.println("Total skor dadu komputer: "+ computerTempScore);
			
			//untuk mendapatkan total skor dadu komputer di setiap ronde
			computerTotalScore = computerTotalScore+computerTempScore;
			System.out.println("\nTotal skor komputer: "+ computerTotalScore+"\n");

			//pengecekkan jika skor komputer < 100, maka pemain dapat melempar dadu
			if(computerTotalScore<100){

				//PEMAIN
				int j=1;
				playerTempScore=0;
				System.out.println("PEMAIN TURN");
				
				//perulangan dilakukan selama skor pemain != 1, pemain ingin main lagi dan total skor pemain masih < 100
				do{
					
					System.out.println("\nLemparan ke "+j);

					//mendapatkan skor dadu pemain				
					playerScore = rand.nextInt(6)+1;
					System.out.println("Pemain melempar dadu, dadu pemain: "+ playerScore);
					
					//pengecekkan jika skor pemain yang didapat = 1, maka kesempatan pemain habis dan total skor sementara hangus
					if(playerScore == 1){
						playerTempScore=0;
						System.out.println("Kesempatan pemain habis.");
						System.out.println("Total skor dadu anda sementara: "+ playerTempScore);
					}
					else{
						//untuk mendapatkan total skor sementara pemain
						playerTempScore=playerTempScore+playerScore;	
						System.out.println("Total skor dadu anda sementara: "+ playerTempScore);	

						//pengecekan jika pemain ingin main lagi atau tidak saat total skor pemain masih < 100
						if(playerTotalScore<100){
							System.out.print("Main lagi? (y/n) ");
							lempar=keyboard.next();
						}										
					}
					j++;

				}while(playerScore != 1 && lempar.equalsIgnoreCase("y") && (playerTotalScore+playerTempScore)<100);

				//mendapatkan total skor pemain
				playerTotalScore = playerTotalScore+playerTempScore;
				System.out.println("Total skor pemain: "+playerTotalScore+"\n\n");
			}

			round++;
		}while(computerTotalScore<100 && playerTotalScore<100);

		//untuk menampilkan ketika komputer atau pemain menang
		if(computerTotalScore>playerTotalScore){
			System.out.println("KOMPUTER MENANG! dengan skor: "+ computerTotalScore);
			System.out.println("Anda KALAH dengan skor: "+playerTotalScore);
		}
		else{
			System.out.println("ANDA MENANG! dengan skor: "+playerTotalScore);
			System.out.println("Komputer KALAH dengan skor: "+computerTotalScore);
		}
	}
}