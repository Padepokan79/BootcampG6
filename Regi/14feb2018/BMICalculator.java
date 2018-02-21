import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double tinggiBadanMeter, beratBadanKg, bmi, feet, pound, inches;
		double feetToMeter = 0.3048, poundToKg = 0.453592, inchesToMeter = 0.0254;

		System.out.print( "\nYour height (feet): " );
		feet = keyboard.nextDouble();

		System.out.print( "\nYour height (inches): " );
		inches = keyboard.nextDouble();

		System.out.print( "\nYour weight (pound): " );
		pound = keyboard.nextDouble();

		tinggiBadanMeter = (feet * feetToMeter) + (inches * inchesToMeter);

		beratBadanKg = pound * poundToKg;

		bmi = beratBadanKg / ( tinggiBadanMeter * tinggiBadanMeter );

		System.out.print( "\nBMI anda adalah " + bmi );
	}
}