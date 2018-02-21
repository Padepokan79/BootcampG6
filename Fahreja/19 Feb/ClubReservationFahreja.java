import java.util.Scanner;

public class ClubReservationFahreja{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);

		//inisialisasi
		int umur,setuju = 0;
		String hari,gender;
		double penampilan;
		

		//input data dari keyboard
		System.out.print("Masukan Hari yang ingin dipesan: ");
		hari = keyboard.next();
		System.out.print("Gender Anda(Cowok/Cewek): ");
		gender = keyboard.next();
		System.out.print("Umur anda : ");
		umur = keyboard.nextInt();
		System.out.print("Masukan skala kegantengan anda dari 0.0 sampai 10.0 : ");
		penampilan = keyboard.nextDouble();

		//proses kondisional
		if (hari.equalsIgnoreCase("jumat")){
			if (gender.equalsIgnoreCase("cewek")) {
				if (umur >= 40) {
					System.out.println("Selamat anda bisa reservasi di Melodies Memori");
					setuju = 1;	
				}	
			}if (gender.equalsIgnoreCase("cowok")) {
				if (umur >= 40) {
					System.out.println("Selamat anda bisa reservasi di Melodies Memori");
					setuju = 1;	
				}
			}			
		} 
		if (hari.equalsIgnoreCase("kamis")) {
			if (gender.equalsIgnoreCase("cewek")){
				if (umur >= 21 && umur <=30) {
					if (penampilan >=8.0 ) {
						System.out.println("Selamat anda bisa reservasi di Ladies Night 5a");
						setuju = 1;	
					}
				}
			}
		}
		if(hari.equalsIgnoreCase("sabtu")) {
			if (gender.equalsIgnoreCase("cewek")) {
				if (umur >= 21&&umur <= 30) {
					if (penampilan >= 8.0) {
						System.out.println("Selamat anda bisa reservasi di Jomblo Night 5b");
						setuju = 1;	
					}
				}
			}if (gender.equalsIgnoreCase("cowok")) {
				if (umur >= 21&&umur <= 30) {
					if (penampilan >= 8.0) {
						System.out.println("Selamat anda bisa reservasi di Jomblo Night 5b");
						setuju = 1;	
					}
				}
			}
		} 
		if (hari.equalsIgnoreCase("selasa")) {
			if (gender.equalsIgnoreCase("cewek")){ 
				if (umur >= 30&&umur <=45) {
					if (penampilan>=8.0) {	
						System.out.println("Selamat anda bisa reservasi di Brondong Night 5c");
						setuju = 1;	
					}
				}
			}if (gender.equalsIgnoreCase("cowok")) {
				if (umur>=20&&umur<=25) {
					System.out.println("Selamat anda bisa reservasi di Brondong Night 5c");
					setuju = 1;	
				}
			}
		}
		if (hari.equalsIgnoreCase("senin")||hari.equalsIgnoreCase("rabu")||hari.equalsIgnoreCase("minggu")) {
			System.out.println("Reservasi untuk umum");
			setuju = 1;	
		} 
		if (setuju == 1 ){
		}
		else {
			System.out.println("silahkan pesan di hari lain");
		}	
	}	
}