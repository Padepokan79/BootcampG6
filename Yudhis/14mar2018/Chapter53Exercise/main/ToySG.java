package main;

public class ToySG extends GoodsSG implements Taxable {
	int minimumAge;
	
	public ToySG(String des, double pr, int min, int quantity) {
		// TODO Auto-generated constructor stub
		super(des, pr, quantity);
		minimumAge = min;
	}
	
	void display() {
		toString();
		System.out.println("minimum age: " + minimumAge);
	}
	
	public double calculateTax() {
		return getPrice() * taxRate;
	}
}
