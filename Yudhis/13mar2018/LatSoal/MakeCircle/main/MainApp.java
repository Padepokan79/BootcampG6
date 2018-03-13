package main;

import java.util.Scanner;

public class MainApp extends Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int menu;
		
		do {
			Circle circle = new Circle();
			
			System.out.println("\nSimple Circle.\n");
			System.out.println("1. Default Circle.");
			System.out.println("2. Circle with Radius.");
			System.out.println("3. Circle with Radius and Color.");
			System.out.println("0. Exit for quit program.");
			System.out.print("What's your choice? "); menu = input.nextInt();
			
			if (menu == 1) {
				System.out.println(circle.toString());
				System.out.println("Area " + circle.getArea());
				System.out.println("Circumference " + circle.getCircumference());
			} else if (menu == 2) {	
				System.out.print("Radius? "); circle.setRadius(input.nextDouble());				
				
				circle = new Circle(circle.getRadius()); // Constructor overload
				System.out.println(circle.toString());
				System.out.println("Area " + circle.getArea());
				System.out.println("Circumference " + circle.getCircumference());
			} else if (menu == 3) {
				System.out.print("Radius? "); circle.setRadius(input.nextDouble());
				System.out.print("Color? "); circle.setColor(input.next());
				
				circle = new Circle(circle.getRadius(), circle.getColor()); // Constructor overload
				System.out.println(circle.toString());
				System.out.println("Area " + circle.getArea());
				System.out.println("Circumference " + circle.getCircumference());
			}
		} while (menu != 0);
	}

}
