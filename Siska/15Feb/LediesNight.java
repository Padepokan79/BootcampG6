import java.util.Scanner;

public class LediesNight{
	public static void main (String []args){
	Scanner keyboard = new Scanner (System.in);
	int umur; 
	double cute;
	String kamis, cewek ;
	boolean allowed, hari, jenisKelamin, temp;

	//cover
	System.out.println("Selamat Datang di Club");
	System.out.println("\nSilahkan Lakukan Reservasi");
	
	//input hari
	System.out.print("\nMasukan Hari Reservasi : ");
	kamis = keyboard.next();
	
	//input Jenis Kelamin
	System.out.print("Jenis Kelamin            : ");
	cewek = keyboard.next();

	//input Umur
	System.out.print("Umur                     : ");
	umur = keyboard.nextInt();

	//input nilai ganteng/cantik
	System.out.print("Nilai ganteng atau cantik dari 0.0 sampai 1.0: ");
	cute = keyboard.nextDouble();

	//Proses boolean
	hari = kamis.equals ("kamis");
	jenisKelamin = cewek.equals ("cewek");
	allowed = ( umur >= 21 && umur <= 30 &&  (cute >= 8 || cute <= 8));
	
	temp = (hari && jenisKelamin && allowed);

	System.out.println ("Bolehkah untuk reservasi club ? " + temp);


	}
}