import java.util.ArrayList;
import java.util.Scanner;

/* @author : lenawidiani
 * @dibuat : 26 Maret 2018
 * 
 */

public class MainApp {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//==============================================ArrayList===========================================================
		ArrayList<String> listGender = new ArrayList<String>();
		listGender.add("pria");
		listGender.add("wanita");
		
		ArrayList<String> listStatusNikah = new ArrayList<String>();
		listStatusNikah.add("menikah");
		listStatusNikah.add("belum menikah");
		listStatusNikah.add("single parent");
		
		ArrayList<String> listJenisPNS = new ArrayList<>();
		listJenisPNS.add("pejabat");
		listJenisPNS.add("pelayan masyarakat");
		listJenisPNS.add("lainnya");
		//==================================================================================================================
		
		String pertanyaan, nama = "", nip = "", gender = "", golongan = "", masaKerja = "0", statusNikah = "", jumlahAnak = "0", jenisPNS = "", adaTunjanganLain = "", namaTunjanganLain = "", besarTunjanganLain = "0";
		
		pertanyaan = ">> Nama lengkap\t\t\t\t : ";
		nama = validasiInputan(pertanyaan, 1, 32, "huruf");
		
		pertanyaan = ">> NIP\t\t\t\t\t : ";
		nip = validasiInputan(pertanyaan, 12, 18, "angka");
		
		pertanyaan = ">> Jenis kelamin (Pria / Wanita)\t : ";
		gender = validasiInputan(pertanyaan, listGender);
		
		pertanyaan = ">> Golongan (Contoh: 1A)\t\t : ";
		golongan = validasiInputan(pertanyaan, 2, 2, "kombinasi");
		
		pertanyaan = ">> Masa Kerja (dalam tahun)\t\t : ";
		masaKerja = validasiInputanMasaKerja(pertanyaan, golongan);
		
		pertanyaan = ">> Status pernikahan\n   [Menikah/Belum Menikah/Single Parent] : ";
		statusNikah = validasiInputan(pertanyaan, listStatusNikah);
		
		pertanyaan = ">> Jumlah anak \t\t\t\t : ";
		jumlahAnak = validasiInputan(pertanyaan, "angka");
		
		pertanyaan = ">> Tunjangan lain (Y / N)\t\t : ";
		adaTunjanganLain = validasiInputan(pertanyaan, "YesNo");
		
		if(adaTunjanganLain.equalsIgnoreCase("y")) {
			pertanyaan = "   >> Nama Tunjangan\t\t: ";
			namaTunjanganLain = validasiInputan(pertanyaan, "huruf");
			
			pertanyaan = "   >> Besar Tunjangan\t\t: ";
			besarTunjanganLain = validasiInputan(pertanyaan, "angka");
		}
		
		pertanyaan = ">> Jenis PNS\n   [Pejabat/Pelayan Masyarakat/Lainnya]  : ";
		jenisPNS = validasiInputan(pertanyaan, listJenisPNS);
		
		switch (jenisPNS.toLowerCase()) {
		case "pejabat":
			Pejabat pejabat = new Pejabat(nama, nip, gender, golongan, Integer.parseInt(masaKerja), statusNikah, Integer.parseInt(jumlahAnak), namaTunjanganLain, Integer.parseInt(besarTunjanganLain));
			break;

		case "pelayan masyarakat":
			PelayanMasyarakat pelayanMasyarakat = new PelayanMasyarakat(nama, nip, gender, golongan, Integer.parseInt(masaKerja), statusNikah, Integer.parseInt(jumlahAnak), namaTunjanganLain, Integer.parseInt(besarTunjanganLain));
			break;
			
		case "lainnya":
			PejabatLainnya pejabatLainnya = new PejabatLainnya(nama, nip, gender, golongan, Integer.parseInt(masaKerja), statusNikah, Integer.parseInt(jumlahAnak), namaTunjanganLain, Integer.parseInt(besarTunjanganLain));
			break;
		}
		
		
	}

	//===========================================method overloading=====================================================
	public static String validasiInputan(String pertanyaan, int minKarakter, int maxKarakter,  String inputanBerupa) {
		boolean isTrue = false;
		String nilai="";
		
		while(!isTrue){
			System.out.print(pertanyaan);
			nilai = scan.nextLine();
			
			if(nilai.matches("[\\W]*")) {
				System.out.println("Inputan anda kosong atau salah!");
			}
			else {
				switch (inputanBerupa) {
				case "huruf":
					if(nilai.matches("[a-zA-Z .,]*")) {
						if(nilai.length() < minKarakter) {
							System.out.println("Inputan anda tidak boleh kosong!");
						}
						else if(nilai.length() > maxKarakter) {
							System.out.println("Inputan anda lebih dari "+maxKarakter+" karakter");
						}
						else {
							isTrue = true;
						}
					}
					else {
						System.out.println("Inputan tidak boleh angka / simbol!");
					}
					break;

				case "angka":
					if(nilai.matches("[0-9]*")) {
						if(nilai.length() < minKarakter) {
							System.out.println("Inputan anda kurang dari "+minKarakter+" angka!");
						}
						else if(nilai.length() > maxKarakter) {
							System.out.println("Inputan anda lebih dari "+maxKarakter+" angka!");
						}
						else {
							isTrue =true;
						}
					}
					else {
						System.out.println("Inputan tidak boleh huruf / simbol!");
					}
					break;
				
				case "kombinasi":
					if(nilai.length() == 2){
						if(nilai.substring(0,1).matches("[1-4]*") && nilai.substring(1,2).matches("[A-Da-d]*") || nilai.matches("4[Ee]")){
							isTrue = true;
						}else{
							System.out.println("Inputan yang anda masukkan salah!");
						}
					}else{
						System.out.println("Inputan yang anda masukkan salah!");
					}
					break;
				}
			}
		}
		return nilai;
	}
	
	public static String validasiInputan(String pertanyaan, ArrayList<String> listArray) {
		boolean isTrue = false;
		String nilai="";
		
		while(!isTrue){
			System.out.print(pertanyaan);
			nilai = scan.nextLine();
			
			if(nilai.matches("[\\W]*")) {
				System.out.println("Inputan anda kosong atau salah!");
			}
			else {
				if(nilai.matches("[a-zA-Z .,]*")) {
					for(String list : listArray) {
						if(nilai.equalsIgnoreCase(list)) {
							isTrue = true;
						}
					}
					
					if(!isTrue) {
						System.out.println("Inputan anda salah!");
					}
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
		}
		return nilai;
	}
		
	public static String validasiInputan(String pertanyaan, String inputanBerupa) {
		boolean isTrue = false;
		String nilai="";
		
		while(!isTrue){
			System.out.print(pertanyaan);
			nilai = scan.nextLine();
			
			if(nilai.matches("[\\W]*")) {
				System.out.println("Inputan anda kosong atau salah!");
			}
			else {
				switch (inputanBerupa) {
				case "huruf":
					if(nilai.matches("[a-zA-Z .,]*")) {
						isTrue = true;
					}
					else {
						System.out.println("Inputan tidak boleh angka / simbol!");
					}
					break;

				case "angka":
					if(nilai.matches("[0-9]*")) {
						isTrue = true;
					}
					else {
						System.out.println("Inputan tidak boleh huruf / simbol!");
					}
					break;
				case "YesNo":
					if(nilai.equalsIgnoreCase("y") || nilai.equalsIgnoreCase("n")) {
						isTrue = true;
					}
					else {
						System.out.println("Inputan anda salah, harus berupa Y / N!");
					}
					break;
				}
			}
		}
		return nilai;
	}
	//==================================================================================================================
	
	public static String validasiInputanMasaKerja(String pertanyaan, String nilaiPembanding) {
		boolean isTrue = false;
		String nilai="";
		
		while(!isTrue){
			System.out.print(pertanyaan);
			nilai = scan.nextLine();
			
			if(nilai.matches("[\\W]*")) {
				System.out.println("Inputan anda kosong atau salah!");
			}
			else {
				if(nilai.matches("[0-9]*")) {
					if(Integer.parseInt(nilai) < 3 && nilaiPembanding.matches("[1-2B-Db-d]*")){
						System.out.println("Golongan " + nilaiPembanding + " minimal memiliki masa kerja 3 tahun!");
					}else{
						isTrue = true;
					}
				}
				else {
					System.out.println("Inputan harus berupa angka & tidak bernilai negatif!");
				}
			}
		}
		return nilai;
	}
	
}