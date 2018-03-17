package TheDiscountSystem;

import java.util.Date;

public class Visit implements DiscountRate, TaxRate {
	
	// Variable
	private Customer customer;
	private Date date;
    private double serviceExpense;
    private double productExpense;

    // Constructor
    public Visit(String name, Date date) {
    	this.setDate(date);
    }

    public String getName() {
        return customer.getName();
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
    
//    public String toString() {
//		return "Total Expense on " + date + " : " + getTotalExpense();
//	}

    public double getServiceDiscRate(String type) {
    	double disc = 0;
    	if(type.equalsIgnoreCase("premium")) {
    		disc = disc + serviceDiscountPremium;
    	}	
    	else if (type.equalsIgnoreCase("gold")) {
			disc = disc + serviceDiscountGold;
		}
    	else if (type.equalsIgnoreCase("silver")) {
			disc = disc + serviceDiscountSilver;
		}
    	return disc;
    }
    
    public double getProductDiscRate(String type) {
    	double disc = 0;
    	if(type.equalsIgnoreCase("premium")) {
    		disc = disc + productDiscountPremium;
    	}
    	else if(type.equalsIgnoreCase("gold")) {
    		disc = disc + productDiscountGold;
    	}
    	else if(type.equalsIgnoreCase("silver")) {
    		disc = disc + productDiscountSilver;
    	}
    	return disc;
    }
    
    public double getTaxRate(String type) {
    	double tax = 0;
    	if(type.equalsIgnoreCase("premium")) {
    		tax = tax + taxPremium;
    	}
    	else if(type.equalsIgnoreCase("gold")) {
    		tax = tax + taxGold;
    	}
    	else if(type.equalsIgnoreCase("silver")) {
    		tax = tax + taxSilver;
    	}
    	else {
    		tax = tax + taxNonMember;
    	}
    	return tax;
    }
    
    public String toString() {
        return "Detail expense on date " + date;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
