/**
 * 27-03-2018
 */
package main;

/**
 * @author Yudhistira
 *
 */
public interface SatuanPenghitunganPotongan {

	// Satuan perhitungan potongan
	double satuanPenghitunganPotonganBiayaJabatan = 0.05;
	
	double satuanPenghitunganPotonganIWP = 0.1;
	
	double satuanPenghitunganPotonganPensiun = 0.0475;
	
	int pTKP = 36000000;
	int pTKPanggotaKeluarga = 3000000;
	int pKPLv1 = 50000000;
	double satuanPenghitunganPkpLv1 = 0.5;
	int pKPLv2 = 200000000;
	double satuanPenghitunganPkpLv2 = 0.15;
	int pKPLv3 = 250000000;
	double satuanPenghitunganPkpLv3 = 0.25;
	double satuanPenghitunganPkpLvAkhir = 0.30;
	
	int potonganTaperumGolongan1 = 3000;
	int potonganTaperumGolongan2 = 5000;
	int potonganTaperumGolongan3 = 7000;
	int potonganTaperumGolongan4 = 10000;
	
}
