public class ArrayIntro {
	public static void main(String[] args) {
		String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String [] nation = {"Indonesia", "Malaysia", "Thailand", "Cambodia", "Myanmar", "Laos", "Vietnam"};

		for (String p : planets) {
			System.out.println(p + "\t" + p.toUpperCase());
		}

		System.out.println();

		for (String n : nation) {
			System.out.println(n);
		}
	}
}