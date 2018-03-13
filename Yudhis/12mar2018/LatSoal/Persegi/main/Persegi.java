package main;

public class Persegi {
	
	int sisi, luas, keliling;
	
	public Persegi() {
		// TODO Auto-generated constructor stub
	}
	
	Persegi(int sisi) {
		Persegi persegi = new Persegi();
		
		System.out.println("\nSisi : " + sisi);
		persegi.Luas(sisi);
		persegi.Keliling(sisi);
	}
	
	void Luas(int sisi) {
		luas = sisi * sisi;
		System.out.println("Luas persegi = " + luas);
	}
	
	void Keliling(int sisi) {
		keliling = sisi * 4;
		System.out.println("Keliling persegi = " + keliling);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persegi persegi1 = new Persegi();
		Persegi persegi2 = new Persegi();
		Persegi persegi3 = new Persegi(25);
		
		persegi1.sisi = 5;
		System.out.println("\nSisi : " + persegi1.sisi);
		System.out.println("Luas persegi = " + persegi1.sisi * persegi1.sisi);
		System.out.println("Keliling persegi = " + persegi1.sisi * 4);
		
		persegi2.sisi = 10;
		System.out.println("\nSisi : " + persegi2.sisi);
		persegi2.Luas(persegi2.sisi);
		persegi2.Keliling(persegi2.sisi);
		
	}

}
