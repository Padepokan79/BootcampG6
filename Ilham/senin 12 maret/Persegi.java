
public class Persegi {
	int sisi, luas, keliling;
	
	public Persegi() {
		
	}
	
	public Persegi(int s) {
		sisi = s;
		luas = s * s;
		keliling = s+s+s+s;
	}
	
	public void cariLuasKeliling(int s) {
		sisi = s;
		luas = s * s;
		keliling = s+s+s+s;
	}
	
	public void tampilLuasKeliling() {
		System.out.println("Sisi\t\t:" + sisi + "\nLuas\t\t:" + luas +"\nKeliling\t:" + keliling);
		System.out.println();
	}
	
}
