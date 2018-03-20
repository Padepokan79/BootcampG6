package main;

public class Apel extends Buah implements HargaBuah {
	
	public Apel(String hari, int jumlahLaku) {
		// TODO Auto-generated constructor stub
		setHari(hari);
		setJumlahLaku(jumlahLaku);
		setHarga(hargaApelPerKg);
		
		totalPemasukan();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Penjualan Buah Apel, hari " + getHari() + " terjual sebanyak " 
				+ getJumlahLaku() + " kg. Pemasukan = " + totalPemasukan();
	}

	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return getJumlahLaku() * getHarga();
	}
	
}
