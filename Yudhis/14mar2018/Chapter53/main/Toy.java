package main;

public class Toy extends Goods implements Taxable {
	int minimumAge;
	
	public Toy(String des, double pr, int min) {
		// TODO Auto-generated constructor stub
		super(des, pr);
		minimumAge = min;
	}
	
	void display() {
		super.display();
		System.out.println("minimum age: " + minimumAge);
	}
	
	public double calculateTax() {
		return price * taxRate;
	}
}
