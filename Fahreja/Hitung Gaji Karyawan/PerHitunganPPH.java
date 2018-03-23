
interface PerHitunganPPH {
	double ptkp = 36000000;
	double perOrang = 3000000;
	double lapisSATU = 50000000;
	double lapisDUA = 200000000;
	double lapisTIGA = 250000000;
	
	double potonganSATU = 0.05;
	double potonganDUA = 0.15;
	double potonganTIGA = 0.25;
	double potonganEMPAT = 0.3;
	
	
	double hitungPTKP();
	double pkp ();
	double hitungPPHSetahun();
	double hitungPPHPerbulan();
	
}
