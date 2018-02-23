import java.util.Scanner;

public class AdaTidak{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1={ 25,14,56,15,36,56,77,18,29,49 };
		int cari, index;
		String kunci;

		for (int angka : arr1) {
			System.out.print(angka+ " ");
		}

		System.out.println();

		System.out.print("Masukan nilai yang ingin dicari : ");
		cari =keyboard.nextInt();
		kunci ="tidak";

		for (int angka : arr1) {
			if (angka == cari) {
				System.out.println("Angka ditemukan");
				kunci = ("ada");
			}			
		}
		if (kunci.equals("tidak")) {
			System.out.println("Maaf angka yang cari tidak ditemukan");
		}
	}
	
}