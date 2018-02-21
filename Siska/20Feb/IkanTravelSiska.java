import java.util.Scanner;

public class IkanTravelSiska{
	public static void main (String[]args){
	Scanner keyboard = new Scanner (System.in);
	int penumpang, bus6, bus12, bus18, bus32, bus45, bus60;

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
	if (penumpang >=1 ){
		System.out.println ("\nBis dengan kursi 6 Executive \t Rp. " + bus6);	
	}
	if (penumpang >= 12 ){
		System.out.println ("\nBis dengan kursi 12 \t\tRp. " + bus12);
	if (penumpang >=18 ){
		System.out.println ("\nBis dengan kursi 18 \t\tRp. "+ bus18);
	}
	if (penumpang >=32){
		System.out.println ("\nBis dengan kusi 32 \t\tRp. "+ bus32);
	}
	if (penumpang >= 45){
		System.out.println ("\nBis dengan kursi 45 \t\tRp. "+ bus45);
	}
	if (penumpang >=60){
		System.out.println ("\nBis dengan kursi 60 \t\tRp. "+ bus60);
	}

	

}

if (penumpang >=1 && penumpang <=6){
		System.out.println ("*Rekomendasi Bis untuk Anda ");
		System.out.println ("1 Bis dengan 6 Kursi Executive dengan Total Rp. " + bus6);
	}
	else if (penumpang >=7 && penumpang <=11){
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 6 Kursi Executive dengan Total Rp. " + (bus6*2));
	}
	else if (penumpang == 12) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 12 Kursi dengan Total Rp. " + bus12);
	}
	else if (penumpang >=13 && penumpang <=17) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 12 Kursi dengan Total Rp. " + (bus12*2));
	}
	else if (penumpang ==18) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 18 Kursi dengan Total Rp. " + bus18);
	}
	else if (penumpang >=19 && penumpang <=24) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 12 Kursi dengan Total Rp. " + (bus12*2));
	}
	else if (penumpang >=25 && penumpang <=30) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 18 Kursi dan 1 Bis dengan 12 Kursi dengan Total Rp. " + (bus18+bus12));
	}
	else if (penumpang ==31) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 18 Kursi dengan Total Rp. " + (bus18*2));
	}
	else if (penumpang ==32) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 32 Kursi dengan Total Rp. " + bus32);
	}
	else if (penumpang >=33 && penumpang <= 36) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 18 Kursi dengan Total Rp. " + (bus18*2));
	}	
	else if (penumpang >=37 && penumpang <= 44) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 32 Kursi dan 1 Bis dengan 12 Kursi dengan Total Rp. " + (bus32+bus12));
	}
	else if (penumpang ==45) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 45 Kursi dengan Total Rp. " + bus45);
	}
	else if (penumpang >=46 && penumpang <= 57) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 45 Kursi dan 1 Bis dengan 12 Kursi dengan Total Rp. " + (bus45+bus12));
	}
	else if (penumpang >=58 && penumpang <= 59) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 32 Kursi dengan Total Rp. " + (bus32*2));
	}
	else if (penumpang ==60) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 60 Kursi dengan Total Rp. " + bus60);
	}
	else if (penumpang >=61 && penumpang <= 64) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 32 Kursi dengan Total Rp. " + (bus32*2));
	}
	else if (penumpang >=65 && penumpang <= 72) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 60 Kursi dan 1 bis dengan 12 Kursi dengan Total Rp. " + (bus60+bus12));
	}
	else if (penumpang >=73 && penumpang <= 77) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 45 Kursi dan 1 bis dengan 32 Kursi dengan Total Rp. " + (bus45+bus32));
	}
	else if (penumpang == 78) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 60 Kursi dan 1 bis dengan 18 Kursi dengan Total Rp. " + (bus60+bus18));
	}
	else if (penumpang >=79 && penumpang <= 90) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 45 Kursi dengan Total Rp. " + (bus45*2));
	}
	else if (penumpang >=91 && penumpang <= 92) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 60 Kursi dan 1 bis dengan 32 Kursi dengan Total Rp. " + (bus60+bus32));
	}
	else if (penumpang >=93 && penumpang <= 105) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("1 Bis dengan 60 Kursi dan 1 bis dengan 45 Kursi dengan Total Rp. " + (bus60+bus45));
	}
	else if (penumpang >=106 && penumpang <= 120) {
		System.out.println ("*Rekomendasi Bis untuk Anda");
		System.out.println ("2 Bis dengan 60 Kursi dengan Total Rp. " + (bus60*2));
	}
}
}