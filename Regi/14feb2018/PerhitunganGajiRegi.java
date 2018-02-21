import java.util.Scanner;

public class PerhitunganGajiRegi {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		String nama, nip;
		double basicSalary, familyAllowance, childrenAllowance, functionalAllowance = 500000, familyMember = 4, ricePrice = 8000, ricePerPerson = 10,
		riceAllowance, allowance, brutoSalary,  retriment = 0.0475, retrimentContribution, functional = 0.05, functionalExpenses, taperum = 10000, 
		salaryCut, nettoSalary, annualNettoSalary, pphSalary, takeHomePay;

		System.out.print( "\n----------------------------------" );
		System.out.print( "\n Tuliskan Nama Anda : " );
		nama = keyboard.next();

		System.out.print( "\n NIP : " );
		nip = keyboard.next();

		System.out.print( "\n Gaji Pokok Anda : " );
		basicSalary = keyboard.nextDouble();

		System.out.println();
		System.out.println();
		System.out.print( "\n Gaji Bapak/Ibu : " + nama );
		System.out.println();
		System.out.print( "\n NIP            : " + nip );

		familyAllowance = 0.1 * basicSalary;
		childrenAllowance = 0.02 * basicSalary;
		riceAllowance = familyMember * ricePerPerson * ricePrice;
		allowance = familyAllowance + childrenAllowance + riceAllowance + functionalAllowance;
		brutoSalary = basicSalary + allowance;
		retrimentContribution = retriment * brutoSalary;
		functionalExpenses = functional * brutoSalary;
		salaryCut = retrimentContribution + functionalExpenses + taperum;
		nettoSalary = brutoSalary - salaryCut;
		annualNettoSalary = nettoSalary * 12;
		pphSalary = 0.05 * nettoSalary;
		takeHomePay = nettoSalary - pphSalary;

		System.out.print( "\n----------------------------------" );
		System.out.println();
		System.out.print( "\n Basic Salary\t: " + basicSalary );
		System.out.print( "\n Allowance\t: " + allowance );
		System.out.print( "\n Bruto Salary\t: " + brutoSalary );
		System.out.print( "\n Salary Cut\t: " + salaryCut );
		System.out.print( "\n Netto Salary\t: " + nettoSalary );
		System.out.print( "\n PPH Salary\t: " + pphSalary );
		System.out.print( "\n Take Home Pay\t: " + takeHomePay );
		System.out.println();
		System.out.print( "\n----------------------------------" );
	}
}