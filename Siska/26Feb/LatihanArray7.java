//Siska Pitriani 26 Februari 2018
import java.util.Scanner;
public class LatihanArray7{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];

		System.out.print ("Arr1 : ");
		for (int n : arr1) {
			System.out.print (n + " ");
		}

		System.out.println ();
		
		arr2=arr1;
		System.out.print ("Arr2 : ");
		for (int num : arr2) {
			System.out.print (num + " ");
		}
	}
}