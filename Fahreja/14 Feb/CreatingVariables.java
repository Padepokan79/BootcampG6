public class CreatingVariables{
	public static void main(String[] args){
		int x, y, age, z;
		double seconds, e, checking, j;
		String firstName, lastName, title, pet, address;

		x = 10;
		z = 2;
		y = 400;
		age = 39;
		seconds = 4.71;
		e = 2.71828182845904523536;
		j = 178.798128;
		checking = 1.89;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		pet = "kuda";
		address = "cimuncang, Bandung";

		System.out.println("The variable x contains " + x);
		System.out.println("Thhe value "+ y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + "seconds");
		System.out.println("A favorite irrational # is Euler's number: " +e);
		System.out.println("Hpoefully you have more than $ " + checking+"!");
		System.out.println("My name's " + title+" "+firstName+lastName);
		System.out.println("saya tinggal di " + address);
		System.out.println("saya mempunyai " + z +" "+ pet +" yang mempunyai total berat " +j+" kg");
	}
}