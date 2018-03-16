package progExercises53;

public class StoreSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodsSGA[] inventory =  new GoodsSGA[10];
//		inventory[0] = new GoodsSGA( "bubble bath", 1.40 );
	    inventory[0] = new ToiletrySG( "bubble bath", 1.40, 1 );
	    inventory[1] = new FoodSG ( "ox tails", 4.45, 2, 1500 );
	    inventory[2] = new BookSG ( "Emma", 24.95, 3, "Austen" );
	    inventory[3] = new ToySG  ( "Leggos", 54.45, 4, 8 );
//	    invnetory[4] = new ToiletrySG ( "bubble bath", 1.40 );

	    ((ToiletrySG)inventory[0]).toString();
	    ((FoodSG)inventory[1]).display();
	    ((BookSG)inventory[2]).display();
	    ((ToySG)inventory[3]).display();

	}

}
