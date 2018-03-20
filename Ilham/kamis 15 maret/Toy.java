
public class Toy extends Goods implements Taxable {
	int minimumAge;
	
	public Toy(String des, double pr, int quant, int min) {
		super(des,pr);
		super.setQuantity(quant);
		minimumAge = min;
	}

	public void display() {
		System.out.println(super.toString());
		System.out.println("Minimum Age: " + minimumAge);
	}
	
	public double calculateTax() {
		return super.getPrice() * taxRate;
	}
}
