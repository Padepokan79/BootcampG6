import java.util.Date;

public class Visit extends Customer implements DiscountRate,TaxRate {
	Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String nama, Date date) {
		super(nama);
		this.date = date;
	}
	double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(double newService) {
		serviceExpense = serviceExpense+ newService;
	}
	
	double getProductExpense() {
		return productExpense;
	}
	public void setProductExpense(double newProduct) {
		productExpense = productExpense + newProduct;
	}
	double getTotalExpense(){
		return productExpense +  serviceExpense;
	}
	
	public double getServiceDiscountRate(String Type) {
		if (getMemberType().equalsIgnoreCase("premium")) {
			return serviceDiscountPremium;
		}else if (getMemberType().equalsIgnoreCase("gold")) {
			return serviceDiscountGold;
		}else if (getMemberType().equalsIgnoreCase("silver")) {
			return serviceDiscountSilver;
		}else {
			return 0;
		}
	}
	public double getProductDiscountRate(String Type) {
		if (getMemberType().equalsIgnoreCase("premium")) {
			return productDiscountPremium;
		}else if (getMemberType().equalsIgnoreCase("gold")) {
			return productDiscountGold;
		}else if (getMemberType().equalsIgnoreCase("silver")) {
			return productDiscountSilver;
		}else {
			return 0;
		}
	}
		
	public double calTax(String type) {
		if (getMemberType().equalsIgnoreCase("premium")) {
			return premium * getTotalExpense();
		}else if (getMemberType().equalsIgnoreCase("gold")) {
			return gold *getTotalExpense();
		}else if (getMemberType().equalsIgnoreCase("silver")) {
			return silver * getTotalExpense();
		}else {
			return non * getTotalExpense();
		}
	}
	
	void display() {
		System.out.println("Selamat Datang");
		System.out.println(date);
	}
}
