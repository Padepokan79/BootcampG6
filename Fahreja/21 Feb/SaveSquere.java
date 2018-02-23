import java.util.Scanner;
public class SaveSquere{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x,y;

		System.out.println("Give me a number, and I'll find its square root");
		System.out.print("(No negatives, please)");
		x = keyboard.nextDouble();

		while (x < 0) {
			System.out.println("I won't take the square root of a negatives");
			System.out.println("\nNew number : ");
			x = keyboard.nextDouble();
		}
		y = Math.sqrt(x);
		System.out.println("The square root of " +x+"is "+y);
	}
	
}