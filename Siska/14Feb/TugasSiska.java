import java.util.Scanner;

public class TugasSiska{
	public static void main(String[]args){

	Scanner keyboard = new Scanner (System.in);
	String nama, nip;
	int taperumCon, familyMember, ricepricekg, ricepricepersonkg, riceAllowance, functionalAllowance;
	Double gaji, retriment, retrimentCon, func, functionalExpenses, allowance, brutoSalary, family, familyAllowance, children, childrenAllowance;
	Double salaryCut, nettoSalary, annualNettosalary, pph, takeHomepay;
	family = 0.1;
	children = 0.02;
	functionalAllowance=500000;
	familyMember= 4;
	ricepricekg=8000;
	ricepricepersonkg=10;
	retriment=0.0475;
	func=0.05;
	taperumCon = 10000;

	System.out.println("----------------------------");
	System.out.println("Tuliskan Nama Anda : ");
	nama = keyboard.next();
	System.out.println("NIP : " );
	nip = keyboard.next();
	System.out.println("Gaji Pokok Anda : ");
	gaji = keyboard.nextDouble();

	familyAllowance=family*gaji;
	childrenAllowance=children*gaji;
	riceAllowance = familyMember*ricepricepersonkg*ricepricekg;
	allowance = familyAllowance+childrenAllowance+riceAllowance+functionalAllowance;
	brutoSalary = gaji+allowance;

	retrimentCon=retriment*brutoSalary;
	functionalExpenses=func*brutoSalary;
	salaryCut = retrimentCon + functionalExpenses + taperumCon;

	nettoSalary=brutoSalary-salaryCut;
	annualNettosalary = nettoSalary * 12;
	pph = func*nettoSalary;
	takeHomepay=nettoSalary-pph;

	System.out.println ("Gaji Bapak/Ibu : " + nama);
	System.out.println ("NIP: " + nip);
	System.out.println("==================================");

	System.out.println ("Basic Salary  : " + gaji);
	System.out.println ("Allowance     : " + allowance);
	System.out.println ("Bruto Salary  : " + brutoSalary);
	System.out.println ("Salary Cut    : " +salaryCut);
	System.out.println ("Netto Salary  : "+ nettoSalary);
	System.out.println ("PPH Salary    : " + pph);
	System.out.println ("Take Home Pay : " + takeHomepay);
	System.out.println ("=================================");

	}
}