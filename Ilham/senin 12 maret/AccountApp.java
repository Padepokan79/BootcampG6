import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Account akun = new Account();
		
		int besarUang, pilih;
		String nama, identitas;
		
		System.out.println("Selamat Datang di Bank 79.");
		System.out.println();
		System.out.println("Untuk Pembuatan Akun Baru.");
		System.out.println("Silahkan Masukan Nama Anda: ");
		nama = keyboard.nextLine();
		System.out.println("Masukan Nomor Identitas: ");
		identitas = keyboard.next();
		System.out.println("Silalkan Besar Deposit pertama Anda: ");
		besarUang = keyboard.nextInt();
		akun.deposit = besarUang;
		
		System.out.println();
		System.out.println("Selamat Datang " + nama);
		System.out.println("Akun Anda adalah " + identitas + " a/n " + nama + " Dengan Saldo Sebesar Rp. " + besarUang);
		System.out.println();
		
		do {
			System.out.println("Menu:");
			System.out.println("1. Untuk Mengecek Saldo.");
			System.out.println("2. Deposit/Menabung.");
			System.out.println("3. Withdraw/Mengambil.");
			System.out.println("0. Exit");
			pilih = keyboard.nextInt();
			
			switch (pilih) {
				case 1:
						akun.cekSaldo();
						break;
				case 2 :
						System.out.println("Masukan Besar Uang yang akan ditabungkan: ");
						besarUang = keyboard.nextInt();
						akun.menabung(besarUang);
						break;
				case 3 :
						System.out.println("Masukan Besar Uang yang akan diambil: ");
						besarUang = keyboard.nextInt();
						akun.mengambil(besarUang);
						break;
			}
		} while (pilih != 0);
	}

}
