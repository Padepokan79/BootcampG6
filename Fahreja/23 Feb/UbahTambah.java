import java.util.Scanner;

public class UbahTambah{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1={ 25,14,56,15,36,56,77,18,29,49 };
		int nilai,index;
		String kunci;

		for (int angka : arr1 ) {
			System.out.print(angka + " ");
		}
		System.out.println();
		System.out.print("Masukan nilai baru : ");
		nilai = keyboard.nextInt();
		System.out.print("Masukan uruatan (1-10) : ");
		index = keyboard.nextInt();

		arr1[index-1] = nilai;

		System.out.println("array setelah dirubah");
		for (int angka : arr1 ) {
			System.out.print(angka + " ");
		}
		
	}
	
}