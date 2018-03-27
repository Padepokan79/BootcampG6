// Ilham 26-03-2018

import java.util.HashMap;
import java.util.Map;

public abstract class Karyawan implements TunjanganIstriAnak, TunjanganBeras, PotonganIWP, PotonganTaperum, PPH21, DataGajiPokok {
	private String nama, nip, jenisKelamin, kodeGolongan, statusMenikah, namaTunjanganLainnya;
	private double besarTunjanganLainnya, gajiPokok, tunjanganIstri, tunjanganAnak, tunjanganBeras, gajiKotor, potonganIWP, potonganTaperum, pph, gajiBersih;
	private int golongan, masaKerjaDalamTahun, jumlahAnak;
	private boolean tunjanganLainnya;	
	
	HashMap<String, double[]> gapokGol4 = new HashMap<String, double[]>();
	HashMap<String, double[]> gapokGol3 = new HashMap<String, double[]>();
	HashMap<String, double[]> gapokGol2 = new HashMap<String, double[]>();
	HashMap<String, double[]> gapokGol1 = new HashMap<String, double[]>();
	HashMap<Integer, HashMap<String, double[]>> dataGapok = new HashMap<Integer, HashMap<String, double[]>>();
	
	// Construct
	public Karyawan(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan, int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya) {
		this.nama = nama;
		this.nip = nip;
		this.jenisKelamin = jenisKelamin;
		this.golongan = golongan;
		this.kodeGolongan = kodeGolongan;
		this.masaKerjaDalamTahun = masaKerjaDalamTahun;
		this.statusMenikah = statusMenikah;
		this.jumlahAnak = jumlahAnak;
		this.setTunjanganLainnya(tunjanganLainnya);
		setPerhitungan();
	}

	// Construct
	// overloading
	public Karyawan(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan, int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya, String namaTunjanganLainnya, double besarTunjanganLainnya) {
		this.nama = nama;
		this.nip = nip;
		this.jenisKelamin = jenisKelamin;
		this.golongan = golongan;
		this.kodeGolongan = kodeGolongan;
		this.masaKerjaDalamTahun = masaKerjaDalamTahun;
		this.statusMenikah = statusMenikah;
		this.jumlahAnak = jumlahAnak;
		this.setTunjanganLainnya(tunjanganLainnya);
		this.namaTunjanganLainnya = namaTunjanganLainnya;
		this.besarTunjanganLainnya = besarTunjanganLainnya;
		setPerhitungan();
	}

	// method perhitungan
	private void setPerhitungan() {
		setDataGajiPokok();
		setGajiPokok();
		setTunjanganIstriAnak();
		setTunjanganBeras();
		setGajiKotor();
		setPotonganIWP();
		setPotonganTaperum();
		setPPH();
		setGajiBersih();
	}
	
	// memasukkan data gaji pokok ke hash map
	private void setDataGajiPokok() {
		gapokGol1.put("A", gol1A);gapokGol1.put("B", gol1B);gapokGol1.put("C", gol1C);gapokGol1.put("D", gol1D); 
		gapokGol2.put("A", gol2A);gapokGol2.put("B", gol2B);gapokGol2.put("C", gol2C);gapokGol2.put("D", gol2D); 
		gapokGol3.put("A", gol3A);gapokGol3.put("B", gol3B);gapokGol3.put("C", gol3C);gapokGol3.put("D", gol3D); 
		gapokGol4.put("A", gol4A);gapokGol4.put("B", gol4B);gapokGol4.put("C", gol4C);gapokGol4.put("D", gol4D);gapokGol4.put("E", gol4E);
		dataGapok.put(1, gapokGol1);dataGapok.put(2, gapokGol2);dataGapok.put(3, gapokGol3);dataGapok.put(4, gapokGol4);		
	}
	
	// set Gaji Bersih
	private void setGajiBersih() {
		this.gajiBersih = this.gajiKotor - (this.potonganIWP + this.potonganTaperum + this.pph);
	}
	
	// set Gaji Kotor
	// sebelum pph
	protected abstract void setGajiKotor(); 
	// overloading
	// setelah pph
	protected abstract void setGajiKotor(double gajiKotor, double pph); 
	
	protected void setGajiKotor(double gajiKotor) {
		this.gajiKotor = gajiKotor;
	}
	
	// method Get
	public abstract String getNamaTunjanganJabatan();
	public abstract double getTunjanganJabatan();
	public String getNama() {
		return nama;
	}
	public String getNip() {
		return nip;
	}
	public int getGolongan() {
		return golongan;
	}
	public String getKodeGolongan() {
		return kodeGolongan;
	}
	public int getMasaKerjaDalamTahun() {
		return masaKerjaDalamTahun;
	}
	public double getGajiBersih() {
		return gajiBersih;
	}
	public boolean isTunjanganLainnya() {
		return tunjanganLainnya;
	}

	public void setTunjanganLainnya(boolean tunjanganLainnya) {
		this.tunjanganLainnya = tunjanganLainnya;
	}

	
	// Gaji pokok
	private double hitungGajiPokok() {
		double gapok = 0;	
		HashMap<String, double[]> gapokGol = dataGapok.get(golongan);
		for(Map.Entry<String, double[]> entry : gapokGol.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(kodeGolongan)) {
				gapok = entry.getValue()[masaKerjaDalamTahun];
			}
		}
		return gapok;
	}
	private void setGajiPokok() {
		this.gajiPokok = hitungGajiPokok();
	}
	public double getGajiPokok() {
		return gajiPokok;
	}
	public double getGajiKotor() {
		return gajiKotor;
	}
	
	// Tunjangan Istri dan Anak
	@Override
	public double hitungTunjanganIstri() {
		return statusMenikah.equalsIgnoreCase("Menikah") ? TUNJANGANISTRI * this.gajiPokok : 0;
	}
	@Override
	public double hitungTunjanganAnak() {
		return TUNJANGANANAK * this.gajiPokok * (this.jumlahAnak > MAKSJUMLAHANAK ? MAKSJUMLAHANAK : this.jumlahAnak);
	}
	private void setTunjanganIstriAnak() {
		this.tunjanganIstri = hitungTunjanganIstri();
		this.tunjanganAnak = hitungTunjanganAnak();
	}
	public double getTunjanganIstri() {
		return tunjanganIstri;
	}
	public double getTunjanganAnak() {
		return tunjanganAnak;
	}
	
	// Tunjangan Beras
	@Override
	public double hitungTunjanganBeras() {
		int jumlahAnggotaKeluarga = 1 + (this.statusMenikah.equalsIgnoreCase("Menikah") ? 1 : 0) + this.jumlahAnak;
		return (jumlahAnggotaKeluarga > MAKSJUMLAHANGGOTAKELUARGA ? MAKSJUMLAHANGGOTAKELUARGA : jumlahAnggotaKeluarga) * JUMLAHBERASPERORANGDALAMKG * HARGABERAS;
	}
	private void setTunjanganBeras() {
		this.tunjanganBeras = hitungTunjanganBeras();
	}
	public double getTunjanganBeras() {
		return tunjanganBeras;
	}
	
	// Tunjangan Lainnya
	public boolean getTunjanganLainnya() {
		return isTunjanganLainnya();
	}
	public String getNamaTunjanganLainnya() {
		return namaTunjanganLainnya;
	}
	public double getBesarTunjanganLainnya() {
		return besarTunjanganLainnya;
	}
	
	// Potongan IWP
	@Override
	public double hitungPotonganIWP() {
		return POTONGANIWP * (this.gajiPokok + tunjanganIstri + tunjanganAnak);
	}
	private void setPotonganIWP() {
		this.potonganIWP = hitungPotonganIWP();
	}
	public double getPotonganIWP() {
		return potonganIWP;
	}

	// Potongan Taperum
	@Override
	public double hitungPotonganTaperum() {
		return POTONGANTAPERUM[golongan];
	}
	private void setPotonganTaperum() {
		this.potonganTaperum = hitungPotonganTaperum();
	}
	public double getPotonganTaperum() {
		return potonganTaperum;
	}
	
	// Hitung PPh
	@Override
	public double hitungPPH() {
		double biayaJabatan, iuranPensiun, penghasilanNettoPerbulan, penghasilanNettoSetahun, ptkp,
		pkp, pphSetahun = 0, pph;
		
		biayaJabatan = BIAYAJABATAN * gajiKotor > MAKSIMALBIAYAJABATAN ? MAKSIMALBIAYAJABATAN : BIAYAJABATAN * gajiKotor;
		iuranPensiun = IURANPENSIUN * (gajiPokok + tunjanganIstri + tunjanganAnak);
		
		penghasilanNettoPerbulan = gajiKotor - (biayaJabatan + iuranPensiun);
		penghasilanNettoSetahun = penghasilanNettoPerbulan * 12;
		
		ptkp = PTKP;
		if (statusMenikah.equalsIgnoreCase("Menikah")) {
			ptkp += PTKPTAMBAH;
		}
		ptkp += PTKPTAMBAH * (jumlahAnak > MAKSIMALANAK ? MAKSIMALANAK: jumlahAnak);
		
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
	private void setPPH() {
		this.pph = hitungPPH();
		setGajiKotor(this.gajiKotor, this.pph);
	}
	public double getPPH() {
		return pph;
	}

}