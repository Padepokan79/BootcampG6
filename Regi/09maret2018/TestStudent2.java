
public class TestStudent2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Membuat objek
		Student siswa1 = new Student();
		Student siswa2 = new Student();
		Student siswa3 = new Student();
		Student siswa4 = new Student();
		Student siswa5 = new Student(105, "Adit");
		Student siswa6 = new Student(106, "Indra");
		
		// Inisialisai objek jika menggunakan variabel referensi
		siswa1.id = 101;
		siswa1.name = "Sonoo";
		siswa2.id = 102;
		siswa2.name = "Amiit";
		
		// Menampilkan data jika menggunakan variabel referensi
		System.out.println(siswa1.id + " " + siswa1.name);
		System.out.println(siswa2.id + " " + siswa2.name);
		
		// Inisialisasi objek jika menggunakan method
		siswa3.insertRecord(111, "Karan");
		siswa4.insertRecord(222, "Aryan");
		
		// Menampilkan data jika menggunakan method
		siswa3.displayInformation();
		siswa4.displayInformation();
		
		// Menampilkan data dgn menggunakan method tapi dari constructor
		siswa5.displayInformation();
		siswa6.displayInformation();
	}

}
