import java.util.Scanner;

public class BooleanExpressions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;

		System.out.print("Give me two numbers. First: ");
		x = keyboard.nextDouble();
		System.out.print("Second: ");
		y = keyboard.nextDouble();

		a = (x < y);
		b = (x <= y);
		c = (x == y);
		d = (x != y);
		e = (x > y);
		f = (x >= y);

		System.out.println(x + " < " + y + ": " + a);
		System.out.println(x + " <= " + y + ": " + b);
		System.out.println(x + " == " + y + ": " + c);
		System.out.println(x + " != " + y + ": " + d);
		System.out.println(x + " > " + y + ": " + e);
		System.out.println(x + " >= " + y + ": " + f);
		System.out.println();

		System.out.println( !(x < y) + " " + (x >= y) );
		System.out.println( !(x <= y) + " " + (x > y) );
		System.out.println( !(x == y) + " " + (x != y) );
		System.out.println( !(x != y) + " " + (x == y) );
		System.out.println( !(x > y) + " " + (x <= y) );
		System.out.println( !(x >= y) + " " + (x < y) );
	}
}