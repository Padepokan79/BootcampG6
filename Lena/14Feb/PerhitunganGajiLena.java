import java.util.Scanner;

public class PerhitunganGajiLena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		String nama,nip;

		double basicSalary, brutoSalary, salaryCut, nettoSalary, annualNettoSalary, pphSalary;
		double familyAllowance,childrenAllowance,riceAllowance, allowance;
		double retrimentContribution,functionalExpenses;
		double takeHomePay;

		double functionalAllowance=500000;
		double ricePricePerKg=8000;
		double taperumContribution=10000;
		double ricePerPersonInKg=10;

		int familyMember=4;

		System.out.print("Tuliskan nama anda: ");
		nama=keyboard.next();
		System.out.print("NIP: ");
		nip=keyboard.next();
		System.out.print("Gaji pokok anda: Rp ");
		basicSalary=keyboard.nextDouble();

		familyAllowance= 0.1*basicSalary;
		childrenAllowance= 0.02*basicSalary;
		riceAllowance= familyMember*ricePerPersonInKg*ricePricePerKg;

		allowance=familyAllowance+childrenAllowance+riceAllowance+functionalAllowance;

		brutoSalary=basicSalary+allowance;

		retrimentContribution=0.0475*brutoSalary;
		functionalExpenses=0.05*brutoSalary;

		salaryCut=retrimentContribution+functionalExpenses+taperumContribution;

		nettoSalary=brutoSalary - salaryCut;

		annualNettoSalary=nettoSalary*12;

		pphSalary=0.05*nettoSalary;

		takeHomePay=nettoSalary - pphSalary;

		System.out.println("\n\nGaji Bapak/Ibu "+nama);
		System.out.println("NIP  : "+nip);
		System.out.println("=========================================");

		System.out.println("\nBasic Salary     : Rp  "+(int) basicSalary);
		System.out.println("Allowance        : Rp  "+(int) allowance);
		System.out.println("Bruto Salary     : Rp  "+(int) brutoSalary);
		System.out.println("Salary Cut       : Rp  "+(int) salaryCut);
		System.out.println("Netto Salary     : Rp  "+(int) nettoSalary);
		System.out.println("PPH Salary       : Rp  "+(int) pphSalary);
		System.out.println("Take Home Pay    : Rp  "+(int) takeHomePay);

		System.out.println("\n=========================================");
	}
}