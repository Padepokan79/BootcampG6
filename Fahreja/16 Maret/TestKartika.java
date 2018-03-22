import java.util.*;
public class TestKartika {
	public static void main(String[] args) {
		
		int totalHarga = 0,totalBerat = 0;
		
		Risol jenisRisol1 = new Risol("Risol Jumbo", 5000, 250, "Daging ayam dan sayuran");
		Risol jenisRisol2 = new Risol("Risol Medium", 2500, 100, "Bakso dan sayuran");
		Gurilem jenisGurilem1 = new Gurilem("GuriPed", 20000, 500, "Extra Pedas");
		Gurilem jenisGurilem2 = new Gurilem("GuriAsin", 20000, 500, "Sedang");
		
		
		List <Risol> daftarRisol = new ArrayList<Risol>();
		List <Gurilem> daftarGurilem = new ArrayList<Gurilem>();
		daftarRisol.add(jenisRisol1);
		daftarRisol.add(jenisRisol2);
		daftarGurilem.add(jenisGurilem1);
		daftarGurilem.add(jenisGurilem2);
		
		for (Gurilem gurilem : daftarGurilem) {
			System.out.println(gurilem.getNama()+"\t"+gurilem.getHarga()+"\t"+ gurilem.getBerat()+"\t"+ gurilem.tingkatPedas);
			totalHarga = totalHarga + gurilem.getHarga();
			totalBerat = totalBerat + gurilem.getBerat();
		}
		for (Risol risol : daftarRisol) {
			System.out.println(risol.getNama()+"\t"+risol.getHarga()+"\t"+risol.getBerat()+"\t"+risol.isiDalamRisol);
			totalHarga = totalHarga + risol.getHarga();
			totalBerat = totalBerat + risol.getBerat();
		}
		System.out.println("-----------------------------------------");
		System.out.println("Total Harga Belanjaan anda : "+totalHarga);
		System.out.println("Total Berat Belanjaan anda : "+totalBerat);
	}
}
