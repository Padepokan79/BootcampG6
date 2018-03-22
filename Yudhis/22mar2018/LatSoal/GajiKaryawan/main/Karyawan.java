package main;

public abstract class Karyawan implements TunjanganPegawai, UMKpegawai, SatuanPotongan, SatuanPPH {

	// Variable
	private String namaLengkap, nik, penempatanKerja, statusNikah, tingkatan;
	private int tunjanganPegawai, tunjanganKeluarga, tunjanganTransportasi, lamaKerja, lembur, banyakLembur;
	private int gajiPokok, umk, gajiKotor, bonus;
	private int potonganBPJSkesehatan, potonganBPJSketenagakerjaan, potonganPPH;
	
	// Default constructor
	public Karyawan() {
		// TODO Auto-generated constructor stub
	}
	
	public Karyawan(Karyawan karyawan) {
		// TODO Auto-generated constructor stub
		setNamaLengkap(karyawan.getNamaLengkap()); // oper nama lengkap
		setNik(karyawan.getNik()); // oper nik
		setPenempatanKerja(karyawan.getPenempatanKerja()); // oper penempatan
		setTingkatan(karyawan.getTingkatan()); // oper tingkatan
		setLamaKerja(karyawan.getLamaKerja()); // oper lama kerja
		hitungUMK(getPenempatanKerja()); // hitung umk
		hitungGajiPokok(); // hitung gaji pokok
		hitungTunjanganPegawai(); // hitung tunj. pegawai
		setStatusNikah(karyawan.getStatusNikah()); // oper status nikah
		hitungTunjanganKeluarga(); // hitung tunjangan nikah
		hitungLembur(karyawan.getBanyakLembur()); // hitung bonus lembur
		setBonus(karyawan.getBonus()); // oper bonus
		hitungGajiKotor(); // hitung gaji kotor
		hitungPotonganBPJSkesehatan(); // hitung bpjs kes
		hitungPotonganBPJSketenagakerjaan(); // hitung bpjs ket
		hitungPotonganPPH(); // hitung pph
	}
	
	// Penghitung dan tunjangan transport khusus Jakarta
	public void hitungUMK(String penempatanKerja) {
		int umk = 0;
		
		if (getPenempatanKerja().equals("Bandung")) {
			umk = umk + umkBandung;
		} else if (getPenempatanKerja().equals("Jakarta")) {
			umk = umk + umkJakarta;
			
			// Tunjangan transportasi
			setTunjanganTransportasi(tunjanganTransportasiJakarta);
		} else {
			umk = umk + umkKarawang;
		}
		
		setUmk(umk);
	}

	public abstract void hitungGajiPokok();
	
	public abstract void hitungGajiKotor();
	
	public void hitungLembur(int banyakLembur) {
		double lembur = 0;
		
		lembur = lembur + (1.5 * 1 / 173 * (getGajiPokok() + getTunjanganPegawai()));
		
		setLembur((int) lembur * banyakLembur);
	};
	
	public void hitungTunjanganPegawai() {
		int tunjanganPegawai = 0;
		
		switch (tingkatan) {
			case "Junior":
				tunjanganPegawai = tunjanganPegawaiJunior;
				break;
			case "Middle":
				tunjanganPegawai = tunjanganPegawaiMiddle;
				break;
			case "Senior":
				tunjanganPegawai = tunjanganPegawaiSenior;
				break;
		}
		
		setTunjanganPegawai(tunjanganPegawai);
	}
	
	public void hitungPotonganPPH() {		
		double biayaJabatan = 0;
		double gajiBersih = 0;
		double ptkp = 0;
		double pkp = 0;
		double pphSetahun = 0;
		
		// Potongan biaya jabatan
		biayaJabatan = satuanPotonganJabatan * getGajiKotor();
		
		// Gaji bersih
		gajiBersih = getGajiKotor() - biayaJabatan;
		
		// PTKP
		if (getStatusNikah().equals("Menikah")) {
			ptkp = ptkp + ptkpMenikah;
		} else {
			ptkp = ptkp + ptkpBelumMenikah;
		}
		
		// Penghitungan PKP
		pkp = (gajiBersih * 12) - ptkp;
				
		// Penghitungan PPH
		if (pkp <= batasPph50juta) {
			pphSetahun = pph50juta * pkp;
		} else if (pkp > batasPph50juta && pkp <= batasPph250juta) {
			pkp = pkp - batasPph50juta;
			
			pphSetahun = (batasPph50juta * pph50juta) + (pkp * pph50sd250juta);
		} else if (pkp > batasPph250juta && pkp <= batasPph500juta) {
			pkp = pkp - batasPph50juta - batasPph250juta;
			
			pphSetahun = (batasPph50juta * pph50juta) + (batasPph250juta * pph50sd250juta) + 
					(pkp * pph250sd500juta);
		} else if (pkp > batasPph500juta) {
			pkp = pkp - batasPph50juta - batasPph250juta - batasPph500juta;
			
			pphSetahun = (batasPph50juta * pph50juta) + (batasPph250juta * pph50sd250juta) + 
					(batasPph500juta * pph250sd500juta) + (pkp * pph500juta);
		}
			
		setPotonganPPH((int) pphSetahun / 12);
	}
	
	public void hitungPotonganBPJSkesehatan() {
		setPotonganBPJSkesehatan((int) (satuanPotonganBPJSkesehatan * getGajiKotor()));
	}
	
	public void hitungPotonganBPJSketenagakerjaan() {
		setPotonganBPJSketenagakerjaan((int) (satuanPotonganBPJSketenagakerjaan * getGajiKotor()));
	}
	
	public void hitungTunjanganKeluarga() {
		double tunjanganKeluarga = 0;
		
		if (statusNikah.equals("Menikah")) {
			tunjanganKeluarga = tunjanganKeluarga + satuanTunjanganKeluarga * (getGajiPokok() + getTunjanganPegawai());
		}
		
		setTunjanganKeluarga((int) tunjanganKeluarga);
	}
	
	public abstract void hitungBonus(int jumlah);
	
	// Setters & Getters 
	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}

	public String getPenempatanKerja() {
		return penempatanKerja;
	}

	public void setPenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}

	public String getStatusNikah() {
		return statusNikah;
	}

	public void setStatusNikah(String statusNikah) {
		this.statusNikah = statusNikah;
	}

	public String getTingkatan() {
		return tingkatan;
	}

	public void setTingkatan(String tingkatan) {
		this.tingkatan = tingkatan;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public int getTunjanganPegawai() {
		return tunjanganPegawai;
	}

	public void setTunjanganPegawai(int tunjanganPegawai) {
		this.tunjanganPegawai = tunjanganPegawai;
	}

	public int getTunjanganKeluarga() {
		return tunjanganKeluarga;
	}

	public void setTunjanganKeluarga(int tunjanganKeluarga) {
		this.tunjanganKeluarga = tunjanganKeluarga;
	}

	public int getTunjanganTransportasi() {
		return tunjanganTransportasi;
	}

	public void setTunjanganTransportasi(int tunjanganTransportasi) {
		this.tunjanganTransportasi = tunjanganTransportasi;
	}

	public int getLamaKerja() {
		return lamaKerja;
	}

	public void setLamaKerja(int lamaKerja) {
		this.lamaKerja = lamaKerja;
	}

	public int getLembur() {
		return lembur;
	}

	public void setLembur(int lembur) {
		this.lembur = lembur;
	}

	public int getBanyakLembur() {
		return banyakLembur;
	}

	public void setBanyakLembur(int banyakLembur) {
		this.banyakLembur = banyakLembur;
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

	public int getGajiKotor() {
		return gajiKotor;
	}

	public void setGajiKotor(int gajiKotor) {
		this.gajiKotor = gajiKotor;
	}

	public int getPotonganBPJSkesehatan() {
		return potonganBPJSkesehatan;
	}

	public void setPotonganBPJSkesehatan(int potonganBPJSkesehatan) {
		this.potonganBPJSkesehatan = potonganBPJSkesehatan;
	}

	public int getPotonganBPJSketenagakerjaan() {
		return potonganBPJSketenagakerjaan;
	}

	public void setPotonganBPJSketenagakerjaan(int potonganBPJSketenagakerjaan) {
		this.potonganBPJSketenagakerjaan = potonganBPJSketenagakerjaan;
	}

	public int getPotonganPPH() {
		return potonganPPH;
	}

	public void setPotonganPPH(int potonganPPH) {
		this.potonganPPH = potonganPPH;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	// Print Slip Gaji
	@Override
	public String toString() {
		return 
				namaLengkap + "\n"
				+ nik + "\n"
				+ "\nPenempatan Kerja              : " + penempatanKerja
				+ "\nTingkatan                     : " + tingkatan 
				+ "\nLama Kerja                    : " + lamaKerja + "\n"
				
				+ "\nUMK                           : " + umk 
				+ "\nGaji Pokok                    : " + gajiPokok + "\n"
				
				+ "\nTunjangan Pegawai             : " + tunjanganPegawai
				+ "\nTunjangan Keluarga            : " + tunjanganKeluarga 
				+ "\nTunjangan Transportasi        : " + tunjanganTransportasi + "\n"
				 
				+ "\nLembur                        : " + lembur + "\n"
				+ "\nBonus                         : " + bonus + "\n"
				
				+ "\nGaji Kotor                    : " + gajiKotor + "\n" 
				
				+ "\nPotongan BPJS Kesehatan       : " + potonganBPJSkesehatan 
				+ "\nPotongan BPJS Ketenagakerjaan : " + potonganBPJSketenagakerjaan
				+ "\nPotongan PPH                  : " + potonganPPH + "\n"
		
				+ "\nTake Home Pay                 : " + (gajiKotor - potonganBPJSkesehatan - potonganBPJSketenagakerjaan - potonganPPH);
	}	
	
}
