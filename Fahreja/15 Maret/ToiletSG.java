
public class ToiletSG extends GoodsSGA implements Taxable {

	 ToiletSG( String description, double price, int quantity){
	    super(description, price,quantity);
	  }
	 
	 void display() {
		 System.out.println("Toilet");
		 System.out.println(super.toString());
	 }

	public double calculateTax() {
		return getPrice()*taxRate;
	}
}
