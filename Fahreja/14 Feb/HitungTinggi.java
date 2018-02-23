import java.util.Scanner;
public class HitungTinggi{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		double tinggiBadanM, convert;
		double feetToMeter = 0.3048, incToMeter = 0.0254;			
		System.out.print("Your height in meter :");
		tinggiBadanM=keyboard.nextDouble();

		convert = (tinggiBadanM*100)%feetToMeter;

		System.out.println("Your BMI is "+convert);
	}
}