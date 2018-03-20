package soal2PomBensin;

import java.util.ArrayList;

public class TestPomBensin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sebuah pom bensin dalam seminggu dapat menjual: \n\tPremium\t\tPertalite");
		System.out.println("Senin\t120 liter\t50 liter\nSelasa\t100 liter\t15 liter\nRabu\t50 liter\t13 liter");
		System.out.println("Kamis\t30 liter\t4 liter\nJumat\t20 liter\t20 liter\nSabtu\t150 liter\t55 liter\nMinggu\t110 liter\t60 liter");
		System.out.println("\nApabila 1 liter premium berharga Rp 6000 dan Pertalite lebih mahal Rp 2000 dari premium,");
		System.out.println("Berapa total pendapatan selama seminggu?");
		
		Bensin premium = new Bensin("Premium", 6000);
		Bensin pertalite =  new Bensin("Pertalite", 8000);
		
		int totalPendapatan=0;
				
		ArrayList<Integer> listPremium = new ArrayList<Integer>();
		listPremium.add(120);
		listPremium.add(100);
		listPremium.add(50);
		listPremium.add(30);
		listPremium.add(20);
		listPremium.add(150);
		listPremium.add(110);
		
		ArrayList<Integer> listPertalite = new ArrayList<Integer>();
		listPertalite.add(50);
		listPertalite.add(15);
		listPertalite.add(13);
		listPertalite.add(4);
		listPertalite.add(20);
		listPertalite.add(55);
		listPertalite.add(60);
		
		for(int i=0; i < 7; i++) {
			totalPendapatan = totalPendapatan + (listPremium.get(i)*premium.getHarga())+(listPertalite.get(i)*pertalite.getHarga());
		}
		
		System.out.println("\n\nTotal pendapatan seminggu: Rp "+totalPendapatan);
	}
}
