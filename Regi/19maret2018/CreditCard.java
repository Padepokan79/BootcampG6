package SembilanBelasMaret2018;

public class CreditCard {
	String jenisKartu;
	private int insentifPenjualankartu;

	public CreditCard(String jenisKartu, int insentifPenjualankartu) {
		super();
		this.jenisKartu = jenisKartu;
		this.insentifPenjualankartu = insentifPenjualankartu;
	}

	public int getInsentifPenjualankartu() {
		return insentifPenjualankartu;
	}

	public void setInsentifPenjualankartu(int insentifPenjualankartu) {
		this.insentifPenjualankartu = insentifPenjualankartu;
	}

}
