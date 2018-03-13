package main;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Person person = new Person();
		
		System.out.print("Nama depan : "); person.firstName = input.nextLine();
		System.out.print("Nama belakang : "); person.lastName = input.nextLine();
		System.out.print("Umur : "); person.age = input.nextInt();
		input.nextLine();
		System.out.print("Jenis kelamin : "); person.gender = input.nextLine();
		System.out.print("Hobi : "); person.interest = input.nextLine();
		
		person.showPerson();
	}

}
