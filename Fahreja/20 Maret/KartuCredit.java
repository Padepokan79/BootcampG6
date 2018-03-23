
public class KartuCredit {
//	String jenis;
	private double iuranTahunan;
	int tahun;
	public KartuCredit(double iuranTahunan) {
		super();
		this.iuranTahunan = iuranTahunan;
	}
	
	public void tahunan(int tahun) {
		this.tahun = tahun;
	}
	
	public double pajak() {
		if (tahun == 2) {
			return iuranTahunan -(iuranTahunan *0.1);
		} else {
			return iuranTahunan;
		}
	}
	public double getIuranTahunan() {
		return iuranTahunan;
	}
}
