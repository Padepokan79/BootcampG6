package main;

public class Holiday extends Card {
	public Holiday(String r) {
		// TODO Auto-generated constructor stub
		recipient = r;
	}
	
	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Season's Greetings!\n\n");
	}
}
