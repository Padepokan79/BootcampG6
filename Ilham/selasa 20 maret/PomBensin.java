
public class PomBensin {
	private String jenisBensin;
	private int jumlahLiterYangTerjualDalamSehari;
	private double hargaPerliter;
	
	public PomBensin(String jenisBensin, double hargaPerliter) {
		this.setJenisBensin(jenisBensin);
		this.setHargaPerliter(hargaPerliter);
	}

	public int getJumlahLiterYangTerjualDalamSehari() {
		return jumlahLiterYangTerjualDalamSehari;
	}

	public void setJumlahLiterYangTerjualDalamSehari(int jumlahLiterYangTerjualDalamSehari) {
		this.jumlahLiterYangTerjualDalamSehari = jumlahLiterYangTerjualDalamSehari;
	}

	public double getHargaPerliter() {
		return hargaPerliter;
	}

	public void setHargaPerliter(double hargaPerliter) {
		this.hargaPerliter = hargaPerliter;
	}

	public String getJenisBensin() {
		return jenisBensin;
	}

	public void setJenisBensin(String jenisBensin) {
		this.jenisBensin = jenisBensin;
	}
	
	public double penghasilanPerhari() {
		return this.hargaPerliter * this.jumlahLiterYangTerjualDalamSehari;		
	}
	
}
