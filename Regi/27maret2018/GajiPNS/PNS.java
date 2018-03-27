/*author	: Regi Witanto
dibuat	: 26/03/2018 - 27/03/2018
*/

package GajiPNS;

import java.util.HashMap;

public class PNS extends Pegawai implements GajiGolongan, Tunjangan, Potongan, Iuran {
	
	// Variables
	private String golongan = "", tunjanganLain, namaTunjanganLain, besarTunjanganLain = "0";
	private double tunjanganMenikah = 0, tunjanganAnak, tunjanganBeras, bruto, biayaJabatan, iuranPensiun, netto, nettoSetahun, ptkp, pkp, 
			pphSetahun = 0, pph = 0, iwp, jumlahPotongan, jumlahBersih;
	private int jumlahAnggotaKeluarga = 1, jumlahAnakTemp = 0, jumlahAnggotaTunjangan, 
			taperum = 0;
	
	// HashMap
	HashMap<Integer, Integer> mapTunjanganUmum = new HashMap<Integer, Integer>();
	
	// Default Constructor
	public PNS() {
		// TODO Auto-generated constructor stub
		
	}
	
	// Constructor Overload
	public PNS(PNS pns) {
		// TODO Auto-generated constructor stub
		
	}

	// Getter Setter
	public String getGolongan() {
		return golongan;
	}

	public void setGolongan(String golongan) {
		this.golongan = golongan;
	}

	public String getTunjanganLain() {
		return tunjanganLain;
	}

	public void setTunjanganLain(String tunjanganLain) {
		this.tunjanganLain = tunjanganLain;
	}

	public String getNamaTunjanganLain() {
		return namaTunjanganLain;
	}

	public void setNamaTunjanganLain(String namaTunjanganLain) {
		this.namaTunjanganLain = namaTunjanganLain;
	}

	public String getBesarTunjanganLain() {
		return besarTunjanganLain;
	}

	public void setBesarTunjanganLain(String besarTunjanganLain) {
		this.besarTunjanganLain = besarTunjanganLain;
	}
	
	// Methods
	// Insert HashMap
	public void insertHashMap(HashMap<Integer, Integer> map, int[] array) {
		for (int i = 0; i < array.length; i++) {
			map.put(i+1, array[i]);			
		}
	}
	
	// Hitung Tunjangan Menikah
	public void tunjanganMenikah() {
		if (getStatusPernikahan().equals("1")) {
			tunjanganMenikah = 0.1 * getGajiPokok();
			jumlahAnggotaKeluarga++;
		}
	}
	
	// Hitung Tunjangan Anak
	public void tunjanganAnak() {
		jumlahAnakTemp = Integer.parseInt(getJumlahAnak());
		if (Integer.parseInt(getJumlahAnak()) > 2) {
			jumlahAnakTemp = 2;
		}
		tunjanganAnak = 0.02 * getGajiPokok() * jumlahAnakTemp;
	}
	
	// Hitung Tunjangan Beras
	public void tunjanganBeras() {
		jumlahAnggotaTunjangan = jumlahAnggotaKeluarga + jumlahAnakTemp;
		tunjanganBeras = 10 * hargaBeras * jumlahAnggotaTunjangan;
	}
	
	// Hitung Tunjangan Berdasar Jenis PNS
	// Tunjangan Struktural
	public int setTunjanganStruktural() {
		return 0;
	}
	// Tunjangan Fungsional
	public int setTunjanganFungsional() {
		return 0;
	}
	// Tunjangan Umum
	public int setTunjanganUmum() {
		return 0;
	}
	
	// Hitung Bruto
	public void bruto() {
		bruto = getGajiPokok() + tunjanganMenikah + tunjanganAnak + tunjanganBeras + (setTunjanganStruktural() + setTunjanganFungsional() + setTunjanganUmum()) + 
				Integer.parseInt(getBesarTunjanganLain());
	}
	
	// Hitung Biaya Jabatan
	public void biayaJabatan() {
		biayaJabatan = 0.05 * bruto;
		if(biayaJabatan > 500000){
			biayaJabatan = 500000;
		}
	}
	
	// Hitung Iuran Pensiun
	public void iuranPensiun() {
		iuranPensiun = 0.0475 * (getGajiPokok() + tunjanganMenikah + tunjanganAnak);
	}
	
	// Hitung Netto
	public void netto() {
		netto = bruto - biayaJabatan - iuranPensiun;
	}
	
	// Hitung Netto Setahun
	public void nettoSetahun() {
		nettoSetahun = netto * 12;
	}
	
	// Hitung PTKP
	public void ptkp() {
		jumlahAnakTemp = Integer.parseInt(getJumlahAnak());
		if (Integer.parseInt(getJumlahAnak()) > 3) {
			jumlahAnakTemp = 3;
		}
		ptkp = ptkpDefault + (ptkpPerOrang * (jumlahAnggotaKeluarga - 1 + jumlahAnakTemp));
	}
	
	// Hitung PKP
	public void pkp() {
		pkp = nettoSetahun - ptkp;
	}
	
	// Hitung PPH
	public void pph() {
		double pkpTemp;
		// PKP 0 - 50000000
		if (pkp > 0) {
			pkpTemp = pkp;
			if (pkpTemp - 50000000 > 0) {
				pkpTemp = 50000000;
			}
			pphSetahun = 0.05 * pkpTemp;
		}

		// PKP 50000000 - 250000000
		if (pkp > 50000000) {
			pkpTemp = pkp - 50000000;
			if (pkpTemp - 200000000 > 0) {
				pkpTemp = 200000000;
			}
			pphSetahun = pphSetahun + (0.15 * pkpTemp);
		}

		// PKP 250000000 - 500000000
		if (pkp > 250000000) {
			pkpTemp = pkp - 250000000;
			if (pkpTemp - 250000000 > 0) {
				pkpTemp = 250000000;
			}
			pphSetahun = pphSetahun + (0.25 * pkpTemp);
		}

		// PKP > 500000000
		if (pkp > 500000000) {
			pkpTemp = pkp - 500000000;
			pphSetahun = pphSetahun + (0.3 * pkpTemp);
		}

		// PPH Perbulan
		pph = pphSetahun / 12;
	}
	
	// Hitung Bruto + PPH
	public void brutoPlusPPH() {
		bruto = bruto + pph;
	}
	
	// Hitung IWP
	public void iwp() {
		iwp = 0.1 * (getGajiPokok() + tunjanganMenikah + tunjanganAnak);
	}
	
	// Hitung Taperum
	public void taperum() {
		for (int i = 0 ; i < 4 ; i++) {
			if (Integer.parseInt(getGolongan().substring(0,1)) == i + 1) {
				taperum = potonganTaperumArr[i];
			}
		}
	}
	
	// Hitung Jumlah Potongan
	public void jumlahPotongan() {
		jumlahPotongan = iwp + pph + taperum;
	}
	
	// Hitung Jumlah Bersih
	public void jumlahBersih() {
		jumlahBersih = bruto - jumlahPotongan;
	}
	
	// Method Overide
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// Cetak Slip Gaji PNS
		return
				"\n\n========================================================================="
				+ "\n\t\t\t\tSLIP GAJI PNS"
				+ "\n========================================================================="
				+ "\nKANTOR PELAYANAN: "
				+ "\nPembayaran : Gaji Induk Bulan: "
				+ "\nPegawai    : " + getNama() +" ( " + getNip() + " )"
				+ "\n========================================================================="
				+ "\n\t   Penghasilan\t\t\t\t     Potongan"
				+ "\n========================================================================="
				+ "\nGaji Pokok\t\t" + (int) getGajiPokok()               + "\t\t IWP\t\t\t" + (int) iwp
				+ "\nT. Istri/Suami\t\t" + (int) tunjanganMenikah    + "\t\t Pot. PPH\t\t" + (int) pph
				+ "\nT. Anak\t\t\t" + (int) tunjanganAnak              + "\t\t Taperum\t\t" + taperum
				+ "\nT. Umum\t\t\t" + setTunjanganUmum()                    + "\t\t                 ---------------"
				+ "\nT. Struktural\t\t" + setTunjanganStruktural()
				+ "\nT. Fungsional\t\t" + setTunjanganFungsional()        + "\t\t Jml. Pot\t\t" + (int) jumlahPotongan
				+ "\nT. Lain\t\t\t" + getBesarTunjanganLain()
				+ "\nT. Beras\t\t" + (int) tunjanganBeras            + "\t\t                 ---------------"
				+ "\nT. Pajak\t\t" + (int) pph
				+ "\n                     -----------"               + "\tJml. Bersih\t\t" + (int) jumlahBersih
				+ "\nJml. Kotor\t\t"+ (int) bruto
				+ "\n=========================================================================";
	}			

}
