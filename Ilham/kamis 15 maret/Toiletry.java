
public class Toiletry extends Goods implements Taxable {
	public Toiletry(String des, double pr, int quant) {
		super(des,pr);
		super.setQuantity(quant);
	}

	public void display() {
		System.out.println(super.toString());
	}
	
	public double calculateTax() {
		return super.getPrice() * taxRate;
	}
}
