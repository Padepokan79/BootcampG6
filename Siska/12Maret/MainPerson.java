import java.util.Scanner;
public class MainPerson {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); Scanner keyboardInt = new Scanner (System.in);
		Person person1 = new Person ();
		System.out.println("Nama depan: ");
		person1.firstName = keyboard.nextLine();
		System.out.println("Nama belakang: ");
		person1.lastname = keyboard.nextLine();
		System.out.println ("Umur: ");
		person1.age = keyboardInt.nextInt();
		System.out.println("Jenis Kelamin: ");
		person1.gender = keyboard.nextLine();
		
		System.out.println("Hobi: ");
		person1.interests = keyboard.nextLine();

		person1.bio();
		person1.greeting();
	}

}
