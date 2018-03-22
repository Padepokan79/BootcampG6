package main;

public class Jeruk extends Buah implements HargaBuah {
	
	public Jeruk(String hari, int jumlahLaku) {
		// TODO Auto-generated constructor stub
		setHari(hari);
		setJumlahLaku(jumlahLaku);
		setHarga(hargaJerukPerKg);
		
		totalPemasukan();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Penjualan Buah Jeruk, hari " + getHari() + " terjual sebanyak " 
				+ getJumlahLaku() + " kg. Pemasukan = " + totalPemasukan();
	}

	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return getJumlahLaku() * getHarga();
	}
	
}
