import java.util.Date;

public class Visit extends Customer implements DiskonRate, TaxRate {
	private Customer customer;
	private Date date;
	private double serviceExpense, productExpense, discServ, discProd, total, tax;

	public Visit() {

	}
	
	public Visit(String name, Date date) {
		super(name);
		this.date = date;
	}
	
	public String getNmae() {
		return super.getName();
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public void setProductExpense(double ex) {
		this.productExpense = ex;
	}
	
	public double totalExpense() {
		return serviceExpense + productExpense;
	}

	public double getProductDicountRate(String memberType) {
		if (memberType.equalsIgnoreCase("Premium")) {
			return productDiscountPremium;
		}
		else if (memberType.equalsIgnoreCase("Gold")) {
			return productDiscountGold;
		}
		else if (memberType.equalsIgnoreCase("Silver")) {
			return productDiscountSilver;
		}
		else {
			return 0;
		}
	}

	public double getServiceDicountRate(String memberType) {
		if (memberType.equalsIgnoreCase("Premium")) {
			return serviceDiscountPremium;
		}
		else if (memberType.equalsIgnoreCase("Gold")) {
			return serviceDiscountGold;
		}
		else if (memberType.equalsIgnoreCase("Silver")) {
			return serviceDiscountSilver;
		}
		else {
			return 0;
		}
	}	
	
	public double taxRateSaloon(String memberType) {
		if (memberType.equalsIgnoreCase("Premium")) {
			return premium;
		}
		else if (memberType.equalsIgnoreCase("Gold")) {
			return gold;
		}
		else if (memberType.equalsIgnoreCase("Silver")) {
			return silver;
		}
		else {
			return nonMember;
		}		
	}

	public String toString(int i, String memTyp, double discServ, double discProd, double pajak, double total) {
		this.discServ = discServ;
		this.discProd = discProd;
		this.tax = pajak;
		this.total = total;
		return "Visit" + i + " \nNama: " + getName() + " \nMember: " + memTyp + "\nDate: " + date
				+ "\nPembayaran Service: " + getServiceExpense() + "\nDiskon Service(member): " + discServ
				+ "\nPembayaran Product: " + getProductExpense() + "\nDiskon Product(member): " + discProd
				+ "\nPajak: " + pajak
				+ "\nTotal Pembayara: " + total + "\n";
		}
	
}
