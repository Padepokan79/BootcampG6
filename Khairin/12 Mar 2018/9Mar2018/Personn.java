package eclipse;

public class Personn {
	String firstName, lastName, gender, interest;
	int age;
	
	public Personn() {
		// TODO Auto-generated constructor stub
	}
	
	Personn (String depan , String belakang , int umur, String jk, String suka ) {
		firstName = depan;
		lastName = belakang;
		age = umur;
		gender = jk;
		interest = suka;
}
	void displayBio() {
		System.out.println();
		System.out.println("Name " + firstName + " " + lastName);
		System.out.println("Age " + age);
		System.out.println("Gender " + gender);
		System.out.println("Interest " + interest);
		System.out.println("Bio " + firstName + " is " + age + " years old. She likes " + interest);
}

class Teacher extends Personn{
	String subject, greeting;
	void subject(String sub, String greet) {
		subject=sub;
		greeting = greet;
		System.out.println("Subject " + subject);
		System.out.println("Greeting " + greeting);
	}
	
class Student extends Personn{
	String greeting;
	void greeting(String greet) {
		greeting=greet;
		System.out.println("Greeting Yo! I'm " + firstName );
	}
}

}
}