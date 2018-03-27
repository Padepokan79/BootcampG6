//author Siska Pitriani 26/03/2018
package GajiPNSOOP;
import java.util.*;

public abstract class PegawaiPNS implements TunjanganUmum, PotonganTaperum{
	String nama, nip, golonganUmum, golonganKhusus, status, tunjanganLain, lamaKerja, jenisKelamin, jumlahAnak, jenisPNS, tuntunjanganLain;
	//constructor
	public void Pegawai  (String nip, String nama, String jenisKelamin, String golonganUmum, String golonganKhusus, String lamaKerja, String status, 
	String jumlahAnak, String jenisPNS , String tunjanganLain) {
		this.nip = nip;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.golonganUmum = golonganUmum;
		this.golonganKhusus = golonganKhusus;
		this.lamaKerja = lamaKerja;
		this.status = status;
		this.jumlahAnak = jumlahAnak;
		this.jenisPNS = jenisPNS;
		this.tunjanganLain = tunjanganLain;
		
	}
	
	//HashMap untuk tunjangan Umum
	HashMap <String, Integer> tUmum = new HashMap<String, Integer>();
	//HashMap untuk Taperum
	HashMap <String, Integer> taperum = new HashMap <String, Integer>();
	
	//getter & setter nama
	String getNama () {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	//getter & setter nip
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	// getter & setter golongan Umum
	public String getGolonganUmum() {
		return golonganUmum;
	}
	public void setGolonganUmum(String golonganUmum) {
		this.golonganUmum = golonganUmum;
	}
	// getter & setter status
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//getter & setter tunjangan Lain
	public String getTunjanganLain() {
		return tunjanganLain;
	}
	public void setTunjanganLain(String tunjanganLain) {
		this.tunjanganLain = tunjanganLain;
	}
	//getter & setter lama kerja
	public String getLamaKerja() {
		return lamaKerja;
	}
	public void setLamaKerja(String lamaKerja) {
		this.lamaKerja = lamaKerja;
	}
	//getter & setter jenis kelamin
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	//getter & setter jumlah anak
	public String getJumlahAnak() {
		return jumlahAnak;
	}
	public void setJumlahAnak(String jumlahAnak) {
		this.jumlahAnak = jumlahAnak;
	}
	//getter & setter jenis PNS
	public String getJenisPNS() {
		return jenisPNS;
	}
	public void setJenisPNS(String jenisPNS) {
		this.jenisPNS = jenisPNS;
	}
	//Mendapat Tunjangan Umum berdasarkan golongan 
	int getTunjangUmum () {
		tUmum.put("1", tunGolongan1);
		tUmum.put("2", tunGolongan2);
		tUmum.put("3", tunGolongan3);
		tUmum.put("4", tunGolongan4);
		return tUmum.get(golonganUmum);
		
	}
	//Mendapat Taperum berdasarkan golongan
	int getTapeRum () {
		taperum.put("1", taperumgol1);
		taperum.put("2", taperumgol2);
		taperum.put("3", taperumgol3);
		taperum.put("4", taperumgol4);
		return taperum.get(golonganUmum);
	}
	//method abstract untuk menghitung GajiPokok
	abstract int getGajiPokok();
	
}
