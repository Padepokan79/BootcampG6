import java.util.Scanner;

public class IkanTravelIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int penumpang, a, b, c, d, e, f, a1, b1, c1, d1, e1, f1;

		//INISIALISASI
		a = 60;
		a1 = 2300000;
		b = 45; 
		b1 = 2000000;
		c = 32; 
		c1 = 1800000;
		d = 18; 
		d1 = 1500000;
		e = 12; 
		e1 = 1300000;
		f = 6; 
		f1 = 2000000;

		//PROSES 1 TAMPILAN LIST HARGA

		System.out.println( "========================================================================================");
		System.out.println( "                                      IKAN TRAVEL                                       ");
		System.out.println( "========================================================================================");
		System.out.println( "======================================= WELCOME! =======================================");
		System.out.println();
		System.out.println( "Berapa jumlah penumpang Anda?" );
		penumpang = keyboard.nextInt();

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print( "\n\nList harga bus adalah\t: \n");
		if ( penumpang <= 6 ) {
			System.out.println( "Jumlah Kursi " + f + " \tHarga " + "Rp." + f1 );
		}
		else if ( penumpang == 12 || penumpang < 18) {
			System.out.println( "Jumlah Kursi " + f + " \t\tHarga " + "Rp." + f1 );
			System.out.println( "Jumlah Kursi " + e + " \tHarga " + "Rp." + e1 );
		}
		else if ( penumpang == 18 || penumpang < 32) {
			System.out.println( "Jumlah Kursi " + f + " \t\tHarga " + "Rp." + f1 );
			System.out.println( "Jumlah Kursi " + e + " \tHarga " + "Rp." + e1 );
			System.out.println( "Jumlah Kursi " + d + " \tHarga " + "Rp." + d1 );
		}	
		else if (penumpang == 32 || penumpang < 45) {
			System.out.println( "Jumlah Kursi " + f + " \t\tHarga " + "Rp." + f1 );
			System.out.println( "Jumlah Kursi " + e + " \tHarga " + "Rp." + e1 );
			System.out.println( "Jumlah Kursi " + d + " \tHarga " + "Rp." + d1 );
			System.out.println( "Jumlah Kursi " + c + " \tHarga " + "Rp." + c1 );
		}
		else if (penumpang == 45 || penumpang < 60) {
			System.out.println( "Jumlah Kursi " + f + " \t\tHarga " + "Rp." + f1 );
			System.out.println( "Jumlah Kursi " + e + " \tHarga " + "Rp." + e1 );
			System.out.println( "Jumlah Kursi " + d + " \tHarga " + "Rp." + d1 );
			System.out.println( "Jumlah Kursi " + c + " \tHarga " + "Rp." + c1 );
			System.out.println( "Jumlah Kursi " + b + " \tHarga " + "Rp." + b1 );
		}	
		else if (penumpang == 60 || penumpang >= 60) {
			System.out.println( "Jumlah Kursi " + f + " \t\tHarga " + "Rp." + f1 );
			System.out.println( "Jumlah Kursi " + e + " \tHarga " + "Rp." + e1 );
			System.out.println( "Jumlah Kursi " + d + " \tHarga " + "Rp." + d1 );
			System.out.println( "Jumlah Kursi " + c + " \tHarga " + "Rp." + c1 );
			System.out.println( "Jumlah Kursi " + b + " \tHarga " + "Rp." + b1 );
			System.out.println( "Jumlah Kursi " + a + " \tHarga " + "Rp." + a1 );
		}

		//PROSES 2 TAMPILAN REKOMENDASI BUS

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println( "\nJumlah Penumpang Anda adalah\t\t: " + penumpang + "\nRekomendasi bus untuk anda adalah\t:\n");
		
		if ( penumpang <=6 ) {
			System.out.println( "Bus dengan jumlah kursi " + f + "\tDengan total harga " + "Rp." + f1 );
		}	
		else if	( penumpang == 7 || penumpang <= 11) {
			System.out.println( "2 bus dengan jumlah kursi " + f +  "\tDengan total harga " + "Rp." + f1*2 );
		}
		else if ( penumpang == 12) {
			System.out.println( "1 bus dengan jumlah kursi " + e +  "\tDengan total harga " + "Rp." + e1 );
		}
		else if ( penumpang == 13 || penumpang <= 17) {
			System.out.println( "2 bus dengan jumlah kursi " + e +  "\tDengan total harga " + "Rp." + e1*2 );
		}
		else if ( penumpang == 18 ) {
			System.out.println( "1 bus dengan jumlah kursi " + d +  "\tDengan total harga " + "Rp." + d1 );
		}
		else if ( penumpang == 19 || penumpang <= 24 ) {
			System.out.println( "2 bus dengan jumlah kursi " + e +  "\tDengan total harga " + "Rp." + e1*2 );
		}
		else if ( penumpang == 25 || penumpang <= 30 ) {
			System.out.println( "2 bus dengan jumlah kursi " + e + " dan " + d +  "\tDengan total harga " + "Rp." + (d1+e1) );
		}
		else if ( penumpang == 31 ) {
			System.out.println( "2 bus dengan jumlah kursi " + d +  "\tDengan total harga " + "Rp." + d1*2 );
		}
		else if ( penumpang == 32 ) {
			System.out.println( "1 bus dengan jumlah kursi " + c +  "\tDengan total harga " + "Rp." + c1 );
		}
		else if ( penumpang == 33 || penumpang <= 36 ) {
			System.out.println( "2 bus dengan jumlah kursi " + d +  "\tDengan total harga " + "Rp." + d1*2 );
		}
		else if ( penumpang == 37 || penumpang <= 44 ) {
			System.out.println( "2 bus dengan jumlah kursi " + e + " dan " + c + "\tDengan total harga " + "Rp." + (e1+c1) );
		}
		else if ( penumpang == 45 ) {
			System.out.println( "1 bus dengan jumlah kursi " + b +  "\tDengan total harga " + "Rp." + b1 );
		}
		else if ( penumpang == 46 || penumpang <= 50 ) {
			System.out.println( "2 bus dengan jumlah kursi " + d + " dan " + c + "\tDengan total harga " + "Rp." + (d1+c1) );
			System.out.println( "2 bus dengan jumlah kursi " + e + " dan " + b + "\tDengan total harga " + "Rp." + (b1+e1) );
		}
		else if ( penumpang == 51 || penumpang <= 57 ) {
			System.out.println( "2 bus dengan jumlah kursi " + e + " dan " + b + "\tDengan total harga " + "Rp." + (e1+b1) );
		}
		else if ( penumpang == 58 || penumpang <= 59 ) {
			System.out.println( "2 bus dengan jumlah kursi " + d + " dan " + b + "\tDengan total harga " + "Rp." + (d1+b1) );
		}
		else if ( penumpang == 60 ) {
			System.out.println( "1 bus dengan jumlah kursi " + a +  "\tDengan total harga " + "Rp." + a1 );	
		}
		else if ( penumpang == 61 || penumpang <= 63  ) {
			System.out.println( "2 bus dengan jumlah kursi " + b + " dan " + d + "\tDengan total harga " + "Rp." + (b1+d1) );	
		}
		else if ( penumpang  == 64 ) {
			System.out.println( "2 bus dengan jumlah kursi " + c + "\t\tDengan total harga " + "Rp." + (c1*2) );	
			System.out.println( "2 bus dengan jumlah kursi " + e + " dan " + a + "\tDengan total harga " + "Rp." + (e1+a1) );	
		}
		else if ( penumpang  == 65 || penumpang <= 72 ) {
			System.out.println( "2 bus dengan jumlah kursi " + e + " dan " + a + "\tDengan total harga " + "Rp." + (e1+a1) );	
		}
		else if ( penumpang  == 73 || penumpang <= 77 ) {
			System.out.println( "2 bus dengan jumlah kursi " + d + " dan " + a + "\tDengan total harga " + "Rp." + (d1+a1) );	
			System.out.println( "2 bus dengan jumlah kursi " + c + " dan " + b + "\tDengan total harga " + "Rp." + (b1+c1) );
		}
		else if ( penumpang  == 78 ) {
			System.out.println( "2 bus dengan jumlah kursi " + d + " dan " + a + "\tDengan total harga " + "Rp." + (d1+a1) );	
		}
		else if ( penumpang  == 79 || penumpang <= 90 ) {
			System.out.println( "2 bus dengan jumlah kursi " + b + "\tDengan total harga " + "Rp." + b1*2 );	
		}
		else if ( penumpang  == 91 || penumpang <= 92 ) {
			System.out.println( "2 bus dengan jumlah kursi " + b + " dan " + a + "\tDengan total harga " + "Rp." + (a1+b1) );	
		}
		else if ( penumpang  == 91 || penumpang <= 92 ) {
			System.out.println( "2 bus dengan jumlah kursi " + c + " dan " + a + "\tDengan total harga " + "Rp." + (c1+a1) );	
		}
		else if ( penumpang  == 93 || penumpang <= 105 ) {
			System.out.println( "2 bus dengan jumlah kursi " + b + " dan " + a + "\tDengan total harga " + "Rp." + (a1+b1) );	
		}
		else if ( penumpang  == 106 || penumpang <= 120 ) {
			System.out.println( "2 bus dengan jumlah kursi " + a + "\tDengan total harga " + "Rp." + a1*2 );	
		}
		System.out.println();
		System.out.println( "========================================================================================");
	}
}