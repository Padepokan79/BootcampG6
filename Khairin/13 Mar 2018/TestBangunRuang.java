import java.util.Scanner;

public class TestBangunRuang {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu;
		
		do {
		System.out.println();
		System.out.println("VOLUME DAN LUAS");
		System.out.println("1. Kubus");
		System.out.println("2. Balok");
		System.out.println("3. Tabung");
		System.out.println("0. Exit");
		System.out.println("Pilih Bangun yang ingin di hitung : "); menu = input.nextInt();
		
		switch (menu) {
		case 1 :
			Kubus k= new Kubus();
			break;
		
		case 2 :
			Balok b= new Balok();
			break;
			
		case 3 :
			Tabung t= new Tabung();
			break;
			
		default :
			break;
		}
		
		} while (menu != 0);
		
	}

}
