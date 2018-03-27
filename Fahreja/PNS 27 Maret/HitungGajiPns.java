//author fahreja 26 maret 2017
//edit 27 maret 2017
import java.util.Scanner;

public class HitungGajiPns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nama = null, nip = null, golongan = null, masaKerja=null,statusNikah=null,jumlahAnak = null, gender = null
				,jenisPNS = null,nilaiTunjanganLain = "0",tunjanganLain, namaTunjanganLain = "-";
		double gajiPokok =0,tunjanganNikah =0,tunjanganAnak=0,tunjanganBeras=0,bruto =0,jumlahPotongan = 0,jumlahNetto = 0
				, pphPerbulan =0,tunjanganFungsional=0,tunjanganStruktural=0,tunjanganUmum = 0,iwp =0, taperum =0;
		Scanner nilai = new Scanner(System.in);
		CekValidasi cek = new CekValidasi();
		
		//validasi NIP
		do {
			System.out.print("Masukan NIP anda : ");
			nip = nilai.nextLine();
			cek.angka(nip);
			cek.nip(nip);
		} while (!cek.key);
		
		//validasi Nama
		do {
			System.out.print("Masukan Nama anda : ");
			nama = nilai.nextLine();
			cek.huruf(nama);
			cek.nama(nama);
		} while (!cek.key);
		
		//Validasi Gender
		do {
			System.out.print("Jenis Kelamin (Pria/Wanita) : ");
			gender = nilai.nextLine();
			cek.huruf(gender);
			cek.gender(gender);
		} while (!cek.key);
		
		//Validasi Golongan
		do {
			System.out.print("Masukan golongan dan kode golongan (Tanpa spasi) : ");
			golongan = nilai.nextLine();
			cek.golongan(golongan);
		} while (!cek.key);
		
		//Validasi Masa Kerja
		do {
			System.out.print("Masukan masa kerja (dalam tahun) : ");
			masaKerja = nilai.nextLine();
			cek.angka(masaKerja);
			cek.masaKerja(masaKerja);
		} while (!cek.key);
		
		//Validasi Status Perkawinan
		do {
			System.out.print("Status Kawin (1.Kawin/2.Belum Kawin/3.Single Parents) : ");
			statusNikah = nilai.nextLine();
			cek.angka(statusNikah);
			cek.statusNikah(statusNikah);
		} while (!cek.key);
		
		//Validasi Jumlah Anak
		do {
			System.out.print("Jumlah anak : ");
			jumlahAnak = nilai.nextLine();
			cek.angka(jumlahAnak);
			cek.jumlahAnak(jumlahAnak);
		} while (!cek.key);
		
		//Validasi jenis PNS
		do {
			System.out.print("Jenis PNS (1.Pejabat/2.Pelayanan Masyarakat/3.Lainnya) : ");
			jenisPNS = nilai.nextLine();
			cek.angka(jenisPNS);
			cek.jenisPNS(jenisPNS);
		} while (!cek.key);
		
		//Validasi Tunjangan lain
		do {
			System.out.print("Tunjangan Lainnya (1.Ya/2.Tidak) : ");
			tunjanganLain = nilai.nextLine();
			cek.angka(tunjanganLain);
			cek.tunjanganLain(tunjanganLain);
		} while (!cek.key);
		
		
		if (tunjanganLain.equalsIgnoreCase("1")) {
			//Validasi nama tunjangan lainnya
			do {
				System.out.print("Masukan Nama Tunjangan Lainnya : ");
				namaTunjanganLain = nilai.nextLine();
				cek.huruf(namaTunjanganLain);
			} while (!cek.key);
			//Validasi nilai dari tunjangan lainnya
			do {
				System.out.print("Masukan Nilai Tunjangan Lainnya : ");
				nilaiTunjanganLain = nilai.nextLine();
				cek.angka(nilaiTunjanganLain);
			} while (!cek.key);
		}
		System.out.println();
		
		//Membuat objek berdasarkan jenis pns
		switch (jenisPNS) {
		//jika jenis pns sama dengan 1 atau pejabat maka objek untuk class Struktural dibuat
		case "1" : Pns pns1 = new Struktural(nama, nip, gender, golongan, masaKerja, statusNikah, jumlahAnak, jenisPNS, nilaiTunjanganLain);
				gajiPokok = pns1.getGajiPokok();
				tunjanganNikah = pns1.getTunjanganNikah();
				tunjanganAnak = pns1.getTunjanganAnak();
				tunjanganBeras = pns1.getTunjanganBeras();
				tunjanganFungsional = pns1.getTunjanganJabatan();
				nilaiTunjanganLain = pns1.nilaiTunjanganLain;
				bruto = pns1.getJumlahBruto();
				pphPerbulan = pns1.getPphPerbulan();
				iwp = pns1.getIwp();
				taperum = pns1.getTaperum();
				jumlahPotongan = pns1.getJumlahPotongan();
				jumlahNetto = pns1.getJumlahNetto();
			break;
			
		//jika jenis pns sama dengan 1 atau pejabat maka objek untuk class Fungsional dibuat
		case "2" : Pns pns2 = new Fungsional(nama, nip, gender, golongan, masaKerja, statusNikah, jumlahAnak, jenisPNS, nilaiTunjanganLain);
				gajiPokok = pns2.getGajiPokok();
				tunjanganNikah = pns2.getTunjanganNikah();
				tunjanganAnak = pns2.getTunjanganAnak();
				tunjanganBeras = pns2.getTunjanganBeras();
				tunjanganFungsional = pns2.getTunjanganJabatan();
				nilaiTunjanganLain = pns2.nilaiTunjanganLain;
				bruto = pns2.getJumlahBruto();
				pphPerbulan = pns2.getPphPerbulan();
				iwp = pns2.getIwp();
				taperum = pns2.getTaperum();
				jumlahPotongan = pns2.getJumlahPotongan();
				jumlahNetto = pns2.getJumlahNetto();
			break;
			
		//jika jenis pns sama dengan 1 atau pejabat maka objek untuk class Umum dibuat	
		case "3" : Pns pns3 = new Umum(nama, nip, gender, golongan, masaKerja, statusNikah, jumlahAnak, jenisPNS, nilaiTunjanganLain);
				gajiPokok = pns3.getGajiPokok();
				tunjanganNikah = pns3.getTunjanganNikah();
				tunjanganAnak = pns3.getTunjanganAnak();
				tunjanganBeras = pns3.getTunjanganBeras();
				tunjanganFungsional = pns3.getTunjanganJabatan();
				nilaiTunjanganLain = pns3.nilaiTunjanganLain;
				bruto = pns3.getJumlahBruto();
				pphPerbulan = pns3.getPphPerbulan();
				iwp = pns3.getIwp();
				taperum = pns3.getTaperum();
				jumlahPotongan = pns3.getJumlahPotongan();
				jumlahNetto = pns3.getJumlahNetto();
				
			break;
		}
		
		//Menampilkan Hasil
		System.out.println("SLIP GAJI PNS");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Nama     : "+nama);
		System.out.println("Golongan : "+golongan+"\t Masa kerja : "+masaKerja);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("PENGHASILAN \t\t\t\tPOTONGAN");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Gaji Pokok           : Rp."+(long) gajiPokok+"\t\tPotongan IWP     Rp.: "+(long)iwp);
		System.out.println("Tunjangan Menikah    : Rp."+(long)tunjanganNikah+"\t\tPotongan PPH     Rp.: "+(long)pphPerbulan);
		System.out.println("Tunjangan Anak       : Rp."+(long)tunjanganAnak+"\t\tPotongan Taperum Rp.: "+(long)taperum);
		System.out.println("Tunjangan Fungsional : Rp."+(long)tunjanganFungsional);
		System.out.println("Tunjangan Struktural : Rp."+(long)tunjanganStruktural);
		System.out.println("Tunjangan Umum       : Rp."+(long)tunjanganUmum+"\t\tJumlah Potongan  Rp.: "+(long)jumlahPotongan);
		System.out.println("Tunjangan Lainnya");
		System.out.println("Nama                 : Rp."+namaTunjanganLain.toUpperCase());
		System.out.println("Nilai                : Rp."+Long.parseLong(nilaiTunjanganLain));
		System.out.println("Tunjangan Beras      : Rp."+(long)tunjanganBeras);
		System.out.println("Tunjangan PPH        : Rp."+(long)pphPerbulan);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Gaji Kotor           : Rp."+(long)bruto+"\t\tJumlah Bersih   : Rp."+ (long)jumlahNetto);
		System.out.println("-----------------------------------------------------------------");

	}

}
