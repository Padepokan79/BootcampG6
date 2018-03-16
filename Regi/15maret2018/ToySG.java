package progExercises53;

public class ToySG extends GoodsSGA implements Taxable {
	int minimumAge;

	ToySG( String des, double pr, int quant, int min) {
		super( des, pr, quant );
	    minimumAge  = min ;
	}

	void display() {
	    super.toString() ;
	    System.out.println( "minimum age: " + minimumAge );
	}
	
	public double calculateTax() {
		return getPrice() * taxRate;
	}

}
