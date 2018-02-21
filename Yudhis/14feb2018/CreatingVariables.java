public class CreatingVariables{
	public static void main(String[] args) {
		int x, y, age, tahun, tanggal;
		double seconds, e, checking, jam;
		String firstName, lastName, title, hari, bulan;

		x = 10;
		y = 400;
		age = 39;
		tahun = 2018;
		tanggal = 14;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		jam = 10.36;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		hari = "Rabu";
		bulan = "Februari";

		System.out.println("The variable x contains " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds.");
		System.out.println("A favourite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println("My name's " + title + " " + firstName + lastName);	
		System.out.println("Sekarang hari " + hari + " tanggal " + tanggal + " " + bulan + " " + tahun + " jam " + jam);
	}
}