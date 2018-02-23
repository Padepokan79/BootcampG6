import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int [] orderNumbers = {12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind;
		boolean found = false;

		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");

		System.out.print("Orders: ");
		for (int num : orderNumbers) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();

		for (int num : orderNumbers) {
			if (num == toFind) {
				found = true;
				System.out.println(num + " found.");
			} 
		}

		if (found == false) {
			System.out.println(toFind + " not found.");
		}
	}
}