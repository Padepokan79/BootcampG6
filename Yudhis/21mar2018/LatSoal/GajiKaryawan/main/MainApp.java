package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

	static HashMap<Integer, String> mapPenempatanKerja = new HashMap<Integer, String>();
	static HashMap<Integer, String> mapTingkatan = new HashMap<Integer, String>();
	static ArrayList<String> statusMenikah = new ArrayList<String>();
	
	static Scanner input = new Scanner(System.in);
		
	static Programmer programmer = new Programmer();
	static SystemAnalyst systemAnalyst = new SystemAnalyst();	
	static Tester tester = new Tester();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Memasukkan penempatan kerja
		mapPenempatanKerja.put(1, "Bandung");
		mapPenempatanKerja.put(2, "Jakarta");
		mapPenempatanKerja.put(3, "Karawang");
		
		// Memasukkan penempatan kerja
		mapTingkatan.put(1, "Junior");
		mapTingkatan.put(2, "Middle");
		mapTingkatan.put(3, "Senior");		
		
		// Memasukkan status menikah
		statusMenikah.add("Menikah");
		statusMenikah.add("Belum Menikah");
		
		int menu;
		
		do {
			System.out.println("\nPenghitungan Gaji Karyawan");
			System.out.println("1. Programmer");
			System.out.println("2. System Analyst");
			System.out.println("3. Tester");
			System.out.println("0. Keluar");
			System.out.print("Masukkan posisi : "); menu = input.nextInt();
			
			switch (menu) {
				case 1:
					// Input data yg diperlukan
					inputData(programmer, menu);
					
					break;
					
				case 2:
					// Input data yg diperlukan
					inputData(systemAnalyst, menu);
					
					break;
					
				case 3:
					// Input data yg diperlukan
					inputData(tester, menu);
					
					break;
			}
			
		} while (menu != 0);
		
	}
	
	public static void inputData(Karyawan karyawan, int menu) {		
		// Input data yg diperlukan
		input.nextLine(); // Clear buffer
		System.out.print("\nNama Lengkap : "); karyawan.setNamaLengkap(validasiAlphabet("nama").toUpperCase());
		System.out.print("NIK : "); karyawan.setNik(validasiAngka("nik"));
		karyawan.setTingkatan(mapTingkatan.get(inputTingkatan()));
		System.out.print("Lama Kerja (dalam tahun) : "); karyawan.setLamaKerja(input.nextInt());
		karyawan.setPenempatanKerja(mapPenempatanKerja.get(inputPenempatanKerja()));
		System.out.print("Lembur (dalam hari) : "); karyawan.setBanyakLembur(input.nextInt());
		karyawan.setStatusNikah(inputStatusMenikah());
		
		if (menu == 1) {
			System.out.print("Bugfixing (banyaknya) : "); karyawan.hitungBonus(input.nextInt());
			// Overload constructor
			programmer = new Programmer(karyawan);
		} else if (menu == 3) {
			System.out.print("Testcase (banyaknya) : "); karyawan.hitungBonus(input.nextInt());
			// Overload constructor
			tester = new Tester(karyawan);
		} else {
			// Overload constructor
			systemAnalyst = new SystemAnalyst(karyawan);
		}
		
	}
	
	public static int inputPenempatanKerja() {
		int penempatan;
		
		System.out.println("Penempatan Kerja");
		System.out.println("1. Bandung");
		System.out.println("2. Jakarta");
		System.out.println("3. Karawang");
		System.out.print("Pilih penempatan : "); penempatan = input.nextInt();
		
		return penempatan;
	}
	
	public static String inputStatusMenikah() {
		String status = "";
		int pilihan;
		
		System.out.println("Status Menikah");
		System.out.println("1. Menikah");
		System.out.println("2. Belum Menikah");
		System.out.print("Pilih status : "); pilihan = input.nextInt();
		
		if (pilihan == 1) {
			status = statusMenikah.get(0);
		} else if (pilihan == 2) {
			status = statusMenikah.get(1);
		}
		
		return status;
	}

	public static int inputTingkatan() {		
		int pilihan;
		
		System.out.println("Tingkatan");
		System.out.println("1. Junior");
		System.out.println("2. Middle");
		System.out.println("3. Senior");
		System.out.print("Pilih tingkatan : "); pilihan = input.nextInt();
		
		return pilihan;
	}
	
	public static String validasiAlphabet(String tipe) {
		String hasil = "";
		boolean benar = false;
		
		do {
			hasil = input.nextLine();
			
			if (hasil.length() == 0) {
				System.out.print("\nData belum diisi. Masukkan data : ");
			} else if (hasil.matches("[ ]")) {
				System.out.print("\nData belum diisi. Masukkan data : ");
			} else if (hasil.matches("[a-z A-Z]*")) {
				if (tipe.equals("nama") && hasil.length() <= 32) {
					benar = true;
				} else {
					System.out.print("\nNama tidak boleh melebihi 32 karakter. Masukkan data : ");
				}
			} else {
				System.out.print("\nData tidak boleh mengandung angka. Masukkan data : ");
			}
			
		} while (benar == false);	
			
		return hasil;
	}
	
	public static String validasiAngka(String tipe) {
		String hasil;
		boolean benar = false;
		
		do {
			hasil = input.nextLine();
			
			if (hasil.length() == 0) {
				System.out.print("\nData belum diisi. Masukkan data : ");
			} else if (hasil.matches("[ ]")) {
				System.out.print("\nData belum diisi. Masukkan data : ");
			} else if (hasil.matches("[0-9]*")) {
				if (tipe.equals("nik") && hasil.length() <= 12) {
					benar = true;
				} else {
					System.out.print("\nNIK tidak boleh melebihi 12 karakter. Masukkan data : ");
				}
			} else {
				System.out.print("\nData hanya boleh mengandung angka. Masukkan data : ");
			}
			
		} while (benar == false);	
			
		return hasil;
	}
}
