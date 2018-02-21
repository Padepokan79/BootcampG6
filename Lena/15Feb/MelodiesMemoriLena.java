import java.util.Scanner;

public class MelodiesMemoriLena{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);

		int age;
		String day,jk;
		boolean allowed;

		System.out.print("Input hari: ");
		day=keyboard.next();
		System.out.print("Input jenis kelamin (p/l): ");
		jk=keyboard.next();
		System.out.print("Input usia: ");
		age=keyboard.nextInt();

		allowed=(day.equalsIgnoreCase("jumat") && (jk.equalsIgnoreCase("p") || jk.equalsIgnoreCase("l")) && age>40);

		System.out.println("Allowed to come? "+allowed);
	}
}