package eclipse;

public class TestPersegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persegi persegi1 = new Persegi();
		Persegi persegi2 = new Persegi();
		Persegi persegi3 = new Persegi(11);
		
		//PERSEGI 1
		persegi1.sisi = 5;
		persegi1.menghitungLuas(persegi1.sisi);
		persegi1.menghitungKeliling(persegi1.sisi);
		persegi1.displayHasil();
		
		//PERSEGI 2
		persegi2.kotak(8);
		persegi2.menghitungLuas(persegi2.sisi);
		persegi2.menghitungKeliling(persegi2.sisi);
		persegi2.displayHasil();
		
		//PERSEGI 3
		persegi3.menghitungLuas(persegi3.sisi);
		persegi3.menghitungKeliling(persegi3.sisi);
		persegi3.displayHasil();
	}

}
