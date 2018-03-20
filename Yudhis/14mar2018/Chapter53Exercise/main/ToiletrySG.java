package main;

public class ToiletrySG extends GoodsSG {
	
	int stock;
	
	public ToiletrySG(String des, double pr, int st, int quantity) {
		// TODO Auto-generated constructor stub
		super(des, pr, quantity);
		stock = st;
	}
	
	void display() {
		toString();
		System.out.println("stock: " + stock);
	}
	
}
