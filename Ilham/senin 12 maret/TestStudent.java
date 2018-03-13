
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student siswa1 = new Student();
		Student siswa2 = new Student();
		
		siswa1.insertRecord(111, "Karan");
		siswa2.insertRecord(222, "Aryan");
		
		siswa1.displayInformation();
		siswa2.displayInformation();
	}

}
