// ilham 08-03-2018

// import library
import java.util.Scanner;

public class KuisNoSatu {
	public static void main(String[] args) {
		// Deklarasi variabel
		Scanner keyboard = new Scanner(System.in);
		String inputanSementara;
		int tampilkan;

		// Inisialisasi bilangan untuk dijumlah kan, (untuk mendapat nilai fobonacci)
		int bilanganSatu = 0, bilanganDua = 1, bilanganSekarang = 0;

		// output
		System.out.print("Jumlah urutan angka Fibonacci yang akan ditampilan: ");
		// input
		inputanSementara = keyboard.nextLine();

		// proses validasi
		while ( !(inputanSementara.matches("[0-9]*")) || inputanSementara.length() == 0 || Integer.valueOf(inputanSementara) < 5 || Integer.valueOf(inputanSementara) > 100 ) {
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
			// jika kurang dari lima
			else if (Integer.valueOf(inputanSementara) < 5) {
				System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			// jika lebih dari 100
			else if (Integer.valueOf(inputanSementara) > 100) {
				System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
		}

		// jika lolos validasi, pindahkan nilai ke variabel tamilkan
		tampilkan = Integer.valueOf(inputanSementara);

		// proses mendapatka nilai fibonacci dan menampilkannya
		for (int jumlahBilFibonacci = 0; jumlahBilFibonacci < tampilkan; jumlahBilFibonacci++) {
			if (jumlahBilFibonacci == 0) {
				System.out.print(bilanganDua + " ");
			}
			else {
				bilanganSekarang = bilanganSatu + bilanganDua;
				System.out.print(bilanganSekarang + " ");

				bilanganSatu = bilanganDua;
				bilanganDua = bilanganSekarang;
			}
		}

	}
}
