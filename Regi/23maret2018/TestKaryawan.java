package Karyawan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestKaryawan {
	static Scanner keyboard = new Scanner(System.in);
	
	static HashMap<Integer, String> penempatanKerja = new HashMap<Integer, String>();
	static HashMap<Integer, String> level = new HashMap<Integer, String>();
	static ArrayList<String> statusBerkeluarga = new ArrayList<String>();
	
	static Karyawan karyawan = new Karyawan();
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
		
		int pilih;
		
		do {
			System.out.println("\n=============================================\n");
			System.out.println("Karyawan");
			System.out.println("\nPosisi");
			System.out.println("1. Programmer");
			System.out.println("2. System Analyst");
			System.out.println("3. Tester");
			System.out.println("Masukkan posisi anda: (pilih angka 1 / 2 / 3)");
			pilih = Integer.valueOf(validasiUntukInputanAngka("pilih"));
			
			switch (pilih) {
				case 1: {
					input(programmer, pilih);
					break;
				}
				case 2: {
					input(systemAnalyst, pilih);
					break;
				}
				case 3: {
					input(tester, pilih);
					break;
				}
			}
		} while (pilih != 0);
	}
	
	public static void input(Karyawan karyawan, int pilih) {
		karyawan.level = level.get(inputLevel());
		
		karyawan.penempatanKerja = penempatanKerja.get(inputPenempatanKerja());
		
		System.out.println("\nMasukkan nama anda: ");
		karyawan.nama = String.valueOf(validasiAlphabet("nama"));
		System.out.println("Masukkan NIK anda: ");
		karyawan.setNik(validasiUntukInputanAngka("nik"));
		System.out.println("Masukkan lama anda bekerja: (dalam tahun)");
		karyawan.lamaKerja = Integer.valueOf(validasiUntukInputanAngka("lamaKerja"));
		
		karyawan.statusBerkeluarga = (inputStatusBerkeluarga());
		
		System.out.println("\nMasukkan jam lembur anda dalam sebulan: ");
		karyawan.jumlahLembur = keyboard.nextInt();
		
		if (pilih == 1) {
			System.out.println("\nMasukkan jumlah BugFixing yang anda kerjakan dalam sebulan: "); 
			programmer.bonus(keyboard.nextInt());
			programmer = new PG(karyawan);
		}
		else if (pilih == 3) {
			System.out.println("\nMasukkan jumlah TestCase yang anda kerjakan dalam sebulan: ");
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
		System.out.println("Masukkan level anda: (pilih angka 1 / 2 / 3)"); 
		level = Integer.valueOf(validasiUntukInputanAngka("level"));
		return level;
	}
	
	public static int inputPenempatanKerja() {
		int penempatanKerja;
		System.out.println("\nPenempatan Kerja");
		System.out.println("1. Bandung");
		System.out.println("2. Jakarta");
		System.out.println("3. Karawang");
		System.out.println("Masukkan penempatan kerja anda: (pilih angka 1 / 2 / 3)"); 
		penempatanKerja = Integer.valueOf(validasiUntukInputanAngka("penempatanKerja"));
		return penempatanKerja;
	}
	
	public static String inputStatusBerkeluarga() {
		String status = "";
		int pilih;
		System.out.println("\nStatus Berkeluarga");
		System.out.println("1. Sudah");
		System.out.println("2. Belum");
		System.out.println("Masukkan status berkeluarga anda: (pilih angka 1 / 2)");
		pilih = Integer.valueOf(validasiUntukInputanAngka("pilih"));
		
		if (pilih == 1) {
			status = statusBerkeluarga.get(0);
		} 
		else if (pilih == 2) {
			status = statusBerkeluarga.get(1);
		}
		return status;
	}
	
	public static String validasiUntukInputanAngka(String data) {
		String angka = "";
		boolean benar = false;
		
		do {
			angka = keyboard.next();
			
			if (angka.matches("[\\W]*")) {
				System.out.println("Data yang anda masukkan salah. Silahkan masukkan kembali:");
			}
			else if (angka.matches("[0-9]*")) {				
				switch (data) {
					case "nik":
						if (angka.length() <= 12) {
							benar = true;
						} 
						else {
							System.out.println("NIK maksimal 12 karakter. Silahkan masukkan kembali: ");
						}
						break;
					case "level":
						if (angka.length() == 1 && Integer.valueOf(angka) >= 1 && Integer.valueOf(angka) <= 3) {
							benar = true;
						} 
						else {
							System.out.println("Pilih angka 1 / 2 / 3. Silahkan masukkan kembali: ");
						}
						break;
					case "lembur":
					case "bonus":					
					case "lamaKerja":
						benar = true;
						break;
					case "penempatanKerja":
						if (angka.length() == 1 && Integer.valueOf(angka) >= 1 && Integer.valueOf(angka) <= 3) {
							benar = true;
						} 
						else {
							System.out.println("Pilih angka 1 / 2 / 3. Silahkan masukkan kembali: ");
						}
						break;
					case "statusBerkeluarga":
						if (angka.length() == 1 && Integer.valueOf(angka) >= 1 && Integer.valueOf(angka) <= 2) {
							benar = true;
						} 
						else {
							System.out.println("Pilih angka 1 / 2. Silahkan masukkan kembali: ");
						}
						break;
					case "pilih":
						if (angka.length() == 1 && Integer.valueOf(angka) >= 0 && Integer.valueOf(angka) <= 3) {
							benar = true;
						} 
						else {
							System.out.println("Pilih angka 1 / 2 / 3. Silahkan masukkan kembali: ");
						}						
						break;
				}
			}
			else {
				System.out.println("Data yang anda masukkan harus berupa angka. Silahkan masukkan kembali: ");
			}
		} while (benar == false);	
			
	return angka;
	}
	
	public static String validasiAlphabet(String data) {
		String huruf = "";
		boolean benar = false;
		
		do {
			huruf = keyboard.next();
			
			if (huruf.matches("[\\W]*")) {
				System.out.println("Data yang anda masukkan salah. Silahkan masukkan kembali:");
			}
			else if(huruf.matches("[a-zA-Z .,]*")) {
				if (data.equals("nama") && huruf.length() <= 32) {
					benar = true;
				} 
				else {
					System.out.println("Nama maksimal 32 karakter. Silahkan masukkan kembali: ");
				}
			} 
			else {
				System.out.println("Data yang anda masukkan harus berupa alphabet. Silahkan masukkan kembali: ");
			}
			
		} while (benar == false);	
			
		return huruf;
	}

}
