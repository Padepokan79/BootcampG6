//Siska Pitriani 23 Februari 2018
import java.util.Scanner;
public class LatihanArray4{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		int inputangka, inputposisi;

		System.out.print ("Masukan angka : ");
		inputangka = keyboard.nextInt();
		System.out.print ("Di posisi ke berapa ? ");
		inputposisi = keyboard.nextInt();

		arr1[inputposisi-1] = inputangka;
		System.out.print ("arr1: ");
		for (int num : arr1) {
			System.out.print (num + " ");
		}

	}
}