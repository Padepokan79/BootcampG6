package main;

public interface TaxRate {
	
	static double taxRateNonMember = 0.03;
	static double taxRatetPremium = 0.06;
	static double taxRateGold = 0.05;
	static double taxRateSilver = 0.04;
	
	public double getProductTaxRate(String type);
	
	public double getServiceTaxRate(String type);
}
