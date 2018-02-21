import java.util.Scanner;

public class NOHPSiska{
	public static void main (String[]args){
	Scanner keyboard = new Scanner (System.in);

	String no;
	int awal, akhir;

	System.out.print("Masukan No HP anda : ");
	no = keyboard.next();
	System.out.println ("------------------------------------");

	for (awal = 0 ;  awal < no.length(); awal ++){ 
		akhir = awal + 1;
		System.out.print (no.substring(awal, akhir) );
		if ((no.substring(awal, akhir)) .equals ("0")) {
			System.out.println (" khusus, special, langka");
		}
		else if ((no.substring(awal, akhir)) .equals ("1")) {
			System.out.println (" satu, satu-satunya, diri sendiri");
		}
		else if ((no.substring(awal, akhir)) .equals("2")) {
			System.out.println (" mudah, gampang, tidak sulit");
		}
		else if ((no.substring(awal, akhir)) .equals("3")) {
			System.out.println (" menemukan, mendapatkan, hidup");
		}
		else if ((no.substring(awal, akhir)) .equals("4")) {
			System.out.println (" mati, miskin, susah");
		}
		else if ((no.substring(awal, akhir)) .equals("5")){
			System.out.println (" Tidak akan, tidak pernah, tidak bisa");
		}
		else if ((no.substring(awal, akhir)) .equals("6")){
			System.out.println (" Menuju, akan");
		}
		else if ((no.substring(awal, akhir)) .equals("7")){
			System.out.println (" Tepat, hoki, atau bisa disebut juga ketuhanan");
		}
		else if ((no.substring(awal, akhir)) .equals("8")){
			System.out.println (" Makmur");
		}
		else if ((no.substring(awal, akhir)) .equals("9")){
			System.out.println (" Sukses");
		}

		
	}

	}
}