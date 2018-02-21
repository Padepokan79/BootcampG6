import java.util.Scanner;

public class MelodiesMemori{
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		//inisialisasi

		int umur;
		String hari,gender;
		double penampilan;
		boolean allowed, cewek,cowok, hBenar;

		//input data dari keyboard
		System.out.print("Masukan Hari yang ingin dipesan: ");
		hari = keyboard.next();
		System.out.print("Gender Anda(Cowok/Cewek): ");
		gender = keyboard.next();
		System.out.print("Umur anda : ");
		umur = keyboard.nextInt();
		System.out.print("Masukan skala kegantengan anda dari 0.0 sampai 10.0 : ");
		penampilan = keyboard.nextDouble();

		//proses boolean
		cewek = gender.equalsIgnoreCase("cewek");
		cowok = gender.equalsIgnoreCase("cowok");
		hBenar = hari.equalsIgnoreCase("jumat");
		allowed = (cewek || cowok && umur > 40 && (penampilan >= 8.0 || !(penampilan >= 8.0)) && hBenar);

		//output
		System.out.println("Pemesanan tempat di hari" + hari + " : " + allowed);
	}
}