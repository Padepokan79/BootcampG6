package main;

public class TiketVVIP extends Tiket implements HargaTiket {

	String hari;
	
	public TiketVVIP(int penonton, String hari) {
		// TODO Auto-generated constructor stub
		setHarga(hargaTiketVVIP);
		setPenonton(penonton);
		this.hari = hari;
	}
	
	public TiketVVIP() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Pemasukan Tiket VVIP = " + hitungPemasukan();
	}

	@Override
	public int hitungPemasukan() {
		// TODO Auto-generated method stub
		double harga = 0;
		
		if (hari.equals("Sabtu")) {
			harga = (getHarga() + (getHarga() * 0.2)) * getPenonton();
		} else if (hari.equals("Minggu")) {
			harga = (getHarga() + (getHarga() * 0.5)) * getPenonton();
		} else {
			harga = getHarga() * getPenonton();
		}
		
		return (int) harga;
	}
		
}
