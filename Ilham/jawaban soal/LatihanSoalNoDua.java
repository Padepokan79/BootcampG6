// ilham 06-03-2018

import java.util.Scanner;

public class LatihanSoalNoDua {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int batas;
		String kalimat;
		int indexKalimat = 0;
		
		System.out.print("Masukkan batas segitiga : ");
		batas = keyboard.nextInt();
		System.out.print("Masukkan Kalimat : ");
		keyboard.nextLine();
		kalimat = keyboard.nextLine();

		for (int i = 1; i <= batas; i++) {
			for (int j = 1; j <= batas-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (indexKalimat < kalimat.length()) {
					System.out.print(kalimat.substring(indexKalimat,indexKalimat+1));
					System.out.print(" ");
					indexKalimat++;
				}
			}				
			System.out.println("");
		}
	}
}
