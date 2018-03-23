import java.util.HashMap;
import java.util.Map;

public class TestPomBensin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PomBensin premium = new PomBensin("Premium", 6000);
		PomBensin pertalite = new PomBensin("Pertalite", 8000);
		
		HashMap<String, Integer> literPremium = new HashMap<String, Integer>();
		HashMap<String, Integer> literPertalite = new HashMap<String, Integer>();
		
		literPremium.put("Senin", 120);
		literPremium.put("Selasa", 100);
		literPremium.put("Rabu", 50);
		literPremium.put("Kamis", 30);
		literPremium.put("Jumat", 20);
		literPremium.put("Sabtu", 150);
		literPremium.put("Minggu", 110);

		literPertalite.put("Senin", 50);
		literPertalite.put("Selasa", 15);
		literPertalite.put("Rabu", 13);
		literPertalite.put("Kamis", 4);
		literPertalite.put("Jumat", 20);
		literPertalite.put("Sabtu", 25);
		literPertalite.put("Minggu", 60);
		
		long totalKeuntunganSemingguPremium = 0, totalKeuntunganSemingguPertalite = 0, totalKeuntunganSeminggu;
		
		for (Map.Entry entryPremium : literPremium.entrySet()) {
			premium.setJumlahLiterYangTerjualDalamSehari((int) entryPremium.getValue());
			totalKeuntunganSemingguPremium += premium.penghasilanPerhari();
		}
		
		for (Map.Entry entryPertalite : literPertalite.entrySet()) {
			pertalite.setJumlahLiterYangTerjualDalamSehari((int) entryPertalite.getValue());
			totalKeuntunganSemingguPertalite += pertalite.penghasilanPerhari();
		}
		
		totalKeuntunganSeminggu = totalKeuntunganSemingguPremium + totalKeuntunganSemingguPertalite;
		System.out.println("Total Penghasilan dari Premium Selama Seminggu sebesar Rp." + totalKeuntunganSemingguPremium);
		System.out.println("Total Penghasilan dari Pertalite Selama Seminggu sebesar Rp." + totalKeuntunganSemingguPertalite);
		System.out.println("Total Penghasilan Seminggu sebesar Rp." + totalKeuntunganSeminggu);
		
	}

}
