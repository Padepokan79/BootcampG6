import java.util.Scanner;

public class OctopusSiska{
	public static void main (String []args){
	Scanner keyboard = new Scanner (System.in);
	String inp;
	int awal, akhir;
		
	System.out.print ("Enter a string: ");
	inp = keyboard.next();

	for (awal = 0; awal < inp.length();  awal++){
		akhir = awal + 1; 
		System.out.println (inp.substring(awal, akhir) );
	}
	}
}