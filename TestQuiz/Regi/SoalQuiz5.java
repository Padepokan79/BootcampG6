import java.util.Scanner;

public class SoalQuiz5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String posisi = "";
		int[] number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] temp = new int [10];
		int angka, pos = 0;
		boolean benar = false;

		System.out.print("\nDeretan number: ");

		for (int a = 0; a < number1.length; a ++) {
			System.out.print(number1[a] + " ");
		}

		for (int a = 0 ;a < number1.length; a ++) {
			temp[a] = number1[a];
		}
		System.out.println();

		System.out.print( "\nMasukan Angka yang mau disisipkan: " );
		angka = keyboard.nextInt();
		System.out.print( "\nSisipkan pada posisi ke: " );
		posisi = keyboard.next();

		while ( benar == false ) {
			if (posisi.matches("[A-Za-z.,\\s]*")) {
				System.out.println("\nMaaf, input yang diterima hanya berupa angka.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nSisipkan pada posisi ke:  ");
				posisi = keyboard.nextLine();
			}
			else if (Integer.parseInt(posisi) < 1) {
				System.out.println("\nMaaf, jumlah pos tidak boleh kurang dari 1.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nSisipkan pada posisi ke:  ");
				posisi = keyboard.nextLine();
			}
			else if (Integer.parseInt(posisi) > 10) {
				System.out.println("\nMaaf, jumlah pos tidak boleh lebih dari 10.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nSisipkan pada posisi ke:  ");
				posisi = keyboard.nextLine();
			}
			else {
				benar = true;
				pos = Integer.parseInt(posisi);
				number1 = new int [11];
				int b = 0;

				for (int a = 0; a < number1.length; a++) {
					if ( a != ( pos - 1 ) ) {
						number1[a] = temp[b];
						b++;
					}
					else {
						number1[b] = angka;
					}
				}

				System.out.println();
				for (int a = 0; a < number1.length; a++) {
					System.out.print(number1[a] + " ");
				}
			}
			System.out.println();
		}		
	}
}