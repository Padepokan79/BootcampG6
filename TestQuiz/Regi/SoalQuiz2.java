import java.util.Scanner;

public class SoalQuiz2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String jumlahBaris = "";
		int bilangan, baris = 0;
		boolean benar = false;

		System.out.print("\nJumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
		jumlahBaris = keyboard.nextLine();

		while ( benar == false ) {
			if (jumlahBaris.matches("[A-Za-z.,\\s]*")) {
				System.out.println("\nMaaf, input yang diterima hanya berupa angka.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nJumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
				jumlahBaris = keyboard.nextLine();
			}
			else if (Integer.parseInt(jumlahBaris) < 2) {
				System.out.println("\nMaaf, jumlah baris tidak boleh kurang dari 2.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nJumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
				jumlahBaris = keyboard.nextLine();
			}
			else if (Integer.parseInt(jumlahBaris) > 20) {
				System.out.println("\nMaaf, jumlah baris tidak boleh lebih dari 20.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nJumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
				jumlahBaris = keyboard.nextLine();
			}
			else {
				benar = true;
				baris = Integer.parseInt(jumlahBaris);
				System.out.println();
				for (int a = 0; a < baris; a++) {
					bilangan = 1;
					for (int b = 0; b <= a; b++) {
						System.out.print(bilangan + " ");
						bilangan = bilangan * (a - b) / (b + 1);
					}
					System.out.println();
				}
			} 
		}
	}
}