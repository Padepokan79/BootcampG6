import java.util.Scanner;

public class PerhitunganGajiIlham {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nama, nip;
		double basicSalary, familyAllowance, childrenAllowance, functionalAllowance, familyMember, ricePricePerKg, ricePerPerson, riceAllowance, allowance, brutoSalary, retrimentContribution, functionalExpenses, taperumContribution, salaryCut, nettoSalary, annualNettoSalary, pphSalary, takeHomePay;

		familyMember = 4;
		ricePricePerKg = 8000;
		ricePerPerson = 10;
		functionalAllowance = 500000;
		taperumContribution = 10000;

		System.out.println("-------------------------------------------------");
		System.out.print  ("Tuliskan Nama Anda : ");
		nama = keyboard.next();
		System.out.print  ("NIP : ");
		nip = keyboard.next();
		System.out.print  ("Gaji Pokok Anda : ");
		basicSalary = keyboard.nextDouble();

		familyAllowance = basicSalary * 0.1;
		childrenAllowance = basicSalary * 0.02;
		riceAllowance = familyMember * ricePricePerKg * ricePerPerson;
		allowance = familyAllowance + childrenAllowance + riceAllowance + functionalAllowance;
		brutoSalary = basicSalary + allowance;
		retrimentContribution = brutoSalary * 0.0475;
		functionalExpenses = brutoSalary * 0.05;
		salaryCut = retrimentContribution + functionalExpenses + taperumContribution;
		nettoSalary = brutoSalary - salaryCut;
		annualNettoSalary = nettoSalary * 12;
		pphSalary = nettoSalary * 0.05;
		takeHomePay = nettoSalary - pphSalary;

		System.out.println();
		System.out.println();
		System.out.println("Gaji Bapak/Ibu " + nama);
		System.out.println("NIP : " + nip);
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Basic Salary\t: " + basicSalary);
		System.out.println("Allowance\t: " + allowance);
		System.out.println("Bruto Salary\t: " + brutoSalary);
		System.out.println("Salary Cut\t: " + salaryCut);
		System.out.println("Netto Salary\t: " + nettoSalary);
		System.out.println("PPH Salary\t: " + pphSalary);
		System.out.println("Take Home Pay\t: " + takeHomePay);
		System.out.println();
		System.out.println("=================================================");
	}	
}