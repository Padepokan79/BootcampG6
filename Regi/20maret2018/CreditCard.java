package DuaPuluhMaret2018;

public class CreditCard {
	String jenisCreditCard;
	private int iuranTahunan;
	
	public CreditCard(String jenisCreditCard, int iuranTahunan) {
		super();
		this.jenisCreditCard = jenisCreditCard;
		this.iuranTahunan = iuranTahunan;
	}

	public int getIuranTahunan() {
		return iuranTahunan;
	}

	public void setIuranTahunan(int iuranTahunan) {
		this.iuranTahunan = iuranTahunan;
	}

}
