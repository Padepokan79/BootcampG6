package main;

public abstract class CreditCard {

	private double insentif;
	
	public double getInsentif() {
		return insentif;
	}

	public void setInsentif(double insentif) {
		this.insentif = insentif;
	}

	public abstract double insentifBulanan();
	
}
