
public class Pekerja {
	private String nama, jabatan;
	private int gaji;

	public Pekerja(String nama, String jabatan, int gaji) {
		super();
		this.nama = nama;
		this.jabatan = jabatan;
		this.gaji = gaji;
	}

	public String getNama() {
		return nama;
	}

	public String getJabatan() {
		return jabatan;
	}

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
	
}
