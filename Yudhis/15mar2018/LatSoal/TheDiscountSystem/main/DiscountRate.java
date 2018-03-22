package main;

interface DiscountRate {
	
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	public double getServiceDiscountRate(String type);
	
	public double getProductDiscountRate(String type);
}
