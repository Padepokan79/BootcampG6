package main;

public class Ekonomi extends Kereta implements HargaTiket {
	
	public Ekonomi(int hari, int penumpang) {
		// TODO Auto-generated constructor stub
		setHari(hari);
		setPenumpang(penumpang);
		setHarga(hargaEkonomi);
		
		totalPemasukan();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Kereta Ekonomi, hari ke-" + getHari() + " penumpang sebanyak " 
				+ getPenumpang() + " orang. Pemasukan = " + totalPemasukan();
	}

	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return getPenumpang() * getHarga();
	}
	
}
