package Karyawan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestKaryawan {
	static Scanner keyboard = new Scanner(System.in);
	
	static HashMap<Integer, String> penempatanKerja = new HashMap<Integer, String>();
	static HashMap<Integer, String> level = new HashMap<Integer, String>();
	static ArrayList<String> statusBerkeluarga = new ArrayList<String>();
	
	static PG programmer = new PG();
	static SA systemAnalyst = new SA();
	static Tester tester = new Tester();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		penempatanKerja.put(1, "Bandung");
		penempatanKerja.put(2, "Jakarta");
		penempatanKerja.put(3, "Karawang");
		
		level.put(1, "Junior");
		level.put(2, "Middle");
		level.put(3, "Senior");
		
		statusBerkeluarga.add("sudah");
		statusBerkeluarga.add("belum");
		
		int pilih = 0;
		
		do {
			System.out.println("\nKaryawan");
			System.out.println("\n1. Programmer");
			System.out.println("2. System Analyst");
			System.out.println("3. Tester");
			System.out.println("Masukkan posisi anda:");
			pilih = keyboard.nextInt();
			
			switch (pilih) {
				case 1: {
					inputData(programmer, pilih);
					break;
				}
				case 2: {
					inputData(systemAnalyst, pilih);
					break;
				}
				case 3: {
					inputData(tester, pilih);
					break;
				}
			}
		} while (pilih != 0);
	}
	
	public static void inputData(Karyawan karyawan, int pilih) {
		karyawan.level = level.get(inputLevel());
		
		karyawan.penempatanKerja = penempatanKerja.get(inputPenempatanKerja());
		
		System.out.println("\nMasukkan nama anda: ");
		karyawan.nama = keyboard.next();
		System.out.println("Masukkan NIK anda: ");
		karyawan.setNik(keyboard.next());
		System.out.println("\nMasukkan lama anda bekerja: ");
		karyawan.lamaKerja = keyboard.nextInt();
		
		karyawan.statusBerkeluarga = (inputStatusBerkeluarga());
		
		System.out.println("\nMasukkan jam lembur anda dalam sebulan: ");
		karyawan.jumlahLembur = keyboard.nextInt();
		
		if (pilih == 1) {
			System.out.println("\nMasukkan jumlah BugFixing yang anda kerjakan: "); 
			programmer.bonus(keyboard.nextInt());
			programmer = new PG(karyawan);
		}
		else if (pilih == 3) {
			System.out.println("\nMasukkan jumlah TestCase yang anda kerjakan: ");
			tester.bonus(keyboard.nextInt());
			tester = new Tester(karyawan);
		} 
		else {
			systemAnalyst = new SA(karyawan);
		}
	}
	
	public static int inputLevel() {		
		int level;
		System.out.println("\nLevel");
		System.out.println("1. Junior");
		System.out.println("2. Middle");
		System.out.println("3. Senior");
		System.out.println("Masukkan level anda: "); 
		level = keyboard.nextInt();
		return level;
	}
	
	public static int inputPenempatanKerja() {
		int penempatanKerja;
		System.out.println("\nPenempatan Kerja");
		System.out.println("1. Bandung");
		System.out.println("2. Jakarta");
		System.out.println("3. Karawang");
		System.out.println("Masukkan penempatan kerja anda: "); 
		penempatanKerja = keyboard.nextInt();
		return penempatanKerja;
	}
	
	public static String inputStatusBerkeluarga() {
		String status = "";
		int pilih;
		System.out.println("\nStatus Berkeluarga");
		System.out.println("1. Sudah");
		System.out.println("2. Belum");
		System.out.println("Masukkan status berkeluarga anda:");
		pilih = keyboard.nextInt();
		
		if (pilih == 1) {
			status = statusBerkeluarga.get(0);
		} 
		else if (pilih == 2) {
			status = statusBerkeluarga.get(1);
		}
		return status;
	}
	
//	public static String inputStatusLembur() {
//		String
//	}

}
