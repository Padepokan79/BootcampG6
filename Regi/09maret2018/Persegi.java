
public class Persegi {
	int sisi, luas = 0, keliling = 0;
	
	void inputData(int s) {
		sisi = s;
	}
	
	void hitungLuas(int sisi) {
		luas = sisi * sisi;
	}
	
	void hitungKeliling(int sisi) {
		keliling  = 4 * sisi;
	}
	
	Persegi (int s) {
		sisi = s;
	}
	
	Persegi () {
		
	}
}
