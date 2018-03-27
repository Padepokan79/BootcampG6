/*author	: Regi Witanto
dibuat	: 26/03/2018 - 27/03/2018
*/

package GajiPNS;

// Class Abstract
public abstract class Pegawai {
	private String nip = "";
	private String  nama = "", jenisKelamin, masaKerja, statusPernikahan = "", jumlahAnak = "0";
	private double gajiPokok = 0;
	
	// Default Constructor
	public Pegawai() {
		// TODO Auto-generated constructor stub
	}
	
	// Getter Setter
	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String getStatusPernikahan() {
		return statusPernikahan;
	}

	public void setStatusPernikahan(String statusPernikahan) {
		this.statusPernikahan = statusPernikahan;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
	public String getMasaKerja() {
		return masaKerja;
	}

	public void setMasaKerja(String masaKerja) {
		this.masaKerja = masaKerja;
	}

	public double getGajiPokok() {
		return gajiPokok;
	}

	public void setGajiPokok(double gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public String getJumlahAnak() {
		return jumlahAnak;
	}

	public void setJumlahAnak(String jumlahAnak) {
		this.jumlahAnak = jumlahAnak;
	}
	
	// Method Abstract
	public abstract String toString();

}
