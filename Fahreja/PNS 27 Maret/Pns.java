import java.util.ArrayList;

//author fahreja 26 maret 2017
//edit 27 maret 2017
public abstract class Pns implements Golongan, TunjanganMenikah, TunjanganKeluarga, TunjanganBeras,TunjanganJabatan,PerHitunganPPH, PotonganLain{
	protected String nip,nama, gender, golongan, masaKerja,statusNikah,jumlahAnak, jenisPNS;
	protected String adaTunjanganLain, namaTunjanganLain, nilaiTunjanganLain;
	
	protected double gajiPokok, bruto, netto, nettoSetahun, jumlahPotongan, jumlahNetto,jumlahBruto;
	protected double tunjanganNikah,tunjanganAnak,tunjanganLain,tunjanganBeras, tunjanganJabatan;
	protected double biayaJabatan, iuranPensiun, ptkp, pkp,pkpTemp, pphSetahun, pphPerbulan,iwp;
	
	protected int anggotaKeluarga,jumlahAnggotaKeluarga, jumlahAnakTemp, taperum;
	
	ArrayList<Integer>golonganTemp = new ArrayList<Integer>();
	
	public Pns() {
		
	}
	
	
	public Pns (String nama, String nip, String gender, String golongan, String masaKerja, String statusNikah,String jumlahAnak,String jenisPNS,String nilaiTunjanganLain) {
		this.nama = nama;
		this.nip = nip;
		this.gender = gender;
		this.golongan = golongan;
		this.masaKerja = masaKerja;
		this.statusNikah = statusNikah;
		this.jumlahAnak = jumlahAnak;
		this.jenisPNS = jenisPNS;
		this.nilaiTunjanganLain = nilaiTunjanganLain;
	}
	
	//Method semua perhitungan
	public void perHitungan() {
		setGajiPokok();
		setTunjanganNikah();
		setTunjanganAnak();
		setTunjanganBeras();
		setTunjanganJabatan();
		setBruto();
		setBiayaJabatan();
		setIuranPensiun();
		setNetto();
		setNettoSetahun();
		setPtkp();
		setPkp();
		setPphSetahun();
		setPphPerbulan();
		setIwp();
		setTaperum();
		setJumlahBruto();
		setJumlahPotongan();
		setJumlahNetto();
	}
	//abstract untuk menset nilai tunjangan dari class child
	abstract public void setTunjanganJabatan();
	
	@Override //dari interface golongan
	//cari Gaji berdasarkan golongan dan masa kerja
	public double cariGolongan() {
		switch (getGolongan()) {
		case "1A": golonganTemp.add(golongan1A[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "1B": golonganTemp.add(golongan1B[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "1C": golonganTemp.add(golongan1C[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "1D": golonganTemp.add(golongan1D[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "2A": golonganTemp.add(golongan2A[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "2B": golonganTemp.add(golongan2B[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "2C": golonganTemp.add(golongan2C[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "2D": golonganTemp.add(golongan2D[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "3A": golonganTemp.add(golongan3A[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "3B": golonganTemp.add(golongan3B[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "3C": golonganTemp.add(golongan3C[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "3D": golonganTemp.add(golongan3D[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "4A": golonganTemp.add(golongan4A[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "4B": golonganTemp.add(golongan4B[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "4C": golonganTemp.add(golongan4C[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "4D": golonganTemp.add(golongan4D[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		case "4E": golonganTemp.add(golongan4E[Integer.parseInt(masaKerja)]);
			return golonganTemp.get(0);
		}
		return 0;
	}
	
	//Set nilai gaji pokok
	public void setGajiPokok(){
		this.gajiPokok = cariGolongan();
	}
	
	public String getGolongan() {
		return golongan;
	}
	
	public double getGajiPokok() {
		return gajiPokok;
	}
	public String getStatusNikah() {
		return statusNikah;
	}
	
	@Override//dari interface tunjangan menikah
	//perhitungan tunjangan menikah
	public double cariTunjanganMenikah() {
		if (Integer.parseInt(getStatusNikah()) == 1) {
			anggotaKeluarga ++;
			return istri * getGajiPokok();
		}
		return 0;
	}
	//Set nilai tunjangan menikah
	public void setTunjanganNikah() {
		this.tunjanganNikah = cariTunjanganMenikah();
	}
	
	public double getTunjanganNikah() {
		return tunjanganNikah;
	}
	public String getJumlahAnak() {
		return jumlahAnak;
	}
	public int getJumlahAnakTemp() {
		return jumlahAnakTemp;
	}
	//Set nilai jumlah anak
	public void setJumlahAnakTemp(int jumlahAnakTemp) {
		this.jumlahAnakTemp = jumlahAnakTemp;
	}
	
	@Override //dari interface tunjangan keluarga 
	//Perhitungan tunjangan anak
	public double cariTunjanganKeluarga() {
		setJumlahAnakTemp(Integer.parseInt(getJumlahAnak()));
		if (Integer.parseInt(getJumlahAnak()) > 2) {
			setJumlahAnakTemp(2);
			return keluarga * getGajiPokok()* getJumlahAnakTemp();
		}
		return keluarga * getGajiPokok()* getJumlahAnakTemp();
	}
	
	//Set nilai tunjangan anak(Maksimal anak 2)
	public void setTunjanganAnak() {
		this.tunjanganAnak = cariTunjanganKeluarga();
	}
	public double getTunjanganAnak() {
		return tunjanganAnak;
	}
	
	@Override//dari interface tunjangan beras
	//Perhitungan tunjangan beras
	public double cariTunjanganBeras() {
		jumlahAnggotaKeluarga = anggotaKeluarga + getJumlahAnakTemp();
		return ((jumlahAnggotaKeluarga+1)* banyakBeras)*hargaBeras;
	}
	//Set nilai tunjangan beras 
	public void setTunjanganBeras() {
		this.tunjanganBeras = cariTunjanganBeras();
	}
	public double getTunjanganBeras() {
		return tunjanganBeras;
	}
	
	public String getJenisPNS() {
		return jenisPNS;
	}
	public double getTunjanganJabatan() {
		return tunjanganJabatan;
	}

	//Perhitungan Bruto
	private double cariBruto() {
		return getGajiPokok()+getTunjanganNikah()+getTunjanganAnak()+getTunjanganBeras()+getTunjanganJabatan()+Integer.parseInt(nilaiTunjanganLain);

	}
	//Set nilai gaji kotor
	public void setBruto() {
		this.bruto = cariBruto();
	}
	public double getBruto() {
		return bruto;
	}
	//Perhitungan Biaya jabatan
	public double cariBiayaJabatan() {
		return 0.05 * getBruto();
	}
	//Set nilai biaya jabatan
	public void setBiayaJabatan() {
		if (cariBiayaJabatan() > 500000) {
			this.biayaJabatan = 500000;
		}else {
			this.biayaJabatan = cariBiayaJabatan();
		}
	}
	
	public double getBiayaJabatan() {
		return biayaJabatan;
	}
	//Perhitugan iuran Pensiun
	public double cariIuranPensiun() {
		return 0.0475 *(getGajiPokok()+getTunjanganNikah()+getTunjanganAnak());

	}
	//Set nilai iuran pensiun
	public void setIuranPensiun() {
		this.iuranPensiun = cariIuranPensiun();
	}
	public double getIuranPensiun() {
		return iuranPensiun;
	}
	//Perhitungan Gaji Bersih
	public double cariNetto() {
		return getBruto() - getBiayaJabatan() - getIuranPensiun();

	}
	//Set nilai gaji bersih perbulan
	public void setNetto() {
		this.netto = cariNetto();
	}
	public double getNetto() {
		return netto;
	}
	//Perhitungan Gaji Bersih Setahun
	public double cariNettoSetahun() {
		return 12*getNetto();
	}
	//Set nilai gaji bersih selama setahun
	public void setNettoSetahun() {
		this.nettoSetahun = cariNettoSetahun();
	}
	public double getNettoSetahun() {
		return nettoSetahun;
	}
	
	@Override //dari interface perhitungan PPH
	//Perhitungan PTKP untuk mencari nilai ptkp berdasarkan jumlah anggota keluarga dan nilai ptkp default
	public double hitungPTKP() {
		setJumlahAnakTemp(Integer.parseInt(getJumlahAnak()));
			if (Integer.parseInt(getJumlahAnak())> 3) {
				setJumlahAnakTemp(3);
			}
		return nilaiptkp +(perOrang *(getJumlahAnakTemp()+anggotaKeluarga));
	}
	//Set nilai ptkp
	public void setPtkp() {
		this.ptkp = hitungPTKP();
	}
	public double getPtkp() {
		return ptkp;
	}
	
	@Override //dari interface perhitungan PPH
	//Perhitungan PKP
	public double hitungPkp() {
		return getNettoSetahun() - getPtkp();
	}
	//Set nilai pkp
	public void setPkp() {
		this.pkp = hitungPkp();
	}
	public double getPkp() {
		return pkp;
	}
	
	@Override //dari interface perhitungan PPH
	//Perhitungan PPH Setahun
	public double hitungPPHSetahun() {
		if (getPkp() > 0 ) {
			pkpTemp = getPkp();
			if(pkpTemp - lapisSATU > 0){
				pkpTemp = lapisSATU;
			}
			return pkpTemp * potonganSATU;
		}if (getPkp() > lapisSATU) {
			pkpTemp = getPkp() - lapisSATU;
			if(pkpTemp - lapisDUA > 0){
				pkpTemp = lapisDUA;
			}
			return pphSetahun = pphSetahun + (pkpTemp * potonganDUA);
		}if (getPkp() > lapisTIGA) {
			pkpTemp = getPkp()- lapisTIGA;
			if(pkpTemp - lapisTIGA > 0){
				pkpTemp = lapisTIGA;
			}
			return pphSetahun = pphSetahun + (pkpTemp * potonganTIGA);
		}if (getPkp() > 500000000) {
			pkpTemp = getPkp() - 500000000;
			return pphSetahun = pphSetahun + (pkpTemp * potonganEMPAT);
		}else {
			return 0;
		}
		
	}
	@Override //dari interface perhitungan PPH
	//Perhitungan PPH Perbulan
	public double hitungPPHPerbulan() {
		return pphSetahun / 12;
	}
	//Set nilai PPH selama setahun
	public void setPphSetahun() {
		this.pphSetahun = hitungPPHSetahun();
	}
	public double getPphPerbulan() {
		return pphPerbulan;
	}
	//Set nilai PPH perbulan
	public void setPphPerbulan() {
		this.pphPerbulan = hitungPPHPerbulan();
	}
	public double getPphSetahun() {
		return pphSetahun;
	}
	
	@Override //dari interface potongan lain
	//Menghitung potongan iwp
	public double hitungIwp() {
		return potonganIwp*(getGajiPokok()+getTunjanganNikah()+getTunjanganAnak());
	}
	//Set nilai iwp
	public void setIwp() {
		this.iwp = hitungIwp();
	}
	public double getIwp() {
		return iwp;
	}
	
	@Override //dari interface potongan lain
	//Mencari nilai taperum bedasarkan golongan
	public double cariTaperum() {
		if (getGolongan().substring(0,1).equalsIgnoreCase("1")) {
			return taperumGol1;
		}if (getGolongan().substring(0,1).equalsIgnoreCase("2")) {
			return taperumGol2;
		}if (getGolongan().substring(0,1).equalsIgnoreCase("3")) {
			return taperumGol3;
		}if (getGolongan().substring(0,1).equalsIgnoreCase("4")) {
			return taperumGol4;
		}
		return 0;
	}
	
	//set nilai taperum
	public void setTaperum() {
		this.taperum = (int) cariTaperum();
	}
	
	public int getTaperum() {
		return taperum;
	}
	//perhitungan jumlah bruto
	private double cariJumlahBruto() {
		return getBruto()+getPphPerbulan();
	}
	//set nilai jumlah bruto
	public void setJumlahBruto() {
		this.jumlahBruto = cariJumlahBruto();
	}
	public double getJumlahBruto() {
		return jumlahBruto;
	}
	//perhitungan jumlah potongan
	private double cariJumlahPotongan() {
		return getIwp()+getPphPerbulan()+getTaperum();

	}
	//Set nilai jumlah potongan
	public void setJumlahPotongan() {
		this.jumlahPotongan = cariJumlahPotongan();
	}
	
	public double getJumlahPotongan() {
		return jumlahPotongan;
	}
	
	//perhitungan jumlah gaji bersih
	private double cariJumlahNetto() {
		return getJumlahBruto() - getJumlahPotongan();
	}
	//Set nilai jumlah gaji bersih
	public void setJumlahNetto() {
		this.jumlahNetto = cariJumlahNetto();
	}
	public double getJumlahNetto() {
		return jumlahNetto;
	}
}

