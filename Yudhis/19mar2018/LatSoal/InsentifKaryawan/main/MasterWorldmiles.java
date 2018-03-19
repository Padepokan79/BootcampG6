package main;

public class MasterWorldmiles extends CreditCard implements InsentifBulananKaryawan {

	String bulan;
	int jumlahJual = 0;
	
	public MasterWorldmiles(String bulan, int jumlahJual) {
		// TODO Auto-generated constructor stub
		this.bulan = bulan;
		this.jumlahJual = jumlahJual;
		toString();
		setInsentif(insentifBulanan());
	}
	
	@Override
	public String toString() {
		return "Insentif Master Worldmiles bulan " + bulan + ", sebesar " + getInsentif();
	}

	@Override
	public double insentifBulanan() {
		// TODO Auto-generated method stub
		double iuran = 0;
		
		if (bulan.equals("Maret")) {
			iuran = insentifMasterWorldmiles - (insentifMasterWorldmiles * 0.2);
		} else {
			iuran = iuran + insentifMasterWorldmiles;
		}
		
		return iuran;
	}
	
	
	
}
