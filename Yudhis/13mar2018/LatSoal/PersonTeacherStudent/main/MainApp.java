package main;

public class MainApp extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		Student student = new Student();
		
		teacher.setFirstName("Yudhistira");
		teacher.setLastName("Putra");
		teacher.setAge(22);
		teacher.setGender("Lelaki");
		teacher.setInterest("Inter Milan");
		teacher.bioPerson();
		teacher.subjectTeacher("Matematika");
		
		student.setFirstName("Yudhistira");
		student.setLastName("Putra");
		student.setAge(22);
		student.setGender("Lelaki");
		student.setInterest("Sevilla");
		student.bioPerson();
		student.greetStudent();
	}

}
