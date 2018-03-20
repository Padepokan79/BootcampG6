import java.util.ArrayList;
import java.util.Scanner;

public class TestBarang {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String namaPedagang, alamatPedagang, namaBarang;
		int banyakBarang, hargaJual, hargaBeli, keuntungan = 0, totKeuntungan = 0;
		
		ArrayList<Pedagang> listPedagang = new ArrayList<Pedagang>();
		ArrayList<Barang> listBarang = new ArrayList<Barang>();	
		
		System.out.println("Ada berapa pedagang? ");
		int banyakPedagang = input.nextInt();
		System.out.println();
		
		for (int i = 0; i < banyakPedagang; i++) {
			System.out.println("Nama Pedagang " + (i+1) + " : ");
			namaPedagang = input.next();
			System.out.println("Alamat Pedagang " + (i+1) + " : ");
			alamatPedagang = input.next();
			System.out.println("Berapa banyak barang yang dijual? ");
			banyakBarang = input.nextInt();	
			
			Barang barang = new Barang();
			Pedagang pedagang = new Pedagang(namaPedagang, alamatPedagang, banyakBarang, barang);
			
			for (int j = 0; j < banyakBarang; j++) {
				System.out.println();
				System.out.println("Input nama barang " + (j+1) + " :"); 
				namaBarang = input.next();
				System.out.println("Harga jual barang " + (j+1) + " :");
				hargaJual = input.nextInt();
				System.out.println("Harga beli barang " + (j+1) + " :");
				hargaBeli = input.nextInt();
				keuntungan = hargaJual - hargaBeli;
				totKeuntungan = totKeuntungan + keuntungan;
				System.out.println("\nKeuntungan Barang " + (j+1) + " = " + keuntungan);
				listBarang.add(barang = new Barang(namaBarang, hargaJual, hargaBeli));
			}
			listPedagang.add(pedagang = new Pedagang(namaPedagang, alamatPedagang, banyakBarang, barang));
			
			for (Pedagang ped : listPedagang) {
				System.out.println(ped);
				}
			for (Barang barang1 : listBarang) {
				System.out.println(barang1);
			}
			
			System.out.println("\nTotal keuntungan Pedagang " + (i+1) + " adalah " + totKeuntungan );
			
		}

	}

}
