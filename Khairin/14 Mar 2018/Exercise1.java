import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int pilih, banyak;
		Scanner input = new Scanner(System.in);
		Jam goose = new Jam("Gooseberry", "7/4/86",  12);
		Jam apple = new Jam("Crab Apple",  "9/30/99", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 16);
		Pantry exer1 = new Pantry(goose, apple, rhub);
		
		do {
		System.out.println("The jams are: ");
		exer1.print();
		System.out.println("Enter your selection 1, 2, or 3: "); pilih = input.nextInt();
		exer1.select(pilih);
		System.out.println("Enter amount to spread: "); banyak = input.nextInt();
		exer1.spread(banyak);
		} while (banyak != -1); 
			System.out.println("Good-bye!");
	}

}
