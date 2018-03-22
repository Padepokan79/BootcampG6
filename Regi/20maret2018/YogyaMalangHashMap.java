package DuaPuluhMaret2018;

import java.util.HashMap;

public class YogyaMalangHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kecepatanSyamilPerSetengahJam = 30;
		int kecepatanDodoPerSetengahJam = 40;
		int jarakYogyakartaMalang = 350;
		int jarakDariSyamil = 0;
		int jarakDariDodo = 0;
		int waktuDalamMenit = 0;
		int key = 1;
		
		HashMap<Integer, Integer> jarakSyamil = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> jarakDodo = new HashMap<Integer, Integer>();
		
		for (int i = kecepatanSyamilPerSetengahJam; i <= jarakYogyakartaMalang; i += kecepatanSyamilPerSetengahJam) {
			jarakSyamil.put(key, i);
			key++;
		}
		
		key = 1;
		for (int i = kecepatanDodoPerSetengahJam; i <= jarakYogyakartaMalang; i += kecepatanDodoPerSetengahJam) {
			jarakDodo.put(key, i);
			key++;
		}
		
//		System.out.println(jarakSyamil);
//		System.out.println(jarakDodo);
//		
//		System.out.println(jarakSyamil.size());
//		System.out.println(jarakDodo.size());
		
		for (int i = 1; i < jarakDodo.size(); i++) {	
			if ((jarakSyamil.get(i) + jarakDodo.get(i)) == jarakYogyakartaMalang) {
				jarakDariSyamil = jarakSyamil.get(i);
				jarakDariDodo = jarakDodo.get(i);
				waktuDalamMenit = (i) * 30;
			}
		}
		
		int sisaWaktuDalamMenit = waktuDalamMenit % 60;
		int waktuDalamJam = (waktuDalamMenit - sisaWaktuDalamMenit) / 60;
		int waktuBertemuDalamJam = 6 + waktuDalamJam;
		
		System.out.println("Syamil berpapasan dengan Dodo pada Jarak : " + jarakDariSyamil + " Km");
		System.out.println("Dodo berpapasan dengan Syamil pada Jarak : " + jarakDariDodo + " Km");
		System.out.println("Mereka berpapasan pada pukul : " + waktuBertemuDalamJam + "." + sisaWaktuDalamMenit);
		
	}

}
