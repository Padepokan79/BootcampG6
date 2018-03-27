import java.util.ArrayList;
import java.util.HashMap;

//import java.util.HashMap;

public abstract class Pegawai implements Potongan, TunjanganKeluarga, Lembur, PerHitunganPPH {
	protected String nama,nik ,penempatanKerja,jenisPekerjaan,jabatan;
	protected double umk, tunjangan,tunjanganKeluarga,lembur,bruto, biayaJabatan, gajiBersih,lamaKerja,jamLembur,status, 
	kesehatan,ketenagaKerjaan,pphSetahun,pphPerbulan,pkp,tunjangJakarta,gapok,bonus;
	protected float gajiBersihSetahun;
	HashMap<String, Double> umkKaryawan = new HashMap<String, Double>();
	HashMap<String, Double> tunjanganKaryawan = new HashMap<String, Double>();
	ArrayList<Double> transport = new ArrayList<Double>();
	
	public Pegawai(String nama, String nik, String penempatanKerja, String jenisPekerjaan, String jabatan,
			double lamaKerja, double jamLembur, double status) {
		this.nama = nama;
		this.nik = nik;
		this.penempatanKerja = penempatanKerja;
		this.jenisPekerjaan = jenisPekerjaan;
		this.jabatan = jabatan;
		this.lamaKerja = lamaKerja;
		this.jamLembur = jamLembur;
		this.status = status;
	}
	
	public void hitungSemua() {
		setGapok();
		setLembur();
		setTunjangan();
		setTunjanganKeluarga();
		setTunjangJakarta();
		setBonus();
		setBruto();
		setKesehatan();
		setKetenagaKerjaan();
		setBiayaJabatan();
		setGajiBersih();
		setGajiBersihSetahun();
		setPkp();
		setPphSetahun();
		setPphPerbulan();
	}
	
	abstract public void setGapok();
	abstract public void setBonus();
	
	public double getGapok() {
		return gapok;
	}
	public String getNama() {
		return nama;
	}
	public String getPenempatanKerja() {
		return penempatanKerja;
	}
	public String getNik() {
		return nik;
	}
	public String getJenisPekerjaan() {
		return jenisPekerjaan;
	}
	public double getUmk() {
		return umk;
	}
	public String getJabatan() {
		return jabatan;
	}
	public double getJamLembur() {
		return jamLembur;
	}
	public int getLamaKerja() {
		return (int) lamaKerja;
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
	
	@Override
	public double tunjangan() {
		if (getStatus() == 1) {
			return tunjanganKeluarga = (getGapok()+ getTunjangan())*keluarga;
		}return 0;
	}
	
	@Override
	public double getLembur() {
		return lembur;
	}
	@Override
	public double hitungKesehatan() {
		return bruto * bpjsKesehatan;
	}
	@Override
	public double hitungKetenagakerjaan() {
		return  bruto * bpjsKetenagakerjaan;
	}
	double hitungBiayaJabatan() {
		return biayaJabatan = 0.05 * bruto;
	}
	double cariGajiBersih() {
		return gajiBersih = bruto - biayaJabatan;
	}
	double hitungGajiBersihSetahun() {
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

	public double getTunjanganKeluarga() {
		return tunjanganKeluarga;
	}

	public void setTunjanganKeluarga() {
		this.tunjanganKeluarga = tunjangan();
	}

	public double getBiayaJabatan() {
		return biayaJabatan;
	}

	public void setBiayaJabatan() {
		this.biayaJabatan = hitungBiayaJabatan();
	}

	public double getGajiBersih() {
		return gajiBersih;
	}

	public void setGajiBersih() {
		this.gajiBersih = cariGajiBersih();
	}

	public double getKesehatan() {
		return kesehatan;
	}

	public void setKesehatan() {
		this.kesehatan = hitungKesehatan();
	}

	public double getKetenagaKerjaan() {
		return ketenagaKerjaan;
	}

	public void setKetenagaKerjaan() {
		this.ketenagaKerjaan = hitungKetenagakerjaan();
	}

	public double getPphSetahun() {
		return pphSetahun;
	}

	public void setPphSetahun() {
		this.pphSetahun = hitungPPHSetahun();
	}

	public double getPphPerbulan() {
		return pphPerbulan;
	}

	public void setPphPerbulan() {
		this.pphPerbulan = hitungPPHPerbulan();
	}

	public double getPkp() {
		return pkp;
	}

	public void setPkp() {
		this.pkp = pkp();
	}

	public double getTunjangJakarta() {
		return tunjangJakarta;
	}
	
	public double cariTunjangan() {
		transport.add(1000000.00);
		if (getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			return transport.get(0);
		}return getTunjangJakarta();
	}

	public void setTunjangJakarta() {
		this.tunjangJakarta = cariTunjangan();
	}

	public float getGajiBersihSetahun() {
		return gajiBersihSetahun;
	}

	public void setGajiBersihSetahun() {
		this.gajiBersihSetahun = (float) hitungGajiBersihSetahun();
	}

	public void setTunjangan() {
		this.tunjangan = cariTunjanganPegawai();
	}

	public void setLembur() {
		this.lembur = getJamLembur() * rumuslembur *(getGapok()+ getTunjangan());
	}
	public void setBruto() {
		this.bruto = getLembur() + getBonus() + getTunjangJakarta() + getGapok()+ getTunjangan()+ getTunjanganKeluarga();
	}

	public void setStatus(double status) {
		this.status = status;
	}
	public double getBonus() {
		return bonus;
	}
	
	public double cariTunjanganPegawai() {
		tunjanganKaryawan.put("junior", 200000.00);
		tunjanganKaryawan.put("middle", 300000.00);
		tunjanganKaryawan.put("senior", 500000.00);
		return tunjanganKaryawan.get(getJabatan());
	}
	
}
