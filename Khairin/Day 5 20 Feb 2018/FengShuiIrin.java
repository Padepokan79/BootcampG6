import java.util.Scanner;

public class FengShuiIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int indexAwal=0, indexAkhir;
		String no, hasil, angka0, angka1, angka2, angka3, angka4, angka5, angka6, angka7, angka8, angka9;

		angka0 = "khusus, special, langka \n";
		angka1 = "satu, satu-satunya, diri sendiri \n";
		angka2 = "mudah, gampang, tidak sulit \n";
		angka3 = "menemukan, mendapatkan, hidup \n";
		angka4 = "mati, miskin, susah \n";
		angka5 = "Tidak akan, tidak pernah, tidak bisa\n";
		angka6 = "Menuju, akan \n";
		angka7 = "Tepat, hoki, atau bisa disebut juga ketuhanan \n";
		angka8 = "Makmur \n";
		angka9 = "Sukses \n";


		System.out.println( "Masukkan no. HP Anda");
		no = keyboard.next();

		for ( indexAkhir = 1; indexAkhir <= no.length(); indexAkhir++){
			hasil = no.substring(indexAwal,indexAkhir);
			System.out.print(hasil + " = ");
			if ( hasil.equals("0")){
				System.out.print( angka0 );
			}
			else if ( hasil.equals("1")){
				System.out.print( angka1 );
			}
			else if ( hasil.equals("2")){
				System.out.print( angka2 );
			}
			else if ( hasil.equals("3")){
				System.out.print( angka3 );
			}
			else if ( hasil.equals("4")){
				System.out.print( angka4 );
			}
			else if ( hasil.equals("5")){
				System.out.print( angka5 );
			}
			else if ( hasil.equals("6")){
				System.out.print( angka6 );
			}
			else if ( hasil.equals("7")){
				System.out.print( angka7 );
			}
			else if ( hasil.equals("8")){
				System.out.print( angka8 );
			}
			else if ( hasil.equals("9")){
				System.out.print( angka9 );
			}
			indexAwal++; 
		}
	}
}