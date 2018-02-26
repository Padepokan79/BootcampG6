import java.util.Scanner;

public class ArrayNo11Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int[] arrTemp = new int[10];
		int index = 0; 
		boolean isfound= false;

		System.out.println("\nNo.11 Tampilkan bilangan2 yang sama2 ada di arr1 dan arr3 ");
		System.out.println("============================================================================");
		System.out.println("arr1: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}
		System.out.println("\narr3: ");
		for(int num : arr3){
			System.out.print(num+"  ");
		}

		System.out.print("\n\nBilangan yang sama: ");
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr3.length; j++){
				if(arr1[i] == arr3[j]){
					System.out.print(arr1[i]+" ");
					index++;
					isfound=true;
				}
			}
		}
		if(!isfound){
			System.out.println(" bilangan tidak ada yang sama");
		}

	}
}