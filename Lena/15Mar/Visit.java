package salonDiscountSystem;

import java.util.Date;

public class Visit extends Customer implements DiscountRate, TaxRate{	
	public Date date;
	private double serviceExpense, productExpense;
	
	public Visit() {
		// TODO Auto-generated constructor stub
	}
	
	Visit(String name, Date date){
		super(name);
		this.date = date;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}	
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}
	
	public double getServiceDiscountRate(String type) {
		double diskon=0; 
		
		if(type.equalsIgnoreCase("premium")) {
			diskon = serviceDiscountPremium;
		}
		else if(type.equalsIgnoreCase("gold")) {
			diskon = serviceDiscountGold;
		}
		else if(type.equalsIgnoreCase("silver")) {
			diskon = serviceDiscountSilver;
		}
		else if(type.equalsIgnoreCase("non member")) {
			diskon = 0;
		}
		
		return diskon*serviceExpense;
	}
	
	public double getProductDiscountRate(String type) {
		double diskon=0; 
		
		if(type.equalsIgnoreCase("premium")) {
			diskon = productDiscountPremium;
		}
		else if(type.equalsIgnoreCase("gold")) {
			diskon = productDiscountGold;
		}
		else if(type.equalsIgnoreCase("silver")) {
			diskon = productDiscountSilver;
		}
		else if(type.equalsIgnoreCase("non member")) {
			diskon = 0;
		}
		
		return diskon*productExpense;
	}
	
	public double calculateTax(String type) {
		double tax=0;
		
		if(type.equalsIgnoreCase("premium")) {
			tax = taxPremium;
		}
		else if(type.equalsIgnoreCase("gold")) {
			tax = taxGold;
		}
		else if(type.equalsIgnoreCase("silver")) {
			tax = taxSilver;
		}
		else if(type.equalsIgnoreCase("non member")) {
			tax = taxNonMember;
		}
		
		return (productExpense+serviceExpense)*tax;
	}
	
	public double getTotalExpense() {
		return productExpense + getProductDiscountRate(getMemberType()) + 
			   serviceExpense + getServiceDiscountRate(getMemberType()) + 
			    calculateTax(getMemberType());
	}
	
	public String toString() {
		return "Tgl: "+date+super.toString()+"\nTotal yang harus dibayar: "+getTotalExpense();
	}
}
