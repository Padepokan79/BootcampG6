package main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		
		// Pembuatan akun
		int menu;
		
		System.out.println("Pembuatan Akun.");
		System.out.println("1. Akun Standar");
		System.out.println("2. Akun Platinum");
		System.out.print("Masukkan pilihan : "); menu = input.nextInt();
		
		if (menu == 1) {
			System.out.println("\nAkun anda " + account.toString());
		} else {
			int balance;
			
			do {				
				System.out.print("Masukkan deposit pertama : "); balance = input.nextInt();
			} while (balance <= 500000);
			
			System.out.println("\nAkun anda " + account.toString());
		}
		
		// Menu
		String pilihan;
		
		do {
			
			System.out.println("\nMenu.");
			System.out.println("a. Cek Saldo");
			System.out.println("b. Deposit / Menabung");
			System.out.println("c. Withdraw / Mengambil");
			System.out.println("0. Exit");
			System.out.print("Masukkan pilihan : "); pilihan = input.next();
			
			switch (pilihan) {
				case "a":
					System.out.println("\nAkun anda " + account.toString());
					
					break;

				case "b":
					System.out.println("\nNomor akun : " + account.getAccountNumber());
					System.out.println("Sisa saldo : " + account.getBalance());
					System.out.print("Masukkan kredit : "); account.credit(input.nextInt());
					System.out.println("\nSaldo anda saat ini " + account.getBalance());
					
					break;	
					
				case "c":
					System.out.println("\nNomor akun : " + account.getAccountNumber());
					System.out.println("Sisa saldo : " + account.getBalance());
					
					int debit;
					
					do {
						System.out.print("Masukkan debit : "); debit = input.nextInt();
						
						if (debit >= account.getBalance()) {
							System.out.println("Jumlah debit melebihi atau sama dengan saldo anda!");
						}
					} while (debit >= account.getBalance());
					
					account.debit(debit);
					System.out.println("\nSaldo anda saat ini " + account.getBalance());
					
					break;
					
				default:
					break;
			}
			
		} while (!(pilihan.equalsIgnoreCase("0")));
	}

}
