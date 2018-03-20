package main;

public class TiketNormal extends Tiket implements HargaTiket {

	String hari;
	
	public TiketNormal(int penonton, String hari) {
		// TODO Auto-generated constructor stub
		setHarga(hargaTiketNormal);
		setPenonton(penonton);
		this.hari = hari;
	}
	
	public TiketNormal() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Pemasukan Tiket Normal = " + hitungPemasukan();
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
