package main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		
		int menu;
		
		account.buatAkun();
		
		do {
			System.out.println("\nMenu : ");
			System.out.println("1. Cek saldo");
			System.out.println("2. Menabung");
			System.out.println("3. Mengambil");
			System.out.println("0. Keluar");
			System.out.print("Pilih menu : "); menu = input.nextInt();
			
			switch (menu) {
				case 1:
					account.cekSaldo();
					break;
				
				case 2:
					account.nabung();
					break;
					
				case 3:
					account.ngambil();
					break;
					
				case 0:
					System.exit(0);
					break;
	
				default:
					break;
			}
			
		} while (menu != 0);
	}

}
