import java.util.Scanner;

public class MelodiesMemori{
	public static void main (String []args){
	Scanner keyboard = new Scanner (System.in);
	int umur; 
	double cute;
	String jumat, cewek ;
	boolean allowed, hari, jenisKelamincowok, jenisKelamincewek, temp;

	//cover
	System.out.println("Selamat Datang di Club");
	System.out.println("\nSilahkan Lakukan Reservasi");
	
	//input hari
	System.out.print("\nMasukan Hari Reservasi : ");
	jumat = keyboard.next();
	
	//input Jenis Kelamin
	System.out.print("Jenis Kelamin            : ");
	cewek = keyboard.next();

	//input Umur
	System.out.print("Umur                     : ");
	umur = keyboard.nextInt();

	System.out.print("Nilai penampilan dari 0.0 sampai 1.0: ");
	cute = keyboard.nextDouble();

	//Proses boolean
	hari = jumat.equalsIgnoreCase ("jumat");
	jenisKelamincewek = cewek.equalsIgnoreCase ("cewek");
	jenisKelamincowok = cewek.equalsIgnoreCase ("cowok");

	allowed = ( umur >= 41 || umur <= 41 &&  (cute >= 8 || cute <= 8));
	
	temp = ((hari && allowed) && (jenisKelamincowok || jenisKelamincewek ) );

	System.out.println ("Bolehkah untuk reservasi club ? " + temp);


	}
}