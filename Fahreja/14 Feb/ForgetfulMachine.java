import java.util.Scanner;

public class ForgetfulMachine{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What city is the capital of France?");
		keyboard.next();

		System.out.println("What is 6 multiplied of 7?");
		keyboard.nextInt();

		System.out.println("Enter a nummber between 0.0 and 1.0.");
		keyboard.nextDouble();

		System.out.println("Is the anything else you would like to say ?");
		keyboard.next();
	}
}