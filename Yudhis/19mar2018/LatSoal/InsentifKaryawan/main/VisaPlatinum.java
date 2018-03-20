package main;

public class VisaPlatinum extends CreditCard implements InsentifBulananKaryawan {

	String bulan;
	int jumlahJual = 0;
	
	public VisaPlatinum(String bulan, int jumlahJual) {
		// TODO Auto-generated constructor stub
		this.bulan = bulan;
		this.jumlahJual = jumlahJual;
		toString();
		setInsentif(insentifBulanan());
	}
	
	@Override
	public String toString() {
		return "Insentif Visa Platinum bulan " + bulan + ", sebesar " + getInsentif();
	}

	@Override
	public double insentifBulanan() {
		// TODO Auto-generated method stub
		double iuran = 0;
		
		if (bulan.equals("Maret")) {
			iuran = insentifVisaPlatinum - (insentifVisaPlatinum * 0.2);
		} else {
			iuran = iuran + insentifVisaPlatinum;
		}
		
		return iuran;
	}
	
	
	
}
