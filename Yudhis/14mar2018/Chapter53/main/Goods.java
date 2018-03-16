package main;

public class Goods {
	String description;
	double price;
	
	public Goods(String des, double pr) {
		// TODO Auto-generated constructor stub
		description = des;
		price = pr;
	}
	
	void display() {
		System.out.println("item: " + description + " price: " + price);
	}
}
