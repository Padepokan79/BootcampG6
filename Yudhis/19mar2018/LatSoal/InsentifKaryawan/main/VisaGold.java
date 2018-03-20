package main;

public class VisaGold extends CreditCard implements InsentifBulananKaryawan {

	String bulan;
	int jumlahJual = 0;
	
	public VisaGold(String bulan, int jumlahJual) {
		// TODO Auto-generated constructor stub
		this.bulan = bulan;
		this.jumlahJual = jumlahJual;
		toString();
		setInsentif(insentifBulanan());
	}
	
	@Override
	public String toString() {
		return "Insentif Visa Gold bulan " + bulan + ", sebesar " + getInsentif();
	}

	@Override
	public double insentifBulanan() {
		// TODO Auto-generated method stub
		double iuran = 0;
		
		if (bulan.equals("Maret")) {
			iuran = insentifVisaGold - (insentifVisaGold * 0.2);
		} else {
			iuran = iuran + insentifVisaGold;
		}
		
		return iuran;
	}
	
	
	
}
