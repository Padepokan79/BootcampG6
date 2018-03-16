package arrayListKartikaSari;

import java.util.ArrayList;
import java.util.List;

public class TestKartikaSari {
	public static void main(String[] args) {
		
		
		List<ProduksiKartikaSari> list = new ArrayList<ProduksiKartikaSari>();
		List<CuankiCup> list2 = new ArrayList<CuankiCup>();
		
		double totalHarga =0;
		
		ProduksiKartikaSari salePisang = new ProduksiKartikaSari("15/06/2018", 300, 45000, "Sale Pisang", "Plastik", "pisang, tepung, gula", "manis", "-", "pipih memanjang", 10, 20);
		ProduksiKartikaSari salePisang2 = new ProduksiKartikaSari("15/06/2018", 350, 50000, "Sale Pisang Choco Cheese","plastik", "pisang, tepung, gula, keju, coklat", "manis", "keju, coklat", "pipih memanjang", 10, 20);
		ProduksiKartikaSari saleJari = new ProduksiKartikaSari("15/06/2018", 300, 45000, "Sale Jari", "Plastik", "pisang, gula", "manis", "-", "silinder", 15, 15);
		ProduksiKartikaSari keripikTempe = new ProduksiKartikaSari("15/07/2018", 350, 36000, "Keripik Tempe Rasa Original", "plastik", "tempe, tepung, penyedap rasa", "gurih", "-", "pipih bulat", 30, 5);
		CuankiCup cuankiCup = new CuankiCup("15/06/2019", 150, 25000, "Chuanki Cup", "Cup", "sayuran, dll", "gurih", "15/02/2018", "siomay, bumbu, sayuran kering");
		
		list.add(salePisang);
		list.add(salePisang2);
		list.add(saleJari);
		list.add(keripikTempe);
		
		list2.add(cuankiCup);
				
		for (ProduksiKartikaSari makanan : list) {
			System.out.println("\nNama: "+makanan.getNama());
			System.out.println("Harga: "+makanan.getHarga());
			System.out.println("Topping: "+makanan.getTopping());
			totalHarga = totalHarga + makanan.getHarga();
		}
		
		for (CuankiCup cuanki : list2) {
			System.out.println("\nNama: "+cuanki.getNama());
			System.out.println("Harga: "+cuanki.getHarga());
			System.out.println("Isi: "+cuanki.getIsiYangTerkandung());
			totalHarga = totalHarga + cuanki.getHarga();
		}
		
		System.out.println("\nTotal Harga: Rp "+totalHarga);
		
		
		
	}
}
