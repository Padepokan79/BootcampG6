import java.util.Scanner;

public class AyahSiska{
	public static void main (String[]args){
	Scanner keyboard = new Scanner (System.in);
	int age, selisihtambah, selisihkurang, umurAnak;
	double income, cute;
	boolean allowed;

	umurAnak = 21;
	selisihtambah = umurAnak + 5;
	selisihkurang = umurAnak - 5;

	System.out.println ("Enter your age: ");
	age = keyboard.nextInt();

	System.out.println ("Enter your yearly income: ");
	income = keyboard.nextDouble();

	System.out.print ("How cute are you, on a scale from 0.0 to 10.0? ");
	cute = keyboard.nextDouble();


	// umurAnak = 21;
	allowed = ( age >= selisihkurang  &&  age <= selisihtambah  && (income > 5000000 || (cute >= 8)));

	System.out.print ("Allowed to date my girl ? " + allowed);
	} 
}