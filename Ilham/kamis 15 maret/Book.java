
public class Book extends Goods implements Taxable {
	String author;
	
	public Book(String des, double pr, int quant, String auth) {
		super(des,pr);
		super.setQuantity(quant);
		author = auth;
	}

	public void display() {
		System.out.println(super.toString());
		System.out.println("Authoe: " + author);
	}
	
	public double calculateTax() {
		return super.getPrice() * taxRate;
	}
}
