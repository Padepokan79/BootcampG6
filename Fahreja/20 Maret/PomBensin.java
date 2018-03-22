import java.util.HashMap;
import java.util.Map;

public class PomBensin {
	public static void main(String[] args) {
		int untungSeminggu = 0, terJual;
		Bensin premium = new Bensin("Premium", 6000);
		Bensin pertalite = new Bensin("Pertalite", 8000);
		
		HashMap<Integer, Integer> bensinPremium = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> bensinPertalite = new HashMap<Integer, Integer>();
		
		bensinPremium.put(0, 120);
		bensinPremium.put(1, 100);
		bensinPremium.put(2, 50);
		bensinPremium.put(3, 30);
		bensinPremium.put(4, 20);
		bensinPremium.put(5, 150);
		bensinPremium.put(6, 110);

		bensinPertalite.put(0, 50);
		bensinPertalite.put(1, 15);
		bensinPertalite.put(2, 13);
		bensinPertalite.put(3, 4);
		bensinPertalite.put(4, 20);
		bensinPertalite.put(5, 55);
		bensinPertalite.put(6, 60);
		
		System.out.println("Keuntungan sehari - hari :");
		
		for (int ulang = 0; ulang < bensinPertalite.size(); ulang++) {
			terJual = (bensinPertalite.get(ulang)* pertalite.getHarga())+(bensinPremium.get(ulang)* premium.getHarga());
			untungSeminggu = untungSeminggu + terJual;
		}
		System.out.println("Jumlah keuntungan Pom Bensin Sejahtera dalam seminggu adalah Rp."+untungSeminggu);
	}
}
