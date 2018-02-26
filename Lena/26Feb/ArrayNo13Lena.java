import java.util.Scanner;

public class ArrayNo13Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int posisi1,posisi2,temp;

		System.out.println("\nNo.13 Tukar nilai antara dua posisi pada arr1 ");
		System.out.println("============================================================================");
		System.out.println("arr1 before: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}

		System.out.print("\nMasukkan posisi pertama yang akan ditukar: ");
		posisi1=keyboard.nextInt();
		System.out.print("Masukkan posisi kedua yang akan ditukar: ");
		posisi2=keyboard.nextInt();

		if(posisi1<=arr1.length && posisi2<=arr1.length){
			temp = arr1[posisi1-1];
			arr1[posisi1-1] = arr1[posisi2-1];
			arr1[posisi2-1] = temp;

			System.out.println("arr1 after: ");
			for(int num : arr1){
				System.out.print(num+"  ");
			}
		}else{
			System.out.println("posisi yang diinput melebihi panjang arr1");
		}
	}
}