
public class Food extends GoodsSGA{
	  double calories;

	  Food( String des, double pr, double cal)
	  {
	    super( des, pr );
	    calories = cal ;
	  }

	  void display()
	  {
	    super.display( );
	    System.out.println( "calories: " + calories );
	  }
	}