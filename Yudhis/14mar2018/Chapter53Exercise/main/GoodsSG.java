package main;

public abstract class GoodsSG {
	private String description;
	private double price;
	private int quantity;
	
	public GoodsSG(String des, double pr, int quant) {
		// TODO Auto-generated constructor stub
		description = des;
		price = pr;
		quantity = quant;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString () {
		return "item: " + description + " quantity: " + quantity + " price: " + price;
	}
}
