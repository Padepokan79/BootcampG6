import java.util.Scanner;
import java.util.Random;
public class GamesFahreja{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int angkaAcak,tebakan;

		System.out.println("Saya memikirkan angka dari 1 sampai 10.");
		System.out.println("Anda harus menebaknya, dan hanya memiliki 3 kali kesempatan.");
		System.out.println("Masukan nomber anda : ");
		
		angkaAcak = rand.nextInt(10)+1;
		
		for (int nilaiAwal = 0; nilaiAwal < 4 ; nilaiAwal++ ) {
			tebakan = keyboard.nextInt();
			if (tebakan == angkaAcak) {
				System.out.println("Selamat anda benar");
				nilaiAwal = 4;
			}else if  (tebakan != angkaAcak && nilaiAwal<2){
				System.out.println("Jawaban anda salah");
			}else {
				System.out.println("Nomber yang benar adalah : " + angkaAcak+"\n Kamu kalah");
				break;
			}


		}
	}
	
}