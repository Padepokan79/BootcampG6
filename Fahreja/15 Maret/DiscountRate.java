interface DiscountRate {
	final double serviceDiscountPremium = 0.2;
	final double serviceDiscountGold = 0.15;
	final double serviceDiscountSilver = 0.1;
	final double productDiscountPremium = 0.1;
	final double productDiscountGold = 0.1;
	final double productDiscountSilver = 0.15;
	
	double getServiceDiscountRate(String type);
	double getProductDiscountRate(String type);
	
}
