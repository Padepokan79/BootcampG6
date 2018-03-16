package main;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPemasukan = 0;
		
		int [] arrPenumpangEkonomi = {120, 100, 50, 30, 20, 150, 110};
		int [] arrPenumpangBisnis = {50, 15, 13, 10, 20, 55, 60};
		int [] arrPenumpangExecutive = {40, 21, 11, 16, 12, 35, 40};
		
		// Total Pemasukan Kereta Ekonomi
		System.out.println("\nPemasukan Kereta Ekonomi");
		for (int i = 0; i < arrPenumpangEkonomi.length; i++) {
			Ekonomi ekonomi = new Ekonomi(i+1, arrPenumpangEkonomi[i]);
			totalPemasukan = totalPemasukan + ekonomi.totalPemasukan();
		}
		
		// Total Pemasukan Kereta Bisnis
		System.out.println("\nPemasukan Kereta Bisnis");
		for (int i = 0; i < arrPenumpangBisnis.length; i++) {
			Bisnis bisnis = new Bisnis(i+1, arrPenumpangBisnis[i]);
			totalPemasukan = totalPemasukan + bisnis.totalPemasukan();
		}	
		
		// Total Pemasukan Kereta Executive
		System.out.println("\nPemasukan Kereta Executive");
		for (int i = 0; i < arrPenumpangBisnis.length; i++) {
			Executive executive = new Executive(i+1, arrPenumpangExecutive[i]);
			totalPemasukan = totalPemasukan + executive.totalPemasukan();
		}		
		
		// Total Keseluruhan Pemasukan
		System.out.println("\nTotal Pemasukan Keseluruhan = " + totalPemasukan);
	}

}
