import java.util.*;
public class TestKereta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPemasukanPerHari = 0, totalPemasukanSeminggu = 0;
		
		Kereta kelasEkonomi = new Kereta("Gerbong Ekonomi", 18000);
		Kereta kelasBisnis = new Kereta("Gerbong Bisnis", 35000);
		Kereta kelasExecutive= new Kereta("Gerbong Executive", 80000);
		
		ArrayList<Integer> penumpangEkonomi = new ArrayList<Integer>();
		ArrayList<Integer> penumpangBisnis = new ArrayList<Integer>();
		ArrayList<Integer> penumpangExecutive = new ArrayList<Integer>();
		
		penumpangEkonomi.add(120);
		penumpangEkonomi.add(100);
		penumpangEkonomi.add(50);
		penumpangEkonomi.add(30);
		penumpangEkonomi.add(20);
		penumpangEkonomi.add(150);
		penumpangEkonomi.add(110);
		
		penumpangBisnis.add(50);
		penumpangBisnis.add(15);
		penumpangBisnis.add(13);
		penumpangBisnis.add(10);
		penumpangBisnis.add(20);
		penumpangBisnis.add(55);
		penumpangBisnis.add(60);
		
		penumpangExecutive.add(40);
		penumpangExecutive.add(21);
		penumpangExecutive.add(11);
		penumpangExecutive.add(16);
		penumpangExecutive.add(12);
		penumpangExecutive.add(35);
		penumpangExecutive.add(40);
		
		System.out.println("Pendapatan perhari jalur bandung-bekasi");
		for (int i = 0; i < penumpangEkonomi.size();i++) {
		 totalPemasukanPerHari = (penumpangEkonomi.get(i)*kelasEkonomi.getHargaTiket())+(penumpangBisnis.get(i)*kelasBisnis.getHargaTiket())+(penumpangExecutive.get(i)*kelasExecutive.getHargaTiket());
		 System.out.println("Hari ke "+(i+1)+" Pemasukan : "+totalPemasukanPerHari);
		 totalPemasukanSeminggu= totalPemasukanSeminggu + totalPemasukanPerHari;
		}
		System.out.println("Pendapatan Selama seminggu : " + totalPemasukanSeminggu);
		
	}

}
