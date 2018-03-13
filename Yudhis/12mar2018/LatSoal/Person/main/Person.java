package main;

public class Person {

	String firstName, lastName, gender, interest;
	int age;
	
	void showPerson () {
		System.out.println("Name[" + firstName + ", " + lastName + "]");
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Interests: " + interest);
		System.out.print("Bio{" + firstName + " " + lastName + " is " + age + " years old. ");
		System.out.println("Likes " + interest + "}");
		System.out.println("Greeting{Hi! I'm " + firstName + ".}");
		System.out.println();
	}

}
