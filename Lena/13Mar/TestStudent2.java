
public class TestStudent2 {
	public static void main(String[] args) {
		Student siswa = new Student();
		Teacher guru = new Teacher();
		
		siswa.insertRecord("Diana", "Cops", 18, "Female", "Music");;
		siswa.displayBio();
		siswa.displayGreeting();
		
		guru.insertRecord("Melanie", "Hall", 26, "Female", "Archery");
		guru.setSubject("Physics");
		guru.displayBio();
		guru.displayGreeting();
	}
}
