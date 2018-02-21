import java.util.Scanner;

public class ClubReservationLena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		//deklarasi
		int usia;
		double look;
		String hari, gender;
		boolean kriteria=false;

		System.out.print("Masukkan hari: ");
		hari=keyboard.next();
		System.out.print("Masukkan jenis kelamin (P/L): ");
		gender=keyboard.next();
		System.out.print("Masukkan usia: ");
		usia=keyboard.nextInt();
		System.out.print("Seberapa menariknya anda dari skala 0.0 sampai 10.0: ");
		look=keyboard.nextDouble();

		//proses
		if(hari.equalsIgnoreCase("jumat") && usia>40){
			System.out.println("\nDapat mengikuti klub Melodies Memori");
			kriteria=true;
		}
		if(hari.equalsIgnoreCase("kamis") && gender.equalsIgnoreCase("p") && usia>=21 && usia<=30 && look>=8) {
			System.out.println("\nDapat mengikuti klub Ladies Night");
			kriteria=true;
		}
		if(hari.equalsIgnoreCase("sabtu") && usia>=21 && usia<=30 && look>=8){
			System.out.println("\nDapat mengikuti klub Jomblo night");
			kriteria=true;
		}
		if(hari.equalsIgnoreCase("selasa") && ((gender.equalsIgnoreCase("p") && usia>=30 && usia<45 && look>=8) || (gender.equalsIgnoreCase("l") && usia>=20 && usia<=25 && look<8))){
			System.out.println("\nDapat mengikuti klub Brondong Night");
			kriteria=true;
		}
		if(hari.equalsIgnoreCase("senin") || hari.equalsIgnoreCase("rabu") || hari.equalsIgnoreCase("minggu")){
			System.out.println("\nDapat mengikuti klub yang terbuka untuk umum");
			kriteria=true;
		}
		if(kriteria==false){
			System.out.println("\nTidak memenuhi kualifikasi untuk klub di hari "+hari);
		}
	}
}