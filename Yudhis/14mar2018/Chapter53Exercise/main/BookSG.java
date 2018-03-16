package main;

public class BookSG extends GoodsSG implements Taxable {
	String author;
	
	public BookSG(String des, double pr, String auth, int quantity) {
		// TODO Auto-generated constructor stub
		super(des, pr, quantity);
		author = auth;
	}
	
	void display() {
		toString();
		System.out.println("author: " + author);
	}
	
	public double calculateTax() {
		return getPrice() * taxRate;
	}	
}
