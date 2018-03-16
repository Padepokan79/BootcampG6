package eclipse;

import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
	Scanner data = new Scanner(System.in);
	Account pers1= new Account();
	int menu;
	
	
	System.out.println("SELAMAT DATANG DI BANK 79");
	System.out.println("Untuk Pembuatan Akun Bank Baru.");
	System.out.println("Silahkan Masukkan Nama Anda : "); pers1.nama = data.nextLine();
	System.out.println("Masukkan Nomor Identitas : "); pers1.iD = data.nextLine();
	System.out.println("Masukkan besar deposit pertama Anda: "); pers1.dep(data.nextDouble());
	
	pers1.akunBaru();
	
		do {
			System.out.println("1. Untuk Mengecek Saldo. ");
			System.out.println("2. Deposit/Menabung. ");
			System.out.println("3. Withdraw/Mengambil");
			System.out.println("0. Exit ");
			System.out.println("Pilih menu: "); menu = data.nextInt();
		
			if (menu==1) {
				System.out.println("Saldo Anda saat ini adalah " + pers1.deposit());
			}
			else if (menu==2) {
				System.out.println("Masukkan jumlah uang yang akan ditabungkan :");
				pers1.tambah(data.nextDouble());
				System.out.println("Selamat Uang sebesar Rp" + pers1.tambah() + " telah ditambahkan.");
				System.out.println("Saldo Anda saat ini adalah " + pers1.tambahSaldo() );
			}
			else if (menu==3) {
				System.out.println("Masukkan jumlah uang yang ingin diambil :");
				pers1.kurang(data.nextDouble());
				if (pers1.deposit() < pers1.kurang()) {
					System.out.println("Maaf saldo Anda tidak mencukupi.");
					System.out.println("Sisa saldo Anda saat ini adalah: " + pers1.deposit());
					}		
				else {
					System.out.println("Selamat Uang sebesar Rp" + pers1.kurang() + " telah diambil.");
					System.out.println("Saldo Anda saat ini adalah " + pers1.kurangSaldo() );
				}
			}
	
		} while (menu != 0);
	}
}
