
public class FoodSG extends GoodsSGA {
	double calories;
	
	FoodSG (String description, double price, int quantity, double calories){
		super (description,price,quantity);
		this.calories = calories;
	}
	void display() {
		System.out.println("Food");
		System.out.println(super.toString());
		System.out.println("Calories : "+ calories);
	}
}
