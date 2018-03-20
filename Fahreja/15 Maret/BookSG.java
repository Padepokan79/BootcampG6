
public class BookSG extends GoodsSGA implements Taxable {
	String author;
	
	 BookSG( String description, double price, int quantity, String aut){
	    super(description, price,quantity);
	    author  = aut ;
	  }
	 
	 void display() {
		System.out.println("Book");
		System.out.println(super.toString());
		System.out.println("Author : "+ author);
	 }

	public double calculateTax() {
		return getPrice()*taxRate;
	}
}
