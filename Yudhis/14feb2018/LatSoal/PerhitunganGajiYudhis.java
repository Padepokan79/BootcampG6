import java.util.Scanner;

public class PerhitunganGajiYudhis{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Inisialisasi Nama & NIP
		String nama, nip;

		// Inisialisasi Salary
		double basicSalary, brutoSalary, nettoSalary, annNettoSalary, pphSalary, tHomePay;

		// Inisialisasi Allowance
		double famAllowance, childAllowance, riceAllowance, totAllowance;
		int funcAllowance = 500000, famMember = 4, ricePerKg = 8000, ricePerPersonKg = 10;

		// Inisialisasi Lain-lain
		double retirementCont, funcExp, salaryCut;
		int tapCont = 10000;

		System.out.println("-----------------------------------------");
		System.out.print("Tuliskan nama anda? "); nama = input.nextLine();
		System.out.print("NIP? "); nip = input.next();
		System.out.print("Gaji pokok anda? "); basicSalary = input.nextDouble();

		// Penghitungan Allowance
		famAllowance = 0.1 * basicSalary;
		childAllowance = 0.02 * basicSalary;
		riceAllowance = famMember * ricePerPersonKg * ricePerKg;
		totAllowance = famAllowance + childAllowance + riceAllowance + funcAllowance;

		// Penghitungan Bruto
		brutoSalary = basicSalary + totAllowance;

		// Penghitungan Lain-lain
		retirementCont = 0.0475 * brutoSalary;
		funcExp = 0.05 * brutoSalary;

		// Penghitungan Salary Cut
		salaryCut = retirementCont + funcExp + tapCont;

		// Penghitungan Netto, Annual, PPH, THP
		nettoSalary = brutoSalary - salaryCut;
		annNettoSalary = nettoSalary * 12;
		pphSalary = 0.05 * nettoSalary;
		tHomePay = nettoSalary - pphSalary;

		System.out.println("\nGaji Bapak/Ibu " + nama);
		System.out.println("NIP : " + nip);
		System.out.println("=========================================");
		System.out.println("Basic Salary  : " + (int) basicSalary);
		System.out.println("Allowance     : " + (int) totAllowance);
		System.out.println("Bruto Salary  : " + (int) brutoSalary);
		System.out.println("Salary Cut    : " + (int) salaryCut);
		System.out.println("Netto Salary  : " + (int) nettoSalary);
		System.out.println("PPH Salary    : " + (int) pphSalary);
		System.out.println("Take Home Pay : " + (int) tHomePay);
		System.out.println("=========================================");
	}
}