import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		Account baru = new Account();
		int pilih ;
		
		System.out.println("ACCOUNT\n");
		System.out.println("Pilih akun yang ingin di buat ");
		System.out.println("1.Akun Standar 2.Akun Platinum");
		System.out.print(">");
		pilih = nilai.nextInt();
			
		if (pilih == 1) {
			baru.balanceDefault();
		}else if (pilih == 2) {
			do{
				System.out.println("Masukan deposit awal harus lebih dari Rp 500.000 : ");
				baru.deposit(nilai.nextDouble());
			}while(baru.balancePlatinum()< 500000);
		}else {
			System.out.println("Silahkan Coba lagi nanti");
		}
		baru.getAccountNomber();
		System.out.println(baru.ketAkun());
		do {
			
			System.out.println("\nMenu : \n");
			System.out.println("1. Untuk Mengecek Saldo");
			System.out.println("2. Deposit/Menabung.");
			System.out.println("3. Withdraw/Mengambil.");
			System.out.println("0. Exit");
			System.out.print(">");
			pilih = nilai.nextInt();
			
				if (pilih == 1) {
					System.out.println("Sisa saldo anda : Rp."+baru.getBalance());
					System.out.println("");
				}else if (pilih == 2) {
					System.out.print("Uang yang ingin di tambahkan : Rp.");
					baru.credit(nilai.nextDouble());
					System.out.println("Selamat uang sebesar : Rp."+baru.credit+" Berhasil Ditambahkan");
					baru.tabung();
					
				}else if (pilih == 3) {
					System.out.print("Uang yang ingin di ambil :Rp.");
					baru.debit(nilai.nextDouble());
					baru.tarik();
				}
			
		}while(pilih !=0);
	}
}
