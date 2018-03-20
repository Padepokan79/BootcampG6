package exercise35;

public class JamTester {
	public static void main(String[] args) {
		Jam jar = new Jam("Crab Apple", "9/30/99", 12);
		
		jar.print();
		
		if(jar.empty()) {
			System.out.println("Can't spread any jam: jar is empty.");
		}
		else {
			jar.spread(1);
			jar.print();
		}
	}
}
