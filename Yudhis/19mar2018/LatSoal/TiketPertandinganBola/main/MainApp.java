package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int banyakPertandingan = 0;
		long totalPenjualan = 0;
		
		ArrayList<Tiket> listTiket = new ArrayList<Tiket>();
		
		System.out.print("Masukkan jumlah pertandingan dalam satu bulan : "); 
		banyakPertandingan = banyakPertandingan + input.nextInt();
		
		do {
			System.out.print("Masukkan hari pertandingan : "); String hari = input.next();
			
			int jumlahPenonton = 0;
			
			TiketNormal tiketNormal = new TiketNormal();
			TiketVIP tiketVIP = new TiketVIP();
			TiketVVIP tiketVVIP = new TiketVVIP();
			
			do {
				if (jumlahPenonton > 100) {
					System.out.println("Jumlah penonton lebih dari kapasitas. (Maks. 100)");
				}
				
				int penontonNormal = 0;
				int penontonVIP = 0;
				int penontonVVIP = 0;
				jumlahPenonton = 0;
				
				System.out.print("Masukkan penonton tiket Normal : ");
				tiketNormal = new TiketNormal(penontonNormal = penontonNormal + input.nextInt(), hari);
				System.out.print("Masukkan penonton tiket VIP : ");
				tiketVIP = new TiketVIP(penontonVIP = penontonVIP + input.nextInt(), hari);
				System.out.print("Masukkan penonton tiket VVIP : ");
				tiketVVIP = new TiketVVIP(penontonVVIP = penontonVVIP + input.nextInt(), hari);
				
				jumlahPenonton = penontonNormal + penontonVIP + penontonVVIP;
				
				if (jumlahPenonton <= 100) {
					listTiket.add(tiketNormal);
					listTiket.add(tiketVIP);
					listTiket.add(tiketVVIP);
				}
			} while (jumlahPenonton > 100);		
			
			banyakPertandingan--;
		} while (banyakPertandingan > 0);
		
		for (Tiket t : listTiket) {
			System.out.println(t.toString());
			totalPenjualan = t.hitungPemasukan() + totalPenjualan;
		}
		
		System.out.println("Total pemasukan = " + totalPenjualan);
		
	}

}
