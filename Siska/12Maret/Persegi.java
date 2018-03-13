
public class Persegi {
	int sisi, keliling, luas;
	
	Persegi (){
		
	}
	
	Persegi (int s) {
		sisi = s;
	}
	
	void membuatData (int si) {
		sisi = si;
	}
	
	void keliling () {
		System.out.println("Keliling persegi : "+ (sisi + sisi + sisi + sisi));
	}
	
	void luas () {
		System.out.println("Luas persegi : " + (sisi*sisi));
	}
	
	void keliling (int sisinya) {
		sisi = sisinya;
		keliling = 4*sisi;
	}
	
	void luas (int sisinya) {
		sisi = sisinya;
		luas = sisi*sisi;
	}
	
	void menampilkan () {
		System.out.println ("Sisi:" +sisi);
		System.out.println ("Keliling : " + keliling);
		System.out.println("Luas : " + luas);
	}
}
