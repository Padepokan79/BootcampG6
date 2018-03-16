import java.util.Scanner;
public class TestAccount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Account2 account1 = new Account2();
		int pilihAkun = 0, pilihMenu = 0;
		
		System.out.println("\n========================");
		System.out.println("\nSelamat Datang di Bank 79");
		System.out.println("\nUntuk Pembuatan Akun Bank Baru.");
		System.out.println("Pembuatan Akun:");
		System.out.println("\n1. Akun Standar");
		System.out.println("2. Akun Platinum");
		System.out.println("\nMasukan Pilihan anda:");
		pilihAkun = keyboard.nextInt();
		
		if(pilihAkun == 1) {
			System.out.println(account1.toString());
		}
		else if(pilihAkun == 2) {
			do {
				System.out.println("\nSilahkan masukkan Deposit Pertama:");
				account1.depositPertama = keyboard.nextInt();
				if(account1.depositPertama < account1.getBalance()) {
					System.out.println("\nMaaf nominal terlalu kecil, harus diatas Rp. 500000");
				}
			} while(account1.depositPertama < account1.getBalance());
		account1 = new Account2(account1.depositPertama);
		System.out.println(account1.toString());
		}
		
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Untuk Mengecek Saldo.");
			System.out.println("2. Deposit/Menabung.");
			System.out.println("3. Withdraw/Mengambil.");
			System.out.println("0. Exit");
			System.out.println("\nMasukan Pilihan anda:");
			pilihMenu = keyboard.nextInt();
			
			if(pilihMenu == 1) {
				System.out.println("\nSaldo anda sebesar: " + account1.getBalance());
			}
			else if(pilihMenu == 2) {
				System.out.println("\nMasukkan nominal yang ingin anda tabung: ");
				account1.amount = keyboard.nextDouble();
				account1.menabung();
			}
			else if(pilihMenu == 3) {
				System.out.println("\nMasukkan nominal yang ingin anda ambil: ");
				account1.amount = keyboard.nextDouble();
				account1.mengambil();
			}
		} while(pilihMenu != 0);
		
	}

}
