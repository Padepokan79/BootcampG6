import java.util.Scanner;

public class BMICalculation{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		double meter, kg, feet, inch, pound, bmi;

		System.out.print("Your height in feet: ");
		feet=keyboard.nextDouble();
		System.out.print("Your height in inch: ");
		inch=keyboard.nextDouble();
		
		meter=(feet*0.3048)+(inch*0.0254);


		System.out.print("Your weight in pounds: ");
		pound= keyboard.nextDouble();
		kg=pound*0.453592;

		bmi=kg/(meter*meter);

		System.out.println("Your BMI is "+bmi);

		System.out.print("\n\nBmi category: ");
		if(bmi < 15.0){
			System.out.println("very severely underweight");
		}
		else if (bmi<16.0){
			System.out.println("severely underweight");
		}
		else if (bmi<18.5){
			System.out.println("underweight");
		}
		else if (bmi<25.0){
			System.out.println("normal weight");
		}
		else if ( bmi < 30.0 ){
			System.out.println("overweight");
		}
		else if (bmi<35.0){
			System.out.println("moderately obese");
		}
		else if(bmi<40.0){
			System.out.println("severely obese");
		}
		else{
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}