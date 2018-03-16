import java.util.Scanner;
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String pilih;
		
		do {
			System.out.println("\n===============================+");
			System.out.println("Make Circle");
			System.out.println("\nSimple Circle.");
			System.out.println("1. Default Circle.");
			System.out.println("2. Circle with Radius.");
			System.out.println("3. Circle with Radius and Color.");
			System.out.println("Exit for quit program.");
			
			System.out.println("\nWhat Your Choices?");
			pilih = keyboard.next();
			
			if(pilih.equalsIgnoreCase("1")) {
				Circle circle1 = new Circle();
				
				circle1.getArea();
				circle1.getCircumference();
				
				System.out.println(circle1);
			}
			else if (pilih.equalsIgnoreCase("2")) {
				Circle circle2 = new Circle();
				
				System.out.println("\nInput Your Radius:");
				circle2.setRadius(keyboard.nextDouble());
				
				circle2.getArea();
				circle2.getCircumference();
				
				System.out.println(circle2);
			}
			else if (pilih.equalsIgnoreCase("3")) {
				Circle circle3 = new Circle();
				
				System.out.println("\nInput Your Radius:");
				circle3.setRadius(keyboard.nextDouble());
				System.out.println("Input Your Color:");
				circle3.setColor(keyboard.next());
				
				circle3.getArea();
				circle3.getCircumference();
				
				System.out.println(circle3);
			}
		} while (!(pilih.equalsIgnoreCase("exit")));
	}
}
