import java.util.Scanner;

public class SoalNo7{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nama, punyaUndangan, bawaHadiah, gender;
		int umur;
		double penampilan;

		System.out.println("7. Syarat untuk boleh masuk ke pesta.\n");

		System.out.print("Masukkan nama anda: "); 
		nama = input.next();
		System.out.print("Apakah anda memiliki undangan (Ya/Tidak)? ");
		punyaUndangan = input.next();
		System.out.print("Apakah anda membawa hadiah (Ya/Tidak)? ");
		bawaHadiah = input.next();
		System.out.print("Masukkan umur anda: ");
		umur = input.nextInt();
		System.out.print("Masukkan jenis kelamin (Pria / Wanita): ");
		gender = input.next();
		System.out.print("Seberapa menariknya penampilan anda dalam skala 0,0 - 10,0? ");
		penampilan = input.nextDouble();


		if(punyaUndangan.equalsIgnoreCase("ya")){
			System.out.println("\nAnda boleh ikut ke pesta");
		}
		else if(bawaHadiah.equalsIgnoreCase("ya") && umur <= 20){
			System.out.println("\nAnda boleh ikut ke pesta");
		}
		else if(gender.equalsIgnoreCase("wanita") && umur<=20 && penampilan >=8){
			System.out.println("\nAnda boleh ikut ke pesta");
		}
		else{
			System.out.println("\nAnda tidak boleh ikut pesta");
		}

	}
}