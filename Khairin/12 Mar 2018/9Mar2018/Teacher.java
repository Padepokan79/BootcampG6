package eclipse;
	
class Teacher extends Personn{
		String subject, greeting;
		void subject(String sub, String greet) {
			subject=sub;
			greeting = greet;
			System.out.println("Subject " + subject);
			System.out.println("Greeting " + greeting);
		}

}
