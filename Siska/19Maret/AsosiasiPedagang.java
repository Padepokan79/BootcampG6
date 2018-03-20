package soalAsosiasiPedagang;

import java.util.ArrayList;

public class AsosiasiPedagang {
	public static void main(String[] args) {
		int total = 0;
		Barang barang1 = new Barang("Aqua", 3500, 2000);
		Barang barang2 = new Barang("Beng-beng", 2500, 1300);
		Barang barang3 = new Barang("Poxy", 7500, 6000);
		Pedagang pedagang1 = new Pedagang("Jojo", "Lebak Gede", "Cemilan");
		
		ArrayList<Barang> listbarang = new ArrayList<Barang>();
		listbarang.add(barang1);
		listbarang.add(barang2);
		listbarang.add(barang3);
		
		System.out.println("Nama Pedagang : " + pedagang1.getnamaPedagang() + " Alamat : " + pedagang1.getalamat() + " Kategori : " + pedagang1.getbarang());
		
		for (Barang b:listbarang) {
			System.out.println("Nama Barang : "+ b.getnamaBarang() + " Harga Jual : "+b.gethargaJual() +" Harga Beli : " +b.gethargaBeli() + " Keuntungan : " + b.getkeuntungan());
			total = total + b.getkeuntungan();
		}
			System.out.println("Total Keuntungan pedagang : " + total);
	}
}
