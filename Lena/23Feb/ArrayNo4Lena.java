import java.util.Scanner;

public class ArrayNo4Lena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int angka,posisi;
		boolean isfound= false;

		System.out.println("\nNo.4 Terima nilai dan ubah untuk suatu posisi pada arr1 ");
		System.out.println("============================================================================");
		System.out.println("arr1 before: ");
		for(int num : arr1){
			System.out.print(num+"  ");
		}

		System.out.print("\nMasukkan sebuah bilangan: ");
		angka=keyboard.nextInt();
		System.out.print("Masukkan posisi yang akan diubah: ");
		posisi=keyboard.nextInt();

		if(posisi<arr1.length){
			for (int i=0; i<arr1.length ;i++ ) {
				if((posisi-1)==i){
					arr1[i]=angka;
				}
			}
			System.out.println("arr1 after: ");
			for(int num : arr1){
				System.out.print(num+"  ");
			}
		}else{
			System.out.println("posisi yang diinput melebihi panjang arr1");
		}
	}
}