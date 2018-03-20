
public abstract class Goods {
	private String description;
	private double price;
	private int quantity;
	
	Goods (String des, double pr) {
		description = des;
		price = pr;
	}
	
	double getPrice() {
		return price;
	}
	
	void setPrice(double newPrice) {
		price = newPrice;
	}
	
	int getQuantity() {
		return quantity;
	}
	void setQuantity (int newQuantity) {
		quantity = newQuantity;
	}
	
	public String toString() {
		return "Item: " + description + " quantity: " + quantity + " price: " + price;
		}	
}
