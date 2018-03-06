import java.util.Scanner;

public class ArrayNo10Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,77};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int temp,jumlah=0;
		boolean isfound= false;

		System.out.println("\nNo.10 Tampilkan bilangan2 yang duplikasi pada arr1 ");
		System.out.println("============================================================================");
		System.out.println("arr1: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}

		System.out.print("\n\nBilangan yang duplikat: ");
		for(int i=0; i<arr1.length; i++){
			for(int j=i+1; j<arr1.length; j++){
				if(arr1[i] == arr1[j]){
					System.out.print(arr1[i] +" "+ arr1[j] + " ");
					isfound=true;
				}
			}
		}
		if(!isfound){
			System.out.println(" bilangan tidak ada yang duplikat");
		}

	}
}