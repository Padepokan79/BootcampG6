//author Siska Pitriani 26/03/2018
package GajiPNSOOP;

import java.util.Scanner;

public class MainGajiPNS {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String penampungtanyainput,nip="", nama="", golonganUmum="0", golonganKhusus="", tunjanganLain="", jenisKelamin="", lamaKerja="", status="", jumlahAnak="", jenisPNS="", namaTunjanganlain="";
		int besarTunjanganLain = 0;
	
		penampungtanyainput = "Masukan NIP Anda                : ";
		nip = Validasi(penampungtanyainput, 12, 18, "buatnip");
		penampungtanyainput ="Masukan Nama Lengkap Anda        : ";
		nama = Validasi(penampungtanyainput, 1, 32, "buatnama");
		penampungtanyainput ="Masukan Jenis Kelamin Anda       : \n 1. Pria \t 2. Wanita" ;
		jenisKelamin = Validasi(penampungtanyainput, 1, 1, "buatpilihnomor") ;
		penampungtanyainput ="Masukan Golongan Anda (1/2/3/4)  : ";
		golonganUmum = Validasi(penampungtanyainput,1, 1, "buatpilihnomor");
		penampungtanyainput ="Masukan Golongan Anda (Contoh : 1C)";
		golonganKhusus = input.nextLine();
		penampungtanyainput ="Masukan Lama Kerja Anda(tahun)   : ";
		lamaKerja = Validasi(penampungtanyainput,0, 38, "buatnip");
		penampungtanyainput ="Masukan Status Pernikahan Anda   : \n 1. Menikah \t 2. Belum Menikah \t 3. Single Parents";
		status = Validasi(penampungtanyainput,1, 1, "buatpilihnomor");
		penampungtanyainput ="Masukan Jumlah Anak Anda         : ";
		jumlahAnak = Validasi(penampungtanyainput, 1, 50, "buatnip");
		penampungtanyainput ="Masukan Jenis PNS Anda           : \n 1. Pejabat \t 2. Pelayan Masyarakat \t 3. Lainnya";
		jenisPNS = Validasi(penampungtanyainput,1, 1, "buatpilihnomor");
		penampungtanyainput ="Apakah Ada Tunjangan Lain ? (Y/N)";
		tunjanganLain = Validasi(penampungtanyainput,1, 1, "yn");	
		if (tunjanganLain.equalsIgnoreCase("Y")){
			System.out.println("Nama Tunjangan : ");
			penampungtanyainput = Validasi(penampungtanyainput,1, 50, "buatnama");
			System.out.println("Besar tunjangan : ");
			besarTunjanganLain = input.nextInt();
		}
		Pegawai p1 = new Pegawai(nip, nama, jenisKelamin, golonganUmum, golonganKhusus, lamaKerja, status, jumlahAnak, jenisPNS, tunjanganLain, besarTunjanganLain);
		p1.Print();
	}
	public static String Validasi (String nanya,int min, int max, String inp) {
		Scanner input = new Scanner(System.in);
		boolean isTrue = false;
		String value = "";
		
		while(!isTrue){
			System.out.println(nanya);
			value = input.nextLine();
			
			if(value.matches("[\\W]*")){
				System.out.println("Inputan anda masih kosong / salah!");
			}
			else {
				switch (inp) {
					case "buatnip":
						if(value.matches("[0-9]*")){
							if(value.length() < min){
								System.out.println("Inputan yang anda masukkan kurang dari " + min + " angka!");
							}
							else if(value.length() > max){
								System.out.println("Inputan yang anda masukkan lebih dari "+ max + " angka!");
							}
							else{
								break;
							}
						}else{
							System.out.println("Inputan yang anda masukkan mengandung huruf / simbol!");
						}
					break;
					case "buatnama":
						if(value.length() <= max){					
							if(value.matches("[A-Za-z .,]*") ){
								break;
							}
							else{
								System.out.println("Inputan yang anda masukkan mengandung angka / simbol!");
							}
						}else{
							System.out.println("Inputan yang anda masukkan melebihi " + max + " huruf!");
						}
					break;
					case "buatpilihnomor":
						if(value.matches("[0-9]*")){
							if(value.length() < min){
								System.out.println("Masukkan salah satu nomor !");
							}
							else if(value.length() > max){
								System.out.println("Masukkan salah satu nomor !");
							}
							else{
								break;
							}
						}else{
							System.out.println("Inputan yang anda masukkan salah!");
						}
					break;
					case "yn":
						if(value.length() <= max){					
							if(value.matches("[A-Za-z .,]*") ){
								break;
							}
							else{
								System.out.println("Masukkan Y/N ! ");
							}
						}else{
							System.out.println("Inputan yang anda masukkan salah!");
						}
					break;
				}
			}
		}
		
		return value;
	}
		
	}


