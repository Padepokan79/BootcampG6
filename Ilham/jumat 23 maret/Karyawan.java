import java.util.HashMap;

public abstract class Karyawan implements UMK, TunjanganPegawai, UangLembur, PPH21, TunjanganLainnya, PotonganBPJS {
	protected String nama, nik, penempatanKerja, statusTingkat, pekerjaan;
	protected double gajiPokok, penghasilanKotor, penghasilanBersih, lembur, tunjanganPegawai, tunjanganTransport, tunjanganKeluarga, bonus, potonganBPJSKesehatan, potonganBPJSKetenagaKerjaan, pph;
	protected int lamaKerjaDalamSetahun, jumlahJamLembur;
	protected boolean isBerkeluarga;
	
	protected HashMap<String, Double> umkKota = new HashMap<String, Double>();
	protected HashMap<String, Double> pilihanTunjanganPegawai = new HashMap<String, Double>();
	
	public Karyawan(String nama, String nik, String penempatanKerja, String statusTingkat, String pekerjaan,
			int lamaKerjaDalamSetahun, int jumlahJamLembur, boolean isBerkeluarga) {
		super();
		this.nama = nama;
		this.nik = nik;
		this.penempatanKerja = penempatanKerja;
		this.statusTingkat = statusTingkat;
		this.pekerjaan = pekerjaan;
		this.lamaKerjaDalamSetahun = lamaKerjaDalamSetahun;
		this.jumlahJamLembur = jumlahJamLembur;
		this.isBerkeluarga = isBerkeluarga;
	}
	
	public void lakukanProsesPerhitungan() {
		setGajiPokok();		
		setTunjanganPegawai();
		setLembur();
		setTunjanganTransport();
		setTunjanganKeluarga();
		setBonus();
		setPenghasilanKotor();
		setPotonganBPJSKesehatan();
		setPotonganBPJSKetenagaKerjaan();
		setPPH();
		setPenghasilanBersih();
	}
	
	protected abstract void setGajiPokok();
	protected abstract void setBonus();
	
	protected void setPenghasilanBersih() {
		this.penghasilanBersih = penghasilanKotor - (potonganBPJSKesehatan + potonganBPJSKetenagaKerjaan + pph);
	}
	
	public double getPenghasilanBersih() {
		return this.penghasilanBersih;
	}
	
	protected void setPenghasilanKotor() {
		this.penghasilanKotor = gajiPokok + tunjanganPegawai + tunjanganKeluarga + tunjanganTransport + lembur + bonus;
	}
	
	public double getPenghasilanKotor() {
		return this.penghasilanKotor;
	}
	
	public double getGajiPokok() {
		return this.gajiPokok;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public String getNIK() {
		return this.nik;
	}
	
	public String getPekerjaan() {
		return this.pekerjaan;
	}
	
	public String getStatusTingkat() {
		return this.statusTingkat;
	}
		
	// Mendapatkan UMK
	@Override
	public double getUMK() {
		this.umkKota.put("Bandung", UMKBANDUNG);
		this.umkKota.put("Jakarta", UMKJAKARTA);
		this.umkKota.put("Karawang", UMKKARAWANG);
		return umkKota.get(this.penempatanKerja);
	}
	
	// Hitung Tunjangan Pegawai
	@Override
	public double hitungTunjanganPegawai() {
		this.pilihanTunjanganPegawai.put("Junior", TUNJANGANPEGAWAIJUNIOR);
		this.pilihanTunjanganPegawai.put("Middle", TUNJANGANPEGAWAIMIDDLE);
		this.pilihanTunjanganPegawai.put("Senior", TUNJANGANPEGAWAISENIOR);
		return this.pilihanTunjanganPegawai.get(this.statusTingkat);
	}
	protected void setTunjanganPegawai() {
		this.tunjanganPegawai = hitungTunjanganPegawai();		
	}
	public double getTunjanganPegawai() {
		return this.tunjanganPegawai;
	}
	
	// Hitung Uang Lembur
	@Override
	public double hitungUangLembur() {
		return this.jumlahJamLembur * RUMUSPERKALIANLEMBUR * (this.gajiPokok + this.tunjanganPegawai);
	}
	protected void setLembur() {
		this.lembur = hitungUangLembur();	
	}
	public double getLembur() {
		return this.lembur;
	}
	
	// Hitung Tunjangan Transport
	protected void setTunjanganTransport() {
		if (this.penempatanKerja.equalsIgnoreCase("Jakarta")) {
			this.tunjanganTransport = TUNJANGANTRANSPORTJAKARTA;			
		}
		else {
			this.tunjanganTransport = 0;
		}
	}
	public double getTunjanganTransport() {
		return this.tunjanganTransport;
	}
	
	// Hitung Tunjangan Keluarga
	@Override
	public double hitungTunjanganKeluarga() {
		if (isBerkeluarga) {
			return TUNJANGANKELUARGA * (this.gajiPokok + this.tunjanganPegawai);
		} else {
			return 0;
		}
	}
	protected void setTunjanganKeluarga() {
		this.tunjanganKeluarga = hitungTunjanganKeluarga();
	}
	public double getTunjanganKeluarga() {
		return this.tunjanganKeluarga;
	}
	
	// Hitung Potongan BPJS
	@Override
	public double hitungPotonganBPJSKesehatan() {
		return POTONGANBPJSKESEHATAN * this.penghasilanKotor;
	}
	@Override
	public double hitungPotonganBPJSKetenagaKerjaan() {
		return POTONGANBPJSKETENAGAKERJAAN * this.penghasilanKotor;
	}
	protected void setPotonganBPJSKesehatan() {
		this.potonganBPJSKesehatan = hitungPotonganBPJSKesehatan();	
	}
	protected void setPotonganBPJSKetenagaKerjaan() {
		this.potonganBPJSKetenagaKerjaan = hitungPotonganBPJSKetenagaKerjaan();
	}
	public double getPotonganBPJSKesehatan() {
		return this.potonganBPJSKesehatan;
	}
	public double getPotonganBPJSKestenagaKerjaan() {
		return this.potonganBPJSKetenagaKerjaan;
	}

	// Hitung PPh
	@Override
	public double hitungPPH() {
		double biayaJabatan, penghasilanNettoPerbulan, penghasilanNettoSetahun, ptkp,
				pkp, pphSetahun = 0, pph;
		
		biayaJabatan = BIAYAJABATAN * penghasilanKotor;
		if (biayaJabatan > MAKSIMALBIAYAJABATAN) {
			biayaJabatan = MAKSIMALBIAYAJABATAN;
		}
		
		penghasilanNettoPerbulan = penghasilanKotor - biayaJabatan;
		penghasilanNettoSetahun = penghasilanNettoPerbulan * 12;
		
		ptkp = PTKP;
		if (isBerkeluarga) {
			ptkp += PTKPTAMBAH;
		}
		
		pkp = penghasilanNettoSetahun - ptkp;
		
		if (pkp < 0) {
			pphSetahun += 0;
		}
		if (pkp > 0 && pkp <= PKPSATU) {
			pphSetahun += pkp * PAJAKPKPSATU;
			pkp -= PKPSATU;
		}
		if (pkp > PKPSATU) {
			pphSetahun += PKPSATU * PAJAKPKPSATU;
			pkp -= PKPSATU;
		}
		if (pkp > 0 && pkp <= PKPDUA) {
			pphSetahun += pkp * PAJAKPKPDUA;
			pkp -= PKPDUA;
		}
		if (pkp > PKPDUA) {
			pphSetahun += PKPDUA * PAJAKPKPDUA;
			pkp -= PKPDUA;
		}
		if (pkp > 0 && pkp <= PKPTIGA) {
			pphSetahun += pkp * PAJAKPKPTIGA;
			pkp -= PKPTIGA;
		}
		if (pkp > PKPTIGA) {
			pphSetahun += PKPTIGA * PAJAKPKPTIGA;
			pkp-= PKPTIGA;
		}
		if (pkp > 0) {
			pphSetahun += pkp * PAJAKPKPEMPAT;
		}
		pph = pphSetahun / 12;
		return pph;
	}
	protected void setPPH() {
		this.pph = hitungPPH();
	}
	public double getPPH() {
		return this.pph;
	}

}
