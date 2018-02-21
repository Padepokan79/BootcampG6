public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age, jumlahSaudara;
		double seconds, e, checking, tinggiBadan;
		String firstName, lastName, title, alamat, kota;

		x = 10;
		y = 400;
		age = 39;
		jumlahSaudara = 2;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		tinggiBadan = 168.81;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		alamat = "Cibiru";
		kota = "Bandung";

		System.out.println("The variable x contains " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds.");
		System.out.println("A favorite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println("My name's " + title + " " + firstName + lastName);
		
		System.out.println("Tinggal di " + alamat + " " + kota);
		System.out.println(jumlahSaudara + " bersaudara");
		System.out.println("Tinggi Badan : " + tinggiBadan);
	}
}