public class PedagangRegi {
	public static void main( String[] args ) {

		int kue = 200, menit;

		for ( menit = 15 ; menit <= 450 ; menit += 15 ) {
			kue -= 3;
		}

		System.out.print( "\nsisa kue: " + kue );
	}
}y