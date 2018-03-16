package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student siswa1 = new Student(101, "Regi", 12);
		Student siswa2 = new Student(102, "Witanto", 14);
		Student siswa3 = new Student(103, "Arman", 13);
		
		ArrayList<Student> arrayList1 = new ArrayList<Student>();
		
		arrayList1.add(siswa1);
		arrayList1.add(siswa2);
		arrayList1.add(siswa3);
		
		Iterator iterator1 = arrayList1.iterator();
		
		while(iterator1.hasNext()) {
			Student studentAll = (Student)iterator1.next();
			System.out.println(studentAll.rollno + " " + studentAll.name + " " + studentAll.age);
		}

	}

}
