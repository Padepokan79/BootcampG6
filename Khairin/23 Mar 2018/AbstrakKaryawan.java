//CLASS ABSTRAK
public abstract class AbstrakKaryawan {
	String 	nama, nik, tempatKerja, tingkatanPegawai, jenisPegawai, statusKawin;
	int 	lamaKerja, lamaLembur;
	
	public abstract double getuMK();
	public abstract double getTunjanganKeluarga();
	public abstract double getTunjanganPegawai();
	public abstract double getTunjanganTransportasi();
	public abstract double getGajiLembur();
	public abstract double getpTKP();
	public abstract double getBiayaJabatan();	
	public abstract void getPerhitungan();
	public abstract String toString();
	public abstract void menghitungBonus();
	public abstract double getPotonganBPJSKesehatan();
	public abstract double getPotonganBPJSKetenagakerjaan();
}
