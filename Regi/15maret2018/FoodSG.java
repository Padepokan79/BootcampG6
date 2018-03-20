package progExercises53;

public class FoodSG extends GoodsSGA {
	double calories;

	FoodSG( String des, double pr, int quant, double cal ) {
		super( des, pr, quant);
		calories = cal ;
	}

	void display() {
		super.toString( );
		System.out.println( "calories: " + calories );
	}

}
