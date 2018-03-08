// ilham 08-03-2018

// import library
import java.util.Scanner;

public class KuisNoDua {
	public static void main(String[] args) {
		// Deklarasi variabel
		Scanner keyboard = new Scanner(System.in);
		String inputanSementara;
		int tampilkan, nilai;

		// output
		System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilan: ");
		// input
		inputanSementara = keyboard.nextLine();

		// proses validasi
		while ( !(inputanSementara.matches("[0-9]*")) || inputanSementara.length() == 0 || Integer.valueOf(inputanSementara) < 2 || Integer.valueOf(inputanSementara) > 20 ) {
			// jika bukan angka
			if (!inputanSementara.matches("[0-9]*")) {
				System.out.println("Maaf, input yang diterima hanya berupa angka positif.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();
			}
			// jika input kosong
			else if (inputanSementara.length() == 0) {
				System.out.println("Maaf, input harus di isi.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			// jika kurang dari 2
			else if (Integer.valueOf(inputanSementara) < 2) {
				System.out.println("Maaf, baris untuk Segitiga Paskal tidak boleh kurang dari 2.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			// jika lebih dari 20
			else if (Integer.valueOf(inputanSementara) > 20) {
				System.out.println("Maaf, baris untuk Segitiga Paskal tidak boleh lebih dari 20.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
		}

		// jika lolos validasi, pindahkan nilai ke variabel tampilkan
		tampilkan = Integer.valueOf(inputanSementara);

		// proses pembuatan segitiga paskal
		for (int baris = 0; baris < tampilkan; baris++) {
			nilai = 1;
			for (int kolom = 0; kolom <= baris; kolom++) {
					System.out.print(nilai + " ");
					nilai = nilai * (baris - kolom) / (kolom + 1);
			}
			System.out.println();
		}

	}
}