package main;

public class Bisnis extends Kereta implements HargaTiket {
	
	public Bisnis(int hari, int penumpang) {
		// TODO Auto-generated constructor stub
		setHari(hari);
		setPenumpang(penumpang);
		setHarga(hargaBisnis);
		
		totalPemasukan();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Kereta Bisnis, hari ke-" + getHari() + " penumpang sebanyak " 
				+ getPenumpang() + " orang. Pemasukan = " + totalPemasukan();
	}

	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return getPenumpang() * getHarga();
	}
	
}
