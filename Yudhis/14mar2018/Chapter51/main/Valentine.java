package main;

public class Valentine extends Card {
	int kisses;
	
	public Valentine(String r, int k) {
		// TODO Auto-generated constructor stub
		recipient = r;
		kisses = k;
	}
	
	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Love and Kisses,\n");
		for (int j = 0; j < kisses; j++) {
			System.out.println("X");
		}
		System.out.println("\n\n");
	}
}
