import java.util.Scanner;

public class BMICategories{
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

		System.out.print("BMI Category : ");
		if (bmi < 15.0) {
			System.out.println("very severely underweight");
		} else if (bmi <= 16.0) {
			System.out.println("severely underweight");
		} else if (bmi < 18.5) {
			System.out.println("underweight");
		} else if (bmi < 25.0) {
			System.out.println("normal weight");
		} else if (bmi < 30.0) {
			System.out.println("overweight");
		} else if (bmi < 35.0) {
			System.out.println("moderately obese");
		} else if (bmi < 40.0) {
			System.out.println("severely obese");
		} else {
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}