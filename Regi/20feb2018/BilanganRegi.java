public class BilanganRegi {
	public static void main( String[] args ) {

		int bilangan;

		for ( bilangan = 30 ; bilangan <= 90 ; bilangan ++ ) {
			if ( bilangan % 3 == 0 && bilangan % 5 == 0 ) {
				System.out.println( bilangan );
			}
		}
	}
}