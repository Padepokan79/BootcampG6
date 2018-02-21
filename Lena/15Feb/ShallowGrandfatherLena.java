import java.util.Scanner;

public class ShallowGrandfatherLena{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, goodLooking;
		boolean allowed;


		System.out.print("Enter your age: ");
		age=keyboard.nextInt();

		System.out.print("Enter your early income: ");
		income= keyboard.nextDouble();

		System.out.print("How good looking are you, on a scale from 0.0 to 10.0? ");
		goodLooking=keyboard.nextDouble();

		allowed=(age>=30 && income>5000000 && (goodLooking>=8 ||goodLooking<8));
		System.out.println("Allowed to date my grandchild? "+allowed);
	}
}