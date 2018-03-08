import java.util.Scanner;

public class SoalQuiz1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String batasFibo = "";
		int nilai1 = 0, nilai2 = 1, nilai3 = 0, index = 2, counter = 2, batas = 0;
		int[] bilanganFibo = new int [0];
		boolean benar = false;

		System.out.print("\nJumlah urutan angka Fibonacci yang akan ditampilkan : ");
		batasFibo = keyboard.nextLine();

		while ( benar == false ) {
			if (batasFibo.matches("[A-Za-z.,\\s]*")) {
				System.out.println("\nMaaf, input yang diterima hanya berupa angka.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nJumlah urutan angka Fibonacci yang akan ditampilkan : ");
				batasFibo = keyboard.nextLine();
			}
			else if (Integer.parseInt(batasFibo) < 5) {
				System.out.println("\nMaaf, jumlah baris tidak boleh kurang dari 5.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nJumlah urutan angka Fibonacci yang akan ditampilkan : ");
				batasFibo = keyboard.nextLine();
			}
			else if (Integer.parseInt(batasFibo) > 100) {
				System.out.println("\nMaaf, jumlah baris tidak boleh lebih dari 100.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nJumlah urutan angka Fibonacci yang akan ditampilkan : ");
				batasFibo = keyboard.nextLine();
			}
			else {
				benar = true;
				batas = Integer.parseInt(batasFibo);

				for (int a = 2; nilai3 < batas; a++) {
					nilai3 = nilai1 + nilai2;
					if (nilai3 < batas) {
						counter++;
					}
					nilai1 = nilai2;
					nilai2 = nilai3;
				}
				bilanganFibo = new int [counter];
				nilai1 = 0; nilai2 = 1; nilai3 = 0;

				bilanganFibo[0] = 0;
				bilanganFibo[1] = 1;

				for (int a = 2; nilai3 < batas; a++) {
					nilai3 = nilai1 + nilai2;
					if (nilai3 < batas) {
						bilanganFibo[index] = nilai3;
						index++;
					}
					nilai1 = nilai2;
					nilai2 = nilai3;
				}
				counter = 0; 
				index = 0;

				System.out.println();
				for (int a : bilanganFibo) {
					System.out.print( a + " " );
				}
			}
		}
		System.out.println();
	}
}