// Ilham galang 23 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoEmpat {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int bilangan, posisiIndex;

		System.out.println("4. Terima nilai dan ubah nilai u/ suatu posisi pada arr1! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}
		System.out.print("\nMasukkan suatu bilangan: ");
		bilangan = keyboard.nextInt();
		System.out.print("Posisi yang ingin di ubah(1-10): ");
		posisiIndex = keyboard.nextInt();

		arr1[posisiIndex-1] = bilangan;

		System.out.println("Nilai arr1 setelah di ubah");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}
	}
}
