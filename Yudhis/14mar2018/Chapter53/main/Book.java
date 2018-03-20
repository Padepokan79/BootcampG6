package main;

public class Book extends Goods implements Taxable {
	String author;
	
	public Book(String des, double pr, String auth) {
		// TODO Auto-generated constructor stub
		super(des, pr);
		author = auth;
	}
	
	void display() {
		super.display();
		System.out.println("author: " + author);
	}
	
	public double calculateTax() {
		return price * taxRate;
	}
}
