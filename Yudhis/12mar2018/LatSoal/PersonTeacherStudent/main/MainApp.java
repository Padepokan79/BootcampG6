package main;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		Student student = new Student();
		
		teacher.bioPerson("Yudhistira", "Putra", 22, "Lelaki", "Inter Milan");
		teacher.subjectTeacher("Matematika");
		
		student.bioPerson("Yudhistira", "Putra", 22, "Lelaki", "Sevilla");
		student.greetStudent();
	}

}
