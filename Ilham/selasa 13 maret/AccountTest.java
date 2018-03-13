import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		AccountNew akun = new AccountNew();
		
		int besarUang;
		String pilih;
		
		System.out.println("Selamat Datang di Bank 79.");
		System.out.println();
		do {
			System.out.println("Untuk Pembuatan Akun Baru.");
			System.out.println("Silahkan pilih salah satu.");
			System.out.println("1. Akun Standart.");
			System.out.println("2. Akun Platinum.");
			System.out.println("Pilih: ");
			pilih = input.next();
			
			if (pilih.equalsIgnoreCase("1")) {
				System.out.println(akun.toString());
			}
			else if (pilih.equalsIgnoreCase("2")) {
				do {
					System.out.println("Silahkan Masukan Deposit Pertama: ");
					besarUang = input.nextInt();
					if (besarUang < akun.getBalance()) {
						System.out.println("Deposit awal harus lebih dari Rp." + akun.getBalance());
					}
				} while(besarUang < akun.getBalance());
					akun = new AccountNew(besarUang);
					System.out.println(akun.toString());
			}
			else {
				System.out.println("Menu tidak tersedia.");
			}
		} while(!(pilih.equals("1") || pilih.equalsIgnoreCase("2")));
		
		do {
			System.out.println("Menu:");
			System.out.println("a. Untuk Mengecek Saldo.");
			System.out.println("b. Deposit/Menabung.");
			System.out.println("c. Withdraw/Mengambil.");
			System.out.println("Exit");
			pilih = input.next();
			
			if (pilih.equalsIgnoreCase("a")) {
				akun.cekSaldo();
			}
			else if ( pilih.equalsIgnoreCase("b")) {
				System.out.println("Masukan Besar Uang yang akan ditabungkan: ");
				besarUang = input.nextInt();
				akun.credit(besarUang);
			}
			else if (pilih.equalsIgnoreCase("c")) {
				System.out.println("Masukan Besar Uang yang akan diambil: ");
				besarUang = input.nextInt();
				akun.deposit(besarUang);
			}
			else if (!pilih.equalsIgnoreCase("exit")) {
				System.out.println("Menu tidak tersedia.");
			}
		} while(!pilih.equalsIgnoreCase("exit"));
		
		
	}

}
