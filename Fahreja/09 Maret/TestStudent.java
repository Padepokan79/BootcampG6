
class TestStudent{
	public static void main(String[] args) {
		Student siswa1= new Student();
		Student siswa2= new Student();
		
		siswa1.insertRecord(101,"Karan");
		siswa2.insertRecord(222,"Bangbang");
		siswa1.displayInformation();
		siswa2.displayInformation();
	}
}

