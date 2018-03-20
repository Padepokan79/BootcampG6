package progExercises35;
public class JamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jam jar = new Jam("crab apple", "9/30/99", 12);
		
		jar.print();
		
		if(jar.empty()) {
			System.out.println("Can't spread any jam: jar is empty.");
		}
		else {
			jar.spread(1);
			System.out.println("Spreading 1 oz. of jam.");
			jar.print();
		}

	}

}
