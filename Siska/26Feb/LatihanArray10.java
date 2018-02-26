//Siska Pitriani 26 Februari 2018
import java.util.Scanner;
public class LatihanArray10{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 18, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		int [] copy = new int [arr1.length];
		

		System.out.print ("Arr1 : ");
		for (int n : arr1) {
			System.out.print (n + " ");
		}

		for (int i = 0; i < arr1.length-1; i++){
			for (int k = i + 1; k < arr1.length; k++){
				if (arr1[i] == arr1[k]){
					copy [i]=arr1[i];
				}	
			}
		}
		System.out.println ();
		System.out.println ("Bilangan yang duplikasi pada arr1: " );
		for (int s : copy) {
			System.out.print (s + " ");
		}
		
	}
}