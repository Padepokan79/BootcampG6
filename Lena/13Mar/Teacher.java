
public class Teacher extends Person{
	private String subject;
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	
	void displayGreeting() {
		System.out.println("Subject: "+subject);
		System.out.println("Greeting{ Hello! My name is Ms./Mr. "+getLastName()+" and I teach "+subject+"}");
	}
}
