import java.util.Scanner;

public class MakeCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle c1= new Circle();
		int nilai=1;
		
		
		while (nilai!=0) {
			
		System.out.println("1. Default Circle.");
		System.out.println("2. Circle with Radius.");
		System.out.println("3. Circle with Radius and Color.");
		System.out.println("Exit for quit program.");
		System.out.println("What your Choices?"); nilai = input.nextInt();
		
		 
			
		if (nilai==1) {
			System.out.println(c1.toStringSatu());
		}
		else if (nilai==2) {
			System.out.println("Insert a number of radius: "); c1.setRadius(input.nextInt());
			System.out.println(c1.toStringDua());
		}
		else if (nilai==3) {
			System.out.println("Insert a number of radius: "); c1.setRadius(input.nextInt());
			System.out.println("Insert a color:"); c1.setColor(input.next());
			System.out.println(c1.toStringTiga());
		}

	}
}
}
