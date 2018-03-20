package main;

public class Rambutan extends Buah implements HargaBuah {
	
	public Rambutan(String hari, int jumlahLaku) {
		// TODO Auto-generated constructor stub
		setHari(hari);
		setJumlahLaku(jumlahLaku);
		setHarga(hargaRambutanPerKg);
		
		totalPemasukan();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Penjualan Buah Rambutan, hari " + getHari() + " terjual sebanyak " 
				+ getJumlahLaku() + " kg. Pemasukan = " + totalPemasukan();
	}

	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return getJumlahLaku() * getHarga();
	}
	
}
