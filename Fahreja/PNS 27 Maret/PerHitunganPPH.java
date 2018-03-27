//author fahreja 26 maret 2017
//edit 27 maret 2017
interface PerHitunganPPH {
	double nilaiptkp = 36000000;
	double perOrang = 3000000;
	double lapisSATU = 50000000;
	double lapisDUA = 200000000;
	double lapisTIGA = 250000000;
	
	double potonganSATU = 0.05;
	double potonganDUA = 0.15;
	double potonganTIGA = 0.25;
	double potonganEMPAT = 0.3;
	
	
	double hitungPTKP();
	double hitungPkp ();
	double hitungPPHSetahun();
	double hitungPPHPerbulan();
	
}
