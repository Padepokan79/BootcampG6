import java.util.Scanner;

//ERROR CHECKING

public class SafeSquareRootIrin {
	public static void main( String[] args ) {
		Scanner keybooard = new Scanner(System.in);
		double x, y;

		System.out.print("Give me a number, and I'll find its square root. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();

		while ( x < 0 ) {
			System.out.println("I won't take the square root of aa negative.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The square root of "+x+" is " +y);
	}
}