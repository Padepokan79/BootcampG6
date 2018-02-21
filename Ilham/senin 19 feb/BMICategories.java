import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double tinggiBadanFeet, tinggiBadanInch, tinggiBadanMeter, beratBadanPound, beratBadanKg, bmi;
		double feetToMeter = 0.3048, inchToMeter = 0.0254, poundToKg = 0.453592;

		System.out.print("Masukkan tinggi badan anda (Feet only): ");
		tinggiBadanFeet = keyboard.nextDouble();
		System.out.print("Masukkan tinggi badan anda (Inch): ");
		tinggiBadanInch = keyboard.nextDouble();

		System.out.print("Masukkan berat badan anda (Pound): ");
		beratBadanPound = keyboard.nextDouble();

		tinggiBadanMeter = (tinggiBadanFeet * feetToMeter) + (tinggiBadanInch * inchToMeter);
		beratBadanKg = beratBadanPound * poundToKg;

		bmi = beratBadanKg / (tinggiBadanMeter*tinggiBadanMeter);

		System.out.print("BMI category (" + bmi + ") : ");
		if (bmi < 15.0) {
			System.out.println("very severely underweight");
		} 
		else if (bmi <= 16.0) {
			System.out.println("severely underweight");
		} 
		else if (bmi < 18.5) {
			System.out.println("underweight");			
		}
		else if (bmi < 25.0) {
			System.out.println("normal underweight");
		}
		else if (bmi < 30.0) {
			System.out.println("overweight");
		}
		else if (bmi < 35.0) {
			System.out.println("moderately obese");
		}
		else if (bmi < 40.0) {
			System.out.println("severely obeses");
		}
		else {
			System.out.println("very suverely/\"morbidly\" obese");
		}
	}
}