package bankAccount;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Account akun = new Account();
		
		int menu1, noAkun=0;
		double amount;
		String menu2="";
		
		do {
			System.out.println("Selamat Datang di Bank 79\n\nPembuatan Akun Bank Baru\n\n1. Akun Standar\n2. Akun Platinum\n\nMasukkan pilihan anda: ");
			menu1 = scan.nextInt();
			
			noAkun = akun.getAccountNo();
			
			if(menu1 == 1) {
				System.out.println("\nSelamat Datang\nAkun anda adalah "+ noAkun);
				System.out.println("Dengan Saldo sebesar Rp. "+akun.getDepositAwal());
				akun = new Account(noAkun);
			}
			else if(menu1 == 2) {
				System.out.println("\nSelamat Datang\nAkun anda adalah "+ akun.getAccountNo());
				do {
					System.out.println("Masukkan deposit pertama anda: ");
					amount = scan.nextDouble();
					
					if(amount<=500000) {
						System.out.println("Deposit awal anda harus diatas 500000!");
					}else {
						akun = new Account(noAkun, amount);
						System.out.println("Uang anda berhasil dimasukkan.");
					}
					
				}while(amount <= 500000);
				
			}
			else {
				System.out.println("Inputan yang anda masukkan salah!");
			}
			
			
			do {
				System.out.println("\nMenu\na. Cek Saldo\nb. Deposit\nc. Withdraw\n0. Exit\n");
				menu2 = scan.next();
				
				if(menu2.equalsIgnoreCase("a")) {
					System.out.println(akun.toString());
				}
				else if(menu2.equalsIgnoreCase("b")) {
					System.out.print("Masukkan Besar Uang yang akan ditabungkan: ");
					amount = scan.nextInt();
					akun.credit(amount);
					System.out.println("Uang anda berhasil ditambahkan.");
				}
				else if(menu2.equalsIgnoreCase("c")) {
					System.out.print("Masukkan Besar Uang yang akan diambil: ");
					amount = scan.nextInt();
					
					if(akun.getBalance()-amount < 0) {
						System.out.println("Saldo anda tidak cukup!");
					}
					else {
						akun.debit(amount);
						System.out.println("Uang anda berhasil diambil.");
					}
				}
				else if(menu2.equals("0")) {}
				else {
					System.out.println("Inputan anda salah!");
				}
				
			}while(!menu2.equals("0"));
			
			
		}while(!menu2.equals("0"));
	}
}
