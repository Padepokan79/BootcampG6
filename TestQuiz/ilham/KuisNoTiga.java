// ilham 08-03-2018

// import library
import java.util.Scanner;

public class KuisNoTiga {
	public static void main(String[] args) {
		// Deklarasi variabel
		Scanner keyboard = new Scanner(System.in);
		String inputanSementara;
		int jumlahKeluarga, lamaTabungan, tabunganPerbulan, totalTabungan = 0;

		// output
		System.out.println("Tabungan Keluarga.\n");
		System.out.print("Masukan Jumlah Keluarga: ");
		// input
		inputanSementara = keyboard.nextLine();

		// proses validasi
		while ( !(inputanSementara.matches("[0-9]*")) || inputanSementara.length() == 0 || Integer.valueOf(inputanSementara) < 2 || Integer.valueOf(inputanSementara) > 6 ) {
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
				System.out.println("Maaf, Jumlah keluarga tidak boleh kurang dari 2.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			// jika lebih dari 6
			else if (Integer.valueOf(inputanSementara) > 6) {
				System.out.println("Maaf, Jumlah keluarga tidak boleh lebih dari 6.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
		}

		// jika lolos validasi, pindahkan nilai ke variabel jumlahKeluarga
		jumlahKeluarga = Integer.valueOf(inputanSementara);

		// output
		System.out.print("Masukan Lama Tabungan: ");
		// input
		inputanSementara = keyboard.nextLine();

		// proses validasi
		while ( !(inputanSementara.matches("[0-9]*")) || inputanSementara.length() == 0 || Integer.valueOf(inputanSementara) < 1 || Integer.valueOf(inputanSementara) > 12 ) {
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
			// jika kurang dari 1
			else if (Integer.valueOf(inputanSementara) < 1) {
				System.out.println("Maaf, Lama tabungan tidak boleh kurang dari 1.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
			// jika lebih dari 12
			else if (Integer.valueOf(inputanSementara) > 12) {
				System.out.println("Maaf, Lama tabungan tidak boleh lebih dari 12.");
				System.out.print("Silahkan input kembali: ");
				inputanSementara = keyboard.nextLine();				
			}
		}
	
		// jika lolos validasi, pindahkan nilai ke variabel lamaTabungan
		lamaTabungan = Integer.valueOf(inputanSementara);

		// proses mencari total tabungan
		for (int hitungBulan = 1; hitungBulan <= lamaTabungan; hitungBulan++) {
			// proses mencari tatotal tabungan perbulan
			tabunganPerbulan = hitungTanbunganBulan(hitungBulan) * jumlahKeluarga;
			// tampilkan total tabungan perbulan
			System.out.println("Tabungan pada bulan " + hitungBulan + " sebesar " + tabunganPerbulan);
			// total tabungan keseluruhan
			totalTabungan += tabunganPerbulan;
		}

		// tampilkan total tabungan keseluruhan
		System.out.println("Total Tabungan Selama " + lamaTabungan + " Bulan dengan " + jumlahKeluarga + " anggota keluarga adalah " + totalTabungan);

	}

	// function menghitung tabungan
	public static int hitungTanbunganBulan(int bulan) {
		int banyakHari;
		int tabungan = 0;
		int tambahPerhari = 1000;

		// cek banyak hari dan bayaran dalam bulan tertentu
		switch (bulan) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
					banyakHari = 31;
					break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
					banyakHari = 30;
					break;
			case 2 :
					banyakHari = 28;
					break;
			default : banyakHari = 0;
		}

		// hitung tabungan
		for (int hari = 1; hari <= banyakHari; hari++) {
			tabungan += hari * tambahPerhari;
		}

		// kembalikan nilai pada variabel tabungan
		return tabungan;
	}
}