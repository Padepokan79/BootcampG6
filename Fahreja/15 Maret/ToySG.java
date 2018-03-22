
public class ToySG extends GoodsSGA implements Taxable {
	int minimumAge;
	 ToySG( String description, double price, int quantity, int min){
	    super(description, price,quantity);
	    minimumAge  = min ;
	  }
	 
	 void display() {
		System.out.println("Toy");
		System.out.println(super.toString());
		System.out.println("Minimum Age : "+ minimumAge);
	 }

	public double calculateTax() {
		return getPrice()*taxRate;
	}
}
