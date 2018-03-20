import java.util.*;
public class TestCollection3 {
	public static void main(String[] args) {
		Student2 s1 = new Student2(101, "Seno", 23);
		Student2 s2 = new Student2(102, "Huda", 21);
		Student2 s3 = new Student2(103, "Kurni", 25);
		ArrayList<Student2> al=new ArrayList<Student2>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator iter = al.iterator();
		while (iter.hasNext()) {
			Student2 st = (Student2) iter.next();
				System.out.println(st.age+" "+st.name+" "+st.age);
		}
	}
}
