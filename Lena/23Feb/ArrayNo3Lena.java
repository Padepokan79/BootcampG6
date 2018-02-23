import java.util.Scanner;

public class ArrayNo3Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int angka;
		boolean isfound= false;

		System.out.println("\nNo.3 Suatu bilangan ada di posisi / index ke berapa di arr1 ");
		System.out.println("============================================================================");
		System.out.print("Masukkan sebuah bilangan: ");
		angka=keyboard.nextInt();

		for(int i=0; i< arr1.length; i++){
			if(angka == arr1[i]){
				System.out.println(angka+" ada di index "+i);
				isfound=true;
			}
		}
		if(!isfound){
			System.out.println(angka+" tidak ada pada arr1");
		}
	}
}