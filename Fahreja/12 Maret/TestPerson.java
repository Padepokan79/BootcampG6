
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher guru1 = new Teacher();
		Student siswa1 = new Student();
		
		guru1.tambah("Tatang", "Suryana", "Laki-Laki","Renang", 35);
		guru1.subject = "Guru Olahraga";
		guru1.tampil();
		guru1.greterT();
		
		siswa1.tambah("Galih", "Panjaitan", "Laki-laki", "Bola", 16);
		siswa1.tampil();
		siswa1.greterS();
	}

}
