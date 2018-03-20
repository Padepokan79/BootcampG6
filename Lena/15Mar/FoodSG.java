package exercise53;

public class FoodSG extends GoodsSGA{
	private double calories;
	
	public FoodSG() {
		// TODO Auto-generated constructor stub
	}
	
	FoodSG(String des, double pr, int quant, double cal){
		super(des, pr, quant);
		calories = cal; 
	}
	
	@Override
	public String toString() {
		return super.toString()+" Calories: "+calories;
	}
	
	public void display() {
		System.out.println(toString());
	}
}
