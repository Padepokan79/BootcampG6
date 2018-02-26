import java.util.Scanner;

public class ArrayNo12Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int[] arrTemp = new int[arr1.length + 1];
		int angka,posisi,index=0;

		System.out.println("\nNo.12 Jumlahkan elemen arr1 dan arr3 simpan pada arr4 ");
		System.out.println("============================================================================");
		System.out.println("arr1: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}
		System.out.println("\narr3: ");
		for(int num : arr3){
			System.out.print(num+"  ");
		}

		for (int i=0; i<arr1.length ;i++ ) {
			for(int j=0; j<arr3.length; j++){
				arr4[i] = arr1[i]+arr3[i];
			}
		}

		System.out.println("\n\narr4: ");
		for(int num : arr4){
			System.out.print(num+"  ");
		}
	}
}