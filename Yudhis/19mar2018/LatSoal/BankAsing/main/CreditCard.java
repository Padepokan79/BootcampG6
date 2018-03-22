package main;

public abstract class CreditCard {

	private double iuranTahunan;

	public double getIuranTahunan() {
		return iuranTahunan;
	}

	public void setIuranTahunan(double iuranTahunan) {
		this.iuranTahunan = iuranTahunan;
	}
	
	public abstract double hitungIuran();
	
}
