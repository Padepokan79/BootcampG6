public class CreatingVariables{
	public static void main (String[]args) {
	int x, y, age, gaji;
	double seconds, e, cheking, rotasi;
	String firstName, lastName, title, agama, alamat ;

	x=10;
	y=400;
	age=39;
	gaji=4500000;

	seconds = 4.71;
	e=2.71828182845904523536;
	cheking= 1.89;
	rotasi=115.789;


	firstName = "Graham";
	lastName = "Mitchell";
	title = "Mr.";
	agama="islam";
	alamat="Bandung";

	System.out.println("The variable x contains "  + x);
	System.out.println("The value " +y + " is stored in the variable y.");
	System.out.println("The Experiment took " +seconds+" seconds.");
	System.out.println("A favorite irrational # is Euler's number: " + e);
	System.out.println("Hopefully you have more than $ " + cheking + " ");
	System.out.println("My name's" + title + " " + firstName + lastName);
	System.out.println("Gajinya adalah: Rp. " + gaji);
	System.out.println("Agama : " +agama);
	System.out.println("Alamat: " +alamat);
	}
}