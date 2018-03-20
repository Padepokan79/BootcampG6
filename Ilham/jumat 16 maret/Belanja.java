import java.util.ArrayList;
import java.util.List;

public class Belanja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brownies browniesKukusAdinda = new Brownies("Brownies Kukus Adinda", "Coklat", 800, "Coklat", "Kacang Mede", "Persegi Panjang", "Kukus", 50000);
		Brownies browniesKukusKeju = new Brownies("Brownies Kukus Keju", "Keju", 800, "kuning", "keju", "Persegi Panjang", "Kukus", 57500);
		Brownies browniesKukusPandan = new Brownies("Brownies Kukus Pandan", "Pandan", 800, "Hijau", "-", "Persegi Panjang", "Kukus", 52500);
		Brownies browniesPanggangChocoChips = new Brownies("Brownies Panggang Choco Chips", "Coklat", 800, "Coklat", "Choco Chips", "Persegi Panjang", "Panggang", 60000);
		Brownies browniesGulungKeju = new Brownies("Brownies Gulung Keju", "Original, Keju", 400, "Coklat, Kuning", "-", "Setengah Tabung", "Gulung", 37500);
		
		Keripik keripikBayamSpesialAaa = new Keripik("Keripik Bayam Spesial Aaa", "Original", 190, "Bayam", 27500);
		Keripik keripikNangkaSuperSs = new Keripik("Keripik Nangka Manis Super Ss", "Manis", 200, "Nangka", 40000);
		Keripik keripikSinkongGelombang = new Keripik("Keripik Singkong Gelombang", "Keju", 400, "Singkong", 25000);
		Keripik keripikTempeKeju = new Keripik("Keripik Tempe Keju", "Keju", 500, "Tempe", 37500);
		
		List<Brownies> listBelanjaBrownies = new ArrayList<Brownies>();
		List<Keripik> listBelanjaKeripik = new ArrayList<Keripik>();
		
		ArrayList<List> listSemua = new ArrayList<>();
		
		int totalHarga = 0;
		
		listBelanjaBrownies.add(browniesKukusAdinda);
		listBelanjaBrownies.add(browniesKukusKeju);
		listBelanjaBrownies.add(browniesKukusPandan);
		listBelanjaBrownies.add(browniesPanggangChocoChips);
		listBelanjaBrownies.add(browniesGulungKeju);
		listBelanjaKeripik.add(keripikBayamSpesialAaa);
		listBelanjaKeripik.add(keripikNangkaSuperSs);
		listBelanjaKeripik.add(keripikSinkongGelombang);
		listBelanjaKeripik.add(keripikTempeKeju);
		
		listSemua.add(listBelanjaBrownies);
		listSemua.add(listBelanjaKeripik);
		
		System.out.println(listSemua.get(0));
		System.out.println(listSemua.get(1));
		
		
		
		for (Brownies list : listBelanjaBrownies) {
			System.out.println(list.getNama() + "\t" + list.getRasa() + "\t" + list.getBerat() + "\t" + list.getWarna() + "\t" + list.getTopping() + "\t" + list.getBentuk() + "\t" + list.getJenisBrownies() + "\t" + list.getHarga());
			totalHarga += list.getHarga();
		}

		for (Keripik list : listBelanjaKeripik) {
			System.out.println(list.getNama() + "\t" + list.getRasa() + "\t" + list.getBerat() + "\t" + list.getJenisKeripik()+ "\t" + list.getHarga());
			totalHarga += list.getHarga();
		}
		
		System.out.println();
		System.out.println("Total Harga: " + totalHarga);
		
		/*
		List list;
		for (int i = 0; i < listSemua.size(); i++) {
			list = listSemua.get(i);
			for (int j = 0; i < list.size(); i++) {
				Brownies l = list.get(j);
				System.out.println(l.getNama() + " " + l.getHarga());
			}
		}
		*/	
		
	}

}
