/**
 * 27-03-2018
 */
package main;

import java.util.Scanner;

/**
 * @author Yudhistira
 *
 */
public class MainApp {
	
	// Inisialisasi object pegawai
	static Pegawai pegawai = new Pegawai();
	
	// Inisialisasi object Scanner
	static Scanner input = new Scanner(System.in);

	// Boolean validasi terisi atau belumnya input
	static boolean bNama = false, bNIP = false, bJK = false, bGolongan = false, bMasaKerja = false, bStatKawin = false, bJenis = false;
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputData();
			
	}
	
	// Method input data
	public static void inputData() {
		
		int menu;
		
		do {
			
			System.out.println("\nPenghitungan Gaji PNS\n");
			System.out.println("1. Nama : " + pegawai.nama.toUpperCase());
			System.out.println("2. NIP : " + pegawai.nip);
			System.out.println("3. Jenis Kelamin (1. Pria / 2. Wanita) : " + pegawai.jenisKelamin);
			System.out.println("4. Golongan : " + pegawai.golongan + pegawai.kodeGolongan);
			System.out.println("5. Masa Kerja : " + pegawai.masaKerja);
			System.out.println("6. Status Kawin dan Jumlah Anak : " + pegawai.statusKawin + " " + pegawai.jumlahAnak + " anak.");
			System.out.println("7. Jenis PNS : " + pegawai.jenisPNS);
			System.out.println("8. Tunjangan Lainnya : " + pegawai.namaTunjanganLain.toUpperCase() + " " + pegawai.besarTunjanganLain);
			System.out.println("9. Slip Gaji");
			System.out.println("0. Keluar");
			System.out.print("Pilih menu : "); menu = Integer.valueOf(validasiAngka("menu"));
			
			switch (menu) {
				case 1:
					// Input nama
					System.out.print("Masukkan nama : "); pegawai.nama = validasiAlphabet("nama"); 					
					
					bNama = true;
					
					break;
					
				case 2:
					// Input nip
					System.out.print("Masukkan NIP : "); pegawai.nip = validasiAngka("nip"); 					
					
					bNIP = true;
					
					break;
					
				case 3:
					// Input jenis kelamin
					System.out.print("Masukkan jenis kelamin (1. Pria / 2. Wanita) : ");
					
					if (Integer.valueOf(validasiAngka("jenisKelamin")) == 1) {
						pegawai.jenisKelamin = "Pria";
					} else {
						pegawai.jenisKelamin = "Wanita";
					}
					
					bJK = true;
					
					break;
					
				case 4:
					// Input golongan dan kode golongan
					System.out.print("Masukkan golongan (1-4) : "); 
					
					pegawai.golongan = Integer.valueOf(validasiAngka("golongan"));
					
					if (pegawai.golongan == 4) {
						System.out.print("Masukkan kode golongan (A-E) : "); 
						
						pegawai.kodeGolongan = validasiAlphabet("kodeGolonganA-E");
						
					} else {
						System.out.print("Masukkan kode golongan (A-D) : "); 
						
						pegawai.kodeGolongan = validasiAlphabet("kodeGolonganA-D");
					}

					bGolongan = true;
					
					break;
					
				case 5:
					// Input masa kerja
					if (bGolongan == false) {
						System.out.println("Masukkan golongan terlebih dahulu.");
					} else {
						System.out.print("Masukkan masa kerja (dalam tahun) : ");
						
						pegawai.masaKerja = Integer.valueOf(validasiAngka("masaKerja"));

						bMasaKerja = true;
					}
					
					break;
					
				case 6:
					System.out.println("\n1. Belum Kawin");
					System.out.println("2. Kawin");
					System.out.println("3. Cerai");
					System.out.print("Masukkan pilihan : "); 
					
					int statusNikah = Integer.valueOf(validasiAngka("statusNikah"));
					
					if (statusNikah == 1) {
						pegawai.statusKawin = "Belum Menikah";
					} else if (statusNikah == 2) {
						pegawai.statusKawin = "Menikah";
					} else {
						pegawai.statusKawin = "Cerai";
					}
					
					System.out.print("Masukkan jumlah anak : "); 
					pegawai.jumlahAnak = Integer.valueOf(validasiAngka("jumlahAnak"));
					
					bStatKawin = true;
					
					break;
					
				case 7:
					System.out.println("Pilih jenis PNS:");
					System.out.println("1. Pejabat");
					System.out.println("2. Pelayan Masyarakat");
					System.out.println("3. Lainnya");
					System.out.print("Masukkan pilihan : "); 
					
					int pilJenisPNS = Integer.valueOf(validasiAngka("jenisPNS"));		
					
					if (pilJenisPNS == 1) {
						pegawai.jenisPNS = "Pejabat";
					} else if (pilJenisPNS == 2) {
						pegawai.jenisPNS = "Pelayan Masyarakat";
					} else {
						pegawai.jenisPNS = "Lainnya";
					}
					
					break;
					
				case 8:
					System.out.print("Masukkan nama tunjangan lain : "); 
					pegawai.namaTunjanganLain = validasiAlphabet("namaTunjanganLainnya");
					
					System.out.print("Masukkan besar tunjangan lain : "); 
					pegawai.besarTunjanganLain = Integer.valueOf(validasiAngka("besarTunjanganLainnya")); 
					
					break;
					
				case 9:
					// Overload constructor pegawai menggunakan masing-masing golongan
					switch (pegawai.golongan) {
						case 1:
							pegawai = new Golongan1(pegawai);
							
							System.exit(0);
						
						case 2:
							pegawai = new Golongan2(pegawai);
							
							System.exit(0);
							
						case 3:
							pegawai = new Golongan3(pegawai);
							
							System.exit(0);
							
						case 4:
							pegawai = new Golongan4(pegawai);
							
							System.exit(0);
					}
					
					break;
	
				case 0:
					System.exit(0);
			}
			
		} while (menu != 0);
		
	}
	
	// Validasi input dalam bentuk String
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
				switch (tipe) {						
					case "nama":
						if (hasil.length() <= 32) {
							benar = true;
						} else {
							System.out.print("\nNama tidak boleh melebihi 32 karakter. Masukkan data : ");
						}
						
						break;
						
					case "kodeGolonganA-E":
						if (hasil.matches("[A-Ea-e]*") && hasil.length() == 1) {
							hasil = hasil.toUpperCase();

							benar = true;
						} else {
							System.out.println("Anda hanya dapat memasukkan pilihan A - E. Masukkan data : ");
						}
						
						break;
					
					case "kodeGolonganA-D":
						if (hasil.matches("[A-Da-d]*") && hasil.length() == 1) {
							hasil = hasil.toUpperCase();

							benar = true;
						} else {
							System.out.println("Anda hanya dapat memasukkan pilihan A - D. Masukkan data : ");
						}
						
						break;
						
					case "namaTunjanganLainnya":
						benar = true;
						
						break;
				}
			} else {
				System.out.print("\nData tidak boleh mengandung angka. Masukkan data : ");
			}
			
		} while (benar == false);	
			
		return hasil;
	}
	
	// Validasi input dalam bentuk Integer
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
					case "menu":
						if (Integer.valueOf(hasil) >= 0 && Integer.valueOf(hasil) <= 9) {
							benar = true;
						} else {
							System.out.print("\nPilih menu 1-9. Masukkan data : ");
						}
						
						break;
						
					case "nip":
						if (hasil.length() >= 12 && hasil.length() <= 18) {
							benar = true;
						} else if (hasil.length() > 18) {
							System.out.print("NIP yg anda masukkan tidak boleh lebih dari 18 karakter. Masukkan data : ");
						} else if (hasil.length() < 12 && hasil.length() > 0) {
							System.out.print("NIP yg anda masukkan tidak boleh kurang dari 12 karakter. Masukkan data : ");
						}
						
						break;	
											
					case "jenisKelamin":
						if (Integer.valueOf(hasil) >= 1 && Integer.valueOf(hasil) <= 2) {
							benar = true;
						} else {
							System.out.print("Anda hanya dapat memasukkan pilihan 1 atau 2. Masukkan data : ");
						}
						
						break;
						
					case "golongan":
						if (Integer.valueOf(hasil) >= 1 && Integer.valueOf(hasil) <= 4) {
							benar = true;
						} else {
							System.out.print("Anda hanya dapat memasukkan pilihan 1-4. Masukkan data : ");
						}
						
						break;
						
					case "masaKerja":
						if (Integer.valueOf(hasil) <= 2 && (pegawai.golongan == 1 || pegawai.golongan == 2) && 
							pegawai.kodeGolongan.matches("[B-D]*")) {
							
							System.out.print("Masa kerja tersebut tidak tersedia dalam golongan " + pegawai.golongan + pegawai.kodeGolongan + ". Masukkan data : ");
						
						} else {
							pegawai.masaKerja = Integer.valueOf(hasil);

							benar = true;
						}							
						
						break;
						
					case "jenisPNS":
						
					case "statusNikah":
						if (Integer.valueOf(hasil) >= 1 && Integer.valueOf(hasil) <= 3) {
							benar = true;
						} else {
							System.out.print("Anda hanya dapat memasukkan pilihan 1-3. Masukkan data : ");
						}
						
						break;
						
					case "jumlahAnak":
						if (hasil.matches("[0-9]*")) {
							benar = true;
						}
						
						break;
						
					case "besarTunjanganLainnya":
						if (hasil.length() <= 10) {
							benar = true;
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
