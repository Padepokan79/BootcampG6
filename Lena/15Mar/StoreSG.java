package exercise53;

public class StoreSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodSG food = new FoodSG("mie ayam", 10000, 1, 500);
		ToySG toy = new ToySG("boneka", 1000000, 1, 3);
		BookSG book = new BookSG("Noragami", 25000, 1, "Adachitoka");
		ToiletrySG toilet = new ToiletrySG("bathbomb", 50000, 1);
				
		food.display();
		toy.display();
		book.display();
		toilet.display();
	}

}
