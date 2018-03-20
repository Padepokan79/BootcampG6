package main;

import java.util.Date;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Customer name
		System.out.print("Customer name? ");
		Customer customer = new Customer(input.nextLine());
		
		// Member & Member Type
		System.out.print("Member? y / n ");
		if (input.next().equals("y")) {
			customer.setMember(true);
			System.out.print("Member type? "); customer.setMemberType(input.next());
		} else {
			customer.setMemberType("Non");
		}
		
		// Print customer state
		System.out.println(customer.toString());
		
		// Visit date
		input.nextLine(); // Clear scanner buffer
		Date date = new Date();
		Visit visit = new Visit(customer.getName(), date);
		
		// Service & Product Expense
		System.out.print("Product Expense? "); visit.setProductExpense(input.nextDouble());
		System.out.print("Service Expense? "); visit.setServiceExpense(input.nextDouble());
		
		// Discount Rate, Tax Rate & Total Expense
		if (customer.isMember()) {
			double discServ = visit.getServiceExpense() * visit.getServiceDiscountRate(customer.getMemberType());
			double discProd = visit.getProductExpense() * visit.getProductDiscountRate(customer.getMemberType());
			double taxServ = visit.getServiceExpense() * visit.getServiceTaxRate(customer.getMemberType()); 
			double taxProd = visit.getProductExpense() * visit.getProductTaxRate(customer.getMemberType());
			
			visit.setServiceExpense(visit.getServiceExpense() - discServ + taxServ);
			visit.setProductExpense(visit.getProductExpense() - discProd + taxProd);
			
			System.out.println("Product Discount: " + discProd);
			System.out.println("Service Discount: " + discServ);
			System.out.println("Product Tax: " + taxProd);
			System.out.println("Service Tax: " + taxServ);
			System.out.println("Total Product Expense: " + visit.getProductExpense());
			System.out.println("Total Service Expense: " + visit.getServiceExpense());
			System.out.println(visit.toString());
		} else {
			double taxServ = visit.getServiceExpense() * visit.getServiceTaxRate(customer.getMemberType()); 
			double taxProd = visit.getProductExpense() * visit.getProductTaxRate(customer.getMemberType());
			
			visit.setServiceExpense(visit.getServiceExpense() + taxServ);
			visit.setProductExpense(visit.getProductExpense() + taxProd);
			
			System.out.println("Product Tax: " + taxProd);
			System.out.println("Service Tax: " + taxServ);
			System.out.println("Total Product Expense: " + visit.getProductExpense());
			System.out.println("Total Service Expense: " + visit.getServiceExpense());
			System.out.println(visit.toString());
		}
		
	}

}
