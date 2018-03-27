package Karyawan;

public class Karyawan extends AbstractKaryawan implements UMK, Tunjangan, Potongan {
	private String nik;
	private int gajiPokok, umk;
	String nama, penempatanKerja, statusBerkeluarga, level;
	int lamaKerja, lembur, jumlahLembur, tunjanganPegawai, bonus, tunjanganKeluarga, tunjanganTransport, potonganBPJSKesehatan, potonganBPJSKetenagakerjaan, potonganPPH, gajiKotor;
	
	// Constructor Overloading
	public Karyawan() {
		// TODO Auto-generated constructor stub
	}

	public Karyawan(Karyawan karyawan) {
		// TODO Auto-generated constructor stub
		nama = karyawan.nama;
		penempatanKerja = karyawan.penempatanKerja;
		level = karyawan.level;
		lamaKerja = karyawan.lamaKerja;
		bonus = karyawan.bonus;
		statusBerkeluarga = karyawan.statusBerkeluarga;
		
		setNik(karyawan.getNik());
		umk(penempatanKerja);
		gajiPokok();
		tunjanganPegawai();
		tunjanganKeluarga();
		lembur(karyawan.jumlahLembur);
		gajiKotor();
		potonganBPJSKesehatan();
		potonganBPJSKetenagakerjaan();
		potonganPPH();
	}
	
	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public int getGajiPokok() {
		return gajiPokok;
	}

	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public int getUmk() {
		return umk;
	}

	public void setUmk(int umk) {
		this.umk = umk;
	}
	
	public void umk(String penempatanKerja) {
		int umk = 0;
		if (penempatanKerja.equalsIgnoreCase("bandung")) {
			umk = umkKotaBandung;
		}
		else if (penempatanKerja.equalsIgnoreCase("jakarta")) {
			umk = umkKotaJakarta;
			tunjanganTransport = 1000000;
		}
		else if (penempatanKerja.equalsIgnoreCase("karawang")) {
			umk = umkKabKarawang;
		}
		setUmk(umk);
	}
	
	public void lembur(int jumlahLembur) {
		lembur = (int) (jumlahLembur * 1.5 * 1/173 * (getGajiPokok() + tunjanganPegawai));
	}
	
	public void tunjanganPegawai() {
		if (level.equalsIgnoreCase("junior")) {
			tunjanganPegawai = tunjanganPegawai + tunjanganJunior;
		}
		else if (level.equalsIgnoreCase("middle")) {
			tunjanganPegawai = tunjanganPegawai + tunjanganMiddle; 
		}
		else if (level.equalsIgnoreCase("senior")) {
			tunjanganPegawai = tunjanganPegawai + tunjanganSenior;
		}
	}
	
	public void tunjanganKeluarga() {
		if (statusBerkeluarga.equalsIgnoreCase("sudah")) {
			tunjanganKeluarga = (int) (Tunjangan.tunjanganKeluarga * (getGajiPokok() + tunjanganPegawai));
		}
	}
	
	public void potonganBPJSKesehatan() {
		potonganBPJSKesehatan = (int) (Potongan.potonganBPJSKesehatan * gajiKotor);
	}
	
	public void potonganBPJSKetenagakerjaan() {
		potonganBPJSKetenagakerjaan = (int) (Potongan.potonganBPJSKetenagakerjaan * gajiKotor);
	}
	
	public void potonganPPH() {		
		double biayaJabatan = 0;
		double gajiBersih = 0;
		double ptkp = 0;
		double pkp = 0;
		double pphSetahun = 0;
		
		biayaJabatan = potonganJabatan * gajiKotor;
		gajiBersih = gajiKotor - biayaJabatan;
		
		if (statusBerkeluarga.equalsIgnoreCase("sudah")) {
			ptkp = ptkp + ptkpSudahBerkeluarga;
		} 
		else {
			ptkp = ptkp + ptkpBelumBerkeluarga;
		}
		pkp = (gajiBersih * 12) - ptkp;
				
		if (pkp <= batasPPH50) {
			pphSetahun = potonganPPH50 * pkp;
		} 
		else if (pkp > batasPPH50 && pkp <= batasPPH250) {
			pkp = pkp - batasPPH50;	
			pphSetahun = (batasPPH50 * potonganPPH50) + (pkp * potonganPPH50Sampai250);
		} 
		else if (pkp > batasPPH250 && pkp <= batasPPH500) {
			pkp = pkp - batasPPH50 - batasPPH250;
			pphSetahun = (batasPPH50 * potonganPPH50) + (batasPPH250 * potonganPPH50Sampai250) + (pkp * potonganPPH250Sampai500);
		} 
		else if (pkp > batasPPH500) {
			pkp = pkp - batasPPH50 - batasPPH250 - batasPPH500;
			pphSetahun = (batasPPH50 * potonganPPH50) + (batasPPH250 * potonganPPH50Sampai250) + (batasPPH500 * potonganPPH250Sampai500) + (pkp * potonganPPH500);
		}	
		potonganPPH = (int) (pphSetahun / 12);
	}
	
	@Override
	public void gajiPokok() {
		// TODO Auto-generated method stub
		gajiPokok = umk;
	}

	@Override
	public void bonus(int bonus) {
		// TODO Auto-generated method stub
		bonus = 0;
	}

	@Override
	public void gajiKotor() {
		// TODO Auto-generated method stub
		gajiKotor = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n=============================================\n"
				+ "\tSlip Gaji Karyawan"
				+ "\n=============================================\n"
				+ "\nNama                          : " + nama + "\n"
				+ "NIK                           : " + nik + "\n"
				+ "Level                         : " + level + "\n"
				+ "Penempatan Kerja              : " + penempatanKerja + "\n"
				+ "Lama Kerja                    : " + lamaKerja + " Tahun\n"
				+ "Gaji Pokok                    : Rp. " + gajiPokok + "\n"
				+ "Lembur                        : Rp. " + lembur + "\n"
				+ "Bonus                         : Rp. " + bonus + "\n"
				+ "Tunjangan Pegawai             : Rp. " + tunjanganPegawai + "\n"
				+ "Tunjangan Keluarga            : Rp. " + tunjanganKeluarga + "\n"
				+ "Tunjangan Transport           : Rp. " + tunjanganTransport + "\n"
				+ "Gaji Kotor                    : Rp. " + gajiKotor + "\n" 
				+ "Potongan BPJS Kesehatan       : Rp. " + potonganBPJSKesehatan + "\n"
				+ "Potongan BPJS Ketenagakerjaan : Rp. " + potonganBPJSKetenagakerjaan + "\n"
				+ "Potongan PPH                  : Rp. " + potonganPPH + "\n"
				+ "\nTake Home Pay                 : Rp. " + (gajiKotor - potonganBPJSKesehatan - potonganBPJSKetenagakerjaan - potonganPPH);
	}

}
