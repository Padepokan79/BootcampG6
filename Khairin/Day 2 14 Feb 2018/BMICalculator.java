import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, feet, inch, pound, bmi;
		double feetToMeter = 0.3048, poundToKg = 0.4523, inchToMeter = 0.0254;


		System.out.print( "Your height in feet: " );
		feet = keyboard.nextDouble();

		System.out.print( "Your height in inches: " );
		inch = keyboard.nextDouble();

		System.out.print( "Your weight in pound: " );
		pound = keyboard.nextDouble();

		m = (feet*feetToMeter) + (inch*inchToMeter);

		kg = pound*poundToKg;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}