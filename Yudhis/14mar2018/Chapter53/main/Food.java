package main;

public class Food extends Goods {
	double calories;
	
	public Food(String des, double pr, double cal) {
		// TODO Auto-generated constructor stub
		super(des, pr);
		calories = cal;
	}
	
	void display() {
		super.display();
		System.out.println("calories: " + calories);
	}
}
