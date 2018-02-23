public class ArrayIntro {
	public static void main (String []args){
		String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		int [] number = {1, 2, 3, 4, 5, 6, 7, 8};

		for (int a : number) {
			System.out.println (a + " ");
		}


		for (String p : planets) {
			System.out.println (p + "\t" + p.toUpperCase());
		}


	}
}