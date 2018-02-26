// ilham galang 26 02 2018
import java.util.Scanner;

public class UrutAngka {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String angka;
		int[] arrAngka;
		int tempArr;

		System.out.println("Mangurutkan Angka.");
		System.out.print("Masukkan Angka: ");
		angka = keyboard.next();

		arrAngka = new int[angka.length()];

		for (int index = 0; index < angka.length(); index++) {
			arrAngka[index] = Integer.parseInt(angka.substring(index,index+1));
		}

		for (int i = 0; i < arrAngka.length; i++) {
			for (int j = arrAngka.length-1; j > i; j--) {
				if (arrAngka[j] > arrAngka[j-1]) {
					tempArr = arrAngka[j];
					arrAngka[j] = arrAngka[j-1];
					arrAngka[j-1] = tempArr;
				}
			}
		}

		System.out.println("Urutan dari yang terbesar: ");
		for (int r : arrAngka) {
			System.out.print(r + " ");
		}

		for (int i = 0; i < arrAngka.length; i++) {
			for (int j = arrAngka.length-1; j > i; j--) {
				if (arrAngka[j] < arrAngka[j-1]) {
					tempArr = arrAngka[j];
					arrAngka[j] = arrAngka[j-1];
					arrAngka[j-1] = tempArr;
				}
			}
		}

		System.out.println("\nUrutan dari yang terkecil: ");
		for (int r : arrAngka) {
			System.out.print(r + " ");
		}
			
	}
}