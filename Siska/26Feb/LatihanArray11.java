//Siska Pitriani 26 Februari 2018
import java.util.Scanner;
public class LatihanArray11{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		int [] copy = new int [arr1.length];
		
		System.out.println ("Arr1 : ");
		for (int n : arr1) {
			System.out.print (n + " ");
		}

		System.out.println ("\nArr3 : ");
		for (int p : arr3) {
			System.out.print (p + " ");
		}

		for (int i = 0; i < arr1.length-1; i++){
			for (int m = 0; m < arr3.length-1; m++){
				if (arr1[i] == arr3[m]) {
					copy[i]=arr1[i];
				}	
			}
		}
		System.out.println ();

		System.out.print ("Bilangan yang sama pada arr1 dan arr3: " );
		for (int o : copy) {
			System.out.print (o + " ");
		}
	}
}