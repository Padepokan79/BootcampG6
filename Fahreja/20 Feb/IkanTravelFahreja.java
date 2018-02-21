import java.util.Scanner;
public class IkanTravelFahreja{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int penumpang, kursiA,kursiB,kursiC,kursiD,kursiE,kursiF;
		int hargaTotal,hargaA,hargaB,hargaC,hargaD,hargaE,hargaF,total;

		kursiA = 6;	 hargaA = 2000000;
		kursiB = 12; hargaB = 1300000;
		kursiC = 18; hargaC = 1500000;
		kursiD = 32; hargaD	= 1800000;
		kursiE = 45; hargaE = 2000000;
		kursiF = 60; hargaF	= 2300000;					

		System.out.print("Masukan jumlah penumpang : ");
		penumpang = keyboard.nextInt();

		if(penumpang <= kursiA) {
			System.out.println("Bis yang tersedia untuk anda :");
			System.out.println("Bis dengan kursi " + kursiA + " Executive \tRp. "+hargaA);
			System.out.println("Rekomendasi bis :");
			System.out.println("1 bis dengan "+kursiA+"Rp. "+ hargaA+" Dengan Total Harga Rp. " +hargaA);
		}else if (penumpang < kursiB) {
			System.out.println("Bis yang tersedia untuk anda :");
			System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
			total = hargaA+hargaA;
			System.out.println("Rekomendasi bis :");
			System.out.println("2 bis dengan "+kursiA+"Rp. "+ hargaA+" Dengan Total Harga Rp. " + total);
		}else if (penumpang < kursiC) {
			if (penumpang == 12) {
				System.out.println("Bis yang tersedia untuk anda :");
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				total = hargaB;
				System.out.println("Rekomendasi bis :");
				System.out.println("1 bis dengan "+kursiB +" bis Rp. "+ hargaB+" \nDengan Total Harga Rp. " + total);
				
			}
			if (penumpang > 12 && penumpang <=17) {
				System.out.println("Bis yang tersedia untuk anda :");
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				total = hargaB+hargaB;
				System.out.println("Rekomendasi bis :");
				System.out.println("2 bis dengan "+kursiB +" bis Rp. "+ hargaB+" \nDengan Total Harga Rp. " + total);	
			}
		}else if (penumpang < kursiD) {
			if (penumpang == 18) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Rekomendasi bis :");
				total = hargaC;
				System.out.println("1 bis dengan "+kursiC +" bis Rp. "+ hargaC+" \nDengan Total Harga Rp. " + total);
			}
			if (penumpang > 18 && penumpang <=24) {
				System.out.println("Bis yang tersedia untuk anda :");
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				total = hargaB+hargaB;
				System.out.println("Rekomendasi bis :");
				System.out.println("2 bis dengan "+kursiB +" bis Rp. "+ hargaB+" \nDengan Total Harga Rp. " + total);	
			}
			if (penumpang > 24 && penumpang <= 30){
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Rekomendasi bis :");
				total = hargaB+hargaC;
				System.out.println("1 bis dengan "+kursiB+" kursi Rp. "+hargaB+" dan 1 bis dengan "+kursiC + "bis Rp. "+ hargaC+" \nDengan Total Harga Rp. " + total);
			}
			if (penumpang == 31 ){
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Rekomendasi bis :");
				total = hargaC+hargaC;
				System.out.println("2 bis dengan "+kursiC +" bis Rp. "+ hargaC+" \nDengan Total Harga Rp. " + total);
			}
		}else if (penumpang < kursiE) {
			if (penumpang ==32) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Rekomendasi bis :");
				total = hargaD;
				System.out.println("1 bis dengan "+kursiD+" kursi Rp. "+hargaD+" \nDengan Total Harga Rp. " + total);	
			}
			if (penumpang > 32 && penumpang <= 36){
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Rekomendasi bis :");
				total = hargaC+hargaC;
				System.out.println("2 bis dengan "+kursiC+" kursi Rp. "+hargaC+ "\nDengan Total Harga Rp. " + total);
			}
			if (penumpang > 36 && penumpang <= 44) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Rekomendasi bis :");
				total = hargaB+hargaD;
				System.out.println("1 bis dengan "+kursiB+" kursi Rp. "+hargaB+" dan 1 bis dengan "+kursiD + "bis Rp. "+ hargaD+" \nDengan Total Harga Rp. " + total);
			}
		}else if (penumpang < kursiF) {
			if (penumpang == 45) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Rekomendasi bis :");
				total = hargaE;
				System.out.println("1 bis dengan "+kursiE+" kursi Rp. "+hargaE+" \nDengan Total Harga Rp. " + total);
			}
			if (penumpang >= 46 && penumpang <=50) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Rekomendasi bis :");
				total = hargaC+hargaD;
				System.out.println("1 bis dengan "+kursiC+" kursi Rp. "+hargaC+" dan 1 bis dengan "+kursiD + "bis Rp. "+ hargaD+" \nDengan Total Harga Rp. " + total);	
			}
			if (penumpang > 50 && penumpang <= 57) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Rekomendasi bis :");
				total = hargaB+hargaE;
				System.out.println("1 bis dengan "+kursiB+" kursi Rp. "+hargaB+" dan 1 bis dengan "+kursiE + "bis Rp. "+ hargaE+" \nDengan Total Harga Rp. " + total);
				
			}if (penumpang > 57 && penumpang <= 59) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Rekomendasi bis :");
				total = hargaC+hargaE;
				System.out.println("1 bis dengan "+kursiC+" kursi Rp. "+hargaC+" dan 1 bis dengan "+kursiE + "bis Rp. "+ hargaE+" \nDengan Total Harga Rp. " + total);
			}
		}else if (penumpang < 120 ) {	
			if (penumpang == 60) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaF;
				System.out.println("1 bis dengan "+kursiF+" kursi Rp. "+hargaF+" \nDengan Total Harga Rp. " + total);	
			}
			if (penumpang > 60 && penumpang <= 63) {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaC+hargaE;
				System.out.println("1 bis dengan "+kursiC+" kursi Rp. "+hargaC+" dan 1 bis dengan "+kursiE + "bis Rp. "+ hargaE+" \nDengan Total Harga Rp. " + total);
			}
			if (penumpang > 63 && penumpang <=77)  {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaD+hargaE;
				System.out.println("1 bis dengan "+kursiD+" kursi Rp. "+hargaD+" dan 1 bis dengan "+kursiE + "bis Rp. "+ hargaE+" \nDengan Total Harga Rp. " + total);
				
			}
			if (penumpang == 78)  {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaC+hargaF;
				System.out.println("1 bis dengan "+kursiC+" kursi Rp. "+hargaC+" dan 1 bis dengan "+kursiF + "bis Rp. "+ hargaF+" \nDengan Total Harga Rp. " + total);
			}
			if (penumpang > 78 && penumpang <= 90)  {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaE+hargaE;
				System.out.println("2 bis dengan "+kursiE+" kursi Rp. "+hargaE+" \nDengan Total Harga Rp. " + total);
			}if (penumpang > 90 && penumpang <= 92)  {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaD+hargaF;
				System.out.println("1 bis dengan "+kursiD+" kursi Rp. "+hargaD+" dan 1 bis dengan "+kursiF + "bis Rp. "+ hargaF+" \nDengan Total Harga Rp. " + total);
			}
			if (penumpang > 92 && penumpang <= 105)  {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaE+hargaF;
				System.out.println("1 bis dengan "+kursiE+" kursi Rp. "+hargaE+" dan 1 bis dengan "+kursiF + "bis Rp. "+ hargaF+" \nDengan Total Harga Rp. " + total);
			}
			if (penumpang > 105 && penumpang <= 120)  {
				System.out.println("Bis dengan kursi " + kursiA + " Executive \t Rp. "+hargaA);
				System.out.println("Bis dengan kursi " + kursiB + " \t\t Rp. "+hargaB);
				System.out.println("Bis dengan kursi " + kursiC + " \t\t Rp. "+hargaC);
				System.out.println("Bis dengan kursi " + kursiD + " \t\t Rp. "+hargaD);
				System.out.println("Bis dengan kursi " + kursiE + " \t\t Rp. "+hargaE);
				System.out.println("Bis dengan kursi " + kursiF + " \t\t Rp. "+hargaF);
				System.out.println("Rekomendasi bis :");
				total = hargaF+hargaF;
				System.out.println("1 bis dengan "+kursiF+" kursi Rp. "+hargaF+" dan 1 bis dengan "+kursiF + "bis Rp. "+ hargaF+" \nDengan Total Harga Rp. " + total);
			}

		}else {
			System.out.println("Inputan anda salah");
		}
	}	
}
