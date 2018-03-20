package main;

public class FoodSG extends GoodsSG {
	double calories;
	
	public FoodSG(String des, double pr, double cal, int quantity) {
		// TODO Auto-generated constructor stub
		super(des, pr, quantity);
		calories = cal;
	}
	
	void display() {
		toString();
		System.out.println("calories: " + calories);
	}
	
}
