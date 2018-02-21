import java.util.Scanner;

public class BMICalculator {
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

		tinggiBadanMeter = (tinggiBadanFeet * feetToMeter) + (tinggiBadanInch * inchToMeter
			);
		beratBadanKg = beratBadanPound * poundToKg;

		bmi = beratBadanKg / (tinggiBadanMeter*tinggiBadanMeter);

		System.out.println("BMI anda adalah : " + bmi);

		// 1 feet = 0.3048 meter
		// 1 inch = 0.0254 meter
		// 1 pound = 0.453592 kg

	}
}