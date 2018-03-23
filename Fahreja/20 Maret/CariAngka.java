import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CariAngka {
	public static void main(String[] args) {
		int pilih,banyakAngka=0,posisi = 0;
		Scanner cari = new Scanner(System.in);
		HashMap<Integer, Integer> daftar = new HashMap<Integer, Integer>();
		
		daftar.put(0, 4);
		daftar.put(1, 3);
		daftar.put(2, 2);
		daftar.put(3, 4);
		daftar.put(4, 2);
		daftar.put(5, 6);
		daftar.put(6, 2);
		daftar.put(7, 5);
		daftar.put(8, 5);
		daftar.put(9, 7);
		daftar.put(10, 5);
		daftar.put(11, 3);
		daftar.put(12, 5);
		daftar.put(13, 3);
		daftar.put(14, 3);
		daftar.put(15, 23);
		daftar.put(16, 4);
		daftar.put(17, 6);
		daftar.put(18, 4);
		daftar.put(19, 3);
		daftar.put(20, 4);
		daftar.put(21, 4);
		daftar.put(22, 2);
		daftar.put(23, 2);
		
		System.out.println("Masukan Angka yang dicari :");
		pilih = cari.nextInt();
		
		for (int cekAngka = 0; cekAngka < daftar.size(); cekAngka++) {
			if (pilih  == daftar.get(cekAngka)) {
				banyakAngka ++;
			}
		}
		System.out.println("Angka "+pilih+" ada "+banyakAngka+", ditemukan pada posisi:");

		for (int cekAngka = 0; cekAngka < daftar.size(); cekAngka++) {
			if (pilih  == daftar.get(cekAngka)) {
				System.out.print((cekAngka+1)+" ");
			}
		}
	}
}
