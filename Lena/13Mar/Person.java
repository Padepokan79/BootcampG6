
public class Person {
	private String firstName, lastName, gender, interest;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	Person(String namaDepan, String namaBelakang, int umur, String jk, String hobi) {
		// TODO Auto-generated constructor stub
		firstName = namaDepan;
		lastName = namaBelakang;
		age = umur;
		gender = jk;
		interest = hobi;
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
	public void setAge(int age) {
		this.age = age;
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
	public int getAge() {
		return age;
	}
	
	public void insertRecord(String namaDepan, String namaBelakang, int umur, String jk, String hobi) {
		firstName = namaDepan;
		lastName = namaBelakang;
		age = umur;
		gender = jk;
		interest = hobi;
	}
	
	public void displayBio() {
		System.out.println();
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Interests: "+interest);
		System.out.println("Bio{ "+ firstName+" "+lastName+" is "+age+" years old. She/He likes "+interest+". }");
	}
	
	
}
