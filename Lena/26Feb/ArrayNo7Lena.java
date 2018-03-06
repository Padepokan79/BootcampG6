import java.util.Scanner;

public class ArrayNo7Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];

		System.out.println("\nNo.7 Copy isi arr1 ke arr2 ");
		System.out.println("============================================================================");
		System.out.println("arr1: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}

		arr2=arr1;

		System.out.println("\n\narr2: ");
		for(int num : arr2){
			System.out.print(num+"  ");
		}
		
	}
}