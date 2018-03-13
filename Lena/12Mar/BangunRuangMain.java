import java.util.Scanner;

public class BangunRuangMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Kubus kubus = new Kubus();
		Balok balok = new Balok();
		Tabung tabung = new Tabung();
		
		int menu = 1;
		double sisi,panjang,lebar,tinggi,jariJari;
		
		while(menu!=0) {
			System.out.println("Perhitungan Ruang\n1.Kubus\n2.Balok\n3.Tabung\n0.Exit\nPilih bangun yang ingin dihitung: ");
			menu=scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Menghitung Ruang Kubus");
				System.out.println("Masukkan panjang sisi dalam cm:");
				sisi=scan.nextDouble();
				kubus.insertRecord(sisi);
				kubus.displayLuas();
				kubus.displayVolume();
				break;
			case 2:
				System.out.println("Menghitung Ruang Balok");
				System.out.println("Masukkan panjang dalam cm:");
				panjang=scan.nextDouble();
				System.out.println("Masukkan lebar dalam cm:");
				lebar=scan.nextDouble();
				System.out.println("Masukkan tinggi dalam cm:");
				tinggi=scan.nextDouble();
				balok.insertRecord(panjang,lebar,tinggi);
				balok.displayLuas();
				balok.displayVolume();
				break;
			case 3:
				System.out.println("Menghitung Ruang Tabung");
				System.out.println("Masukkan jari jari dalam cm:");
				jariJari=scan.nextDouble();
				System.out.println("Masukkan tinggi dalam cm:");
				tinggi=scan.nextDouble();
				tabung.insertRecord(jariJari,tinggi);
				tabung.displayLuas();
				tabung.displayVolume();
				break;
			case 0:				
				break;
			default:
				System.out.println("Inputan anda salah!");
				break;
			}
		}
	}

}
