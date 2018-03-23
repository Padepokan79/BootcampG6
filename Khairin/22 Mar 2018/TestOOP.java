import java.util.Scanner;

public class TestOOP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner angka = new Scanner(System.in);
		String nama, nik, statusKawin, tempatKerja, tingkatanPegawai, jenisPegawai ;
		int lamaKerja, lamaLembur, fixingBug, testCase;
		boolean kondisi = false;
		
		Karyawan karyawan = new Karyawan();
		
		System.out.println("KARYAWAN"); 
		System.out.println("Masukkan Nama Anda : "); nama = input.nextLine();
		do {
			if (nama.matches("[A-Z a-z]*")) {
			}
			else {
				System.out.println("Inputan yang Anda masukkan harus berupa huruf.");
			}
			if (nama.length() > 32 || nama.length() <= 1) {
				System.out.println("Inputan yang Anda masukkan lebih dari 32 karakter atau kosong.");
			}
			if (nama.matches("[ ]*")) {
				System.out.println("Anda belum menginput apapun.");
			}
		} while (kondisi == false);
				
				
		System.out.println("Masukkan Nomor NIK Anda : "); nik = input.nextLine();
			
		System.out.println("Status Kawin (Kawin/Tidak Kawin) : "); statusKawin = input.nextLine();
		System.out.println("\nTempat kerja : ");
		System.out.println("Bandung");
		System.out.println("Jakarta");
		System.out.println("Karawang");
		System.out.println("Masukkan tempat kerja Anda :"); tempatKerja = input.nextLine();
		
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


		
