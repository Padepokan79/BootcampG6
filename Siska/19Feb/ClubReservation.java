import java.util.Scanner;

public class ClubReservation{
	public static void main (String [] args){
	Scanner keyboard = new Scanner (System.in);
	int age;
	String gender, hari;
	double cute;

	System.out.println ("---------------------");
	System.out.println ("Silahkan isi data untuk Melakukan Reservasi");
	System.out.print ( "Masukan hari : ");
	hari = keyboard.next ();
	System.out.print ("Jenis Kelamin : ");
	gender = keyboard.next();
	System.out.print ("Umur : ");
	age = keyboard.nextInt();
	System.out.print ("Tingkat penampilan anda dari 0 sampai 10 : ");
	cute = keyboard.nextDouble();


	if (hari.equalsIgnoreCase ("selasa") && ((gender.equalsIgnoreCase ("cewek") && (age >= 30 && age <= 45) && cute >= 8.0) || (gender.equalsIgnoreCase ("cowok") && (age >= 20 && age <= 25) && cute < 8.0))) {
		System.out.println ("Anda Bisa Melakukan Reservasi Brondong Night");
	}
	
	if (hari.equalsIgnoreCase ("jumat") && age > 40 && (gender.equalsIgnoreCase("cewek") || gender.equalsIgnoreCase("cowok"))){
		System.out.println ("Anda Bisa Melakukan Reservasi Melodies Memori");
	}

	if (hari.equalsIgnoreCase ("kamis") && (age <=30 && age >=21) && cute >=8.0 && gender.equalsIgnoreCase("cewek")){
		System.out.println ("Anda Bisa Melakukan Reservasi Ledies Night");
	}
	
	if (hari.equalsIgnoreCase ("sabtu") && (age >=21 && age <= 30 && cute>= 8.0) && (gender.equalsIgnoreCase ("cewek") || gender.equalsIgnoreCase("cowok"))) {
			System.out.println ("Anda Bisa Melakukan Reservasi Jomblo Night");
		}
	if (hari.equalsIgnoreCase ("senin") || hari.equalsIgnoreCase ("rabu") || hari.equalsIgnoreCase ("minggu")){
		System.out.println ("Kamu Diterima di Reservasi Umum");
	}
	else {
		System.out.println ("\nKamu tidak bisa Melakukan Reservasi");
	}
	}

	}