import java.util.Scanner;

public class ArrayNo8Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int temp=arr1[0];

		System.out.println("\nNo.8 Tampilkan nilai minimum arr1 ");
		System.out.println("============================================================================");
		System.out.println("arr1: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}

		for (int i=0; i<arr1.length ;i++ ) {
			if(arr1[i] < temp){
				temp=arr1[i];
			}
		}

		System.out.print("\nNilai minimum: "+temp);
	}
}