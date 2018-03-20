import java.util.ArrayList;

public class CreditCard {
	private ArrayList<String> jenisCreditCard = new ArrayList<String>();
	private String pemilik;
	private double besaranIuranSetahun = 0;
	private final double VISAGOLD = 300000, MASTERTITANIUM = 500000, VISAPLATINUM = 750000, MASTERWORLDMILES = 1000000, POTONGAN = 0.1;
	
	public CreditCard(String pemilik, String jenisCreditCard) {
		this.pemilik = pemilik;
		this.jenisCreditCard.add(jenisCreditCard);
		for (String jenisCredit : this.jenisCreditCard) {
			this.besaranIuranSetahun += cekJumlahBesaranIuranSetahun(jenisCredit);
		}
	}
	
	public CreditCard(String pemilik, String jenisCreditCardSatu, String jenisCreditCardDua) {
		this.pemilik = pemilik;
		this.jenisCreditCard.add(jenisCreditCardSatu);
		this.jenisCreditCard.add(jenisCreditCardDua);
		for (String jenisCredit : this.jenisCreditCard) {
			this.besaranIuranSetahun += cekJumlahBesaranIuranSetahun(jenisCredit);
		}
	}
	
	public double cekJumlahBesaranIuranSetahun(String jenisCreditCard) {
		if (jenisCreditCard.equalsIgnoreCase("Visa Gold")) {
			return VISAGOLD;
		}
		else if (jenisCreditCard.equalsIgnoreCase("Master Titanium")) {
			return MASTERTITANIUM;
		}
		else if (jenisCreditCard.equalsIgnoreCase("Visa Platinum")) {
			return VISAPLATINUM;
		}
		else if (jenisCreditCard.equalsIgnoreCase("Master Worldmiles")) {
			return MASTERWORLDMILES;
		}
		else {
			return 0;
		}
	}

	public String getPemilik() {
		return pemilik;
	}

	public void setPemilik(String pemilik) {
		this.pemilik = pemilik;
	}

	public double getBesaranIuranSetahun() {
		return besaranIuranSetahun;
	}

	public void setBesaranIuranSetahun(double besaranIuranSetahun) {
		this.besaranIuranSetahun = besaranIuranSetahun;
	}
	
	public double getPotongan() {
		return this.POTONGAN;
	}
	
}
