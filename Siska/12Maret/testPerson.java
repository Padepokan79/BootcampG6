
public class testPerson {

	public static void main(String[] args) {
		//variable
		Person person1 = new Person ();
		person1.firstName = "Siska";
		person1.lastname = "Pitriani";
		person1.age = 20;
		person1.gender = "Female";
		person1.interests = "Reading";
		person1.bio();
		person1.greeting();

		//methode
		Person person2 = new Person ();
		person2.buatData("Grace", "Berasa", 20, "Female", "Singing");
		person2.bio();
		person2.greeting();
		
		//constructors
		Person person3 = new Person("Aristo", "Pacitra", 20, "Male", "Playing");
		person3.bio();
		person3.greeting();

	}

}
