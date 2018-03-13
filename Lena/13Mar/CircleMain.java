package simpleCircle;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double radius;
		String color;
		int menu = 1;
		
		while(menu!=0) {
			System.out.println("Simple Circle\n1.Default Circle\n2.Circle with Radius\n3.Circle with Radius and Color\n0.Exit\nWhat's your choice?");
			menu=scan.nextInt();
			
			if(menu == 1) {
				Circle circle = new Circle();
				System.out.println(circle.toString());
			}
			else if(menu == 2) {
				System.out.print("Input Radius: ");
				radius= scan.nextDouble();
				
				Circle circle = new Circle(radius);
				System.out.println(circle.toString());
			}
			else if(menu == 3) {
				System.out.print("Input Radius: ");
				radius = scan.nextDouble();
				System.out.print("Input Color: ");
				color = scan.next();
				
				Circle circle = new Circle(radius, color);
				System.out.println(circle.toString());
			}
			else if(menu == 0) {}
			else {
				System.out.println("Inputan anda salah");
			}
		}
	}

}
