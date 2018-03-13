
public class TestPersegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persegi persegi1 = new Persegi();
		persegi1.sisi = 7;
		
		System.out.println("Persegi 1");
		
		persegi1.hitungLuas(persegi1.sisi);
		System.out.println(persegi1.luas);
		
		persegi1.hitungKeliling(persegi1.sisi);
		System.out.println(persegi1.keliling);
		
		
		Persegi persegi2 = new Persegi();
		persegi2.sisi = 9;
		
		System.out.println("\nPersegi 2");
		
		persegi2.hitungLuas(persegi2.sisi);
		System.out.println(persegi2.luas);
		
		persegi2.hitungKeliling(persegi2.sisi);
		System.out.println(persegi2.keliling);
		
		
		Persegi persegi3 = new Persegi();
		persegi3.sisi = 12;
		persegi3.luas = 0;
		persegi3.keliling = 0;
		
		persegi3.luas = persegi3.sisi * persegi3.sisi;
		persegi3.keliling = 4 * persegi3.sisi;
		
		System.out.println("\nPersegi 3");
		
		System.out.println(persegi3.luas);
		System.out.println(persegi3.keliling);
	}

}