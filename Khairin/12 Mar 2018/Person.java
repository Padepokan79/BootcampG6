
	public class Person {
		String firstName, lastName, gender, interest;
		int age;
		
		public Person() {
			// TODO Auto-generated constructor stub
		}
		
		void person (String depan , String belakang , int umur, String jk, String suka ) {
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

	}
