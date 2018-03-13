public class TestStudent2 {

	public static void main(String[] args) {
		Siswa siswa1 = new Siswa ();
		siswa1.id = 101;
		siswa1.name = "Sonoo";
		System.out.println (siswa1.id + " " + siswa1.name);
		
		Siswa siswa2 = new Siswa ();
		siswa2.id = 102;
		siswa2.name = "Siska";
		System.out.println (siswa2.id + " " + siswa2.name);
		
		Siswa siswa3 = new Siswa ();
		Siswa siswa4 = new Siswa ();
		
		siswa3.buatData(103, "Ria");
		siswa4.buatData(104, "Nisa");
		
		siswa3.menampilkanInformasi();
		siswa4.menampilkanInformasi();
		
		Siswa siswa5 = new Siswa(105, "Saya");
		siswa5.menampilkanInformasi();
		
	}

}
