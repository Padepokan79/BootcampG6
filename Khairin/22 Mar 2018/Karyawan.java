
public class Karyawan extends AbstrakKaryawan implements UMK, TunjanganPegawai, TunjanganKeluarga, BPJSKesehatan, BPJSKetenagakerjaan, LapisanPPH {
	private	double 	uMK, gajiPokok,  gajiLembur, tunjanganKeluarga, tunjanganPegawai, tunjanganTransportasi, bonus, penghasilanBruto,
					penghasilanNetto, potonganPphSetahun, potonganPphSebulan, potonganBPJSKesehatan, potonganBPJSKetenagakerjaan,
					nettoPph, biayaJabatan, pKP, pTKP;
	
	//CONSTRUCTOR
	public Karyawan() {
		// TODO Auto-generated constructor stub
	}
	
	public Karyawan(Karyawan karyawan) {
	setNama(karyawan.getNama());
	setNik(karyawan.getNik());
	setStatusKawin(karyawan.getStatusKawin());
	setBonus(karyawan.getBonus());
	setJenisPegawai(karyawan.getJenisPegawai());
	setLamaKerja(karyawan.getLamaKerja());
	setTempatKerja(karyawan.getTempatKerja());
	setLamaLembur(karyawan.getLamaLembur());
	setTingkatanPegawai(karyawan.getTingkatanPegawai());
	}
	
	public Karyawan(String nama, String nik, String tempatKerja, String tingkatanPegawai, String jenisPegawai,
			String statusKawin, int lamaKerja, int lamaLembur) {
		this.nama = nama;
		this.nik = nik;
		this.tempatKerja = tempatKerja;
		this.tingkatanPegawai = tingkatanPegawai;
		this.jenisPegawai = jenisPegawai;
		this.statusKawin = statusKawin;
		this.lamaKerja = lamaKerja;
		this.lamaLembur = lamaLembur;
	}

	//METHOD
	private double hitungGajiPokok () {
		setuMK();
		if (tingkatanPegawai.equalsIgnoreCase("junior")) { 
			if(lamaKerja == 1 || lamaKerja == 0) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*1.2;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*1.1;
				}
				
			} else if(lamaKerja == 2 || lamaKerja == 3) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*1.2;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*1.3;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*1.2;
				}
			
			} else if(lamaKerja > 3) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*1.5;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*1.6;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*1.5;
				}
			}
	}
	else if (tingkatanPegawai.equalsIgnoreCase("middle")) {
			if(lamaKerja == 0 || lamaKerja == 1 || lamaKerja == 2) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*1.7;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*1.8;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*1.8;
				}
			}
			else if(lamaKerja == 3 || lamaKerja == 4) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*1.8;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*1.9;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*1.9;
				}
			}
			else if(lamaKerja > 4) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*2.1;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*2.2;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*2.1;
				}
			}
		}
		else if (tingkatanPegawai.equalsIgnoreCase("senior")) {
			if(lamaKerja == 0 || lamaKerja == 1 || lamaKerja == 2) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*2.5;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*2.7;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*2.6;
				}
			}
			else if(lamaKerja == 3 || lamaKerja == 4) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*2.7;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*2.9;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*2.7;
				}
			}
			else if(lamaKerja > 4) {
				if(jenisPegawai.equalsIgnoreCase("programmer")) {
					gajiPokok = uMK*2.8;	
				}
				else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
					gajiPokok = uMK*3;
				}
				else if(jenisPegawai.equalsIgnoreCase("tester")) {
					gajiPokok = uMK*2.8;
				}
			}	
		}
			return gajiPokok;
	}
	
	private double hitungPenghasilanBruto () {
		return	penghasilanBruto = gajiPokok + gajiLembur + tunjanganKeluarga +  tunjanganPegawai + tunjanganTransportasi + bonus;
	}
	
	private double hitungPotonganPPh () {
		
		nettoPph = (penghasilanBruto - biayaJabatan) * 12;
		pKP = nettoPph - pTKP;
		
		if(pKP <= pphLapis1) {
			potonganPphSetahun = pKP * 0.05;
		}
		else if (pKP > pphLapis1 && pKP <= pphLapis3) {
			potonganPphSetahun = pphLapis1 * 0.05 + (pKP - pphLapis1) * 0.15;  
		}
		else if (pKP > pphLapis3 && pKP <= 500000000) {
			potonganPphSetahun = pphLapis1 * 0.05 + (pphLapis3 - pphLapis1) * 0.15
					+ (pKP - pphLapis3) * 0.25;
		}
		else if (pKP > 500000000) {
			potonganPphSetahun = pphLapis1 * 0.05 + (pphLapis3 - pphLapis1) * 0.15
					+ (500000000 - pphLapis3) * 0.25 + (pKP - 500000000) * 0.30;
		}
		potonganPphSebulan = potonganPphSetahun/12;
		
		return potonganPphSebulan;
	}
	
	private double hitungPenghasilanNetto () {
		return penghasilanBruto - potonganBPJSKesehatan - potonganBPJSKetenagakerjaan - potonganPphSebulan;
	}
	
	//GETTER & SETTER
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}
	
	public String getStatusKawin() {
		return statusKawin;
	}

	public void setStatusKawin(String statusKawin) {
		this.statusKawin = statusKawin;
	}

	public String getJenisPegawai() {
		return jenisPegawai;
	}

	public void setJenisPegawai(String jenisPegawai) {
		this.jenisPegawai = jenisPegawai;
	}

	public String getTingkatanPegawai() {
		return tingkatanPegawai;
	}

	public void setTingkatanPegawai(String tingkatanPegawai) {
		this.tingkatanPegawai = tingkatanPegawai;
	}
	
	public int getLamaKerja() {
		return lamaKerja;
	}

	public void setLamaKerja(int lamaKerja) {
		this.lamaKerja = lamaKerja;
	}

	public String getTempatKerja() {
		return tempatKerja;
	}

	public void setTempatKerja(String tempatKerja) {
		this.tempatKerja = tempatKerja;
	}

	public double getuMK() {
		return uMK;
	}

	public void setuMK() {
		if (tempatKerja.equalsIgnoreCase("Bandung")) {
			uMK = uMKBandung;
		}
		else if (tempatKerja.equalsIgnoreCase("Jakarta")) {
			uMK = uMKJakarta;
		}
		else if (tempatKerja.equalsIgnoreCase("Karawang")) {
			uMK = uMKKarawang;
		}
	}

	public double getGajiPokok() {
		return hitungGajiPokok();
	}

	/*public void setGajiPokok() {
		if (tingkatanPegawai.equalsIgnoreCase("junior")) { 
				if(lamaKerja == 1) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*1.2;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*1.1;
					}
					
				} else if(lamaKerja == 2 || lamaKerja == 3) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*1.2;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*1.3;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*1.2;
					}
				
				} else if(lamaKerja > 3) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*1.5;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*1.6;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*1.5;
					}
				}
		}
		else if (tingkatanPegawai.equalsIgnoreCase("middle")) {
				if(lamaKerja == 1 || lamaKerja == 2) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*1.7;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*1.8;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*1.8;
					}
				}
				else if(lamaKerja == 3 || lamaKerja == 4) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*1.8;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*1.9;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*1.9;
					}
				}
				else if(lamaKerja > 4) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*2.1;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*2.2;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*2.1;
					}
				}
			}
			else if (tingkatanPegawai.equalsIgnoreCase("senior")) {
				if(lamaKerja == 1 || lamaKerja == 2) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*2.5;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*2.7;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*2.6;
					}
				}
				else if(lamaKerja == 3 || lamaKerja == 4) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*2.7;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*2.9;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*2.7;
					}
				}
				else if(lamaKerja > 4) {
					if(jenisPegawai.equalsIgnoreCase("programmer")) {
						gajiPokok = uMK*2.8;	
					}
					else if(jenisPegawai.equalsIgnoreCase("system analyst")) {
						gajiPokok = uMK*3;
					}
					else if(jenisPegawai.equalsIgnoreCase("tester")) {
						gajiPokok = uMK*2.8;
					}
				}	
			}
		}*/
	
	public int getLamaLembur() {
		return lamaLembur;
	}

	public void setLamaLembur(int lamaLembur) {
		this.lamaLembur = lamaLembur;
	}

	public double getTunjanganKeluarga() {
		return tunjanganKeluarga;
	}

	public void setTunjanganKeluarga() {
		if (statusKawin.equalsIgnoreCase("kawin")) {
		tunjanganKeluarga = rateTunjanganKeluarga * (gajiPokok + tunjanganPegawai);
		}
	}
	
	public double getTunjanganPegawai() {
		return tunjanganPegawai;
	}

	public void setTunjanganPegawai() {
		if (tingkatanPegawai.equalsIgnoreCase("junior")) {
			tunjanganPegawai = tunjanganJunior;
		}
		else if (tingkatanPegawai.equalsIgnoreCase("middle")) {
			tunjanganPegawai = tunjanganMiddle;
		}
		else if (tingkatanPegawai.equalsIgnoreCase("senior")) {
			tunjanganPegawai = tunjanganSenior;
		}
	}
	
	public double getTunjanganTransportasi() {
		return tunjanganTransportasi;
	}

	public void setTunjanganTransportasi() {
		if (tempatKerja.equalsIgnoreCase("jakarta")) {
			tunjanganTransportasi = 1000000;
		}
	}

	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//METHOD OVERRIDING
	public void menghitungBonus() {
		
	}

	public double getPenghalisanBruto() {
		return hitungPenghasilanBruto();
	}

	/*public void setPenghalisanBruto() {
		if (jenisPegawai.equalsIgnoreCase("programmer") || jenisPegawai.equalsIgnoreCase("tester")) {	
		penghalisanBruto = gajiPokok + tunjanganKeluarga  + tunjanganPegawai + bonus;
		}		
		else {
		penghalisanBruto = gajiPokok + tunjanganKeluarga + tunjanganPegawai;
		}
	}*/
	
	public double getGajiLembur() {
		return gajiLembur;
	}


	public void setGajiLembur() {
		gajiLembur = ((double) lamaLembur/173) * 1.5 * (gajiPokok + tunjanganPegawai);
	}
	
	public double getpTKP() {
		return pTKP;
	}

	public void setpTKP() {
		if (statusKawin.equalsIgnoreCase("kawin")) {
			pTKP = 39000000;
		}
		else {
			pTKP = 36000000;
		}
	}

	public double getBiayaJabatan() {
		return biayaJabatan;
	}

	public void setBiayaJabatan() {
		biayaJabatan = 0.05 * penghasilanBruto;
		if (biayaJabatan > 500000) {
			biayaJabatan = 500000;
		}
	}

	/*public void setPotonganPphSetahun() {
		penghasilanBersihPajak = (penghalisanBruto - biayaJabatan) * 12;
		pKP = penghasilanBersihPajak - pTKP;
		
		if(pKP <= pphLapis1) {
			potonganPphSetahun = pKP * 0.05;
		}
		else if (pKP > pphLapis1 && pKP <= pphLapis3) {
			potonganPphSetahun = pphLapis1 * 0.05 + (pKP - pphLapis1) * 0.15;  
		}
		else if (pKP > pphLapis3 && pKP <= 500000000) {
			potonganPphSetahun = pphLapis1 * 0.05 + (pphLapis3 - pphLapis1) * 0.15
					+ (pKP - pphLapis3) * 0.25;
		}
		else if (pKP > 500000000) {
			potonganPphSetahun = pphLapis1 * 0.05 + (pphLapis3 - pphLapis1) * 0.15
					+ (500000000 - pphLapis3) * 0.25 + (pKP - 500000000) * 0.30;
		}
		
	}*/

	public double getPotonganPphSebulan() {
		return hitungPotonganPPh();
	}

	public double getPotonganBPJSKesehatan() {
		return potonganBPJSKesehatan;
	}

	public void setPotonganBPJSKesehatan() {
		potonganBPJSKesehatan = rateBPJSKesehatan * penghasilanBruto;
	}

	public double getPotonganBPJSKetenagakerjaan() {
		return potonganBPJSKetenagakerjaan;
	}

	public void setPotonganBPJSKetenagakerjaan() {
		potonganBPJSKetenagakerjaan = rateBPJSKtenagakerjaan * penghasilanBruto;
	}
	
	public double getPenghasilanNetto() {
		return hitungPenghasilanNetto();
	}
	public void setPerhitungan() {
		hitungGajiPokok();
		setTunjanganPegawai();
		setTunjanganKeluarga();
		setTunjanganTransportasi();
		setGajiLembur();
		menghitungBonus();
		hitungPenghasilanBruto();
		setPotonganBPJSKesehatan();
		setPotonganBPJSKetenagakerjaan();
		hitungPotonganPPh();
		hitungPenghasilanNetto();	
	}
	
	//DISPLAY SLIP GAJI

	//METHOD OVERRIDING
	@Override
	public String toString() {
		setPerhitungan();
		return "Nama Pegawai				: " + nama + 
				"\nNomor NIK Pegawai			: " + nik +
				"\nStatus Kawin				: " + statusKawin +
				"\nPosisi Pekerjaan			: " + jenisPegawai +
				"\nLama Bekerja				: " + lamaKerja + " Tahun " +
				"\nGaji Pokok				: " + (int) gajiPokok +
				"\nTunjangan Kawin				: " + (int) tunjanganKeluarga +
				"\nTunjangan Pegawai			: " + (int) tunjanganPegawai +
				"\nTunjangan Transport			: " + (int) tunjanganTransportasi +	
				"\nTotal Tunjangan				: " + (int) (tunjanganKeluarga+tunjanganPegawai) +
				"\nJam Lembur				: " + lamaLembur + " Jam " +
				"\nGaji Lembur				: " + (int) gajiLembur +
				"\nBonus					: " + (int) bonus +
				"\n=========================================================================="
				+ "===========" +
				"\nPenghasilan Bruto			: " + (int) penghasilanBruto + 
				"\nPotongan BPJS Kesehatan			: " + (int) potonganBPJSKesehatan +
				"\nPotongan BPJS Ketenagakerjaan		: " + (int) potonganBPJSKetenagakerjaan +
				"\nPotongan Pph Pasal 21			: " + (int) potonganPphSebulan +
				"\nTotal Potongan				: " + (int) (potonganBPJSKesehatan + potonganBPJSKetenagakerjaan + potonganPphSebulan) +
				"\n======================================================================================" +
				"\nTAKE HOME PAY				: " + (int) hitungPenghasilanNetto();
	}	
	
}