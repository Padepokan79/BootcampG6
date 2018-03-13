
public class TestPersonInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		Student s = new Student();
		
		t.person("Diana", "Merilyn", 21, "Female", "Singing");
		t.displayBio();
		t.subject("Biology");
		
		s.person("David", "Hann", 20, "Male", "Sport");
		s.displayBio();
		s.greeting();

	}

}
