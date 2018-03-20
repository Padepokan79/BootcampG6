package progExercises53;

public class BookSG extends GoodsSGA implements Taxable {
	String author;

	BookSG( String des, double pr, int quant, String auth) {
	    super( des, pr, quant);
	    author  = auth ;
	}

	void display() {
	    super.toString() ;
	    System.out.println( "author: " + author );
	}
	
	public double calculateTax() {
		return getPrice() * taxRate;
	}

}
