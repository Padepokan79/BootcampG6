import java.util.Scanner;
public class Test {
	public static void main (String[]args) {
		String nama, nik, penempatanKerja, pekerjaan, kategoripegawai, status;
		int lamakerja, lamalembur, jmlfixingbug, jmltestcase;
		double gajiPokok;
		
		Scanner input = new Scanner (System.in);
		
		//nama
		System.out.println("Nama : ");
		nama = input.nextLine();
		
		
		//nik
		System.out.println("NIK : ");
		nik = input.nextLine();
		
		
		//penempatan kerja
		System.out.println("Wilayah Kerja(bandung/karawang/jakarta): ");
		penempatanKerja = input.nextLine();
		
		
		//pekerjaan 
		System.out.println("Pekerjaan(programmer/system analys/tester): ");
		pekerjaan = input.nextLine();
		
				
		//kategori pegawai
		System.out.println("Tingkat Pegawai(junior/middle/senior) : ");
		kategoripegawai = input.nextLine();
		
		
		//lama kerja
		System.out.println("Lama kerja(tahun) : ");
		lamakerja = input.nextInt();
		
		
		//status
		System.out.println("Apakah sudah menikah? (y/n) ");
		status = input.next();
		
		
		//lembur
		System.out.println("Lama lembur(jam) : ");
		lamalembur = input.nextInt();
		
		//pekerjaan
		if (pekerjaan.equalsIgnoreCase("Programmer")) {
			
			System.out.println("Berapa kali fixing bug ? ");
			jmlfixingbug = input.nextInt();
			
			PG k = new PG(nama, nik, penempatanKerja, pekerjaan, kategoripegawai, lamakerja, status, lamalembur, jmlfixingbug);
			System.out.println("Gaji Pokok           : " + (int) k.getgaji());
			System.out.println("Lembur               : " + (int) k.getgajilembur());
			System.out.println("Bonus                : " + (int) k.getbonusPG());
			System.out.println("Tunjangan Pegawai    : " + (int) k.gettunjanganPegawai());
			System.out.println("Tunjangan Transport  : " + (int) k.gettunjanganTransport());
			System.out.println("Tunjangan Keluarga   : " + (int) k.getTunjanganKel());
			System.out.println("Gaji Kotor           : " + (int) k.getbruto());
			System.out.println("BPJS Kesehatan       : " + (int) k.getbpjskes());
			System.out.println("BPJS Ketenagakerjaan : " + (int) k.getbpjsket());
			System.out.println("PKP                  : " + (int) k.getpkp());
			System.out.println("PPH Sebulan          : " + (int) k.getpphSebulan());
			System.out.println("Take Home Pay        : " + (int) k.gettakeHomepay());
		}
		else if (pekerjaan.equalsIgnoreCase("System Analys")) {
			SA s = new SA(nama, nik, penempatanKerja, pekerjaan, kategoripegawai, lamakerja, status, lamalembur);
			System.out.println("Gaji Pokok           : " + (int) s.getgaji());
			System.out.println("Lembur               : " + (int) s.getgajilembur());
			System.out.println("Tunjangan Pegawai    : " + (int) s.gettunjanganPegawai());
			System.out.println("Tunjangan Transport  : " + (int) s.gettunjanganTransport());
			System.out.println("Tunjangan Keluarga   : " + (int) s.getTunjanganKel());
			System.out.println("Gaji Kotor           : " + (int) s.getbruto());
			System.out.println("BPJS Kesehatan       : " + (int) s.getbpjskes());
			System.out.println("BPJS Ketenagakerjaan : " + (int) s.getbpjsket());
			System.out.println("PKP                  : " + (int) s.getpkp());
			System.out.println("PPH Sebulan          : " + (int) s.getpphSebulan());
			System.out.println("Take Home Pay        : " + (int) s.gettakeHomepay());
			
		}
		else if (pekerjaan.equalsIgnoreCase("Tester")) {
			System.out.println("Berapa kali testcase? ");
			jmltestcase = input.nextInt();
			
			TS t = new TS(nama, nik, penempatanKerja, pekerjaan, kategoripegawai, lamakerja, status, lamalembur, jmltestcase);
			
			System.out.println("Gaji Pokok           : " + (int) t.getgaji());
			//System.out.println("Gaji Bulanan         : " + (int) t.getgajiBulanan());
			System.out.println("Gaji Lembur          : " + (int) t.getgajilembur());
			System.out.println("Bonus                : " + (int) t.getbonus());
			System.out.println("Tunjangan Pegawai    : " + (int) t.gettunjanganPegawai());
			System.out.println("Tunjangan Transport  : " + (int) t.gettunjanganTransport());
			System.out.println("Tunjangan Keluarga   : " + (int) t.getstatus());
			System.out.println("Gaji Kotor           : " + (int) t.getbruto());
			System.out.println("BPJS Kesehatan       : " + (int) t.getbpjskes());
			System.out.println("BPJS Ketenagakerjaan : " + (int) t.getbpjsket());
			System.out.println("PKP                  : " + (int) t.getpkp());
			System.out.println("PPH Sebulan          : " + (int) t.getpphSebulan());
			System.out.println("Take Home Pay        : " + (int) t.gettakeHomepay());
		}
		
	}
}
