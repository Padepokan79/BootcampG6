import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Karyawan objekPegawai;
		
		// Menyimpan Data Inputan Sementara 
		HashMap<String, String> data = new HashMap<String, String>();
		String[] pilihan = new String[3];
		String inputanSementara;
		
		// INPUT DARI USER
		// input nama
		System.out.println("Masukan Nama Anda: ");
		data.put("nama", validasi(input.nextLine(), "nama"));
		
		// input nik
		System.out.println("Masukan NIK: ");
		data.put("nik", validasi(input.nextLine(), "nik"));
		
		// input jenis pekerjaan
		System.out.println("Masukan Posisi Pekerjaan Anda (1-3): ");
		System.out.println("1. Programmer");
		System.out.println("2. Sistem Analis");
		System.out.println("3. Tester");
		System.out.print("Pilihan: ");
		pilihan[0] = "Programmer"; pilihan[1] = "Sistem Analis"; pilihan[2] = "Tester";
		data.put("pekerjaan", validasi(input.nextLine(), "1-3", pilihan));
		
		// input penempatan kerja
		System.out.println("Masukan Penempatan Kerja (1-3): ");
		System.out.println("1. Bandung");
		System.out.println("2. Jakarta");
		System.out.println("3. Karawamg");
		System.out.print("Pilihan: ");
		pilihan[0] = "Bandung"; pilihan[1] = "Jakarta"; pilihan[2] = "Karawang";
		data.put("penempatanKerja", validasi(input.nextLine(), "1-3", pilihan));
		
		// input status tingkatan
		System.out.println("Masukan Tingkatan Anda (1-3): ");
		System.out.println("1. Junior");
		System.out.println("2. Middle");
		System.out.println("3. Senior");
		System.out.print("Pilihan: ");
		pilihan[0] = "Junior"; pilihan[1] = "Middle"; pilihan[2] = "Senior";
		data.put("statusTingkat", validasi(input.nextLine(), "1-3", pilihan));
		
		// input lama bekerja
		System.out.println("Sudah Berapa Lama Anda Bekerja (dalam tahun): ");
		data.put("lamaKerjaDalamSetahun", validasi(input.nextLine(), "angka"));
		
		// input jumlah jam lembur
		System.out.println("Apakah Anda Lembur (Ya/Tidak): ");
		inputanSementara = validasi(input.nextLine(), "ya/tidak");
		if (inputanSementara.equalsIgnoreCase("ya")) {
			System.out.println("Masukan Jumlah Jam Lembur: ");
			data.put("jumlahJamLembur", validasi(input.nextLine(), "angka"));
		} else {
			data.put("jumlahJamLembur", "0");
		}

		// input apakah sudah bekeluarga
		System.out.println("Apakah Anda Sudah Berkeluarga (Ya/Tidak)? ");
		String apakahBerkeluarga = validasi(input.nextLine(), "ya/tidak");
		if (apakahBerkeluarga.equalsIgnoreCase("ya")) {
			data.put("isBerkeluarga", "true");
		} else {
			data.put("isBerkeluarga", "false");
		}
		
		// Bonus
		if (data.get("pekerjaan").equalsIgnoreCase("Programmer")) {
			System.out.println("Jumlah Fixing Bug: ");
			data.put("jumlahUntukMendapatBonus", validasi(input.nextLine(), "angka"));
		}
		else if (data.get("pekerjaan").equalsIgnoreCase("Tester")) {
			System.out.println("Jumlah Testcase: ");
			data.put("jumlahUntukMendapatBonus", validasi(input.nextLine(), "angka"));
		} else {
			data.put("jumlahUntukMendapatBonus", "0");
		}
		
		// Buat Objek dan melakukan proses perhitungan
		objekPegawai = buatObjekKaryawan(data.get("nama"), data.get("nik"), data.get("penempatanKerja"), data.get("statusTingkat"), data.get("pekerjaan"), Integer.valueOf(data.get("lamaKerjaDalamSetahun")), Integer.valueOf(data.get("jumlahJamLembur")), Boolean.parseBoolean(data.get("isBerkeluarga")), Integer.valueOf(data.get("jumlahUntukMendapatBonus")));
		// hapus data local
		data.clear();		
		pilihan = null;
		inputanSementara = null;
		
		// OUTPUT
		System.out.println();
		System.out.println("Slip Gaji ");
		System.out.println("--------------------------------------------------");
		System.out.println("Nama \t\t: " + objekPegawai.getNama());
		System.out.println("NIK \t\t: " + objekPegawai.getNIK());
		System.out.println("Posisi \t\t: " + objekPegawai.getPekerjaan());
		System.out.println("Tingkat \t: " + objekPegawai.getStatusTingkat());
		System.out.println("--------------------------------------------------");
		System.out.println("Gaji Pokok \t\t\tRp." + (long)(objekPegawai.getGajiPokok()));
		System.out.println("Tunjangan Pegawai \t\tRp." + (long)(objekPegawai.getTunjanganPegawai()));
		System.out.println("Lembur \t\t\t\tRp." + (long)(objekPegawai.getLembur()));
		System.out.println("Tunjangan Transport \t\tRp." + (long)(objekPegawai.getTunjanganTransport()));
		System.out.println("Tunjangan Keluarga \t\tRp."+ (long)(objekPegawai.getTunjanganKeluarga()));
		System.out.println("Bonus \t\t\t\tRp." + (long)(objekPegawai.getBonus()));
		System.out.println("");
		System.out.println("Penghasilan Kotor \t\tRp." + (long)(objekPegawai.getPenghasilanKotor()));
		System.out.println("\n");
		System.out.println("Potongan BPJS Kesehatan \tRp." + (long)(objekPegawai.getPotonganBPJSKesehatan()));
		System.out.println("Potongan BPJS Ketenagakerjaan \tRp." + (long)(objekPegawai.getPotonganBPJSKestenagaKerjaan()));
		System.out.println("PPH \t\t\t\tRp." + (long)(objekPegawai.getPPH()));
		System.out.println("\n");
		System.out.println("Penghasilan Bersih \t\tRp." + (long)(objekPegawai.getPenghasilanBersih()));
	}
	
	// method untuk membuat objek
	public static Karyawan buatObjekKaryawan(String nama, String nik, String penempatanKerja, String statusTingkat, String pekerjaan,
			int lamaKerjaDalamSetahun, int jumlahJamLembur, boolean isBerkeluarga, int jumlahUntukMendapatBonus) {
		Karyawan pegawai = null;

		if (pekerjaan.equalsIgnoreCase("Programmer")) {
			pegawai = new Programmer(nama, nik, penempatanKerja, statusTingkat, pekerjaan, lamaKerjaDalamSetahun, jumlahJamLembur, isBerkeluarga, jumlahUntukMendapatBonus);
		}
		else if (pekerjaan.equalsIgnoreCase("Sistem Analis")) {
			pegawai = new SistemAnalis(nama, nik, penempatanKerja, statusTingkat, pekerjaan, lamaKerjaDalamSetahun, jumlahJamLembur, isBerkeluarga);
		}
		else if (pekerjaan.equalsIgnoreCase("Tester")) {
			pegawai = new Tester(nama, nik, penempatanKerja, statusTingkat, pekerjaan, lamaKerjaDalamSetahun, jumlahJamLembur, isBerkeluarga, jumlahUntukMendapatBonus);
		}
		return pegawai;
	}
	
	// validasi
	public static String validasi(String isi, String tipe) {
		String hasil = isi;
		if (tipe.equalsIgnoreCase("nama")) {
			while (hasil.length() < 1 || hasil.length() > 32 || !hasil.matches("[a-zA-Z .]*")) {
				if (hasil.length() < 1) {
					System.out.println("Panjang Nama Minimal 1 Karakter!");
				}
				else if (hasil.length() > 32) {
					System.out.println("Panjang Nama Maksimal 32 Karakter!");
				}
				else if (!hasil.matches("[a-zA-Z .]*")) {
					System.out.println("Nama tidak boleh Angka atau Simbol!");
				}
				System.out.println("Masukan Nama dengan Benar: ");
				hasil = input.nextLine();
			}
		}
		
		if (tipe.equalsIgnoreCase("nik") || tipe.equalsIgnoreCase("angka")) {
			while (hasil.length() < 1 || hasil.length() > 12 || !hasil.matches("[0-9]*")) {
				if (hasil.length() < 1) {
					System.out.println("Panjang Inputan Minimal 1 Karakter!");
				}
				else if (hasil.length() > 12) {
					System.out.println("Panjang Inputan Maksimal 12 Karakter!");
				}
				else if (!hasil.matches("[0-9]*")) {
					System.out.println("Inputan tidak boleh Huruf, Spasi atau Simbol!");
				}
				System.out.println("Masukan Inputan dengan Benar: ");
				hasil = input.nextLine();
			}
		}
		if (tipe.equalsIgnoreCase("ya/tidak")) {
			while (!hasil.equalsIgnoreCase("ya") && !hasil.equalsIgnoreCase("tidak")) {
				System.out.println("Pilih Ya / Tidak!");					
				System.out.println("Masukan Pilihan dengan Benar: ");
				hasil = input.nextLine();
			}
		}
		return hasil;
	}
	
	// overloading validasi
	public static String validasi(String isi, String tipe, String[] array) {
		String hasil = isi;
		if (tipe.equalsIgnoreCase("1-3")) {
			while (!hasil.matches("[0-9]*") || hasil.length() < 1 || Integer.valueOf(hasil) > 3 || Integer.valueOf(hasil) < 1) {
				if (!hasil.matches("[0-9]*")) {
					System.out.println("Pilihan tidak boleh Huruf, Spasi atau Simbol!");					
				}
				else if (hasil.length() < 1 ) {
					System.out.println("Pilihan Harus Di isi!");
				}
				else if (Integer.valueOf(hasil) > 3 || Integer.valueOf(hasil) < 1) {
					System.out.println("Pilih 1-3!");
				}
				System.out.println("Masukan Pilihan dengan Benar: ");
				hasil = input.nextLine();
			}
		}
		boolean isFound = false;
		for (int i = 0; i < array.length && !isFound; i++) {
			if (Integer.valueOf(hasil) == (i+1)) {
				hasil = array[i];
				isFound = true;
			}
		}
		return hasil;
	}	
}