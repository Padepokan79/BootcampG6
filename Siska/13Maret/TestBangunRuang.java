import java.util.Scanner;
public class TestBangunRuang {
	public static void main (String[]args) {
	int pilihan, sisi, panjang, lebar, tinggi, jarijari;
	Scanner keyboard = new Scanner (System.in);
	Kubus kubus1 = new Kubus ();
	Balok balok1 = new Balok ();
	Tabung tabung1 = new Tabung ();
	
	System.out.println("Volume dan Luas");
	System.out.println();
	
	do {
	System.out.println("PerhitunganRuang");
	System.out.println("1. Kubus");
	System.out.println("2. Balok");
	System.out.println("3. Tabung");
	System.out.println("0. exit");
	System.out.println("Pilih Bangun yang ingin di hitung");
	pilihan = keyboard.nextInt();
	
	if (pilihan == 1) {
		System.out.println("Menghitung Ruang Kubus");
		System.out.println("Masukan panjang sisi(cm):");
		sisi = keyboard.nextInt();
		kubus1.setsisi(sisi);
		System.out.println("Volume Kubus dengan sisi " + kubus1.getsisi() + " Adalah " + kubus1.menghitungVolume());
		System.out.println("Luas Kubus dengan sisi " + kubus1.getsisi() + " Adalah " + kubus1.menghitungLuas());
	}
	else if (pilihan == 2) {
		System.out.println("Menghitung Ruang Balok");
		System.out.println ("Masukan panjang (cm): ");
		panjang = keyboard.nextInt();
		balok1.setpanjang(panjang);
		System.out.println("Masukan lebar(cm): ");
		lebar = keyboard.nextInt();
		balok1.setlebar(lebar);
		System.out.println("Masukan tinggi (cm): ");
		tinggi = keyboard.nextInt();
		balok1.settinggi(tinggi);
		System.out.println("Volume Balok adalah " + balok1.menghitungVolume());
		System.out.println("Luas Balok adalah " + balok1.menghitungLuas());
	}
	else if (pilihan == 3) {
		System.out.println("Menghitung Ruang Tabung");
		System.out.println ("Masukan panjang jari-jari(cm): ");
		jarijari = keyboard.nextInt();
		tabung1.setjarijari(jarijari);
		System.out.println("Masukan tinggi(cm): ");
		tinggi = keyboard.nextInt();
		tabung1.settinggi(tinggi);
		System.out.println("Volume Tabung adalah " + tabung1.menghitungVolume());
		System.out.println("Luas tabung adalah " + tabung1.menghitungLuas());
		}
	}
	while (pilihan != 0); 
}
}
