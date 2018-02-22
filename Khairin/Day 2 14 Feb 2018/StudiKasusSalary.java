import java.util.Scanner;

public class StudiKasusSalary {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String name, nIP;  
		double bSalary, funcAll, cA, famA, fM, ricePrice, riceKg,rAll, all, brSalary, salCut, nettSal, pphSal, tHP, retCont, funcExp, taperCont, annNettSal;


		System.out.print( "Tuliskan Nama Anda:" );
		name = keyboard.next();

		System.out.print( "NIP:" );
		nIP = keyboard.next();

		System.out.print( "Gaji Pokok Anda:" );
		bSalary = keyboard.nextDouble();

		funcAll=500000;
		fM=4;
		ricePrice=8000;
		riceKg=10; 
		famA=0.1*bSalary;
		cA=0.02*bSalary;
		rAll=fM*riceKg*ricePrice;
		all=famA+cA+rAll+funcAll;
		brSalary=bSalary+all;
		retCont=0.0475*brSalary;
		funcExp=0.05*brSalary;
		taperCont=10000;
		salCut=retCont+funcExp+taperCont;
		nettSal=brSalary-salCut;
		annNettSal=nettSal*12;
		pphSal=0.05*nettSal;
		tHP=nettSal-pphSal;

		System.out.println("========================================");
		
		System.out.println( "Gaji Bapak/Ibu " + name );
		System.out.println( "NIP: " + nIP );

		System.out.println("========================================");
		
		System.out.println( "\nBasic Salary\t: " + bSalary );
		System.out.println( "Allowance\t: " + all );
		System.out.println( "Bruto Salary\t: " + brSalary );
		System.out.println( "Salary Cut\t: " + salCut );
		System.out.println( "Netto Salary\t: " + nettSal );
		System.out.println( "PPH Salary\t: " + pphSal );
		System.out.println( "Take Home Pay\t: " + tHP );

		System.out.println("========================================");
	}
}