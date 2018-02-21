import java.util.Scanner;

public class BrondongNightLena{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);

		int age;
		String day, jk;
		double look;
		boolean allowed;

		System.out.print("Input hari: ");
		day=keyboard.next();
		System.out.print("Input jenis kelamin (p/l): ");
		jk=keyboard.next();
		System.out.print("Input usia: ");
		age=keyboard.nextInt();
		System.out.print("How good looking are you, on a scale from 0.0 to 10.0? ");
		look=keyboard.nextDouble();

		allowed=(day.equalsIgnoreCase("selasa") && ((jk.equalsIgnoreCase("p") && age>=30 && age<=45 && look>=8) || (jk.equalsIgnoreCase("l") && age>=20 && age<=25 && look<8)));

		System.out.println("Allowed to come? "+allowed);
	}
}