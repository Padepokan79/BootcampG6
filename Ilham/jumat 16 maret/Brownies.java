
public class Brownies extends Kue {
	private String jenisBrownies;
	private int harga;
	
	public Brownies(String nama, String rasa, int berat, String warna, String topping, String bentuk, String jenisBrownies, int harga) {
		super(nama, rasa, berat, warna, topping, bentuk);
		this.jenisBrownies = jenisBrownies;
		this.harga = harga;
	}

	public String getJenisBrownies() {
		return jenisBrownies;
	}

	public void setJenisBrownies(String jenisBrownies) {
		this.jenisBrownies = jenisBrownies;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
	
	
}
