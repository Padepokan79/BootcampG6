import java.util.Scanner;

public class AllowedIbu{
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		int umur;
		double ganteng, pendapatan;
		boolean allowed;

		System.out.print("Masukan umur anda: ");
		umur = keyboard.nextInt();

		System.out.print("Masukan Pemasukan pertahun: ");
		pendapatan = keyboard.nextDouble();

		System.out.print("Masukan skala kegantengan anda dari 0.0 sampai 10.0 : ");
		ganteng = keyboard.nextDouble();

		allowed = (umur >= 17 && umur < 30 && (pendapatan > 5000000 && ganteng >= 8.0));

		System.out.println("Diterima atau tidak : "+ allowed);
	}
}