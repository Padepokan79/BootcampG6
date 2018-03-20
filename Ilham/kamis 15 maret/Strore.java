
public class Strore {

	public static void main(String[] args) {
		Toiletry tl = new Toiletry("bubble bath", 1.40, 7);
		Food fd = new Food("ox tails", 4.45, 8, 1500);
		Book bk = new Book("Emma", 24.95, 7, "Austen");
		Toy ty = new Toy("legos", 54.45, 8, 8);
		
		tl.display();
		
		fd.display();
		
		ty.display();
		System.out.println("Tax is: " + ty.calculateTax() + "\n");
		
		bk.display();
		System.out.println("Tax is: " + bk.calculateTax() + "\n");
	}

}
