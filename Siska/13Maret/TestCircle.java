import java.util.Scanner;
public class TestCircle {

	public static void main (String[]args) {
		Scanner keyboard = new Scanner (System.in);
		MakeCircle circle1 = new MakeCircle();
		MakeCircle circle2 = new MakeCircle();
		MakeCircle circle3 = new MakeCircle();
		
		double radius;
		String color, pilihan;
		
		System.out.println("Simple Circle");
		System.out.println();
		
		
		do {
		System.out.println();
		System.out.println();
		System.out.println("1. Default Circle");
		System.out.println("2. Circle with Radius");
		System.out.println("3. Circle with Radius and Color");
		System.out.println("Exit for quit program.");
		System.out.println();
		System.out.println("What your choices?");
		pilihan = keyboard.next();
		System.out.println();
		
			if (pilihan.equalsIgnoreCase ("1") ) {
				System.out.println("Your Circle is color " + circle1.getcolor() + " with Radius " + circle1.getradius());
				System.out.println("Area " + circle1.getarea());
				System.out.println("Circumference " + circle1.getcircumference());
			}
			else if (pilihan.equalsIgnoreCase("2")) {
				System.out.println("Masukan radius :" );
				radius = keyboard.nextDouble();
				circle2.setradius(radius);
				System.out.println("Your Circle is color " + circle2.getcolor() + " with Radius " + circle2.getradius());
				System.out.println("Area " + circle2.getarea());
				System.out.println("Circumference " + circle2.getcircumference());
			}
			else if (pilihan.equalsIgnoreCase("3")) {
				System.out.println("Masukan radius :" );
				radius = keyboard.nextDouble();
				circle3.setradius(radius);
				System.out.println("Masukan color :" );
				color = keyboard.next();
				circle3.setcolor(color);
				System.out.println("Your Circle is color " + circle3.getcolor() + " with Radius " + circle3.getradius());
				System.out.println("Area " + circle3.getarea());
				System.out.println("Circumference " + circle3.getcircumference());
				}
		}
		while (!(pilihan.equalsIgnoreCase("exit")));
	}
	
}
