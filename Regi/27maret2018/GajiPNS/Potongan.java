/*author	: Regi Witanto
dibuat	: 26/03/2018 - 27/03/2018
*/

package GajiPNS;

public interface Potongan {
	final int[] potonganTaperumArr = {3000, 5000, 7000, 10000};
	
	double potonganJabatan = 0.05;
	final int ptkpDefault = 36000000;
	final int ptkpPerOrang = 3000000;
	
	double batasPPH50 = 50000000;
	double batasPPH250 = 200000000;
	double batasPPH500 = 250000000;
	
	double potonganPPH50 = 0.05;
	double potonganPPH50Sampai250 = 0.15; 
	double potonganPPH250Sampai500 = 0.25;
	double potonganPPH500 = 0.3;

}
