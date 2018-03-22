package progExercises53;

public class ToiletrySG extends GoodsSGA implements Taxable {
	int minimumAge;

	ToiletrySG( String des, double pr, int quant) {
	    super( des, pr, quant );
	}

	void display() {
	    super.toString() ;
	}
	
	public double calculateTax() {
		return getPrice() * taxRate;
	}

}
