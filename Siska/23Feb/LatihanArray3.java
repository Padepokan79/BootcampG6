//Siska Pitriani 23 Februari 2018
import java.util.Scanner;
public class LatihanArray3{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		int cari, posisi=0;

		
		System.out.println ("Ayo kita cari posisi ");

		System.out.print ("Orders: ");
		for (int num : arr1) {
			System.out.print (num + " ");
		}
		System.out.println();

		System.out.print("Which order to find? ");
		cari = keyboard.nextInt();

		for (int num : arr1){
			if (num == cari){
				System.out.println ();
				System.out.println (num + "[" + posisi +"]" );
			}
			posisi ++;
		}
	}
}