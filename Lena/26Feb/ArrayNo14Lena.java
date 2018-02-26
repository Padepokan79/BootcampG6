import java.util.Scanner;
//import java.util.Arrays;

public class ArrayNo14Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int[] arrTemp = new int[10];
		int temp;

		System.out.println("\nNo.14 Mengurutkan nilai pada arr1 ");
		System.out.println("============================================================================");
		System.out.println("arr1 before: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}

		//Arrays.sort(arr1);

		for(int i=0; i<arr1.length; i++){
			for(int j=arr1.length-1; j>i;j--){
				if(arr1[j]<arr1[j-1]){
					temp=arr1[j];
					arr1[j]=arr1[j-1];
					arr1[j-1]=temp;
				}
			}
		}

		System.out.println("\narr1 after: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}
	}
}