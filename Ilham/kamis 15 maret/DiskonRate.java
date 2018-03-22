
public interface DiskonRate {
	double serviceDiscountPremium = 0.2;
	double serviceDiscountGold = 0.15;
	double serviceDiscountSilver = 0.1;
	double productDiscountPremium = 0.1;
	double productDiscountGold= 0.1;
	double productDiscountSilver = 0.1;
	
	public double getServiceDicountRate(String memberType);
	
	public double getProductDicountRate(String memberType);	
}
