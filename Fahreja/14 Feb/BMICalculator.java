import java.util.Scanner;
public class BMICalculator{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		double beratBadanKg, bmi, tinggiBadanM, feet, inch, pound;
		double feetToMeter = 0.3048, incToMeter = 0.0254,poundToKg = 0.453592; 
			
		System.out.print("Your height in feet :");
		feet=keyboard.nextDouble();

		System.out.print("Your height in inch :");
		inch=keyboard.nextDouble();

		System.out.print("Your weight in pounds :");
		pound=keyboard.nextDouble();

		tinggiBadanM = (feet*feetToMeter)+(inch*incToMeter);
		beratBadanKg = pound*poundToKg;

		bmi = beratBadanKg / (tinggiBadanM*tinggiBadanM);

		System.out.println("Your BMI is "+bmi);
	}
}