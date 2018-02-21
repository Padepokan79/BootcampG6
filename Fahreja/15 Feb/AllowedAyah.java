import java.util.Scanner;

public class AllowedAyah{
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		int anakP,anakL,temp;
		double ganteng, pendapatan;
		boolean allowed;


		//inisialisasi umur anak perempuang
		anakP = 18;
		//mengambil data yang diperlukan
		System.out.print("Masukan umur anda : ");
		anakL = keyboard.nextInt();

		System.out.print("Masukan pendapatan anda(perbulan) : ");
		pendapatan = keyboard.nextDouble();

		System.out.print("Masukan skala kegantengan anda dari 0.0 sampai 10.0 : ");
		ganteng = keyboard.nextInt();

		temp = anakL - anakP;

		allowed = ((temp <= 5 && temp >= -5)&& ganteng >= 8.0 && pendapatan >= 5000000);
		System.out.println("Diterima atau tidak : "+ allowed);
	}
}