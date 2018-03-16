package makanan;

import java.util.ArrayList;

public class MainApp {
	
	public static void main(String[] args) {	
		
		int totalHarga = 0;
				
		// Membuat array list bakwan dan selai
		ArrayList<Bakwan> listBakwan = new ArrayList<Bakwan>();
		ArrayList<Selai> listSelai = new ArrayList<Selai>();
		
		// Membuat object bakwan
		Bakwan bakwan1 = new Bakwan(10, 3, "Udang", 3000);
		Bakwan bakwan2 = new Bakwan(10, 3, "Telur", 2500);
		Bakwan bakwan3 = new Bakwan(10, 3, "Biasa", 2000);
		
		// Memasukkan bakwan kedalam array list bakwan
		listBakwan.add(bakwan1);
		listBakwan.add(bakwan2);
		listBakwan.add(bakwan3);
		
		// Traversing array list bakwan
		for (Bakwan bakwan : listBakwan) {
			totalHarga = totalHarga + bakwan.getHarga();
			bakwan.printMakanan();
		}
		
		// Membuat object selai
		Selai selai1 = new Selai("Coklat", "Coklat", 15000);
		Selai selai2 = new Selai("Kuning", "Pisang", 12000);
		Selai selai3 = new Selai("Merah", "Strawberry", 17000);
		
		// Memasukkan selai kedalam array list selai
		listSelai.add(selai1);
		listSelai.add(selai2);
		listSelai.add(selai3);
		
		// Traversing array list selai
		for (Selai selai : listSelai) {
			totalHarga = totalHarga + selai.getHarga();
			selai.printMakanan();
		}		
		
		// Total Harga
		System.out.println("Total Harga = " + totalHarga);
	}
	
}
