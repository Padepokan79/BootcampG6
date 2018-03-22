package main;

import java.util.Date;

public class Visit implements DiscountRate, TaxRate {

	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name, Date date) {
		// TODO Auto-generated constructor stub
		this.date = date;
	}
	
	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
	public double getTotalExpense() {
		return getProductExpense() + getServiceExpense();
	}
	
	public String toString() {
		return "Total Expense on " + date + " : " + getTotalExpense();
	}
	
	@Override
	public double getProductDiscountRate(String type) {
		// TODO Auto-generated method stub
		double disc = 0;
		
		if (type.equals("Premium")) {
			disc = disc + serviceDiscountPremium;
		} else if (type.equals("Gold")) {
			disc = disc + serviceDiscountGold;
		} else if (type.equals("Silver")) {
			disc = disc + serviceDiscountSilver;
		}
		
		return disc;
	}
	
	@Override
	public double getServiceDiscountRate(String type) {
		// TODO Auto-generated method stub
		double disc = 0;
		
		if (type.equals("Premium")) {
			disc = disc + productDiscountPremium;
		} else if (type.equals("Gold")) {
			disc = disc + productDiscountGold;
		} else if (type.equals("Silver")) {
			disc = disc + productDiscountSilver;
		}
		
		return disc;
	}
	
	@Override
	public double getProductTaxRate(String type) {
		// TODO Auto-generated method stub
		double tax = 0;
		
		if (type.equals("Premium")) {
			tax = tax + taxRatetPremium;
		} else if (type.equals("Gold")) {
			tax = tax + taxRateGold;
		} else if (type.equals("Silver")) {
			tax = tax + taxRateSilver;
		} else {
			tax = tax + taxRateNonMember;
		}
		
		return tax;
	}
	
	@Override
	public double getServiceTaxRate(String type) {
		// TODO Auto-generated method stub
		double tax = 0;
		
		if (type.equals("Premium")) {
			tax = tax + taxRatetPremium;
		} else if (type.equals("Gold")) {
			tax = tax + taxRateGold;
		} else if (type.equals("Silver")) {
			tax = tax + taxRateSilver;
		} else {
			tax = tax + taxRateNonMember;
		}
		
		return tax;
	}
}
