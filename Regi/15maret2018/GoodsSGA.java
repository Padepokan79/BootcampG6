package progExercises53;

public abstract class GoodsSGA {
	
	// Variable
	private String description;
	private double price;
	private int quantity;

	// Constructor
	public GoodsSGA( String des, double pr, int quant ) {
	    description = des;
	    price       = pr;
	    quantity    = quant;
	}

	// Method
	double getPrice() {
		return price;
	}

	void setPrice( double newPrice) {
		price =  newPrice;
	}

	int getQuantity() {
		return quantity;
	}

	void setQuantity ( int newQuantity ) {
		quantity =  newQuantity;
	}
	       
	public String toString() {
		return "item: " + description + " quantity: " + quantity + " price: " + price;
	}

}
