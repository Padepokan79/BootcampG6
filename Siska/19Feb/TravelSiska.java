import java.util.Scanner;

public class TravelSiska{
	public static void main (String[]args){
	Scanner keyboard = new Scanner (System.in);
	int penumpang,bus6, bus12, bus18, bus32, bus45, bus60;
	bus6=2000000;
	bus12=1300000;
	bus18=1500000;
	bus32=1800000;
	bus45=2000000;
	bus60=2300000;

	System.out.println ("Selamat Datang di IKAN Travel");
	System.out.print ("Masukan jumlah penumpang : ");
	penumpang = keyboard.nextInt();

	System.out.print ("Tersedia : ");
	if (penumpang >=1){
		System.out.println ("\nBis dengan kursi 6 Executive \t Rp.2.000.000");		
		System.out.println ("\n*Rekomendasi Bis untuk anda");
		System.out.println ("\n1 Bis dengan 6 Kursi Executive dengan Total Rp. " + bus6);
	}
	else if (penumpang >=7){
		System.out.println ("\nBis dengan kursi 6 Executive \t Rp.2.000.000");		
		System.out.println ("\n*Rekomendasi Bis untuk anda" );
		System.out.println ("\n2 Bis dengan 6 Kursi Executive Rp. " + bus6 + "dengan Total Harga Rp. " +(bus6*2));
	}
	else if (penumpang >=12){
		System.out.println ("\nBis dengan kursi 6 Executive \t Rp.2.000.000");
		System.out.println ("\nBis dengan kursi 12 \t Rp. 1.300.000");		
		System.out.println ("\n*Rekomendasi Bis untuk anda");
		System.out.println ("\n1 Bis dengan 12 Kursi dengan Total Rp. " + bus12);
	}
	else if (penumpang <18){
		System.out.println ("\nBis dengan kursi 12 \t Rp. 1.300.000");
		System.out.println ("Bis dengan kursi 6 Executive \t Rp.2.000.000");
	}
	else if (penumpang <32){
		System.out.println ("\nBis dengan kursi 18 \t Rp. 1.500.000");
		System.out.println ("Bis dengan kursi 12 \t Rp. 1.300.000");
		System.out.println ("Bis dengan kursi 6 Executive \t Rp.2.000.000");
	}
	else if (penumpang< 45){
		System.out.println ("\nBis dengan kusi 32 \t Rp.1.800.000");
		System.out.println ("Bis dengan kursi 18 \t Rp. 1.500.000");
		System.out.println ("Bis dengan kursi 12 \t Rp. 1.300.000");
		System.out.println ("Bis dengan kursi 6 Executive \t Rp.2.000.000");	
	}
	else if (penumpang <60 ){
		System.out.println ("\nBis dengan kursi 45 \t Rp. 2000.000");
		System.out.println ("Bis dengan kusi 32 \t Rp.1.800.000");
		System.out.println ("Bis dengan kursi 18 \t Rp. 1.500.000");
		System.out.println ("Bis dengan kursi 12 \t Rp. 1.300.000");
		System.out.println ("Bis dengan kursi 6 Executive \t Rp.2.000.000");	
	}
	else {
		System.out.println ("\nBis dengan kursi 60 \t Rp. 2.300.000");
		System.out.println ("Bis dengan kursi 45 \t Rp. 2000.000");
		System.out.println ("Bis dengan kusi 32 \t Rp.1.800.000");
		System.out.println ("Bis dengan kursi 18 \t Rp. 1.500.000");
		System.out.println ("Bis dengan kursi 12 \t Rp. 1.300.000");
		System.out.println ("Bis dengan kursi 6 Executive \t Rp.2.000.000");	
	}

}
}