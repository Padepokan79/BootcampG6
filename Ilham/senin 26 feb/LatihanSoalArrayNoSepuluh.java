// Ilham galang 26 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoSepuluh {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,56};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int[] duplikasi = new int[arr1.length];
		int indexDuplikasi = 0;
		boolean sudahAda = false;

		System.out.println("10. Tampilkan bilangan2 yang duplikasi pada arr1! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}

		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					for (int k = 0; (k < duplikasi.length && !sudahAda); k++) {
						if (arr1[i] == duplikasi[k]) {							
							sudahAda = true;
						}
					}
					if (!sudahAda) {
						duplikasi[indexDuplikasi] = arr1[i];
						indexDuplikasi++;
					}
				}
			}
		}

		System.out.println("\nNIlai Duplikasi yang terdapat pada arr1 : ");
		for (int r : duplikasi) {
			if (r != 0) {
				System.out.print(r + ", ");
			}
		}
	}
}
