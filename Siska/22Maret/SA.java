
public class SA extends Karyawan implements Lembur, TunjanganKeluarga, BPJS, PPH{
	public SA(String namaK, String noNIK, String penempatanKerja, String pekerjaan, String kategoripegawai,
			int lamakerja, String status, int lamalembur) {
		super(namaK, noNIK, penempatanKerja, pekerjaan, kategoripegawai, lamakerja, status, lamalembur);
		
	}
	int ptkp;
	double tunjanganKeluarga, pkp;
	@Override
	public double setGajiPokok() {
		double gaPok=0;
		if (kategoripegawai.equalsIgnoreCase("Junior")) {
			if (lamakerja >=0 && lamakerja  <=1) {
				gaPok = 1.2;
			}
			else if (lamakerja >=2 && lamakerja <= 3 ) {
				gaPok = 1.3;
			}
			else if (lamakerja > 3) {
				gaPok = 1.6;
			}
		}
		else if (kategoripegawai.equalsIgnoreCase("Middle")) {
			if (lamakerja >= 0 && lamakerja <=2 ) {
				gaPok = 1.8;
			}
			else if (lamakerja >=3 && lamakerja <=4 ) {
				gaPok = 1.9;
			}
			else if (lamakerja > 4) {
				gaPok = 2.2;
			}
		}
		else if (kategoripegawai.equalsIgnoreCase("Senior")) {
			if (lamakerja >= 0 && lamakerja <= 2) {
				gaPok = 2.7;
			}
			else if (lamakerja >= 3 && lamakerja <= 4) {
				gaPok = 2.9;
			}
			else if (lamakerja > 4) {
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
		return lembur*getgajiBulanan()*lamalembur;
	}
	//status
		double getstatus () {
			if (status.equalsIgnoreCase("Y")) {
				tunjanganKeluarga = besartunjangankeluarga* getgajiBulanan() ;
			}
			else if  (status.equalsIgnoreCase("N")) {
				tunjanganKeluarga = 0;
			}
			return tunjanganKeluarga;
		}
	double getbruto () {
		return getgajiBulanan() + getgajilembur() + gettunjanganTransport() + getstatus();
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
		if (status.equalsIgnoreCase("Y")){
			ptkp = ptkpmenikah;
		}
		else if (status.equalsIgnoreCase("N")) {
			ptkp = ptkplajang;
		}
		return ptkp;
	}
	double getpkp() {
		return pkp = getnettosetahun()-getptkp();
	}
	double getpph() {
		double pphsetahun=0;
		
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
		return getpph()/12;
	}
	double gettakeHomepay() {
		return getbruto()- getbpjskes() - getbpjsket() - getpphSebulan();
	}
}
