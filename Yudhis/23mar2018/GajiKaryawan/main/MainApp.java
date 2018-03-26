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
			System.out.print("Masukkan posisi : "); menu = Integer.valueOf(validasiAngka("menu"));
			
			switch (menu) {
				case 1:
					inputData(1);
					
					break;
					
				case 2:
					inputData(2);
					
					break;
					
				case 3:
					inputData(3);
					
					break;
			}
			
		} while (menu != 0);
		
	}
	
	public static void inputData(int menu) {		
		String nama, nik, tingkatan, penempatanKerja, statusNikah;
		int lamaKerja, banyakLembur;
		
		// Input data yg diperlukan
		System.out.print("\nNama Lengkap : "); nama = validasiAlphabet("nama").toUpperCase();
		System.out.print("NIK : "); nik = validasiAngka("nik");
		tingkatan = mapTingkatan.get(inputTingkatan());
		System.out.print("Lama Kerja (dalam tahun) : "); lamaKerja = Integer.valueOf(validasiAngka("lamaKerja"));
		penempatanKerja = mapPenempatanKerja.get(inputPenempatanKerja());
		System.out.print("Lembur (dalam jam) : "); banyakLembur = Integer.valueOf(validasiAngka("lembur"));
		statusNikah = inputStatusMenikah();
		
		if (menu == 1) {
			System.out.print("Bugfixing (banyaknya) : ");
			programmer.hitungBonus(Integer.valueOf(validasiAngka("bugFixing")));
			// Overload constructor
			programmer = new Programmer(nama, nik, penempatanKerja, tingkatan, lamaKerja, statusNikah, banyakLembur, 
					programmer.getBonus());
		} else if (menu == 3) {
			System.out.print("Testcase (banyaknya) : ");
			tester.hitungBonus(Integer.valueOf(validasiAngka("testCase")));
			// Overload constructor
			tester = new Tester(nama, nik, penempatanKerja, tingkatan, lamaKerja, statusNikah, banyakLembur, 
					tester.getBonus());
		} else {
			// Overload constructor
			systemAnalyst = new SystemAnalyst(nama, nik, penempatanKerja, tingkatan, lamaKerja, statusNikah, banyakLembur, 
					systemAnalyst.getBonus());
		}													 
		
	}
	
	public static int inputPenempatanKerja() {
		int penempatan;
		
		System.out.println("Penempatan Kerja");
		System.out.println("1. Bandung");
		System.out.println("2. Jakarta");
		System.out.println("3. Karawang");
		System.out.print("Pilih penempatan : "); penempatan = Integer.valueOf(validasiAngka("penempatanKerja"));
		
		return penempatan;
	}
	
	public static String inputStatusMenikah() {
		String status = "";
		int pilihan;
		
		System.out.println("Status Menikah");
		System.out.println("1. Menikah");
		System.out.println("2. Belum Menikah");
		System.out.print("Pilih status : "); pilihan = Integer.valueOf(validasiAngka("statusMenikah"));
		
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
		System.out.print("Pilih tingkatan : "); pilihan = Integer.valueOf(validasiAngka("tingkatan"));
		
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
			} else if (hasil.matches("[a-z A-Z.]*")) {
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
		String hasil = "";
		boolean benar = false;
		
		do {
			hasil = input.nextLine();
			
			if (hasil.length() == 0) {
				System.out.print("\nData belum diisi. Masukkan data : ");
			} else if (hasil.matches("[ ]")) {
				System.out.print("\nData belum diisi. Masukkan data : ");
			} else if (hasil.matches("[0-9]*")) {				
				switch (tipe) {
					case "nik":
						if (hasil.length() <= 12) {
							benar = true;
						} else {
							System.out.print("\nNIK tidak boleh melebihi 12 karakter. Masukkan data : ");
						}
						
						break;
	
					case "tingkatan":
						if (hasil.length() == 1 && Integer.valueOf(hasil) >= 1 && Integer.valueOf(hasil) <= 3) {
							benar = true;
						} else {
							System.out.print("\nPilih tingkatan 1-3. Masukkan data : ");
						}
						
						break;
					
					case "lembur":
						
					case "bugFixing":
						
					case "testCase":
						
					case "lamaKerja":
						benar = true;
						
						break;
						
					case "penempatanKerja":
						if (hasil.length() == 1 && Integer.valueOf(hasil) >= 1 && Integer.valueOf(hasil) <= 3) {
							benar = true;
						} else {
							System.out.print("\nPilih penempatan 1-3. Masukkan data : ");
						}
						
						break;
						
					case "statusMenikah":
						if (hasil.length() == 1 && Integer.valueOf(hasil) >= 1 && Integer.valueOf(hasil) <= 2) {
							benar = true;
						} else {
							System.out.print("\nPilih status nikah 1-2. Masukkan data : ");
						}
						
						break;
						
					case "menu":
						if (hasil.length() == 1 && Integer.valueOf(hasil) >= 0 && Integer.valueOf(hasil) <= 3) {
							benar = true;
						} else {
							System.out.print("\nPilih posisi 1-3. Masukkan data : ");
						}
						
						break;
				}
			} else {
				System.out.print("\nData hanya boleh mengandung angka. Masukkan data : ");
			}
			
		} while (benar == false);	
			
		return hasil;
	}
}
