import java.util.Scanner;

public class NomberDelapan{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		//Fahreja
		int tinggi;

		System.out.print("input angka : ");
		tinggi = nilai.nextInt();

		for (int baris = 0; baris < tinggi ; baris++) {
			for(int spasi = 1; spasi < tinggi-baris; spasi++){
				System.out.print(" ");
			}
			for (int kata = 0; kata <= baris ; kata++) {
				System.out.print("#");
			}
			System.out.println(" ");
		}
	}
}
