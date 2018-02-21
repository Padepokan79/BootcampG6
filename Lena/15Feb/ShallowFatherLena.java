import java.util.Scanner;

public class ShallowFatherLena{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age,umurAnak;
		double income, look;
		boolean allowed;


        System.out.print("Enter umur anak perempuan: ");
		umurAnak=keyboard.nextInt();

		System.out.print("Enter your age: ");
		age=keyboard.nextInt();

		System.out.print("Enter your early income: ");
		income= keyboard.nextDouble();

		System.out.print("How good looking are you, on a scale from 0.0 to 10.0? ");
		look=keyboard.nextDouble();

		allowed=(((age - umurAnak)<=5||(umurAnak - age)<=5) && (income>5000000||look>=8));
		System.out.println("Allowed to date my child? "+allowed);
	}
}