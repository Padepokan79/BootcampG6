package soal1MixPrinting;

public class Printing {
	private String jenisPrinting;
	private int harga, jumlahPengunjung;
	
	public Printing(String jenisPrinting, int harga, int jumlahPengunjung) {
		super();
		this.jenisPrinting = jenisPrinting;
		this.harga = harga;
		this.jumlahPengunjung = jumlahPengunjung;
	}

	public String getJenisPrinting() {
		return jenisPrinting;
	}

	public void setJenisPrinting(String jenisPrinting) {
		this.jenisPrinting = jenisPrinting;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public int getJumlahPengunjung() {
		return jumlahPengunjung;
	}
	
	public void setJumlahPengunjung(int jumlahPengunjung) {
		this.jumlahPengunjung = jumlahPengunjung;
	}
	
	
}
