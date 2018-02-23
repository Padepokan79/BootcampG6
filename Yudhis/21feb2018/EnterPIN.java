import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String pass, entryPass;

		pin = 12345;
		pass = "wonosobo";

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		entryPass = keyboard.next();
		
		while (!(entryPass.equals(pass))) {
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD: ");
			entryPass = keyboard.next();
		}

		System.out.println("\nPASSWORD ACCEPTED.");

		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();

		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}