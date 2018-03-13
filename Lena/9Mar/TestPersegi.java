
public class TestPersegi {
	public static void main(String[] args) {
		Persegi persegi1 = new Persegi();
		Persegi persegi2 = new Persegi();
		Persegi persegi3 = new Persegi(15);
		
		persegi1.sisi = 5;
		System.out.println("Sisi: "+persegi1.sisi);
		System.out.println("Luas persegi: "+persegi1.luasPersegi(persegi1.sisi));
		System.out.println("Keliling persegi: "+persegi1.kelilingPersegi(persegi1.sisi));
		
		System.out.println();
		
		persegi2.insertRecord(10);
		persegi2.display();
		
		System.out.println();
		persegi3.display();

	}
}
