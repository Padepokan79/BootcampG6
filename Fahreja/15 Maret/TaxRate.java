
interface TaxRate {
	final double non = 0.03;
	final double premium = 0.06;
	final double gold = 0.05;
	final double silver = 0.04;
	
	double calTax(String type);
}