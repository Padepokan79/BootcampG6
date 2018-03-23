
public class SA extends Karyawan implements Lembur, TunjanganKeluarga, BPJS, PPH{
	public SA(String namaK, String noNIK, String penempatanKerja, String pekerjaan, String kategoripegawai,
			int lamakerja, String status, int lamalembur) {
		super(namaK, noNIK, penempatanKerja, pekerjaan, kategoripegawai, lamakerja, status, lamalembur);
		
	}
	int ptkp;
	double tunjanganKeluarga, pkp, pphbulan=0, pphsetahun=0, tHP=0;
	
	@Override
	public double setGajiPokok() {
		double gaPok=0;
		if (getkategoripegawai().equalsIgnoreCase("Junior")) {
			if (getlamakerja() >=0 && getlamakerja()  <=1) {
				gaPok = 1.2;
			}
			else if (getlamakerja() >=2 && getlamakerja() <= 3 ) {
				gaPok = 1.3;
			}
			else if (getlamakerja() > 3) {
				gaPok = 1.6;
			}
		}
		else if (getkategoripegawai().equalsIgnoreCase("Middle")) {
			if (getlamakerja() >= 0 && getlamakerja() <=2 ) {
				gaPok = 1.8;
			}
			else if (getlamakerja() >=3 && getlamakerja() <=4 ) {
				gaPok = 1.9;
			}
			else if (getlamakerja() > 4) {
				gaPok = 2.2;
			}
		}
		else if (getkategoripegawai().equalsIgnoreCase("Senior")) {
			if (getlamakerja() >= 0 && getlamakerja() <= 2) {
				gaPok = 2.7;
			}
			else if (getlamakerja() >= 3 && getlamakerja() <= 4) {
				gaPok = 2.9;
			}
			else if (getlamakerja() > 4) {
				gaPok = 3.0;
				}
			}
		return gaPok;
		}
	double getgaji () {
		return setGajiPokok()*getumk();
	}
	double getgajiBulanan() {
		return getgaji()+gettunjanganPegawai();
	}
	double getgajilembur() {
		return lembur*getgajiBulanan()*getlamalembur();
	}
	//status
	 double getTunjanganKel () {
		if (getstatuskar().equalsIgnoreCase("Y")) {
			tunjanganKeluarga = besartunjangankeluarga* getgajiBulanan();
		}
		else if  (getstatuskar().equalsIgnoreCase("N")) {
			tunjanganKeluarga = 0;
		}
		return tunjanganKeluarga;
	}
	double getbruto () {
		return getgajiBulanan() + getgajilembur() + gettunjanganTransport() + getTunjanganKel();
	}
	double getbpjskes() {
		return potonganBPJSKesehatan*getbruto();
	}
	double getbpjsket() {
		return potonganBPJSKetenagakerjaan*getbruto();
	}
	double getbJabatan() {
		return biayaJabatan*getbruto();
	}
	double getnetto() {
		return getbruto()-getbJabatan();
	}
	double getnettosetahun() {
		return getnetto()*12;
	}
	
	int getptkp () {
		if (getstatuskar().equalsIgnoreCase("Y")){
			ptkp = ptkpmenikah;
		}
		else if (getstatuskar().equalsIgnoreCase("N")) {
			ptkp = ptkplajang;
		}
		return ptkp;
	}
	double getpkp() {
		return pkp = getnettosetahun()-getptkp();
	}
	double getpph() {
		
		if (pkp >= 0 && pkp <= nilai50) {
			pphsetahun = pkpsampai50*pkp;
		}
		else if (pkp > nilai50 && pkp <= nilai250) {
			pkp = pkp - nilai50;
			pphsetahun = nilai50*pkpsampai50 + pkp*pkpsampai250;
		}
		else if (pkp > nilai250 && pkp <= nilai500) {
			pkp = pkp - nilai50 - nilai250;
			pphsetahun = nilai50*pkpsampai50+ nilai250*pkpsampai250 +pkpsampai500*pkp;
			
		}
		else if (pkp > nilai500) {
			pkp = pkp-nilai50-nilai250-nilai500;
			pphsetahun = nilai250*pkpsampai50 + nilai250*pkpsampai250 + nilai500* pkpsampai500+pkplebih500*pkp;
			
		}
		
		return pphsetahun;
	}
	double getpphSebulan () {
		return pphbulan=getpph()/12;
	}
	double gettakeHomepay() {
		tHP = getbruto()- getbpjskes() - getbpjsket() - pphbulan;
		return tHP;
	}
}
