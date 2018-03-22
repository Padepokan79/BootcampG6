package main;

public class StoreArraySG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsSG[] inventory =  new GoodsSG[10];
	    inventory[0] = new ToiletrySG("bubble bath", 1.40, 10, 11);
	    inventory[1] = new FoodSG("fox tails", 4.45, 1500, 20);
	    inventory[2] = new BookSG("Emma", 24.95, "Austen", 15);
	    inventory[3] = new ToySG("Leggos", 54.45, 8, 4);

	    System.out.println(inventory[0].toString());
	    System.out.println(inventory[1].toString());
	    System.out.println(inventory[2].toString());
	    System.out.println(inventory[3].toString());	
	}

}
