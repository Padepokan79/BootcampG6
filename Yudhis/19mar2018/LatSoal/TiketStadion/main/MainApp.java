package main;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Tiket> listTiket = new ArrayList<Tiket>();
		
		Tiket tiket = new Tiket();
		
		long totalPemasukan = 0;
		
		listTiket.add(tiket = new Tiket(15000, 10000, 1));
		listTiket.add(tiket = new Tiket(18000, 12000, 2));
		listTiket.add(tiket = new Tiket(17000, 8000, 3));
		listTiket.add(tiket = new Tiket(18000, 10000, 4));
		listTiket.add(tiket = new Tiket(10000, 4000, 5));
		
		for (Tiket t : listTiket) {
			System.out.println(t.toString());
			totalPemasukan = totalPemasukan + t.getPemasukan();
		}
		
		System.out.println("Total pemasukan tiket " + totalPemasukan);
	}
	
}
