import java.util.Scanner;

public class AccountBankApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountBank acc1 = new AccountBank();
		int angka, pilih;
		
		
		System.out.println("Selamat Datang di Bank 79");
		System.out.println("Untuk Pembuatan Akun Bank Baru.");
		System.out.println("Pembuatan Akun: ");
		System.out.println("1. Akun Standar");
		System.out.println("2. Akun Platinum");
		System.out.println("Masukkan pilihan Anda:"); angka = input.nextInt();
		
		if(angka==1) {
			acc1.BalanceStandar();
		}
		else if (angka==2) {
			System.out.println("Masukkan saldo pertama Anda harus lebih dari Rp500.000 : ");
			acc1.setBalancePlatinum(input.nextDouble());
			
			do {
			System.out.println("Maaf saldo yang Anda masukkan kurang dari Rp500.000.");
			System.out.println("Masukkan saldo pertama Anda harus lebih dari Rp500.000 :");
			acc1.setBalancePlatinum(input.nextDouble());
			} while (acc1.getBalance() < 500000);
		}
		
		acc1.getAccountNumber();
		
		System.out.println(acc1.toStringAkunBaru());
		
		do {
		System.out.println("MENU:");
		System.out.println("1. Untuk mengecek saldo.");
		System.out.println("2. Deposit/Menabung.");
		System.out.println("3. Withdraw/Mengambil.");
		System.out.println("0. Exit"); 
		System.out.println("Pilih menu: ");pilih = input.nextInt();
		
			if (pilih==1) {
				System.out.println("Saldo Anda saat ini adalah " + acc1.getBalance() );
			}
			else if (pilih==2) {
				System.out.println("Masukkan jumlah uang yang ingin ditambahkan :");
				acc1.setCredit(input.nextDouble());
				System.out.println("Selamat Uang sebesar Rp" + acc1.getCredit() + " telah ditambahkan.");
				System.out.println("Saldo Anda saat ini adalah " + acc1.tambahDeposit());
			}
			else if (pilih==3) {
				System.out.println("Masukkan jumlah uang yang ingin diambil :");
				acc1.setDebit(input.nextDouble());
				if (acc1.getBalance() < acc1.getDebit() ) {
					System.out.println("Maaf saldo Anda tidak mencukupi");
					System.out.println("Saldo Anda saat ini adalah " + acc1.getBalance());
				} else {
				System.out.println("Selamat Uang sebesar Rp" + acc1.getDebit() + " telah dikurangkan.");
				System.out.println("Saldo Anda saat ini adalah " + acc1.mengambilDeposit());		
				}	
			}
		} while (pilih != 0);
	}

}
