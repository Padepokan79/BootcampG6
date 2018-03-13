package eclipse;

public class Person {
	String firstName, lastName, gender, interest;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	Person (String depan , String belakang , int umur, String jk, String suka ) {
		firstName = depan;
		lastName = belakang;
		age = umur;
		gender = jk;
		interest = suka;
} //3.	Object and Class Example: Initialization through constructor. DIMULAI DENGAN HURUF BESAR
	
	void data(String depan , String belakang , int umur, String jk, String suka ) {
	firstName = depan;
	lastName = belakang;
	age = umur;
	gender = jk;
	interest = suka;
} //2.	Object and Class Example: Initialization through method DIMULAI DENGAN HURUF KECIL
	
	void displayBio() {
		System.out.println();
		System.out.println("Name " + firstName + " " + lastName);
		System.out.println("Age " + age);
		System.out.println("Gender " + gender);
		System.out.println("Interest " + interest);
		System.out.println("Bio Joane is " + age + " years old. She likes " + interest);
		System.out.println("Greeting Hi I'm " + firstName + " " + lastName);
		System.out.println("\n");}
} //1.	Object and Class Example: Initialization through reference

