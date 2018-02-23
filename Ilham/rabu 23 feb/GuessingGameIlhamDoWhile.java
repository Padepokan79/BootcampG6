import java.util.Random;
import java.util.Scanner;

public class GuessingGameIlhamDoWhile {
	public static void main(String[] args) {
		//Inisialisasi
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		//Inisialisasi
		int kesempatan, batasKesempatan, myNumber, tebakan, tebakanBenar, ronde;
		String rating;

		//Deklarasi
		batasKesempatan = 3; // batas kesempatan menebak
		tebakanBenar = 0; //
		ronde = 1; // deklarasi ronde 1

		// ulang ronde hingga 10 kali
		do {
			// angka yang dirandom
			myNumber = rand.nextInt(10)+1; 
			// reset tebakan user
			tebakan = 0;
			// reset kesempatan
			kesempatan = 1; // deklarasi kesempatan peratama
			// menampilkan output
			System.out.println("Round " + ronde + ": \n");
			System.out.println("Guessing Game\n");
			System.out.println("my number is: " + myNumber);
			System.out.println("\nI am thinking of a number from 1 to 10. \nYou must guess what it is in three tries.\nEnter a guess: ");
			
			// ulang jika jawaban salah && kesempatan kurang dari sama dengan 3
			do {
				//input tebakan user
				tebakan = keyboard.nextInt();			
				if (tebakan == myNumber) {
					// jika benar
					System.out.println("RIGHT!");
					System.out.println("You have won the game.");
					tebakanBenar += 1;
				} else {
					// jika salah
					// jika salah pada kesempatan terakhir
					if (kesempatan == batasKesempatan) {
						System.out.println("Wrong");
					}
					// jika perbedaan lebih dari 3
					else if (tebakan - myNumber >= 3 || myNumber - tebakan >= 3) {
						System.out.println("Cold");				
					}
					// jika perbedaan sama dengan 2
					else if (tebakan - myNumber == 2 || myNumber - tebakan == 2) {
						System.out.println("Warm");				
					}
					// jika perbedaan sama dengan 1 
					else if (tebakan - myNumber == 1 || myNumber - tebakan == 1) {
						System.out.println("Hot");				
					}
					// tambah kesempatan jika salah
					kesempatan++;
				}			
			} while (kesempatan <= batasKesempatan && tebakan != myNumber);
			// tampilkan jika user salah menebak setelah 3 kali kesempatan
			if (tebakan != myNumber) {
				System.out.println("The correct number was " + myNumber);
				System.out.println("You have lost the game.");
			}

			System.out.println("\nYou have won " + tebakanBenar + " out of " + ronde + " rounds");
			System.out.println("-------------------------------------------------------------------------\n");
			ronde++;
		} while (ronde <= 10); 

		// cek rating
		switch (tebakanBenar) {
		 	case 10: rating = "hackers";
		 			 break;
		 	case 9: rating = "professionals";
		 			break;
		 	case 8: rating = "advanced";
		 			break;
		 	default: rating = "amateurs";
		 } 
		 System.out.println("Your rating: " + rating);
		
	}
}