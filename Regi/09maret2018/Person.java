
public class Person {
	String firstName, lastName, gender, interest;
	int age;
	
	public Person() {
	}
	
	Person(String f, String l, String g, String i, int a) {
		firstName = f;
		lastName = l;
		gender = g;
		interest = i;
		age = a;
	}
	
	void tampilData() {
		System.out.println("\nBio{" + firstName + " " + lastName + " " + " is " + age + " years old." + " He likes " + interest + ".}");
		System.out.println("\nGreeting{Hello. My name is Mr. " + lastName + "}");
	}
	
}
