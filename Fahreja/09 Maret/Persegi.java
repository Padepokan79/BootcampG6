public class Persegi {
	int sisi;
	int luas;
	int	keliling;
	
	Persegi(){
		
	}
	
	Persegi(int s){
		sisi = s;
		luas = s*s;
		keliling =s+s+s+s;
	}
	void hitung(int s) {
		sisi = s;
		luas = s*s;
		keliling =s+s+s+s;
	}
	
	void tampil() {
		System.out.println("Sisi : "+sisi);
		System.out.println("Luas Persegi : " +luas);
		System.out.println("Keliling Persegi : " +keliling);
	}
}
