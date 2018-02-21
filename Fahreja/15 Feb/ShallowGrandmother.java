import java.util.Scanner;

public class ShallowGrandmother{
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		int age;
		double income, cute;
		boolean allowed;

		System.out.print("Masukan umur anda: ");
		age = keyboard.nextInt();

		System.out.print("Masukan Pemasukan pertahun: ");
		income = keyboard.nextDouble();

		System.out.print("Masukan skala kegantengan anda dari 0.0 sampai 10.0 : ");
		cute = keyboard.nextDouble();

		allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));

		System.out.println("Diterima atau tidak : "+ allowed);
	}
}