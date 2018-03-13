
public class Teacher extends Person {
	String subject;
	
	Teacher(String f, String l, String g, String i, int a, String s) {
		firstName = f;
		lastName = l;
		gender = g;
		interest = i;
		age = a;
		subject = s;
	}
	
	void tampilDataTeacher() {
		System.out.println("\nBio{" + firstName + " " + lastName + " " + " is " + age + " years old." + " He likes " + interest + ".}");
		System.out.println("\nGreeting{Hello. My name is Mr. " + lastName + " and I teach " + subject + "}");
	}
}
