import java.util.Date;
import java.util.Scanner;

public class BeautySalon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date date = new Date();
		Customer customer = new Customer();
		Visit[] visit = new Visit[5];
		visit[0] = null;
		visit[1] = null;
		visit[2] = null;
		visit[3] = null;
		visit[4] = null;
		
		String name, pilih, pilihan;
		boolean member;
		double pembayaranService, pembayaranProduk, totalPembayaran, dapatDiskonServis, dapatDiskonProduk, pajak;
		int kunjungan = 0;
		
		System.out.println("Beauty Saloon!\n");
		System.out.println("Masukan Nama: ");
		name = input.nextLine();
		//
		customer = new Customer(name);
		
		System.out.println("Apakah anda masuk member(Ya/Tidak)?");
		pilih = input.nextLine();
		if (pilih.equalsIgnoreCase("ya")) {
			member = true;
			customer.setMember(member);
		} else {
			member = false;
			customer.setMember(member);
		}
		
		if (customer.isMember()) {
			System.out.println("Pilih member yang anda gunakan:");
			System.out.println("1. Premium");
			System.out.println("2. Gold");
			System.out.println("3. Silver");
			System.out.println("Pilih: ");
			pilih = input.nextLine();
			
			if (pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("Premium")) {
				pilih = "Premium";
			}
			else if (pilih.equalsIgnoreCase("2") || pilih.equalsIgnoreCase("Gold")) {
				pilih = "Gold";
			}
			else if (pilih.equalsIgnoreCase("3") || pilih.equalsIgnoreCase("Silver")) {
				pilih = "Silver";
			}
			else {
				pilih = "none";
			}
		} 
		else {
			pilih = "none";
		}
		customer.setMemberType(pilih);
		
		System.out.println();
		System.out.println(customer);
		System.out.println();
	
		do {	
			System.out.println();
			System.out.println("Visit...");
			System.out.println("Total pembayaran service: ");
			pembayaranService = input.nextDouble();
			System.out.println("Total pembayaran produk: ");
			pembayaranProduk = input.nextDouble();
			
			visit[kunjungan] = new Visit(customer.getName(), date);
			visit[kunjungan].setServiceExpense(pembayaranService);
			visit[kunjungan].setProductExpense(pembayaranProduk);
			
			dapatDiskonServis = visit[kunjungan].getServiceDicountRate(customer.getMemberType());
			dapatDiskonProduk = visit[kunjungan].getProductDicountRate(customer.getMemberType());
			
			pajak = (visit[kunjungan].getProductExpense()+visit[kunjungan].getServiceExpense()) * visit[kunjungan].taxRateSaloon(customer.getMemberType());
			
			dapatDiskonServis = dapatDiskonServis * visit[kunjungan].getServiceExpense();
			dapatDiskonProduk = dapatDiskonProduk * visit[kunjungan].getProductExpense();
	
			totalPembayaran = (visit[kunjungan].getServiceExpense() + visit[kunjungan].getProductExpense() + pajak) - (dapatDiskonProduk + dapatDiskonServis);
			
			System.out.println();
			System.out.println(visit[kunjungan].toString(1, customer.getMemberType(), dapatDiskonServis, dapatDiskonProduk, pajak, totalPembayaran));
			
			System.out.println();
			System.out.println("Ingin Pergi ke Salon Lagi (ya/tidak)? ");
			pilihan = input.next();
			
			if (pilihan.equalsIgnoreCase("ya")) {
				if (kunjungan == 4) {
					visit[0] = visit[1];
					visit[1] = visit[2];
					visit[2] = visit[3];
					visit[3] = visit[4];
					kunjungan = 4;
				} else {
					kunjungan++;
				}
			}			
		} while(pilihan.equalsIgnoreCase("ya"));
		
		System.out.println("History kunjungan: ");
		for (int i = 0; i < visit.length; i++) {
			if (visit[i] != null) {
				System.out.println(visit[i].toString(i, customer.getMemberType(), dapatDiskonServis, dapatDiskonProduk, pajak, totalPembayaran));
			}
		}
	}
}
