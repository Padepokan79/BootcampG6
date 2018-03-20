import java.util.ArrayList;

public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard visaGold = new CreditCard("Visa Gold", 300000);
		CreditCard masterTitanium = new CreditCard("Master Titanium", 500000);
		CreditCard visaPlatinum = new CreditCard("Visa Platinum", 750000);
		CreditCard masterWorldMiles = new CreditCard("Master World Miles", 1000000);
		double iuranTahun=0, totalIuran =0;
		
		ArrayList<Integer> listCards = new ArrayList<Integer>();
	
		listCards.add(1);
		listCards.add(2);
		
		
		for(int i=0; i<5; i++) {
			if (i==2) {
			iuranTahun = 0.9*(visaGold.getIuranTahunan()*listCards.get(0) + masterTitanium.getIuranTahunan()*listCards.get(0)
						+ visaPlatinum.getIuranTahunan()*listCards.get(1) + masterWorldMiles.getIuranTahunan()*listCards.get(0));
			System.out.println("\nIuran tahun ke " + (1+i) + " adalah: Rp" + (int) iuranTahun);
				
			}
			else {
			iuranTahun = visaGold.getIuranTahunan()*listCards.get(0) + masterTitanium.getIuranTahunan()*listCards.get(0)
						+ visaPlatinum.getIuranTahunan()*listCards.get(1) + masterWorldMiles.getIuranTahunan()*listCards.get(0); 
			System.out.println("\nIuran tahun ke " + (1+i) + " adalah: Rp" + (int) iuranTahun);
				
			}
			totalIuran = totalIuran + iuranTahun;
		}
		System.out.println("\nTotal iuran pada Tahun ke-5 adalah : Rp" + (int) totalIuran);

	}
}
