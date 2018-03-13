
public class TestPersegi {

	public static void main(String[] args) {
		//variable
		Persegi persegi1 = new Persegi ();
		persegi1.sisi = 5;
		persegi1.keliling();
		persegi1.luas();

		Persegi persegi2 = new Persegi();
		persegi2.sisi = 10;
		persegi2.keliling(persegi2.sisi);
		persegi2.luas(persegi2.sisi);
		persegi2.menampilkan();
		
		//constructors
		Persegi persegi3 = new Persegi(7);
		persegi3.keliling(persegi3.sisi);
		persegi3.luas(persegi3.sisi);
		persegi3.menampilkan();
			
		//method
		Persegi persegi4 = new Persegi();
		persegi4.membuatData(8);
		persegi4.keliling(persegi4.sisi);
		persegi4.luas(persegi4.sisi);
		persegi4.menampilkan();
		
	}
}
