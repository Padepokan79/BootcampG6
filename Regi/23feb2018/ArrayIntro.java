public class ArrayIntro {
	public static void main( String[] args ) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		double[] bilangan = { 0.1, 0.2, 0.3 };

		for ( String p : planets ) {
			System.out.println( p + "\t" + p.toUpperCase() );
		}
		for ( double bil : bilangan ) {
			System.out.println( "\n" + 	bil );
		}
	}
}