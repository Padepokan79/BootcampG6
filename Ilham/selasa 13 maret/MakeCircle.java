import java.util.Scanner;

public class MakeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Circle circle = new Circle();
		
		String pilih, color;
		double radius;

		System.out.println("Make Circle");
		do {
			System.out.println();
			System.out.println("Simple Circle.");
			System.out.println("1. Default Circle.");
			System.out.println("2. Circle with Radius.");
			System.out.println("3. Circle with Radius and Color");
			System.out.println("Exit for quit program");
			System.out.println();
			System.out.println("What Your Choices?");
			pilih = input.nextLine();
			
			if (pilih.equalsIgnoreCase("1")) {
				circle = new Circle();
			} else if (pilih.equalsIgnoreCase("2")){
				System.out.println("Input Radius: ");
				radius = input.nextDouble();
				input.nextLine();
				circle = new Circle(radius);
			} else if (pilih.equalsIgnoreCase("3")){
				System.out.println("Input Radius: ");
				radius = input.nextDouble();
				input.nextLine();
				System.out.println("Input Color: ");
				color = input.nextLine();
				circle = new Circle(radius, color);
			}
			if (!pilih.equalsIgnoreCase("exit")) {
				System.out.println(circle);
				System.out.println("Area : " + circle.getArea());
				System.out.println("Circumference : " + circle.getCircumference());
			
			}			
			
		} while(!pilih.equalsIgnoreCase("exit"));
		
	}

}
