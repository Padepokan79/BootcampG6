package main;

public class Person {
	
	String name, firstName, lastName;
	
	void bioPerson (String firstName, String lastName, int age, String gender, String interest) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.name = firstName + " " + lastName;
		
		System.out.print(name + " is " + age + " years old. ");
		System.out.println("They like " + interest + ".");
	}
	
}
