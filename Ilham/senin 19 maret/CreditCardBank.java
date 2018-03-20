import java.util.ArrayList;

public class CreditCardBank extends KaryawanBank {
	private final double VISAGOLD = 10000, MASTERTITANIUM = 15000, VISAPLATINUM = 20000, MASTERWORLDMILES = 25000;
	private final double potongan = 0.2;
	private int jumlahCreditCardTerjual;
	private double besarIntensif;
	private String jenisCreditCard;

	public CreditCardBank(String namaKaryawan, String jenisCreditCard, int jumlahCreditCardTerjual) {
		super(namaKaryawan);
		this.jenisCreditCard = jenisCreditCard;
		this.jumlahCreditCardTerjual = jumlahCreditCardTerjual;
	}
	
	public double getBesarIntensif() {
		return jumlahCreditCardTerjual * cekJumlahBesaranIntensifSebulan(this.jenisCreditCard);
	}
	
	public double cekJumlahBesaranIntensifSebulan(String jenisCreditCard) {
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

	public int getJumlahCreditCardTerjual() {
		return jumlahCreditCardTerjual;
	}

	public void setJumlahCreditCardTerjual(int jumlahCreditCardTerjual) {
		this.jumlahCreditCardTerjual = jumlahCreditCardTerjual;
	}

	public double getPotongan() {
		return potongan;
	}
	
}
