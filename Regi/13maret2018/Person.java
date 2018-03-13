
public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private String interest;
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
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getInterest() {
		return interest;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setInterest(String interest) {
		this.interest = interest;
	}
}
