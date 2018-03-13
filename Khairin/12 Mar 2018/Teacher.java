

class Teacher extends Person{
			String subject;
			void subject(String sub) {
				subject=sub;
				System.out.println("Subject " + subject);
				System.out.println("Greeting Hello My name is " + firstName + " " + lastName + ", and I teach " + subject);
			}

	}

