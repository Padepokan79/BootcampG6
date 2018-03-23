package Karyawan;

public interface Potongan {
	double potonganBPJSKesehatan = 0.01;
	double potonganBPJSKetenagakerjaan = 0.01;
	
	double potonganJabatan = 0.05;
	double ptkpBelumBerkeluarga = 36000000;
	double ptkpSudahBerkeluarga = 39000000;
	
	double batasPPH50 = 50000000;
	double batasPPH250 = 200000000;
	double batasPPH500 = 250000000;
	
	double potonganPPH50 = 0.05;
	double potonganPPH50Sampai250 = 0.15; 
	double potonganPPH250Sampai500 = 0.25;
	double potonganPPH500 = 0.3;

}
