import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double feet, inches, pound, tinggiBadanMeter, beratBadanKg, bmi ;
		double feetToMeter = 0.3048, poundToKg = 0.453592, inchesToMeter = 0.0254;

		// Inputan
		System.out.print( "\nYour height (feet): " );
		feet = keyboard.nextDouble();

		System.out.print( "\nYour height (inches): " );
		inches = keyboard.nextDouble();

		System.out.print( "\nYour weight (pound): " );
		pound = keyboard.nextDouble();

		// Proses Hitung BMI
		tinggiBadanMeter = (feet * feetToMeter) + (inches * inchesToMeter);
		beratBadanKg = pound * poundToKg;
		bmi = beratBadanKg / ( tinggiBadanMeter * tinggiBadanMeter );

		// Hasil Hitung BMI
		System.out.println( "\nBMI anda adalah: " + bmi );

		// Kategori BMI
		System.out.print( "\nBMI category: " );

		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi < 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}