package makanan;

public class Selai extends Makanan {

	String warnaSelai, rasaSelai;

	public Selai(String warnaSelai, String rasaSelai, int harga) {
		super();
		this.warnaSelai = warnaSelai;
		this.rasaSelai = rasaSelai;
		setHarga(harga);
	}
	
	@Override
	public String toString() {
		return "Selai [warnaSelai=" + warnaSelai + ", rasaSelai=" + rasaSelai + ", harga=" + getHarga() + "]";
	}

	@Override
	public void printMakanan() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
}
