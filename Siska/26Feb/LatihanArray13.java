//Siska Pitriani 26 Februari 2018
import java.util.Scanner;
public class LatihanArray13{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		int cari, cari2, temp=0;


		System.out.print ("Arr1: ");
		for (int num : arr1) {
			System.out.print (num + " ");
		}
		System.out.println();

		System.out.println("\nPosisi yang akan ditukar : ");
		cari = keyboard.nextInt();
		System.out.println("dengan yang : ");
		cari2 = keyboard.nextInt();

		temp = arr1[cari-1];
		arr1[cari-1] = arr1[cari2-1];
		arr1[cari2-1] = temp;

		System.out.print ("\nArr1 setelah ditukar : ");
		for (int u : arr1) {
			System.out.print (u + " ");
		}

	}
}