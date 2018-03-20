package main;

public class MasterTitanium extends CreditCard implements InsentifBulananKaryawan {

	String bulan;
	int jumlahJual = 0;
	
	public MasterTitanium(String bulan, int jumlahJual) {
		// TODO Auto-generated constructor stub
		this.bulan = bulan;
		this.jumlahJual = jumlahJual;
		toString();
		setInsentif(insentifBulanan());		
	}
	
	@Override
	public String toString() {
		return "Insentif Master Titanium bulan " + bulan + ", sebesar = " + getInsentif();
	}

	@Override
	public double insentifBulanan() {
		// TODO Auto-generated method stub
		double iuran = 0;
		
		if (bulan.equals("Maret")) {
			iuran = insentifMasterTitanium - (insentifMasterTitanium * 0.2);
		} else {
			iuran = iuran + insentifMasterTitanium;
		}
		
		return iuran;
	}
	
	
	
}
