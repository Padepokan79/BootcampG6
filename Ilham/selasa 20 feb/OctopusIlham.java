import java.util.Scanner;

public class OctopusIlham{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int indexBegin, indexEnd;
		String input;

		System.out.println("Enter a String: ");
		input = keyboard.next();

		for (indexBegin = 0; indexBegin < input.length(); indexBegin++) {
			indexEnd = indexBegin + 1;
			System.out.println(input.substring(indexBegin,indexEnd));
		}

	}
}