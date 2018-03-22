package SembilanBelasMaret2018;

import java.util.ArrayList;

public class YogyakartaMalang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jarakYogyakartaMalang = 350;
		int jarakDariBedu = 0;
		int jarakDariBudi = 0;
		int waktuDalamMenit = 0;
		
		ArrayList<Integer> jarakBedu = new ArrayList<Integer>();
		ArrayList<Integer> jarakBudi = new ArrayList<Integer>(); 
		
		inputJarak(30, 350, jarakBedu);
		inputJarak(40, 350, jarakBudi);
		
		
//		for (int i = kecepatanBeduPerSetengahJam; i <= jarakYogyakartaMalang; i += kecepatanBeduPerSetengahJam) {
//			jarakBedu.add(i);
//		}
		
//		for (int i = 0; i < jarakBedu.size(); i++) {
//			System.out.print(jarakBedu.get(i) + " ");
//		}
		
//		for (int i = kecepatanBudiPerSetengahJam; i <= jarakYogyakartaMalang; i += kecepatanBudiPerSetengahJam) {
//			jarakBudi.add(i);
//		}
		
//		for (int i = 0; i < jarakBudi.size(); i++) {
//			System.out.print(jarakBudi.get(i) + " ");
//		}
		
		for (int i = 0; i < jarakBudi.size(); i ++) {
			if ((jarakBedu.get(i) + jarakBudi.get(i)) == jarakYogyakartaMalang) {
				jarakDariBedu = jarakBedu.get(i);
				jarakDariBudi = jarakBudi.get(i);
				waktuDalamMenit = (i + 1) * 30;
			}
		}
		
		int sisaWaktuDalamMenit = waktuDalamMenit % 60;
		int waktuDalamJam = (waktuDalamMenit - sisaWaktuDalamMenit) / 60;
		int waktuBertemuDalamJam = 6 + waktuDalamJam;
		
		System.out.println("Bedu berpapasan dengan Budi pada Jarak : " + jarakDariBedu + " Km");
		System.out.println("Budi berpaapsan dengan Bedu pada Jarak : " + jarakDariBudi + " Km");
		System.out.println("Mereka berpapasan pada pukul : " + waktuBertemuDalamJam + "." + sisaWaktuDalamMenit);
	}

	public static void inputJarak(int kecepatanPerSetengahJam, int jarakYogyakartaMalang, ArrayList<Integer> namaList) {
		for (int i = kecepatanPerSetengahJam; i <= jarakYogyakartaMalang; i += kecepatanPerSetengahJam) {
			namaList.add(i);
		}
	}
	
}
