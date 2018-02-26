// ilham galang 26 02 2018
import java.util.Scanner;

public class UrutAngkaVdua {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String angka;
		int[] arrAngka;
		int tempArr, panjangAngka;
		int indexString = 0;

		System.out.println("Mangurutkan Angka.");
		System.out.print("Masukkan Angka: ");
		angka = keyboard.next();

		panjangAngka = angka.length();

		if (panjangAngka % 2 == 0) {
			panjangAngka = panjangAngka / 2;		
		} else {
			panjangAngka = panjangAngka / 2 + 1;		
		}
		arrAngka = new int[panjangAngka];

		for (int index = 0; index < arrAngka.length; index++) {
			if (panjangAngka % 2 == 1) {	
				if ((indexString + 1) == angka.length()) {
					arrAngka[index] = Integer.parseInt(angka.substring(indexString,indexString+1));		
				} else {
					arrAngka[index] = Integer.parseInt(angka.substring(indexString,indexString+2));
				}
			} else {
				arrAngka[index] = Integer.parseInt(angka.substring(indexString,indexString+2));
			}
			indexString+=2;
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