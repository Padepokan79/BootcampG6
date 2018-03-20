package soal5NilaiMahasiswa;

import java.util.ArrayList;

public class TestNilaiMahasiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nama = new ArrayList<String>();
		insertToAddList(nama, "Dinda", "Randi", "Joseph", "Diana", "Natalia");
		
		ArrayList<Integer> nilaiPerpajakan = new ArrayList<Integer>();
		insertToAddList(nilaiPerpajakan, 80, 20, 70, 95, 75);
		
		ArrayList<Integer> nilaiStatistika = new ArrayList<Integer>();
		insertToAddList(nilaiStatistika, 90, 50, 80, 85, 65);
		
		ArrayList<Integer> nilaiEkonomi = new ArrayList<Integer>();
		insertToAddList(nilaiEkonomi, 70, 50, 80, 90, 60);
		
		ArrayList<Integer> nilaiManajemen = new ArrayList<Integer>();
		insertToAddList(nilaiManajemen, 80, 70, 85, 80, 50);
		
		double rataRataTiapSiswa, rataRataSeluruhSiswa=0;
		
		System.out.println("Nilai rata-rata: ");
		for(int i=0; i<nama.size() ; i++) {
			rataRataTiapSiswa = (nilaiPerpajakan.get(i) + nilaiStatistika.get(i) + nilaiEkonomi.get(i) + nilaiManajemen.get(i))/nama.size();
			System.out.println(nama.get(i) + " : "+rataRataTiapSiswa);
			
			rataRataSeluruhSiswa += rataRataTiapSiswa;
		}
		
		rataRataSeluruhSiswa = rataRataSeluruhSiswa/nama.size();
		System.out.println("\nNilai rata-rata seluruh siswa: "+ rataRataSeluruhSiswa);
	}
	
	public static void insertToAddList(ArrayList<String> x, String a, String b, String c, String d, String e) {
		x.add(a);
		x.add(b);
		x.add(c);
		x.add(d);
		x.add(e);
	}
	
	public static void insertToAddList(ArrayList<Integer> x, int a, int b, int c, int d, int e) {
		x.add(a);
		x.add(b);
		x.add(c);
		x.add(d);
		x.add(e);
	}
}
