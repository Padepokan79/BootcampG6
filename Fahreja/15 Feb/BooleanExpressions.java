import java.util.Scanner;

public class BooleanExpressions{
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		boolean kurangDari,krgDariSm,samaDgn,tidakSmDgn,lebihDari,lebihDariSm;
		double nAwal,nKedua;

		System.out.print("Give me two number. First :");
		nAwal= keyboard.nextDouble();
		System.out.print("Second : ");
		nKedua = keyboard.nextDouble();

		kurangDari =(nAwal < nKedua);
		krgDariSm =(nAwal <= nKedua);
		samaDgn =(nAwal == nKedua);
		tidakSmDgn=(nAwal != nKedua);
		lebihDari=(nAwal > nKedua);
		lebihDariSm = (nAwal >= nKedua);

		System.out.println(nAwal +" lebih kecil dari " +nKedua+" : "+kurangDari);
		System.out.println(nAwal +" lebih kecil dari atau sama dengan " +nKedua+" : "+krgDariSm);
		System.out.println(nAwal +" sama dengan " +nKedua+" : "+ samaDgn);
		System.out.println(nAwal +" tidak sama dengan " +nKedua+" : "+tidakSmDgn);
		System.out.println(nAwal +" lebih besar dari " +nKedua+" :"+lebihDari);
		System.out.println(nAwal +" lebih besar dari atau sama dengan" +nKedua+" :"+lebihDariSm);
		System.out.println();

		System.out.println(!(nAwal<nKedua)+ " " + (nAwal>=nKedua));
		System.out.println(!(nAwal<=nKedua)+ " " + (nAwal>nKedua));
		System.out.println(!(nAwal==nKedua)+ " "+(nAwal!=nKedua));
		System.out.println(!(nAwal!=nKedua)+ " "+(nAwal==nKedua));
		System.out.println(!(nAwal>nKedua)+ " "+(nAwal<=nKedua));
		System.out.println(!(nAwal>=nKedua)+ " "+(nAwal<nKedua));
	}
}