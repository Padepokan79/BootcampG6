import java.util.Scanner;

public class TestBangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Kubus kubus = new Kubus();
		Balok balok = new Balok();
		Tabung tabung = new Tabung();
		
		int pilih;	
		double tinggi, panjang, lebar, sisi, jariJari ;

		
		do {
			System.out.println("Volume dan Luas.");
			System.out.println();
			System.out.println("Perhitungan Ruang");
			System.out.println("1. Kubus.");
			System.out.println("2. Balok.");
			System.out.println("3. Tabung.");
			System.out.println("0. exit.");
			System.out.println("Pilih Bangun yang ingin di hitung: ");
			pilih = input.nextInt();
			
			switch(pilih) {
				case 1 :
						System.out.println("Menghitung Ruang Kubus.");
						System.out.println("Masukan panjang sisi dalam cm: ");
						sisi = input.nextDouble();
						System.out.println();
						kubus.setSisi(sisi);
						System.out.println("Luas Kubus dengan sisi " + kubus.getSisi() + "cm Adalah " + kubus.luas());
						System.out.println("Volume Kubus dengan sisi " + kubus.getSisi() + "cm Adalah " + kubus.volume());
						break;
				case 2 :
						System.out.println("Menghitung Ruang Balok.");
						System.out.println("Masukan panjang dalam cm: ");
						panjang = input.nextDouble();
						balok.setPanjang(panjang);
						System.out.println("Masukan lebar dalam cm: ");
						lebar = input.nextDouble();
						balok.setLebar(lebar);
						System.out.println("Masukan tinggi dalam cm: ");
						tinggi = input.nextDouble();
						balok.setTinggi(tinggi);
						System.out.println();
						System.out.println("Luas Balok dengan panjang " + balok.getPanjang() + "cm, lebar " + balok.getLebar() + "cm, tinggi " + balok.getTinggi() + "cm Adalah " + balok.luas());
						System.out.println("Voume Balok dengan panjang " + balok.getPanjang() + "cm, lebar " + balok.getLebar() + "cm, tinggi " + balok.getTinggi() + "cm Adalah " + balok.volume());
						break;
				case 3 : 
						System.out.println("Menghitung Ruang Tabung.");
						System.out.println("Masukan tinggi dalam cm: ");
						tinggi = input.nextDouble();
						tabung.setTinggi(tinggi);
						System.out.println("Masukan jari-jari dalam cm: ");
						jariJari = input.nextDouble();
						tabung.setJariJari(jariJari);
						System.out.println();
						System.out.println("Luas Tabung dengan jari-jari " + tabung.getJariJari() + "cm, tinggi " + balok.getTinggi() + "cm Adalah " + tabung.luas());
						System.out.println("Luas Tabung dengan jari-jari " + tabung.getJariJari() + "cm, tinggi " + balok.getTinggi() + "cm Adalah " + tabung.volume());												
						break;
				case 0 :
						break;
				default : System.out.println("Pilih nomer dengan benar.");
			}
		} while(pilih != 0);
		
	}
}
