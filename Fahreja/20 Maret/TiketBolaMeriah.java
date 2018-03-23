
public class TiketBolaMeriah {
	private double harga;
	String nama, hari;
	public TiketBolaMeriah(double harga, String nama) {
		super();
		this.harga = harga;
		this.nama = nama;
	}
	
	public void naik(String hari) {
		this.hari = hari;
	}
	
	public double hargaNaik() {
		if (hari.equalsIgnoreCase("sabtu")) {
			return harga = harga+(harga*0.2);
		}if (hari.equalsIgnoreCase("minggu")) {
			return harga = harga+(harga*0.5);
		}else {
			return harga;
		}
	}

	public double getHarga() {
		return harga;
	}
}
