package main;

public abstract class Karyawan implements TunjanganPegawai, UMKpegawai, SatuanPotongan, SatuanPPH {

	// Variable
	private String namaLengkap, nik, penempatanKerja, statusNikah, tingkatan;
	private int tunjanganPegawai, tunjanganKeluarga, tunjanganTransportasi, lamaKerja, lembur;
	private int gajiPokok, umk, gajiKotor, bonus;
	private int potonganBPJSkesehatan, potonganBPJSketenagakerjaan, potonganPPH;
	
	// Default constructor
	public Karyawan() {
		// TODO Auto-generated constructor stub
	}
	
	public Karyawan(String nama, String nik, String penempatanKerja, String tingkatan, int lamaKerja, 
			String statusNikah, int banyakLembur, int bonus) {
		// TODO Auto-generated constructor stub
		this.namaLengkap = nama; // oper nama lengkap
		this.nik = nik; // oper nik
		this.penempatanKerja = penempatanKerja; // oper penempatan
		this.tingkatan = tingkatan; // oper tingkatan
		this.lamaKerja = lamaKerja; // oper lama kerja
		hitungUMK(penempatanKerja); // hitung umk
		hitungGajiPokok(); // hitung gaji pokok
		hitungTunjanganPegawai(); // hitung tunj. pegawai
		this.statusNikah = statusNikah; // oper status nikah
		hitungTunjanganKeluarga(); // hitung tunjangan nikah
		hitungLembur(banyakLembur); // hitung bonus lembur
		this.bonus = bonus; // oper bonus
		hitungGajiKotor(); // hitung gaji kotor
		hitungPotonganBPJSkesehatan(); // hitung bpjs kes
		hitungPotonganBPJSketenagakerjaan(); // hitung bpjs ket
		hitungPotonganPPH(); // hitung pph
	}
	
	// Penghitung dan tunjangan transport khusus Jakarta
	public void hitungUMK(String penempatanKerja) {
		int umk = 0;
		
		if (penempatanKerja.equals("Bandung")) {
			umk = umk + umkBandung;
		} else if (penempatanKerja.equals("Jakarta")) {
			umk = umk + umkJakarta;
			
			// Tunjangan transportasi
			tunjanganTransportasi = tunjanganTransportasiJakarta;
		} else {
			umk = umk + umkKarawang;
		}
		
		this.umk = umk;
	}

	public abstract void hitungGajiPokok();
	
	public abstract void hitungGajiKotor();
	
	public void hitungLembur(int banyakLembur) {
		double lembur = 0;
		
		lembur = lembur + (1.5 * 1 / 173 * (gajiPokok + tunjanganPegawai));
		
		this.lembur = (int) lembur * banyakLembur;
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
		
		this.tunjanganPegawai = tunjanganPegawai;
	}
	
	public void hitungPotonganPPH() {		
		double biayaJabatan = 0;
		double gajiBersih = 0;
		double ptkp = 0;
		double pkp = 0;
		double pphSetahun = 0;
		
		// Potongan biaya jabatan
		biayaJabatan = satuanPotonganJabatan * gajiKotor;
		
		// Gaji bersih
		gajiBersih = gajiKotor - biayaJabatan;
		
		// PTKP
		if (statusNikah.equals("Menikah")) {
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
			pkp = pkp - pengurangPph50juta;
			
			pphSetahun = (pengurangPph50juta * pph50juta) + (pkp * pph50sd250juta);
		} else if (pkp > batasPph250juta && pkp <= batasPph500juta) {
			pkp = pkp - pengurangPph50juta - pengurangPph250juta;
			
			pphSetahun = (pengurangPph50juta * pph50juta) + (pengurangPph250juta * pph50sd250juta) + 
					(pkp * pph250sd500juta);
		} else if (pkp > batasPph500juta) {
			pkp = pkp - pengurangPph50juta - pengurangPph250juta - pengurangPph500juta;
			
			pphSetahun = (pengurangPph50juta * pph50juta) + (pengurangPph250juta * pph50sd250juta) + 
					(pengurangPph500juta * pph250sd500juta) + (pkp * pph500juta);
		}
			
		this.potonganPPH = (int) pphSetahun / 12;
	}
	
	public void hitungPotonganBPJSkesehatan() {
		this.potonganBPJSkesehatan = (int) (satuanPotonganBPJSkesehatan * gajiKotor);
	}
	
	public void hitungPotonganBPJSketenagakerjaan() {
		this.potonganBPJSketenagakerjaan = (int) (satuanPotonganBPJSketenagakerjaan * gajiKotor);
	}
	
	public void hitungTunjanganKeluarga() {
		double tunjanganKeluarga = 0;
		
		if (statusNikah.equals("Menikah")) {
			tunjanganKeluarga = tunjanganKeluarga + satuanTunjanganKeluarga * (gajiPokok + tunjanganPegawai);
		}
		
		this.tunjanganKeluarga = (int) tunjanganKeluarga;
	}
	
	public abstract void hitungBonus(int jumlah);
	
	// Setters & Getters 
	public int getGajiPokok() {
		return gajiPokok;
	}

	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getTingkatan() {
		return tingkatan;
	}

	public int getTunjanganPegawai() {
		return tunjanganPegawai;
	}

	public int getTunjanganKeluarga() {
		return tunjanganKeluarga;
	}

	public int getTunjanganTransportasi() {
		return tunjanganTransportasi;
	}

	public int getLamaKerja() {
		return lamaKerja;
	}

	public int getLembur() {
		return lembur;
	}

	public int getUmk() {
		return umk;
	}

	public void setGajiKotor(int gajiKotor) {
		this.gajiKotor = gajiKotor;
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
