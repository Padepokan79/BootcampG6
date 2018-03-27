// Ilham 26-03-2018

import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		HashMap<String, String> dataInputan = new HashMap<String, String>();
		Karyawan pegawai;
		
		String[] temp = new String[5];
		
		// Input nama
		System.out.print("Masukkan nama anda: "); 
		dataInputan.put("nama", validasi(input.nextLine(), "Nama", null)); 
		
		// Input NIP
		System.out.print("Masukkan NIP (min 12, max 18): "); 
		dataInputan.put("nip", validasi(input.nextLine(), "NIP", null));
		
		// Input Jenis Kelamin
		System.out.print("Masukkan jenis kelamin: \n1. Pria \n2. Wanita \nPilih: ");
		dataInputan.put("jenisKelamin", validasi(input.nextLine(), "Jenis Kelamin", null));
		
		// Input Golongan 
		System.out.print("Masukkan golongan (1 - 4): ");
		dataInputan.put("golongan", validasi(input.nextLine(), "Golongan", null));
		// input kode golongan
		System.out.print("Masukkan kode golongan (A - E): ");
		temp[0] = dataInputan.get("golongan");
		dataInputan.put("kodeGolongan", validasi(input.nextLine(), "Kode Golongan", temp));
		
		// Input Masa Kerja
		System.out.print("Masukkan Masa Kerja (dalam tahun): ");
		temp[1] = dataInputan.get("kodeGolongan");
		dataInputan.put("masaKerjaDalamTahun",validasi(input.nextLine(), "Masa Kerja", temp)); 

		// Input Status Menikah
		System.out.println("Masukkan Status Menikah Anda:");
		System.out.println("1. Belum Menikah");
		System.out.println("2. Menikah");
		System.out.println("3. Cerai");
		System.out.print("Masukkan pilihan : ");
		temp[0] = "Belum Menikah"; temp[1] = "Menikah"; temp[2] = "Cerai"; temp[3] = "Status Menikah";
		dataInputan.put("statusMenikah", validasi(input.nextLine(), "1-3", temp));
		// cek jika Sudah Menikah atau Cerai
		if (!dataInputan.get("statusMenikah").equalsIgnoreCase("Belum Menikah")) {
			// Input Banyak Anak
			System.out.print("Masukkan jumlah anak : "); 
			dataInputan.put("jumlahAnak", validasi(input.nextLine(), "Jumlah Anak", null));			
		} else {
			dataInputan.put("jumlahAnak", "0");
		}
		
		// Input Jenis PNS
		System.out.println("Pilih jenis PNS:");
		System.out.println("1. Pejabat");
		System.out.println("2. Pelayan Masyarakat");
		System.out.println("3. Lainnya");
		System.out.print("Masukkan pilihan : ");
		temp[0] = "Pejabat"; temp[1] = "Pelayan Masyarakat"; temp[2] = "Lainnya"; temp[3] = "Jenis PNS";
		dataInputan.put("jenisPNS", validasi(input.nextLine(), "1-3", temp));
		
		// Input Tunjangan Lainnya
		System.out.print("Apakah ada Tunjangan lainnya (Ya/Tidak): ");
		dataInputan.put("tunjanganLainnya", validasi(input.nextLine(), "Tunjangan Lainnya", null));
		// jika ada tunjangan lainnya
		if (Boolean.parseBoolean(dataInputan.get("tunjanganLainnya"))) {
			// input nama tunjangan lainnya
			System.out.print("Nama tunjangan lainnya: "); 
			dataInputan.put("namaTunjanganLainnya", validasi(input.nextLine(), "Nama Tunjangan Lainnya", null));
			// input besar tunjangan lainnya
			System.out.print("Besar tunjangan lainnya: ");
			dataInputan.put("besarTunjanganLainnya", validasi(input.nextLine(), "Besar Tunjangan Lainnya", null));
		}
		
		// Inisialisasi obejct pegawai
		if (Boolean.parseBoolean(dataInputan.get("tunjanganLainnya"))) {
			pegawai = buatObject(dataInputan.get("nama"), dataInputan.get("nip"), dataInputan.get("jenisKelamin"), Integer.valueOf(dataInputan.get("golongan")), dataInputan.get("kodeGolongan"), Integer.valueOf(dataInputan.get("masaKerjaDalamTahun")), dataInputan.get("statusMenikah"), Integer.valueOf(dataInputan.get("jumlahAnak")), Boolean.parseBoolean(dataInputan.get("tunjanganLainnya")), dataInputan.get("namaTunjanganLainnya"), (double)(Integer.valueOf(dataInputan.get("besarTunjanganLainnya"))), dataInputan.get("jenisPNS"));	
		}
		else {
			pegawai = buatObject(dataInputan.get("nama"), dataInputan.get("nip"), dataInputan.get("jenisKelamin"), Integer.valueOf(dataInputan.get("golongan")), dataInputan.get("kodeGolongan"), Integer.valueOf(dataInputan.get("masaKerjaDalamTahun")), dataInputan.get("statusMenikah"), Integer.valueOf(dataInputan.get("jumlahAnak")), Boolean.parseBoolean(dataInputan.get("tunjanganLainnya")), dataInputan.get("jenisPNS"));	
		}
		
		
		// Output
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("\t\tSlip Gaji PNS");
		System.out.println("----------------------------------------------");
		System.out.println("Nama \t\t: " + pegawai.getNama());
		System.out.println("NIP \t\t: " + pegawai.getNip());
		System.out.println("Golongan \t: " + pegawai.getGolongan() + pegawai.getKodeGolongan() + " (" + pegawai.getMasaKerjaDalamTahun() + " tahun)");
		System.out.println("----------------------------------------------");
		System.out.println("Gaji Pokok \t\t: Rp." + (long)(pegawai.getGajiPokok()));
		System.out.println("Tunjangan Istri \t: Rp." + (long)(pegawai.getTunjanganIstri()));
		System.out.println("Tunjangan Anak \t\t: Rp." + (long)(pegawai.getTunjanganAnak()));
		System.out.println("Tunjangan Beras \t: Rp." + (long)(pegawai.getTunjanganBeras()));
		System.out.println(pegawai.getNamaTunjanganJabatan() + " \t: Rp." + (long)(pegawai.getTunjanganJabatan()));
		if (pegawai.isTunjanganLainnya()) {
			System.out.println("Nama Tunjangan \t\t: " + pegawai.getNamaTunjanganLainnya());
			System.out.println("Besar Tunjangan \t: Rp." + (long)(pegawai.getBesarTunjanganLainnya()));
		}
		System.out.println("Tunjangan PPH \t\t: Rp." + (long)(pegawai.getPPH()));
		System.out.println();
		System.out.println("Gaji Kotor \t\t: Rp." + (long)(pegawai.getGajiKotor()));
		System.out.println();
		System.out.println("Potongan IWP \t\t: Rp." + (long)(pegawai.getPotonganIWP()));
		System.out.println("Potongan Taperum \t: Rp." + (long)(pegawai.getPotonganTaperum()));
		System.out.println("Potongan PPH \t\t: Rp." + (long)(pegawai.getPPH()));
		System.out.println();
		System.out.println("Gaji Bersih \t\t: Rp." + (long)(pegawai.getGajiBersih()));
		System.out.println("----------------------------------------------");
	}
	
	// Membuat Objek
	public static Karyawan buatObject(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan, int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya, String jenisPNS) {
		Karyawan pegawai = null;
		if(jenisPNS.equalsIgnoreCase("Pejabat")) {
			pegawai = new Pejabat(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya);
		}
		else if(jenisPNS.equalsIgnoreCase("Pelayan Masyarakat")) {
			pegawai = new PelayanMasyarakat(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya);
		}
		else if(jenisPNS.equalsIgnoreCase("Lainnya")) {
			pegawai = new PegawaiUmum(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya);
		}
		return pegawai;
	}
	// method overloading
	public static Karyawan buatObject(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan, int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya, String namaTunjanganLainnya, double besarTunjanganLainnya, String jenisPNS) {
		Karyawan pegawai = null;
		if(jenisPNS.equalsIgnoreCase("Pejabat")) {
			pegawai = new Pejabat(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya, namaTunjanganLainnya, besarTunjanganLainnya);
		}
		else if(jenisPNS.equalsIgnoreCase("Pelayan Masyarakat")) {
			pegawai = new PelayanMasyarakat(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya, namaTunjanganLainnya, besarTunjanganLainnya);
		}
		else if(jenisPNS.equalsIgnoreCase("Lainnya")) {
			pegawai = new PegawaiUmum(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya, namaTunjanganLainnya, besarTunjanganLainnya);
		}
		return pegawai;		
	}
	
	// method validasi
	public static String validasi(String isi, String tipe, String[] tambahan) {
		String hasil = isi;
		if (tipe.equalsIgnoreCase("Nama")) {
			// proses validasi nama
			// ulang jika nama tidak di isi, lebih dari 50 karakter, dan ada angka
			while ( (!hasil.matches("[A-Za-z]*") && hasil.length() == 1) || !(hasil.length() <= 32 && hasil.length() > 0 && hasil.matches("[A-Z a-z,.]*")) ) {
				if ( !(hasil.length() > 0) ) {
					System.out.println("Nama harus di isi.");						
				}
				else if ( !(hasil.length() <= 32) ) {
					System.out.println("Nama tidak boleh lebih dari 32 karakter.");						
				}
				else if ((!hasil.matches("[A-Za-z]*") && hasil.length() == 1)) {
					System.out.println("Nama tidak boleh hanya spasi, koma, titik, dll.");						
				}
				else {
					System.out.println("Nama harus alpabhet.");						
				}
				System.out.print("Masukkan nama : "); hasil = input.nextLine(); 	
			}
		}
		if (tipe.equalsIgnoreCase("NIP")) {
			// proses validasi nip
			// ulang jika nip kurang dari 12 dan lebih dari 18 atau nip bukan angka
			while ( !(hasil.length() >= 12 && hasil.length() <= 18 && hasil.matches("[0-9]*")) ){
				if (hasil.length() == 0) {
					System.out.println("NIP harus di isi.");
				}
				else if (hasil.matches("[ ]*")) {
					System.out.println("NIP tidak boleh spasi.");						
				}
				else if ( !(hasil.matches("[0-9]*")) ) {
					System.out.println("NIP harus angka (tanpa spasi).");						
				}
				else if (hasil.length() < 12) {
					System.out.println("NIP yang anda masukkan kurang dari 12 digit.");								
				}
				else if (hasil.length() > 18) {
					System.out.println("NIP yang anda masukkan lebih dari 18 digit.");								
				}
				System.out.print("Masukkan NIP : "); hasil= input.nextLine();
			}
		}
		if (tipe.equalsIgnoreCase("Jenis Kelamin")) {
			// proses validasi jenis kelamin
			// ulang jika jenis kelamin bukan angka (1 atau 2) atau (pria atau wanita)
			while ( !(hasil.equalsIgnoreCase("1") || hasil.equalsIgnoreCase("2") || (hasil.equalsIgnoreCase("pria") || hasil.equalsIgnoreCase("wanita"))) ) {
				if (hasil.length() == 0) {
					System.out.println("Jenis Kelamin tidak boleh kososng.");
				}
				else if (hasil.matches("[0-9 ]*")) {
					if (hasil.equalsIgnoreCase("1 2") || hasil.equalsIgnoreCase("2 1") || hasil.equalsIgnoreCase("1 1") || hasil.equalsIgnoreCase("2 2")) {
						System.out.println("Pilih salah satu, angka 1 atau 2.");								
					}
					else if (!(hasil.matches("[1-2]*"))) {
						System.out.println("Pilih angka 1 atau 2.");
					} 
					else if (hasil.matches("[1-2]*") && hasil.length() > 1) {
						System.out.println("Pilih salah satu, angka 1 atau 2.");
					}							
				} else if (hasil.matches("[A-Za-z]*")) {
					if ( !(hasil.equalsIgnoreCase("pria") || hasil.equalsIgnoreCase("wanita")) ) {
						System.out.println("Pilih Pria atau Wanita.");
					}
				} else {
					System.out.println("Inputan yang ada masukkan tidak sesuai.");
					System.out.println("Pilih 1 atau 2 / Masukkan Pria atau Wanita.");
				}
				System.out.print("Masukkan jenis kelamin: \n1. Pria \n2. Wanita \nPilih: ");
				hasil = input.nextLine();
			}
			// jika jenis kelamin sama dengan 1 atau pria ==> Pria
			if (hasil.equalsIgnoreCase("1") || hasil.equalsIgnoreCase("pria")) {
				hasil = "Pria";
			}
			// jika jenis kelamin sama dengan 2 atau wanita ==> Wanita
			else if (hasil.equalsIgnoreCase("2") || hasil.equalsIgnoreCase("wanita")) {
				hasil = "Wanita";							
			}
		}
		if (tipe.equalsIgnoreCase("Golongan")) {
			// proses validasi Golongan
			// ulang jika golongan bukan angka
			while ( !(hasil.matches("[0-9 ]*") && hasil.length() > 0 && hasil.length() <= 1 && (hasil.equalsIgnoreCase("1") || hasil.equalsIgnoreCase("2") || hasil.equalsIgnoreCase("3") || hasil.equalsIgnoreCase("4"))) ) {
				if (hasil.length() == 0) {
					System.out.println("Golongan harus di isi.");	
				}
				else if (!(hasil.matches("[0-9 ]*"))) {
					System.out.println("Golongan harus berupa angka.");	
				}
				else if (hasil.length() > 1) {
					System.out.println("Masukkan angka hanya 1-4.");	
				}
				else if ( !(Integer.valueOf(hasil) >= 1 && Integer.valueOf(hasil) <= 4) ) {
					System.out.println("Golongan harus 1 sampai 4");
				}
				System.out.print("Masukkan golongan (1 - 4): ");
				hasil = input.nextLine();					
			}
		}
		if (tipe.equalsIgnoreCase("Kode Golongan")) {
			int golongan = Integer.valueOf(tambahan[0]);
			// proses validasi kode golongan
			// ulang jika kode golongan di isi selain karakter a-e
			while ( !(hasil.matches("[A-Ea-e]*") && hasil.length() == 1) || (golongan != 4 && hasil.equalsIgnoreCase("E"))) {
				if (hasil.length() == 0) {
					System.out.println("Kode Golongan harus di isi.");
				}
				else if (!(hasil.matches("[A-Ea-e]*"))) {
					System.out.println("Kode golongan hanya bisa A-E (tanpa spasi).");
				}
				else if (hasil.length() > 1) {
					System.out.println("Pilih salah satu kode golongan.");
				}
				else if (golongan != 4 && hasil.equalsIgnoreCase("E")) {
					System.out.print("Tidak ada kode golongan E pada golongan 1 - 3\n");
				}
				System.out.print("Masukkan kode golongan harus (A - E): ");
				hasil = input.nextLine();
			}
			// mengubah huruf kecil menjadi besar
			switch (hasil) {
				case "a" : 	hasil = "A";
							break;
				case "b" : 	hasil = "B";
							break;
				case "c" : 	hasil = "C";
							break;
				case "d" : 	hasil = "D";
							break;
				case "e" : 	hasil = "E";
							break;
				default : hasil = hasil;						
			}
		}
		if (tipe.equalsIgnoreCase("Masa Kerja")) {
			int golongan = Integer.valueOf(tambahan[0]);
			String kodeGolongan = tambahan[1];
			// proses validasi masa kerja
			// ulang jika masa kerja bukan angka
			while ( !(hasil.matches("[0-9]*") && hasil.length() > 0) || (hasil.length() > 3) || ((hasil.equals("0") || hasil.equals("1") || hasil.equals("2")) && (golongan == 1 || golongan == 2) && kodeGolongan.matches("[B-D]*")) ) {
				if (hasil.length() == 0) {
					System.out.println("Masa Kerja harus di isi.");	
				}
				else if (!(hasil.matches("[0-9]*"))) {
					System.out.println("Masa Kerja harus berupa angka (tanpa spasi).");	
				}
				else if (hasil.length() > 3) {
					System.out.println("Masa Kerja terlalu tinggi.");	
				}
				else if ((hasil.equals("0") || hasil.equals("1") || hasil.equals("2")) && (golongan == 1 || golongan == 2) && kodeGolongan.matches("[B-D]*")) {
					System.out.print("Masa Kerja Tidak tersedia dalam golongan " + golongan + kodeGolongan + "\n");							
				}
				System.out.print("Masukkan Masa Kerja (dalam tahun): ");
				hasil = input.nextLine();												
			}

		}
		if (tipe.equalsIgnoreCase("1-3")) {
			String pilSatu = tambahan[0];
			String pilDua = tambahan[1];
			String pilTiga = tambahan[2];
			String tipeValidasi = tambahan[3];
			// proses validasi status menikah
			// ulang jika status Menikah bukan angka 1 - 3 atau tidak termasuk dalam pilihan
			while ( !(hasil.equalsIgnoreCase("1") || hasil.equalsIgnoreCase("2") || hasil.equalsIgnoreCase("3") || hasil.equalsIgnoreCase(pilSatu) || hasil.equalsIgnoreCase(pilDua) || hasil.equalsIgnoreCase(pilTiga)) ) {
				if (hasil.length() == 0) {
					System.out.println(tipeValidasi + " tidak boleh kososng.");
				}
				else if (hasil.matches("[0-9 ]*")) {
					if (!(hasil.matches("[1-3]*"))) {
						System.out.println("Pilih angka 1 - 3.");
					} 
					else if (hasil.matches("[1-3]*") && hasil.length() > 1) {
						System.out.println("Pilih salah satu, angka 1 atau 2.");
					}							
				} else if (hasil.matches("[A-Za-z]*")) {
					if ( !(hasil.equalsIgnoreCase(pilSatu) || hasil.equalsIgnoreCase(pilDua) || hasil.equalsIgnoreCase(pilTiga)) ) {
						System.out.println("Pilih " + pilSatu + ", " + pilDua + " atau " + pilTiga + ".");
					}
				} else {
					System.out.println("Inputan yang ada masukkan tidak sesuai.");
					System.out.println("Pilih 1 - 3 / Masukkan " + pilSatu + ", " + pilDua + " atau " + pilTiga + ".");
				}
				System.out.println("1. " + pilSatu);
				System.out.println("2. " + pilDua);
				System.out.println("3. " + pilTiga);
				System.out.print("Masukkan pilihan : "); 
				hasil = input.nextLine();	
			}
			// convert pilhan, 1 ==> Belum Menikah dll
			if (hasil.equalsIgnoreCase("1") || hasil.equalsIgnoreCase(pilSatu)) {
				hasil = pilSatu;
			} else if (hasil.equalsIgnoreCase("2") || hasil.equalsIgnoreCase(pilDua)) {
				hasil = pilDua;
			} else if (hasil.equalsIgnoreCase("3") || hasil.equalsIgnoreCase(pilTiga)) {
				hasil = pilTiga;
			}
		}
		if (tipe.equalsIgnoreCase("Jumlah Anak")) {
			// proses validasi jumlah anak
			// ulang jika jumlah anak tidak di isi atau inputan bukan angka
			while (!(hasil.matches("[0-9]*") && hasil.length() > 0 && hasil.length() <= 3)) {
				if (hasil.length() == 0) {
					System.out.println("Jumlah Anak tidak boleh kososng (isi 0 jika tidak punya).");
				}
				else if (!(hasil.matches("[0-9 ]*"))) {
					System.out.println("Inputan harus berupa angka (tanpa spasi).");
				}
				else if (hasil.length() >= 3) {
					System.out.println("Jumlah Anak terlalu tinggi.");
				}
				System.out.print("Masukkan jumlah anak : "); 
				hasil= input.nextLine();
			}		
		}
		if (tipe.equals("Tunjangan Lainnya")) {
			// proses validasi tunjangan Lainnya
			// ulang jika tunjangan lainnya tidak di isi atau tidak mengisi ya / tidak
			while (hasil.length() == 0 || !hasil.equalsIgnoreCase("ya") && !hasil.equalsIgnoreCase("tidak")) {
				if (hasil.length() == 0) {
					System.out.println("Anda belum mengisi inputan.");
				}	
				else if (!hasil.equalsIgnoreCase("ya") && !hasil.equalsIgnoreCase("tidak")) {
					System.out.println("Pilih Ya / Tidak!");					
				}		
				System.out.println("Masukan Pilihan dengan Benar: ");
				hasil = input.nextLine();
			}
			hasil = hasil.equalsIgnoreCase("ya") ? "true" : "false";
		}
		if (tipe.equalsIgnoreCase("Nama Tunjangan Lainnya")) {
			// proses validasi nama tunjangan lainnya
			// ulang jika nama tunjangan lainnya tidak di isi
			while ( !(hasil.matches("[A-Z a-z,.]*")) || hasil.length() == 0 || (!hasil.matches("[A-Za-z]*") && hasil.length() == 1)) {
				if (!(hasil.matches("[A-Z a-z,.]*"))) {
					System.out.println("Hanya bisa di isi karakter.");
				}
				else if (hasil.length() == 0) {
					System.out.println("Nama tunjangan lainnya harus di isi.");							
				}
				else if (!hasil.matches("[A-Za-z]*") && hasil.length() == 1) {
					System.out.println("Nama tunjangan lainnya tidak boleh hanya spasi, kome, titik, dll.");							
				}
				System.out.print("Nama tunjangan lainnya: ");
				hasil = input.nextLine();
			}
		}
		if (tipe.equalsIgnoreCase("Besar Tunjangan Lainnya")) {
			//proses validasi besar tunjangan lainnya
			// ulang jika isi bukan angka
			while ( !(hasil.matches("[0-9]*")) || hasil.length() == 0) {
				if (hasil.length() == 0) {
					System.out.println("Besar tunjangan harus di isi.");	
				}
				else if (!(hasil.matches("[0-9]*"))) {
					System.out.println("Besar tunjangan harus angka (tanpa spasi).");							
				}
				System.out.print("Besar tunjangan lainnya: ");
				hasil = input.nextLine();
			} 
		}
		return hasil;
	}
}