import java.util.Scanner;

public class OctopusLena{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);

		int i;
		String input;

		System.out.print("Enter a string: ");
		input=keyboard.next();

		for(i=0;i<input.length();i++){
			System.out.println(input.substring(i,i+1));
		}
	}
}