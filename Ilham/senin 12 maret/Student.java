
class Student {
	int rollno;
	String nama;
	
	void insertRecord(int r, String n) {
		rollno = r;
		nama = n;
	}
	
	void displayInformation() {
		System.out.println(rollno + " " + nama);
	}
}
