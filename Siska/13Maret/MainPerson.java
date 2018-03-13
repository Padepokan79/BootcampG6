import java.util.Scanner;
public class MainPerson {

	public static void main(String[] args) {
		String tfirstName, tlastname, tgender, tinterests;
		int tage;
		Scanner keyboard = new Scanner(System.in); Scanner keyboardInt = new Scanner (System.in);
		Person person1 = new Person ();
		System.out.println("Nama depan: ");
		tfirstName = keyboard.nextLine();
		person1.setfirstName(tfirstName);
		System.out.println("Nama belakang: ");
		tlastname = keyboard.nextLine();
		person1.setlastame(tlastname);
		System.out.println ("Umur: ");
		tage = keyboardInt.nextInt();
		person1.setage(tage);
		System.out.println("Jenis Kelamin: ");
		tgender = keyboard.nextLine();
		person1.setgender(tgender);
		System.out.println("Hobi: ");
		tinterests = keyboard.nextLine();
		person1.setinterests(tinterests);
		person1.bio();
		person1.greeting();
	}

}
