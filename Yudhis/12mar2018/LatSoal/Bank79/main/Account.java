package main;

import java.util.Scanner;

public class Account {
	
	String nama, identitas;
	int tab;
	Scanner input = new Scanner(System.in);
	
	void buatAkun() {
		System.out.println("Pembuatan akun\n"); 
		System.out.print("Silahkan masukkan nama anda : "); nama = input.nextLine();
		System.out.print("Masukkan nomor identitas : "); identitas = input.nextLine();
		System.out.print("Silahkan masukkan besar deposit pertama anda : "); tab = input.nextInt();
		
		System.out.println("\nSelamat datang " + nama + ".");
		System.out.println("Akun anda adalah " + identitas + " a/n " + nama + " dengan saldo sebesar Rp. "
				+ tab); 
	}
	
	void cekSaldo() {
		System.out.println("\nSisa Saldo anda sebesar Rp. " + tab);
	}
	
	void nabung() {
		System.out.println("\nSisa Saldo anda sebesar Rp. " + tab);
		System.out.print("Masukan besar uang yang akan ditabungkan: "); tab = tab + input.nextInt();
		System.out.println("Saldo anda saat ini sebesar Rp. " + tab);
	}
	
	void ngambil() {
		System.out.println("\nSisa Saldo anda sebesar Rp. " + tab);
		System.out.print("Masukan besar uang yang akan diambil: "); tab = tab - input.nextInt();
		System.out.println("Saldo anda saat ini sebesar Rp. " + tab);
	}
}
