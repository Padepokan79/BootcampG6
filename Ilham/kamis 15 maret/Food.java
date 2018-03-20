
public class Food extends Goods {
	double calories;
	
	public Food(String des, double pr, int quant, double cal) {
		super(des,pr);
		super.setQuantity(quant);
		calories = cal;
	}
	
	public void display() {
		System.out.println(super.toString());
		System.out.println("Calories: " + calories);
	}
}
