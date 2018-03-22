import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class IuranKeluarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double iuranPerTahun, iuranJumlah=0;
		KartuCredit gold = new KartuCredit(300000);
		KartuCredit titanium = new KartuCredit(500000);
		KartuCredit platinum = new KartuCredit(750000);
		KartuCredit worldmiles = new KartuCredit(1000000);
		
		HashMap<Integer, KartuCredit> keluarga = new HashMap<Integer, KartuCredit>();
		keluarga.put(0, worldmiles);
		keluarga.put(1, platinum);
		keluarga.put(2, gold);
		keluarga.put(3, platinum);
		keluarga.put(4, titanium);
		
	
		for (int tahun = 0; tahun < keluarga.size(); tahun++) {
			iuranPerTahun = keluarga.values()
		}
	}

}
