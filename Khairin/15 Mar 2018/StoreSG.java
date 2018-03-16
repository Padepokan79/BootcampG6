
	public class StoreSG {
	  public static void main ( String[] args )
	  {
	    Goods[] inventory =  new Goods[10];
	    inventory[0] = new Goods( "bubble bath", 1.40 );
	    inventory[1] = new Food ( "ox tails", 4.45, 1500 );
	    inventory[2] = new Book ( "Emma", 24.95, "Austen" );
	    inventory[3] = new Toy  ( "Leggos", 54.45, 8 );

	    inventory[0].display();
	    inventory[1].display();
	    inventory[2].display();
	    inventory[3].display();
	  }
	}

}
