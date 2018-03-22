//CLASS ABSTRAK
public abstract class AbstrakKaryawan {
	String 	nama, nik, tempatKerja, tingkatanPegawai, jenisPegawai, statusKawin;
	int 	lamaKerja, lamaLembur;
	
	public abstract void setuMK();
	public abstract void setTunjanganKeluarga();
	public abstract void setTunjanganPegawai();
	public abstract void setTunjanganTransportasi();
	public abstract void setGajiLembur();
	public abstract void setpTKP();
	public abstract void setBiayaJabatan();	
	public abstract void setPerhitungan();
	public abstract String toString();
	public abstract void menghitungBonus();
}
