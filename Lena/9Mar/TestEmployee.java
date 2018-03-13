
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee karyawan1 = new Employee();
		Employee karyawan2 = new Employee();
		Employee karyawan3 = new Employee();
		
		karyawan1.insert(101, "ajeet", 45000);
		karyawan2.insert(102, "irfan", 25000);
		karyawan3.insert(103, "nakul", 55000);
		
		karyawan1.display();
		karyawan2.display();
		karyawan3.display();
		
	}

}
