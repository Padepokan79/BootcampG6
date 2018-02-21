import java.util.Scanner;

public class OctopusIrin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int x=0, y;
		String write;

		System.out.println( "Enter a text");
		write = keyboard.next();

		for ( y = 1; y <= write.length(); y++) {
			System.out.println(write.substring(x,y));
			x++;
		}
	}
}