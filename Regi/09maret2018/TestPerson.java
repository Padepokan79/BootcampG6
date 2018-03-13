import java.util.Scanner;

public class TestPerson {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		
		Person person1 = new Person();
		
		System.out.print("\nMasukkan Nama Depan: ");
		person1.firstName = keyboard.next();
		System.out.print("\nNama Belakang: ");
		person1.lastName = keyboard.next();
		System.out.print("\nUmur: ");
		person1.age = keyboard.nextInt();
		System.out.print("\nJenis Kelamin: ");
		person1.gender = keyboard.next();
		System.out.print("\nHobi: ");
		person1.interest = keyboard.next();
		
		System.out.println("==============================================");
		
		
		System.out.println("\nBio { " + person1.firstName + " " + person1.lastName + " " + " is " + person1.age + " years old." + " He likes " + person1.interest + ". }");
		System.out.println("\nGreeting { Hello. My name is Mr. " + person1.lastName + " }");
	}

}