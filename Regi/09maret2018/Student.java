
public class Student { // Inisialisasi menggunakan variable reference
	int id;
	String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	Student(int i, String n){
		id = i;
		name = n;
	}
	
	// Inisialisai menggunakan method
	void insertRecord(int i, String n) {
		id = i;
		name = n;
	}
	
	void displayInformation() {
		System.out.println(id + " " + name);
	}
}