package main;

public class MasterWorldmiles extends CreditCard implements BiayaIuranTahunan {

	int tahunKe;
	String statusKeluarga;

	public MasterWorldmiles(int tahunKe, String statusKeluarga) {
		super();
		setTahunKe(tahunKe);
		setStatusKeluarga(statusKeluarga);
		setIuranTahunan(biayaMasterWorldmiles);
		System.out.println(toString());
	}

	public int getTahunKe() {
		return tahunKe;
	}

	@Override
	public String toString() {
		return "Iuran Master Worldmiles tahun ke-" + getTahunKe() + ", milik " + getStatusKeluarga()
					+ ", sebesar " + hitungIuran();
	}

	public void setTahunKe(int tahunKe) {
		this.tahunKe = tahunKe;
	}

	public String getStatusKeluarga() {
		return statusKeluarga;
	}

	public void setStatusKeluarga(String statusKeluarga) {
		this.statusKeluarga = statusKeluarga;
	}

	@Override
	public double hitungIuran() {
		// TODO Auto-generated method stub
		double iuran = 0;
		
		if (getTahunKe() == 3) {
			iuran = getIuranTahunan() - (getIuranTahunan() * 0.1);
		} else {
			iuran = getIuranTahunan();
		}
		
		return iuran;
	}
	
}
