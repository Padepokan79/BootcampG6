import java.util.Scanner;

public class NomorHPRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String nomor;
		String keterangan;
		int awal, akhir = 1;

		System.out.print( "\nMasukan Nomor HP Anda: " );
		nomor = keyboard.next();
		System.out.println( "\nKeterangan: " );

		for ( awal = 0; awal < nomor.length(); awal++ ) {
			keterangan = nomor.substring(awal,akhir);
			System.out.print( keterangan );

			if ( keterangan.equals("0") ) {
				System.out.println( "\tkhusus, special, langka" );
			}
			else if ( keterangan.equals("1") ) {
				System.out.println( "\tsatu, satu-satunya, diri sendiri" );
			}
			else if ( keterangan.equals("2") ) {
				System.out.println( "\tmudah, gampang, tidak sulit" );
			}
			else if ( keterangan.equals("3") ) {
				System.out.println( "\tmenemukan, mendapatkan, hidup" );
			}
			else if ( keterangan.equals("4") ) {
				System.out.println( "\tmati, miskin, susah" );
			}
			else if ( keterangan.equals("5") ) {
				System.out.println( "\tTidak akan, tidak pernah, tidak bisa" );
			}
			else if ( keterangan.equals("6") ) {
				System.out.println( "\tMenuju, akan" );
			}
			else if ( keterangan.equals("7") ) {
				System.out.println( "\tTepat, hoki, atau bisa disebut juga ketuhanan" );
			}
			else if ( keterangan.equals("8") ) {
				System.out.println( "\tMakmur" );
			}
			else if ( keterangan.equals("9") ) {
				System.out.println( "\tSukses" );
			}
			
			akhir++;
		}
	}
}