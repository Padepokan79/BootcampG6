//Siska Pitriani 26 Februari 2018
import java.util.Scanner;
public class LatihanArray6{
	public static void main (String[]args){
		Scanner keyboard = new Scanner (System.in);
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int [10];
		int [] arr3 = {2, 39, 47, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int [10];
		int [] temp = new int [arr1.length + 1];
		int inputangka, inputposisi;
		int index = 0;

		System.out.print ("Masukan angka yang disisipkan : ");
		inputangka = keyboard.nextInt();
		System.out.print ("Di posisi ke berapa ? ");
		inputposisi = keyboard.nextInt();

		for (int i=0; i < arr1.length ; i ++){
			if ((inputposisi-1) == i ){
				temp [index] = inputangka; 
				index++;
			}

			temp [index]= arr1[i];
			index ++;

		}
		arr1 = temp;
		System.out.print ("arr1: ");
		for (int num : arr1) {
			System.out.print (num + " ");
		}

	}
}