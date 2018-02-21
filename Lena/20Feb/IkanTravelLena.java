import java.util.Scanner;

public class IkanTravelLena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int jumlahPenumpang;

		double hargaBisExecutive=2000000;
		double hargaBis12=1300000;
		double hargaBis18=1500000;
		double hargaBis32=1800000;
		double hargaBis45=2000000;
		double hargaBis60=2300000;

		System.out.print("Masukkan jumlah penumpang: ");
		jumlahPenumpang=keyboard.nextInt();


		System.out.println("\n\nBus yang tersedia untuk anda:");
		if(jumlahPenumpang>0){
			System.out.println("Bis kursi 6 Executive  : Rp 2.000.000,-");
		}
		if(jumlahPenumpang>=12){
			System.out.println("Bis kursi 12           : Rp 1.300.000,-");
		}
		if(jumlahPenumpang>=18){
			System.out.println("Bis kursi 18           : Rp 1.500.000,-");
		}
		if(jumlahPenumpang>=32){
			System.out.println("Bis kursi 32           : Rp 1.800.000,-");
		}
		if(jumlahPenumpang>=45){
			System.out.println("Bis kursi 45           : Rp 2.000.000,-");
		}
		if(jumlahPenumpang>=60){
			System.out.println("Bis kursi 60           : Rp 2.300.000,-");
		}


		System.out.println("\n\nRekomendasi bis untuk anda:");
		if(jumlahPenumpang<=6){
			System.out.println("1 bis dengan 6 kursi executive dengan Total Harga Rp "+hargaBisExecutive);
		}
		else if(jumlahPenumpang<=11){
			System.out.println("2 bis dengan 6 kursi executive dengan Total Harga Rp "+(2*hargaBisExecutive));
		}
		else if(jumlahPenumpang==12){
			System.out.println("1 bis dengan 12 kursi dengan Total Harga Rp "+hargaBis12);
		}
		else if(jumlahPenumpang<=17){
			System.out.println("2 bis dengan 12 kursi dengan Total Harga Rp "+(2*hargaBis12));
		}
		else if(jumlahPenumpang==18){
			System.out.println("1 bis dengan 18 kursi dengan Total Harga Rp "+hargaBis18);
		}
		else if(jumlahPenumpang<=24){
			System.out.println("2 bis dengan 12 kursi dengan Total Harga Rp "+(2*hargaBis12));
		}
		else if(jumlahPenumpang<=30){
			System.out.println("1 bis dengan 12 kursi dan 1 bis dengan 18 kursi dengan Total Harga Rp "+(hargaBis12+hargaBis18));
		}
		else if(jumlahPenumpang==31){
			System.out.println("2 bis dengan 18 kursi dengan Total Harga Rp "+(2*hargaBis18));
		}
		else if(jumlahPenumpang==32){
			System.out.println("1 bis dengan 32 kursi dengan Total Harga Rp "+(hargaBis32));
		}
		else if(jumlahPenumpang<=36){
			System.out.println("2 bis dengan 18 kursi dengan Total Harga Rp "+(2*hargaBis18));
		}
		else if(jumlahPenumpang<=44){
			System.out.println("1 bis dengan 32 kursi dan 1 bis dengan 12 kursi dengan Total Harga Rp "+(hargaBis32+hargaBis12));
		}
		else if(jumlahPenumpang==45){
			System.out.println("1 bis dengan 45 kursi dengan Total Harga Rp "+hargaBis45);
		}
		else if(jumlahPenumpang<=50){
			System.out.println("1 bis dengan 45 kursi dan 1 bis dengan 12 kursi dengan Total Harga Rp "+(hargaBis45+hargaBis12));
			System.out.println("\n1 bis dengan 32 kursi dan 1 bis dengan 18 kursi dengan Total Harga Rp "+(hargaBis32+hargaBis18));
		}
		else if(jumlahPenumpang<=57){
			System.out.println("\n1 bis dengan 45 kursi dan 1 bis dengan 12 kursi dengan Total Harga Rp "+(hargaBis45+hargaBis12));
		}
		else if(jumlahPenumpang<=59){
			System.out.println("\n1 bis dengan 45 kursi dan 1 bis dengan 18 kursi dengan Total Harga Rp "+(hargaBis45+hargaBis18));
		}
		else if(jumlahPenumpang==60){
			System.out.println("1 bis dengan 60 kursi dengan Total Harga Rp "+hargaBis60);
		}
		else if(jumlahPenumpang<=63){
			System.out.println("\n1 bis dengan 45 kursi dan 1 bis dengan 18 kursi dengan Total Harga Rp "+(hargaBis45+hargaBis18));
		}
		else if(jumlahPenumpang<=72){
			System.out.println("\n1 bis dengan 60 kursi dan 1 bis dengan 12 kursi dengan Total Harga Rp "+(hargaBis60+hargaBis12));
		}
		else if(jumlahPenumpang<=78){
			System.out.println("\n1 bis dengan 60 kursi dan 1 bis dengan 18 kursi dengan Total Harga Rp "+(hargaBis60+hargaBis18));
		}
		else if(jumlahPenumpang<=92){
			System.out.println("\n1 bis dengan 60 kursi dan 1 bis dengan 32 kursi dengan Total Harga Rp "+(hargaBis60+hargaBis32));
		}
		else if(jumlahPenumpang<=105){
			System.out.println("\n1 bis dengan 60 kursi dan 1 bis dengan 45 kursi dengan Total Harga Rp "+(hargaBis60+hargaBis45));
		}
		else if(jumlahPenumpang<=120){
			System.out.println("\n2 bis dengan 60 kursi dengan Total Harga Rp "+(2*hargaBis60));
		}
	}
}