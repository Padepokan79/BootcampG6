import java.util.Scanner;
import java.util.Random;
public class PigDice{
	public static void main(String[] args) {
		//Fahreja Abdullah 23 Feb 2018
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int totalPlayer,totalComputer,scoreRoundP,batasScore = 100;
		int roundGlobal,roundCom,roundPlayer, dadu, daduPemain;
		String konfir;

		roundGlobal = 1;
		totalPlayer = 0;
		totalComputer = 0;

		do{
			scoreRoundP = 0;
			roundCom = 1;
			roundPlayer = 1;
			System.out.println("Ronde : " +roundGlobal);

			while (roundCom !=4) {
				dadu = rand.nextInt(5)+1;
				System.out.println("Ronde Komputer " + roundCom);
				System.out.println("Dadu yang keluar  :" +dadu);
				totalComputer = totalComputer + dadu;
				System.out.println("total skor ronde ini : " +totalComputer);
				
				roundCom++;
			}
			System.out.println();
			if ( totalComputer < batasScore) {
				konfir = "";
				do {
						daduPemain = rand.nextInt(5)+1;
						System.out.println("Ronde Pemain " +roundPlayer);
						if (daduPemain != 1) {
							System.out.println("Dadu yang keluar :" +daduPemain);
							scoreRoundP = scoreRoundP + daduPemain;
							System.out.println("Skor Sementara : " +(scoreRoundP + totalPlayer) );
							System.out.print("Apakah anda ingin melempar dadu lagi (y/n) ? ");
							konfir = keyboard.next();
							
							if (konfir.equalsIgnoreCase("n")) {
								totalPlayer = totalPlayer + scoreRoundP;
								System.out.println("Jumlah Skor : " + totalPlayer);
							}

							roundPlayer++;
						}else {
							System.out.println("Dadu yang keluar :" +daduPemain);
							System.out.println("Maaf anda kurang beruntung");
							System.out.println("Jumlah Skor : " + totalPlayer);
							scoreRoundP = 0;
							}
						System.out.println();	
					}while (konfir.equalsIgnoreCase("y") && daduPemain != 1);
				}				
				
			}while (totalPlayer < batasScore && totalComputer < batasScore);
		
		if (totalPlayer == batasScore) {
				System.out.println("Selamat anda menang");
			}else{
				System.out.println("Komputer Menang");
				System.out.println("Anda kalah dengan total skor : " + totalPlayer
					);
			}
	}
	
}