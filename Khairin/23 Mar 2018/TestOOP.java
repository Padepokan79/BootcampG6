import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;

public class TestOOP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner angka = new Scanner(System.in);
		String nama, nik, statusKawin, tempatKerja, tingkatanPegawai, jenisPegawai ;
		int lamaKerja, lamaLembur, fixingBug, testCase;
		boolean kondisi = true;
		
		Karyawan karyawan = new Karyawan();
		
		ArrayList<String> listTempatKerja = new ArrayList<String>();
		karyawan.insertArrayList(listTempatKerja, "bandung", "jakarta", "karawang");
		
		System.out.println("KARYAWAN"); 
		System.out.println("Masukkan Nama Anda : "); nama = input.nextLine();
			while(!(nama.matches("[A-Z a-z]*")) || nama.matches("[ ]*") || nama.length() > 32 || nama.matches("[\\W]*")) {
				if (!(nama.matches("[A-Z a-z]*"))) {
					System.out.println("Inputan yang Anda masukkan harus berupa huruf.");
				}
				if (nama.matches("[\\W]*")) {
					System.out.println("Inputan yang Anda masukkan mengandung simbol");
				}
				if (nama.matches("[ ]*")) {
					System.out.println("Inputan Anda kosong.");
				}
				if (nama.length() > 32 ) {
					System.out.println("Inputan yang Anda masukkan harus kurang dari 32 karakter.");
				}
				
				System.out.println("Masukkan Nama Anda : "); nama = input.nextLine();	
			} 
				
		System.out.println("Masukkan Nomor NIK Anda : "); nik = input.nextLine();
			while ( !(nik.length() <= 12  && nik.matches("[0-9]*")) ){
				if (nik.matches("[\\W]*") ){
					System.out.println("Anda belum menginput nomor NIK Anda/Nomor NIK Anda salah ");
				}
				else {
					 if (nik.matches("[0-9]*")){
						if(nik.length() > 12) {
							System.out.println("Nomor NIK yang Anda masukkan lebih dari 12 Angka");
						}
					}
					else { 
						System.out.println("Nomor NIK mengandung huruf atau simbol");
					}
				}
				System.out.print("Masukkan Nomor NIK Anda : "); nik = input.nextLine();
			}
			
		System.out.println("Status Kawin (Kawin/Tidak Kawin) : "); statusKawin = input.nextLine();
			while (!(statusKawin.equalsIgnoreCase("kawin") || statusKawin.equalsIgnoreCase("tidak kawin"))) {
				System.out.println("Inputan yang Anda masukkan tidak ada dalam pilihan.");
				System.out.println("Pilih Status Kawin (Kawin/Tidak Kawin) : "); statusKawin = input.nextLine();
			}
		
		System.out.println("\nTempat kerja : ");
		System.out.println("Bandung");
		System.out.println("Jakarta");
		System.out.println("Karawang");
		System.out.println("Masukkan tempat kerja Anda :");
		tempatKerja = input.nextLine();
		karyawan.setTempatKerja(tempatKerja);
			while (!(tempatKerja.equalsIgnoreCase("bandung") || tempatKerja.equalsIgnoreCase("jakarta") || tempatKerja.equalsIgnoreCase("karawang"))) {
				System.out.println("Inputan yang Anda masukkan tidak ada dalam pilihan.");
				System.out.println("\nTempat kerja : ");
				System.out.println("Bandung");
				System.out.println("Jakarta");
				System.out.println("Karawang");
				System.out.println("Masukkan tempat kerja Anda :"); tempatKerja = input.nextLine();
			}
		
		System.out.println("\nPosisi Pekerjaan : ");
		System.out.println("Programmer");
		System.out.println("System Analyst");
		System.out.println("Tester");
		System.out.println("Pilih posisi pekerjaan Anda : "); jenisPegawai = input.nextLine();
		
		System.out.println("\nTingkatan Pekerjaan : ");
		System.out.println("Junior");
		System.out.println("Middle");
		System.out.println("Senior");
		System.out.println("Pilih tingkatan pekerjaan : "); tingkatanPegawai = input.nextLine();
		
		 
		System.out.println("\nLama Bekerja dalam tahun : "); lamaKerja = angka.nextInt();
//			while(!(lamaKerja.matches[0-9]) || lamaKerja < 0) {
//				System.out.println("Inputan Anda mengandung huruf atau simbol.");
//				System.out.println("Inputan harus berupa angka tidak kurang dari 0.");
//			}
			
			
		System.out.println("Waktu Lembur dalam jam : "); lamaLembur = angka.nextInt();
		
		karyawan = new Karyawan(nama, nik, tempatKerja, tingkatanPegawai, jenisPegawai, statusKawin, lamaKerja, lamaLembur);
		
		if (jenisPegawai.equalsIgnoreCase("programmer")) {
			System.out.println("Berapa kali fixing bug? "); fixingBug = angka.nextInt();
			Programmer programmer = new Programmer(karyawan, fixingBug);
			System.out.println(programmer.toString());
		}	
		else if (jenisPegawai.equalsIgnoreCase("system analyst")) {
			SystemAnalyst systemAnalyst = new SystemAnalyst(karyawan);
			System.out.println(systemAnalyst.toString());
		}
		else {
			System.out.println("Mengerjakkan berapa testcase? "); testCase = angka.nextInt();
			Tester tester = new Tester(karyawan, testCase);
			System.out.println(tester.toString());
		}
		
	}
		
}
		



		
