
public class Persegi {
	int sisi;
	
	public Persegi() {
		// TODO Auto-generated constructor stub
	}
	
	Persegi(int s){
		sisi = s;
	}
	
	void insertRecord(int s) {
		sisi=s;
	}
	
	int luasPersegi(int s) {
		return s*s;
	}
	
	int kelilingPersegi(int s) {
		return 4*s;
	}
	
	void display() {
		System.out.println("Sisi: "+sisi);
		System.out.println("Luas persegi: "+luasPersegi(sisi));
		System.out.println("Keliling persegi: "+kelilingPersegi(sisi));
	}
}
