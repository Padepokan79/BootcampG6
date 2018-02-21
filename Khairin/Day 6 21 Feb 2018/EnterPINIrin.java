import java.util.Scanner;

// REPEATING YOURSELF WITH THE WHILE LOOP

public class EnterPINIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entryPin;
		String entryPass;

		pin = 12345;

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		entryPass = keyboard.next();

		while ( ! entryPass.equals("pass") ) {
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD: ");
			entryPass = keyboard.next();
		}
		System.out.println("\nPASSWORD ACCEPTED");
		
		System.out.print("ENTER YOUR PIN: ");
		entryPin = keyboard.nextInt();

		while ( pin != entryPin ) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entryPin = keyboard.nextInt();
		}
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}