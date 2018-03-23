
import java.util.*;
public abstract class Karyawan implements UMK, TunjanganPegawai{
	String namaK,  noNIK, penempatanKerja, pekerjaan, kategoripegawai, status;
	double umk;
	int lamakerja, tunjangan=0, lamalembur, tunjangTransport;
	boolean isTrue;

	public Karyawan (String namaK, String noNIK, String penempatanKerja, String pekerjaan, String kategoripegawai, int lamakerja, String status, int lamalembur){
		this.namaK = namaK;
		this.noNIK = noNIK;
		this.penempatanKerja = penempatanKerja;
		this.pekerjaan = pekerjaan;
		this.kategoripegawai = kategoripegawai;
		this.lamakerja = lamakerja;
		this.status = status;
		this.lamalembur = lamalembur;
	}
	
	HashMap <String, Integer> kota = new HashMap<String, Integer>();
	
	//nama
	String getnamaK (){
		return namaK;
	}
	void setnamaK (String namaK) {
		this.namaK = namaK;
	}
	//no NIK
	String getnoNIK () {
		return noNIK;
	}
	void setnoNIK(String noNIK) {
		this.noNIK = noNIK;
	}
	
	//penempatan kerja
	String getpenempatanKerja() {
		return penempatanKerja;
	}
	void setpenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}
	//pekerjaan
	void setpekerjaan (String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}
	//kategoripegawai
	void setkategoripegawai (String kategoripegawai) {
		this.kategoripegawai= kategoripegawai;
	}
	//lama kerja
	void setlamakerja (int lamakerja) {
		this.lamakerja = lamakerja;
	}
	//abstract method gaji pokok
	public abstract double setGajiPokok();
	
	//umk
	double getumk() {
		kota.put("bandung" , bandung);
		kota.put("jakarta", jakarta);
		kota.put("karawang", karawang);
		return kota.get(penempatanKerja);
	}
	
	//tunjangan pegawai
	int gettunjanganPegawai() {
		if (kategoripegawai.equalsIgnoreCase("Junior")) {
			tunjangan = pegawaiJunior;
		}
		else if (kategoripegawai.equalsIgnoreCase("Middle")) {
			tunjangan = pegawaiMiddle;
		}
		else if (kategoripegawai.equalsIgnoreCase("Senior")) {
			tunjangan = pegawaiSenior;
		}
		return tunjangan;
	}
	//tunjangan transport
	int gettunjanganTransport() {
		if (penempatanKerja.equalsIgnoreCase("Jakarta")){
			tunjangTransport = tunJakarta;
		}
		else if (penempatanKerja.equalsIgnoreCase("Bandung")){
			tunjangTransport = 0;
		}
		else if (penempatanKerja.equalsIgnoreCase("Karawang")){
			tunjangTransport = 0;
		}
			return tunjangTransport;
	
	}
	
	String getvalidasi() {
		if(namaK.matches("[\\W]*")){
			System.out.println("Inputan anda masih kosong / salah!");
		}
		else{
			if(namaK.matches("[0-9]*")){
				if(namaK.length() > 18){
					System.out.println("Inputan yang anda masukkan lebih dari 12 angka!");
				}
				else{
				}
			}else{
				System.out.println("Inputan yang anda masukkan mengandung huruf / simbol!");
			}
		}
		return namaK;
		}
			
}
