package main;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPenjualan = 0;
		
		HashMap<Integer, Barang> mapBarang = new HashMap<Integer, Barang>();
		
		Barang barang = new Barang();
		
		mapBarang.put(1, barang = new Barang(1, 20, 5, 30, 11));
		mapBarang.put(2, barang = new Barang(2, 15, 10, 25, 7));
		
		for (Map.Entry<Integer, Barang> entry:mapBarang.entrySet()) {
			barang = entry.getValue();
			
			totalPenjualan = totalPenjualan + barang.totalPemasukan();
			
			System.out.println(barang.toString());
		}
		
		System.out.println("\nTotal penjualan " + totalPenjualan);
	}

}
