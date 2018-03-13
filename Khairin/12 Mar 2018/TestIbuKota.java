
public class TestIbuKota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bahasa b1 = new Bahasa();
		Bahasa b2 = new Bahasa();
		Bahasa b3 = new Bahasa();
		Makanan m1 = new Makanan();
		Makanan m2 = new Makanan();
		Makanan m3 = new Makanan();
		Pakaian p1 = new Pakaian();
		Pakaian p2 = new Pakaian();
		Pakaian p3 = new Pakaian();
		
		b1.ibuKota("Sumatera Utara", "Medan");
		b1.bahasa("Batak");
		m1.makanan("Bika Ambon");
		p1.pakaian("Karo");
		
		System.out.println("\n");
		
		b2.ibuKota("NAD", "Banda Aceh");
		b2.bahasa("Aceh Gayo");
		m2.makanan("Timpan");
		p2.pakaian("Pidie");
		
		System.out.println("\n");
		
		b3.ibuKota("Sumatera Barat", "Padang");
		b3.bahasa("Minang");
		m3.makanan("Rendang Padang");
		p3.pakaian("Batu Sangkar");

	}

}
