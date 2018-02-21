public class BilanganGenapRegi {
	public static void main( String[] args ) {

		int bilangan;

		for ( bilangan = 0 ; bilangan <= 20 ; bilangan += 2 ) {
			if ( bilangan != 0 && bilangan % 2 == 0 ) {
				System.out.println( bilangan );
			}
		}
	}
}