package main;

public class Barang implements HargaBarang {
	
	private int hargaKemeja, hargaCelana, hargaKaos, hargaJas;
	private int penjualanKemeja, penjualanCelana, penjualanKaos, penjualanJas;
	int mingguKe;

	public Barang() {
		// TODO Auto-generated constructor stub
	}
	
	public Barang(int mingguKe, int penjualanKemeja, int penjualanCelana, int penjualanKaos, int penjualanJas) {
		// TODO Auto-generated constructor stub
		setHargaKemeja(hargaKemejaPerPotong);
		setHargaCelana(hargaCelanaPerPotong);
		setHargaKaos(hargaKaosPerPotong);
		setHargaJas(hargaJasPerPotong);
		
		setPenjualanKemeja(penjualanKemeja);
		setPenjualanCelana(penjualanCelana);
		setPenjualanKaos(penjualanKaos);
		setPenjualanJas(penjualanJas);
		
		this.mingguKe = mingguKe;
	}
	
	public int getHargaKemeja() {
		return hargaKemeja;
	}
	
	public void setHargaKemeja(int hargaKemeja) {
		this.hargaKemeja = hargaKemeja;
	}
	
	public int getHargaCelana() {
		return hargaCelana;
	}
	
	public void setHargaCelana(int hargaCelana) {
		this.hargaCelana = hargaCelana;
	}
	
	public int getHargaKaos() {
		return hargaKaos;
	}
	
	public void setHargaKaos(int hargaKaos) {
		this.hargaKaos = hargaKaos;
	}
	
	public int getHargaJas() {
		return hargaJas;
	}
	
	public void setHargaJas(int hargaJas) {
		this.hargaJas = hargaJas;
	}
	
	public int getPenjualanKemeja() {
		return penjualanKemeja;
	}
	
	public void setPenjualanKemeja(int penjualanKemeja) {
		this.penjualanKemeja = penjualanKemeja;
	}
	
	public int getPenjualanCelana() {
		return penjualanCelana;
	}
	
	public void setPenjualanCelana(int penjualanCelana) {
		this.penjualanCelana = penjualanCelana;
	}
	
	public int getPenjualanKaos() {
		return penjualanKaos;
	}
	
	public void setPenjualanKaos(int penjualanKaos) {
		this.penjualanKaos = penjualanKaos;
	}
	
	public int getPenjualanJas() {
		return penjualanJas;
	}
	
	public void setPenjualanJas(int penjualanJas) {
		this.penjualanJas = penjualanJas;
	}
	
	@Override
	public String toString() {
		return ""
				+ "\nPenjualan Minggu ke-" + mingguKe + "\n"
				+ "Kemeja terjual " + getPenjualanKemeja() 
				+ " pemasukan " + (getPenjualanKemeja() * getHargaKemeja()) + "\n"
				+ "Celana terjual " + getPenjualanCelana()
				+ " pemasukan " + (getPenjualanCelana() * getHargaCelana()) + "\n"
				+ "Kaos terjual " + getPenjualanKaos()
				+ " pemasukan " + (getPenjualanKaos() * getHargaKaos()) + "\n"
				+ "Jas terjual " + getPenjualanJas()
				+ " pemasukan " + (getPenjualanJas() * getHargaJas()) + "\n"
				+ "Total pemasukan = " + totalPemasukan();
	}
	
	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return 
				getPenjualanKemeja() * getHargaKemeja() + getPenjualanCelana() * getHargaCelana() + 
				getPenjualanKaos() * getHargaKaos() + getPenjualanJas() * getHargaJas();
	}
	
}
