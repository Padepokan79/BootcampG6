import java.util.Scanner;

public class Soal9 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] array1 = new int[0];
		int jumlah, hasil = 0;

		System.out.print("\nJumlah angka yang ingin dimasukkan : ");
		jumlah = keyboard.nextInt();

		System.out.println();
		array1 = new int[jumlah];
		for (int i = 0; i < jumlah; i++) {
			System.out.print("angka " + (i + 1) + " : ");
			array1[i] = keyboard.nextInt();
		}

		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
			hasil = hasil + array1[i];
		}
		
		System.out.println();
		System.out.println( "\nHasil array: " + hasil );
	}
}