
public class TiketBola {
	private String kategori, hari;
	private double harga;
	private int jumlahPertandinganDalamSebulan;
	private final int JUMLAHKURSINORMAL = 50, JUMLAHKURSIVIP = 25, JUMLAHKURSIVVIP = 25;
	private final double HARGANORMAL = 35000, HARGAVIP = 50000, HARGAVVIP = 70000;
	
	public TiketBola() {

	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public double getHarga() {
		this.harga = (this.HARGANORMAL * this.JUMLAHKURSINORMAL) + (this.HARGAVIP * this.JUMLAHKURSIVIP) + (this.HARGAVVIP * this.JUMLAHKURSIVVIP);
		
		if (this.hari.equalsIgnoreCase("sabtu")) {
			this.harga += this.harga * 0.2;
		}
		else if (this.hari.equalsIgnoreCase("minggu")) {
			this.harga += this.harga * 0.5;
		}
		return harga;
	}

	public String getHari() {
		return hari;
	}

	public void setHari(String hari) {
		this.hari = hari;
	}

	public int getJumlahPertandinganDalamSebulan() {
		return jumlahPertandinganDalamSebulan;
	}

	public void setJumlahPertandinganDalamSebulan(int jumlahPertandinganDalamSebulan) {
		this.jumlahPertandinganDalamSebulan = jumlahPertandinganDalamSebulan;
	}

	public double pendapatanPerHari() {
		return getHarga();
	}
	
}
