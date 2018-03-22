package exercise53;

public abstract class GoodsSGA {
	private String description;
	private double price;
	private int quantity;
	
	public GoodsSGA() {
		// TODO Auto-generated constructor stub
	}
	GoodsSGA( String des, double pr, int quant ){
		description = des;
		price       = pr;
		quantity    = quant;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "item: "+description+" quantity: "+quantity+" price: "+price;
	}
	
	
}
