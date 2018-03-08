import java.util.Scanner;

public class NomberTujuh{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		//Fahreja

		String nama, gender, undangan, hadiah;
		int umur;
		double penampilan;

		System.out.print("Masukkan nama anda : ");
		nama = nilai.nextLine();

		System.out.print("Apakah anda memiliki undangan (Y/N) : ");
		undangan = nilai.next();

		System.out.print("Apakah anda membawa sebuah hadiah (Y/N) : ");
		hadiah = nilai.next();

		System.out.print("Berapa umur anda : ");
		umur = nilai.nextInt();

		System.out.print("Jenis kelamin (Pria/Wanita) : ");
		gender = nilai.next();

		System.out.print("Penampilan (0.0 - 10.0) : ");
		penampilan = nilai.nextDouble();

		if ((undangan.equalsIgnoreCase("y") || undangan.equalsIgnoreCase("ya")) || (hadiah.equalsIgnoreCase("ya") || hadiah.equalsIgnoreCase("ya")) && (umur > 0 && umur <= 20) || (gender.equalsIgnoreCase("wanita") && (umur >0 && umur <=20 ) && penampilan >= 8.0 )) {
			System.out.print("Selamat "+ nama +" anda bisa masuk");
		}else{
			System.out.print("Maaf anda belum memenuhi syarat");
		}
	}
}