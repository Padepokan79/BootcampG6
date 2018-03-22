
public interface TaxRate {
	double nonMember = 0.03;
	double premium = 0.06;
	double gold = 0.05;
	double silver = 0.04;
	
	public double taxRateSaloon(String memberType);
}
