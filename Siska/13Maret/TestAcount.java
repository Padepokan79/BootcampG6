import java.util.Scanner;
public class TestAcount {
	public static void main (String[]args) {
		int pilihan, depositPlatinum, pilihmenu, nabung, ambil;
		Scanner keyboard = new Scanner (System.in);
		Acount pertama = new Acount();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
		System.out.println("Selamat Datang di Bank 79");
		System.out.println();
		System.out.println("Untuk Pembuatan Akun Bank Baru");
		System.out.println("Pembuatan Akun:");
		System.out.println();
		System.out.println("1. Akun Standar");
		System.out.println("2. Akun Platinum");
		System.out.println("Masukan Pilihan Anda: ");
		pilihan = keyboard.nextInt();
		
		if (pilihan == 1) {
			System.out.println();
			System.out.println("Selamat Datang ");
			System.out.println("Akun Anda adalah " + pertama.getacountNumber() + " Dengan Saldo Sebesar " + pertama.getbalance());
		}
		else if (pilihan == 2) {
			System.out.println();
			System.out.println("Selamat Datang ");
				do {
				System.out.println("Masukan deposit pertama (minimal 500000): ");
				depositPlatinum = keyboard.nextInt();
					if (depositPlatinum < pertama.getbalance()) {
						System.out.println("Kurang");
					}
				}
				while (depositPlatinum <= pertama.getbalance());
			pertama = new Acount(depositPlatinum);
			System.out.println(pertama.toString());
		}
		do {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1. Cek Saldo.");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("0. Exit");
			System.out.println();
			pilihmenu = keyboard.nextInt();
			if (pilihmenu == 1) {
				System.out.println("Sisa saldo anda sebesar Rp." + pertama.getbalance());
			}
			else if (pilihmenu == 2) {
				System.out.println("Masukan besaran uang yang akan ditabungkan: ");
				nabung = keyboard.nextInt();
				pertama.credit(nabung);
				System.out.println("Selamat Uang sebesar Rp. " + nabung + " telah ditambahkan");
			}
			else if (pilihmenu == 3) {
				System.out.println("Masukan besaran uang yang akan diambil: ");
				ambil = keyboard.nextInt();
				pertama.debit(ambil);
				System.out.println("Selamat Uang sebesar Rp. " + ambil + " telah diambil");
			}
		
		}
		while (pilihmenu != 0);
		
	}
}
