package main;

public class Birthday extends Card {
	int age;
	
	public Birthday(String r, int years) {
		// TODO Auto-generated constructor stub
		recipient = r;
		age = years;
	}
	
	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Happy " + age + "th Birthday\n\n");
	}
}
