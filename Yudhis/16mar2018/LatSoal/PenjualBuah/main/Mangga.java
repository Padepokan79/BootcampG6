package main;

public class Mangga extends Buah implements HargaBuah {
	
	public Mangga(String hari, int jumlahLaku) {
		// TODO Auto-generated constructor stub
		setHari(hari);
		setJumlahLaku(jumlahLaku);
		setHarga(hargaManggaPerKg);
		
		totalPemasukan();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Penjualan Buah Mangga, hari " + getHari() + " terjual sebanyak " 
				+ getJumlahLaku() + " kg. Pemasukan = " + totalPemasukan();
	}

	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return getJumlahLaku() * getHarga();
	}
	
}
