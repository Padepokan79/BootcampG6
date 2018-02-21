import java.util.Scanner;
public class BMICalculator{
	public static void main(String []args){
	Scanner keyboard = new Scanner(System.in);
	double feet, feetmeter, in, intom, m, kg, bmi, pon, ponkg;
	ponkg=0.453592;
	feetmeter=0.3048;
	intom=0.0254;

	System.out.print ("Your height in feet: ");
	feet = keyboard.nextDouble();
	
	
	System.out.print("Your height in inches: ");
	in=keyboard.nextDouble();
	

	System.out.print("Your weight in pon: ");
	pon = keyboard.nextDouble();
	kg=pon*ponkg;

	m=(feet*feetmeter)+(in*intom);
	bmi=kg/(m*m);

	System.out.println ("Your BMI is "+bmi);
}
}