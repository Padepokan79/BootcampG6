import java.util.Scanner;

public class BMICalculator{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, pounds;
		int inches, feet;

		System.out.print("Your height in inches: "); inches = keyboard.nextInt();
		
		System.out.println("Your height (feet only): " + (inches / 12));

		System.out.println("Your height (inches): " + (inches % 12));

		System.out.print("Your weight in pounds: "); pounds = keyboard.nextDouble();
		kg = pounds * 0.453592;

		m = inches * 0.0254;
		bmi = kg/(m*m);

		System.out.println("Your BMI is " + bmi);
	}
}