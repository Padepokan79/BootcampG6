package makanan;

public class Bakwan extends Makanan {
	
	int diameterBakwan, ketebalanBakwan;
	String isiBakwan;
		
	public Bakwan(int diameterBakwan, int ketebalanBakwan, String isiBakwan, int harga) {
		super();
		this.diameterBakwan = diameterBakwan;
		this.ketebalanBakwan = ketebalanBakwan;
		this.isiBakwan = isiBakwan;
		setHarga(harga);
	}
	
	@Override
	public String toString() {
		return "Bakwan [diameterBakwan=" + diameterBakwan + ", ketebalanBakwan=" + ketebalanBakwan + ", isiBakwan="
				+ isiBakwan + ", harga=" + getHarga() + "]";
	}

	@Override
	public void printMakanan() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
}
