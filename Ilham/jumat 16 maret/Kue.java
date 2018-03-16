
public class Kue extends Makanan {
	private String warna, topping, bentuk;

	public Kue(String nama, String rasa, int berat, String warna, String topping, String bentuk) {
		super(nama, rasa, berat);
		this.warna = warna;
		this.topping = topping;
		this.bentuk = bentuk;
	}	

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getBentuk() {
		return bentuk;
	}

	public void setBentuk(String bentuk) {
		this.bentuk = bentuk;
	}
	
	
}
