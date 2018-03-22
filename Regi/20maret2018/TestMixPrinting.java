package DuaPuluhMaret2018;

import java.util.HashMap;

public class TestMixPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jumlahPengunjung = 150;
		int key = 1;
		
		Printing kertasBiasa = new Printing("Kertas Biasa", 4000);
		Printing banner = new Printing("Banner", 80000);
		Printing baliho = new Printing("Baliho", 150000);
		
		HashMap<Integer, Integer> kertasBiasaTerjual = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> bannerTerjual = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> balihoTerjual = new HashMap<Integer, Integer>();
		
		HashMap<Integer, String> ukuranBanner = new HashMap<Integer, String>();
		
//		ukuranBanner.put(1, "2 X 1");
//		ukuranBanner.put(2, "2 X 2");
//		ukuranBanner.put(3, "3 X 2");
		
		int pendapatanPerHari = 0;
		
		for (int i = 1; i <= jumlahPengunjung; i++) {
			kertasBiasaTerjual.put(1, 100);
			bannerTerjual.put(1, 30);
			balihoTerjual.put(1, 20);
			
			pendapatanPerHari = (kertasBiasa.getHargaPrinting()*kertasBiasaTerjual.get(key)) + (banner.getHargaPrinting()*bannerTerjual.get(key)) + (baliho.getHargaPrinting()*
					balihoTerjual.get(key));
			
			if (condition) {
				
			}
			
		}
		
		System.out.println(pendapatanPerHari);
		
	}
	
}