package salonDiscountSystem;

public interface TaxRate {
	final double taxPremium = 0.06;
	final double taxGold = 0.05;
	final double taxSilver = 0.04;
	final double taxNonMember = 0.03;
	
	public double calculateTax(String type);
}
