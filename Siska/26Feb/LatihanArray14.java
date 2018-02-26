//Siska Pitriani 26 Februari 2018
import java.util.Scanner;
public class LatihanArray14{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		int temp=arr1[0];

		System.out.print ("Arr1 : ");
		for (int n : arr1) {
			System.out.print (n + " ");
		}

		for (int i = 0; i < arr1.length; i++){
			for (int k = arr1.length-1; k > i; k--){
				if (arr1[k] < arr1[k-1]){
					temp = arr1[k];

					arr1[k]=arr1[k-1];
					arr1[k-1]=temp;
				}
			}
		}
		System.out.print ("Arr1 diurutkan: ");
		for (int n : arr1) {
			System.out.print (n + " ");
		}
	}
}