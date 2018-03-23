import java.util.ArrayList;
import java.util.HashMap;

//import java.util.HashMap;

public abstract class Pegawai implements Potongan, TunjanganKeluarga, Lembur, PerHitunganPPH {
	String nama,nik ,penempatanKerja,jenisPekerjaan,jabatan;
	double umk, tunjangan, tunjanganKeluarga, lembur,bruto, biayaJabatan, gajiBersih,lamaKerja,jamLembur,status, 
	kesehatan, ketenagaKerjaan, pphSetahun,pphPerbulan, pkp,tunjangJakarta;
	float gajiBersihSetahun;
	HashMap<String, Double> umkKaryawan = new HashMap<String, Double>();
	HashMap<String, Double> tunjanganKaryawan = new HashMap<String, Double>();
	ArrayList<Double> transport = new ArrayList<Double>();
	
	public Pegawai(String nama, String nik, String penempatanKerja, String jenisPekerjaan, String jabatan,
			double lamaKerja, double jamLembur, double status) {
		super();
		this.nama = nama;
		this.nik = nik;
		this.penempatanKerja = penempatanKerja;
		this.jenisPekerjaan = jenisPekerjaan;
		this.jabatan = jabatan;
		this.lamaKerja = lamaKerja;
		this.jamLembur = jamLembur;
		this.status = status;
	}

	public Pegawai() {
		
	}

	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getPenempatanKerja() {
		return penempatanKerja;
	}
	public void setPenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}
	public String getNik() {
		return nik;
	}
	public void setNik(String nik) {
		this.nik = nik;
	}
	public String getJenisPekerjaan() {
		return jenisPekerjaan;
	}
	public void setJenisPekerjaan(String jenisPekerjaan) {
		this.jenisPekerjaan = jenisPekerjaan;
	}
	public double getUmk() {
		return umk;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public double getJamLembur() {
		return jamLembur;
	}
	public void setJamLembur(double jamLembur) {
		this.jamLembur = jamLembur;
	}
	public int getLamaKerja() {
		return (int) lamaKerja;
	}
	public void setLamaKerja(double lamaKerja) {
		this.lamaKerja = lamaKerja;
	}

	public double getTunjangan() {
		return tunjangan;
	}

	public int getStatus() {
		return (int) status;
	}

	public double getBruto() {
		return bruto;
	}
	
	public double cariTunjangan() {
		return tunjangJakarta;
	}
	
	@Override
	public void tunjangan() {
		if (getStatus() == 1) {
			tunjanganKeluarga = (getUmk()+ getTunjangan())*keluarga;
		}
	}
	
	@Override
	public double getLembur() {
		return lembur;
	}
	@Override
	public double hitungKesehatan() {
		return kesehatan = bruto * bpjsKesehatan;
	}
	@Override
	public double hitungKetenagakerjaan() {
		return ketenagaKerjaan = bruto * bpjsKetenagakerjaan;
	}
	double hitungBiayaJabatan() {
		return biayaJabatan = 0.05 * getBruto();
	}
	double cariGajiBersih() {
		return gajiBersih = bruto - biayaJabatan;
	}
	float hitungGajiBersihSetahun() {
		return gajiBersihSetahun = (float) (gajiBersih * 12);
	}
	
	@Override
	public double hitungPTKP() {
		if (getStatus() == 1) {
			return ptkp + perOrang;
		}
		return ptkp;
	}
	@Override
	public double pkp() {
		return pkp = gajiBersihSetahun - hitungPTKP();
	}
	@Override
	public double hitungPPHSetahun() {
		if(pkp() <= lapisSATU) {
			return pphSetahun = pkp() * potonganSATU;
		}if (pkp() <= lapisTIGA) {
			pkp = pkp - lapisSATU;
			return pphSetahun = pphSetahun + (pkp * potonganDUA);
		}if (pkp() <= 500000000) {
			pkp = pkp - lapisDUA;
			return pphSetahun = pphSetahun + (pkp * potonganTIGA);
		}if (pkp() > 500000000) {
			pkp = pkp - (lapisTIGA+lapisDUA+lapisSATU);
			return pphSetahun = pphSetahun + (pkp * potonganEMPAT);
		}
		return 0;
	}
	@Override
	public double hitungPPHPerbulan() {
		return pphPerbulan = pphSetahun / 12;
	}
	
}
