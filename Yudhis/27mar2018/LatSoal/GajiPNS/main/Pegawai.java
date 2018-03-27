/**
 * 27-03-2018
 */
package main;

/**
 * @author Yudhistira
 *
 */
public class Pegawai implements SatuanPenghitunganTunjangan, SatuanPenghitunganPotongan {
	
	// Variable yg dimasukkan
	String nama = "-", nip = "-", jenisKelamin = "-", kodeGolongan = "-", statusKawin = "-", jenisPNS = "-", namaTunjanganLain = "-";
	int golongan, masaKerja, jumlahAnak, besarTunjanganLain;
	
	// Variable yg dihitung
	int tunjanganKawin, tunjanganAnak, tunjanganBeras, tunjanganJabatan, gajiKotor;
	int potonganBiayaJabatan, potonganIWP, potonganPensiun, potonganPPH, gajiBersih;
	int takeHomePay;
	
	// Variable yg dihitung pada child abstract (dibuat private)
	private int gajiPokok, potonganTaperum;
	
	// Constructor default
	public Pegawai() {
		// TODO Auto-generated constructor stub
	}
	
	// Overload constructor untuk penghitungan
	public Pegawai(Pegawai pegawai) {
		// TODO Auto-generated constructor stub
		nama = pegawai.nama;
		nip = pegawai.nip;
		jenisKelamin = pegawai.jenisKelamin;
		kodeGolongan = pegawai.kodeGolongan;
		statusKawin = pegawai.statusKawin;
		jenisPNS = pegawai.jenisPNS;
		namaTunjanganLain = pegawai.namaTunjanganLain;
		golongan = pegawai.golongan;
		masaKerja = pegawai.masaKerja;
		jumlahAnak = pegawai.jumlahAnak;
		besarTunjanganLain = pegawai.besarTunjanganLain;
		
		setGajiPokok(pegawai.getGajiPokok());
		setPotonganTaperum(pegawai.getPotonganTaperum());
		
		hitungTunjanganKawin();
		hitungTunjanganAnak();
		hitungTunjanganBeras();
		hitungTunjanganJabatan();
		
		hitungGajiKotor();
		
		hitungPotonganBiayaJabatan();
		hitungPotonganIWP();
		hitungPotonganPensiun();
		
		hitungGajiBersih();
		
		hitungPotonganPPH();
				
		hitungTakeHomePay();
		
		System.out.println(toString());
	}

	// Setters & getters untuk variable yg dihitung pada child abstract
	public int getGajiPokok() {
		return gajiPokok;
	}

	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public int getPotonganTaperum() {
		return potonganTaperum;
	}

	public void setPotonganTaperum(int potonganTaperum) {
		this.potonganTaperum = potonganTaperum;
	}
	
	// Method penghitungan selain yg dibutuhkan dihitung per child abstract
	public void hitungTunjanganKawin() {
		if (statusKawin.equals("Menikah")) {
			tunjanganKawin = (int) (satuanPenghitunganTunjanganKawin * getGajiPokok());
		}
	}
	
	public void hitungTunjanganAnak() {
		if (jumlahAnak >= 2) {
			tunjanganAnak = (int) ((satuanPenghitunganTunjanganAnak * gajiPokok) * 2);
		} else if (jumlahAnak == 1) {
			tunjanganAnak = (int) (satuanPenghitunganTunjanganAnak * gajiPokok);
		}
	}
	
	public void hitungTunjanganBeras() {
		if (statusKawin.equals("Menikah")) {
			if (jumlahAnak >= 2) {
				tunjanganBeras = (2 + 2) * 10 * hargaBeras;
			} else if (jumlahAnak == 1) {
				tunjanganBeras = (2 + 1) * 10 * hargaBeras;
			} else {
				tunjanganBeras = (2) * 10 * hargaBeras;
			}
		} else {
			if (jumlahAnak >= 2) {
				tunjanganBeras = (1 + 2) * 10 * hargaBeras;
			} else if (jumlahAnak == 1) {
				tunjanganBeras = (1 + 1) * 10 * hargaBeras;
			} else {
				tunjanganBeras = (1) * 10 * hargaBeras;
			}
		}
	}
	
	public void hitungTunjanganJabatan() {
		if (jenisPNS.equalsIgnoreCase("Pejabat")) {
			tunjanganJabatan = 1000000;
		} else if (jenisPNS.equalsIgnoreCase("Pelayan Masyarakat")) {
			tunjanganJabatan = 500000;
		} else {
			switch (golongan) {
				case 1 :
					tunjanganJabatan = tunjanganJabatanGolongan1;
					break;
				case 2 :
					tunjanganJabatan = tunjanganJabatanGolongan2;
					break;
				case 3 :
					tunjanganJabatan = tunjanganJabatanGolongan3;
					break;
				case 4 :
					tunjanganJabatan = tunjanganJabatanGolongan4;
					break;
			}	
		}
	}
	
	public void hitungGajiKotor() {
		gajiKotor = gajiPokok + tunjanganKawin + tunjanganAnak + tunjanganBeras + tunjanganJabatan + besarTunjanganLain;
	}
	
	public void hitungPotonganBiayaJabatan() {
		potonganBiayaJabatan = (int) (satuanPenghitunganPotonganBiayaJabatan * gajiKotor);
	}
	
	public void hitungPotonganIWP() {
		potonganIWP = (int) (satuanPenghitunganPotonganIWP * (gajiPokok + tunjanganKawin + tunjanganAnak));
	}
	
	public void hitungPotonganPensiun() {
		potonganPensiun = (int) (satuanPenghitunganPotonganPensiun * (gajiPokok + tunjanganKawin + tunjanganAnak));
	}
	
	public void hitungPotonganPPH() {
		// Variable penghitungan yg hanya digunakan pada method hitungPotonganPPH()
		int pKP = 0, totalPTKP = 0;
		
		// Penghitungan PTKP 
		if (statusKawin.equals("Menikah")){
			if(jumlahAnak >= 3){
				totalPTKP = totalPTKP + pTKP + (4 * pTKPanggotaKeluarga); 
			} 
			else if(jumlahAnak == 2){
				totalPTKP = totalPTKP + pTKP + (3 * pTKPanggotaKeluarga);
			}
			else if(jumlahAnak == 1){
				totalPTKP = totalPTKP + pTKP + (2 * pTKPanggotaKeluarga);
			}
			else if(jumlahAnak == 0){
				totalPTKP = totalPTKP + pTKP + (1 * pTKPanggotaKeluarga);;
			}
		} else if (statusKawin.equals("Belum Menikah") || statusKawin.equals("Cerai")){
			if(jumlahAnak >= 3){
				totalPTKP = totalPTKP + pTKP + (3 * pTKPanggotaKeluarga); 
			}
			else if(jumlahAnak == 2){
				totalPTKP = totalPTKP + pTKP + (2 * pTKPanggotaKeluarga);
			}
			else if(jumlahAnak == 1){
				totalPTKP = totalPTKP + pTKP + (1 * pTKPanggotaKeluarga);;
			}
		}
		
		// Penghitungan pKP
		pKP = pKP + (gajiBersih * 12) - totalPTKP;
		
		// Penghitungan PPH 
		if (pKP > 0) {
			if (pKP <= pKPLv1) {
				potonganPPH = (int) ((satuanPenghitunganPkpLv1 * pKP) / 12);
			} else if (pKP > pKPLv1 && pKP <= (pKPLv1 + pKPLv2)) {
				pKP = pKP - pKPLv1;
				potonganPPH = (int) (((satuanPenghitunganPkpLv1 * pKPLv1) + (satuanPenghitunganPkpLv2 * pKP)) / 12);
			} else if (pKP > pKPLv2 && pKP <= (pKPLv1 + pKPLv2 + pKPLv3)) {
				pKP = pKP - pKPLv1 - pKPLv2;
				potonganPPH = (int) (((satuanPenghitunganPkpLv1 * pKPLv1) + (satuanPenghitunganPkpLv2 * pKPLv2) + (satuanPenghitunganPkpLv3 * pKP)) / 12);
			} else {
				pKP = pKP - pKPLv1 - pKPLv2 - pKPLv3;
				potonganPPH = (int) (((satuanPenghitunganPkpLv1 * pKPLv1) + (satuanPenghitunganPkpLv2 * pKPLv2) + (satuanPenghitunganPkpLv3 * pKPLv3) + (satuanPenghitunganPkpLvAkhir * pKP)) / 12);
			}
		}
				
	}
	
	public void hitungGajiBersih() {
		gajiBersih = gajiKotor - potonganBiayaJabatan - potonganPensiun;
	}
	
	public void hitungTakeHomePay() {
		takeHomePay = (getGajiPokok() + tunjanganKawin + tunjanganAnak + tunjanganBeras + tunjanganJabatan + 
				besarTunjanganLain + potonganPPH) - (potonganIWP + getPotonganTaperum() + potonganPPH);
	}

	@Override
	public String toString() {
		return ""
				+ "\n\nSLIP GAJI\n"
				+ "\nNama : " + nama.toUpperCase()
				+ "\nNIP  : " + nip
				+ "\n\nBasic Salary              \t: " + getGajiPokok()
				+ "\n\nTunjangan / Allowance\n"
				+ "\n\tTunjangan Istri / Suami : " + (int) tunjanganKawin
				+ "\n\tTunjangan Anak          : " + (int) tunjanganAnak
				+ "\n\tTunjangan Beras         : " + (int) tunjanganBeras
				+ "\n\tTunjangan Jabatan       : " + (int) tunjanganJabatan
				+ "\n\tTunjangan PPH           : " + (int) potonganPPH
				+ "\n\tTunjangan Lainnya       : " + besarTunjanganLain 
				+ "\nBruto Salary              \t: " + (int) (getGajiPokok() + tunjanganKawin + 
						tunjanganAnak + tunjanganBeras + tunjanganJabatan + besarTunjanganLain + potonganPPH)
				+ "\n\nPotongan\n"
				+ "\n\tPotongan IWP            : " + (int) potonganIWP
				+ "\n\tPotongan Taperum        : " + (int) getPotonganTaperum()
				+ "\n\tPPH                     : " + (int) potonganPPH
				+ "\n\nTotal Potongan            \t: " + (int) (potonganIWP + getPotonganTaperum() + potonganPPH)
				+ "\n\nTake Home Pay             \t: " + (int) takeHomePay;
	}
	
}
