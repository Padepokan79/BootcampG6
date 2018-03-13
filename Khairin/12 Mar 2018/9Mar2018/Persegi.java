package eclipse;

public class Persegi {
	int sisi, luas, keliling;
	

	public Persegi() {
		// TODO Auto-generated constructor stub
	}
	
	Persegi (int side) {
	sisi = 	side;
	}
	
	void kotak (int side) {
	sisi = side;
	}
	
	void menghitungLuas (int x) {
	luas = x*x;	
	}
	
	void menghitungKeliling (int side) {
	keliling = side*4;	
	}	
	
	void displayHasil() {
		System.out.println("Luas persegi adalah " + luas);
		System.out.println("Keliling persegi adalah " + keliling);
		System.out.println();
	}
	
}
