package TheDiscountSystem;

import java.util.Date;

import java.util.Scanner;

public class TestDiscountRate {

    private static Scanner keyboard;

	public static void main (String[] args) {
    	keyboard = new Scanner(System.in);
        
        System.out.println("beauty saloon");
        
        System.out.println("\nInput your name : ");
        Customer customer1 = new Customer(keyboard.nextLine());
        
        System.out.println("Are you a member of beauty saloon (y / n) : ");
        if(keyboard.next().equals("y")) {
        	customer1.setMember(true);
        	System.out.println("Input your member type? ");
        	customer1.setMemberType(keyboard.next());
        }
        else {
        	customer1.setMemberType("non member");
        }
        
        keyboard.nextLine();
        Date date = new Date();
        Visit visit1 = new Visit(customer1.getName(), date);
        
        System.out.println("Input your service expense : ");
        visit1.setServiceExpense(keyboard.nextDouble());
        
        System.out.println("Input your product expense : ");
	    visit1.setProductExpense(keyboard.nextDouble());
	   
	    System.out.println(customer1.toString());
	    
	    if(customer1.isMember()) {
	    	double totalExpense = visit1.getServiceExpense() + visit1.getProductExpense();
	    	double serviceDiscount = visit1.getServiceExpense()*visit1.getServiceDiscRate(customer1.getMemberType());
			double productDiscount = visit1.getProductExpense()*visit1.getProductDiscRate(customer1.getMemberType());
			double totalDiscount = serviceDiscount + productDiscount;
			double totalExpenseAfterDisc = totalExpense - totalDiscount;
			double totalTax = totalExpense*visit1.getTaxRate(customer1.getMemberType());
			double totalExpensePlusTax = totalExpenseAfterDisc + totalTax;
			
			System.out.println(visit1.toString());
			System.out.println("Total expense : " + totalExpense);
			System.out.println("Service discount : " + serviceDiscount);
			System.out.println("Product discount : " + productDiscount);
			System.out.println("Total discount : " + totalDiscount);
			System.out.println("Total expense after discount : " + totalExpenseAfterDisc);
			System.out.println("Total tax : " + totalTax);
			System.out.println("Total expense plus tax : " + totalExpensePlusTax);
		} 
	    else {
	    	double totalExpense = visit1.getServiceExpense() + visit1.getProductExpense();
			double totalTax = totalExpense*visit1.getTaxRate(customer1.getMemberType());
			double totalExpensePlusTax = totalExpense + totalTax;
			
			System.out.println(visit1.toString());
			System.out.println("Total expense : " + totalExpense);
			System.out.println("Total tax : " + totalTax);
			System.out.println("Total expense Plus Tax : " + totalExpensePlusTax);
		}
        
    }
	
}