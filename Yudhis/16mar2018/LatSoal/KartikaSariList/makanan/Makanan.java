package makanan;

public abstract class Makanan {
	
	private int harga;
		
	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public abstract void printMakanan();
	
}
