import java.util.Scanner;

public class TestPerson {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		
		Person person1 = new Person();
		
		System.out.print("\nMasukkan Nama Depan: ");
		person1.setFirstName(keyboard.next());
		System.out.print("Nama Belakang: ");
		person1.setLastName(keyboard.next());
		System.out.print("Umur: ");
		person1.age = keyboard.nextInt();
		System.out.print("Jenis Kelamin: ");
		person1.setGender(keyboard.next());
		System.out.print("Hobi: ");
		person1.setInterest(keyboard.next());
		
		System.out.println("==============================================");
		
		
		System.out.println("\nBio { " + person1.getFirstName() + " " + person1.getLastName() + " " + " is " + person1.age + " years old." + " He likes " + person1.getInterest() + ". }");
		System.out.println("\nGreeting { Hello. My name is Mr. " + person1.getLastName() + " }");
	}

}