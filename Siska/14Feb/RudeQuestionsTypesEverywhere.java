public class RudeQuestionsTypesEverywhere{
	public static void main (String[]args){
		keyboard[Scanner]= new Scanner(System.in);

		System.out.print ("HEllo. What is your name ?");
		name [String] = keyboard[Scanner].next();

		System.out.print("Hi, " + name[String] + "! How old are you ?");
		age [int] = keyboard[Scanner].nextInt();

		System.out.println("So you're "+ age[int] + " , eh? That's not so old.");
		System.out.print("How much do you weigh, "+ name[String]+ "?");
		weight[double]= keyboard[Scanner].nextDouble();
		
	}
}