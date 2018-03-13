
public class Person {
	String firstName, lastname; 
	int age;
	String gender;
	String interests;
	
	//default
	Person (){
		
	}
	
	//constructors
	Person (String fN, String lN, int ag, String gen, String inte ){
		firstName = fN;
		lastname = lN;
		age = ag;
		gender = gen;
		interests = inte;
		
	}
	//method
	void buatData (String f, String l, int a, String g, String irst) {
		firstName = f;
		lastname = l;
		age = a;
		gender = g;
		interests = irst;
	}
	
	void bio() {
		System.out.println("Bio{ " + firstName + " "+ lastname + " is " + age + " years old. They like " + interests + " }");
	}
	
	void greeting () {
		System.out.println("{Hi, I'm " + firstName + " .}");
	}
	
}
