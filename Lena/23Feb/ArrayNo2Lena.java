import java.util.Scanner;

public class ArrayNo2Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int angka;
		boolean isfound= false;

		System.out.println("\nNo.2 Apakah suatu bilangan ada di arr1 atau tidak ");
		System.out.println("============================================================================");
		System.out.print("Masukkan sebuah bilangan: ");
		angka=keyboard.nextInt();

		for(int num : arr1){
			if(angka==num){
				System.out.println(angka+" ada pada arr1.");
				isfound=true;
			}
		}
		if(!isfound){
			System.out.println(angka+" tidak ada pada arr1");
		}
	}
}