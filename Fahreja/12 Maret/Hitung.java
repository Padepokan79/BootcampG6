import java.util.Scanner;

public class Hitung {
	public static void main(String[] args) {
		
	
	Scanner nilai = new Scanner(System.in);
	BangunRuang rumus = new BangunRuang();
	Kubus rumusK = new Kubus();
	Balok rumusB = new Balok();
	Tabung rumusT = new Tabung();
	int pilih;
	double sisi,panjang,lebar,tinggi,jari= 0,diameter;
	String keluar = "no";
	
		do {
			System.out.println("Menu : \n");
			System.out.println("1. Rumus Volume dan Luas Kubus");
			System.out.println("2. Rumus Volume dan Luas Balok");
			System.out.println("3. Rumus Volume dan Luas Tabung");
			System.out.println("0. Exit");
			System.out.print(">");
			pilih = nilai.nextInt();
			
				if (pilih == 1) {
					rumusK.angka();
					sisi = nilai.nextDouble();
					rumusK.nilai(sisi);
					System.out.println("");
					rumusK.tampilVolum();
					rumusK.tampilLuas();
						
				}else if (pilih == 2) {	
					rumusB.angka();
					System.out.println("Panjang ");
					panjang = nilai.nextDouble();
					System.out.println("Lebar");
					lebar = nilai.nextDouble();
					System.out.println("Tinggi");
					tinggi = nilai.nextDouble();
					rumusB.nilai(panjang, lebar, tinggi);
					System.out.println("");
					rumusB.tampilVolum();
					rumusB.tampilLuas();
					
				}else if (pilih == 3) {
					System.out.println("1.jari-jari 2. diameter : ");
					pilih = nilai.nextInt();
					
						if (pilih == 1) {
							rumusT.angka();
							System.out.println("Jari-jari");
							jari = nilai.nextDouble();
						}
						if (pilih == 2) {
							rumusT.angka();
							System.out.println("Diameter");
							diameter = nilai.nextDouble();
							rumusT.nilai(jari);
							rumusT.convert();
							jari = rumusT.convert();
						}
					System.out.println("tinngi");
					tinggi = nilai.nextDouble();
					rumusT.nilai(jari, tinggi);
					System.out.println("");
					rumusT.tampilVolum();
					rumusT.tampilLuas();
				}
			
		} while (pilih != 0);
	}
	
}
