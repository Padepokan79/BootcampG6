import java.util.Scanner;
import java.util.Date;

public class TestDiscount {
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner(System.in);
		Date date = new Date();
		boolean member;
		int pilih ;
		double cuciRambut = 20000, creambath = 15000, masker = 30000;
		double baju = 250000, celana = 300000, topi = 150000;
		
		System.out.println("Masukan nama anda ");
		Customer nama = new Customer(nilai.nextLine());
		System.out.println("Apakah anda member (1.Ya/2.Tidak)");
		pilih = nilai.nextInt();
		
			if (pilih == 1) {
					nama.setMember(true);
					System.out.println("Jenis member anda(Premium/Gold/Silver)");
					nama.setMemberType(nilai.next());
				}
		
		Visit vis = new Visit(nama.getNama(), date); 
		vis.display();
		System.out.println(nama.keterangan());
		
		do {
			System.out.println("Pilih Layanan Salon\n");
			System.out.println("Service");
			System.out.println("1.Cuci Rambut");
			System.out.println("2.Cream Bath");
			System.out.println("3.Masker");
			System.out.println("Produk");
			System.out.println("4.Baju");
			System.out.println("5.Celana");
			System.out.println("6.Topi");
			System.out.print(">");
			pilih = nilai.nextInt();
				switch (pilih) {
				case value:
					
					break;

				default:
					break;
				}
				
		}while (pilih !=0);
	}
}
