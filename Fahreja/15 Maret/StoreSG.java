import java.util.Scanner;
public class StoreSG {
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner(System.in);
		FoodSG food = new FoodSG ( "ox tails", 4.45, 8, 1500 );
		BookSG  book = new BookSG ( "Emma", 24.95,7, "Austen" );
	    ToySG   toy = new ToySG  ( "Legos", 54.45,7, 8 );
	    ToiletSG toilet = new ToiletSG("bubble bath", 1.40, 9);
	    int pilih;
	    
		food.display();
		book.display();
		toy.display();
		toilet.display();
		System.out.println("");
		System.out.println("Change Price or Quality (1.Yes/2.No)?");
		pilih = nilai.nextInt();
			
			if (pilih == 1) {
				System.out.println("1. Food");
				System.out.println("2. Book");
				System.out.println("3. Toys");
				System.out.println("4. Toilet");
				System.out.print(">");
				pilih = nilai.nextInt();
				
					if (pilih == 1) {
						food.display();
						System.out.println("New Price : ");
						food.setPrice(nilai.nextDouble());
						System.out.println("New Quantity :");
						food.setQuantity(nilai.nextInt());
					}else if (pilih == 2) {
						book.display();
						System.out.println("New Price : ");
						book.setPrice(nilai.nextDouble());
						System.out.println("New Quantity :");
						book.setQuantity(nilai.nextInt());
					}else if (pilih == 3) {
						toy.display();
						System.out.println("New Price : ");
						toy.setPrice(nilai.nextDouble());
						System.out.println("New Quantity :");
						toy.setQuantity(nilai.nextInt());
					}else if (pilih == 4) {
						toilet.display();
						System.out.println("New Price : ");
						toilet.setPrice(nilai.nextDouble());
						System.out.println("New Quantity :");
						toilet.setQuantity(nilai.nextInt());
					}
			}else{
				System.out.println("Everything Same");
			}
			
			food.display();
			book.display();
			System.out.println("Tax is : "+ book.calculateTax());
			toy.display();
			System.out.println("Tax is : "+ toy.calculateTax());
			toilet.display();
			System.out.println("Tax is : "+ toilet.calculateTax());
	}
}
