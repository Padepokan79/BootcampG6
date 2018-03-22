import java.util.HashMap;

public class IsiUlang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int untung = 0, galon = 0, jual;
		AirMinum sega = new AirMinum("Sega", 4000,12);
		AirMinum ron = new AirMinum("Ron 89", 4700,8);
		AirMinum leman = new AirMinum("Le Man", 5400,17);
		
		HashMap<Integer, String> hari = new HashMap<Integer, String>();
		
		hari.put(0, "Senin");
		hari.put(1, "Selasa");
		hari.put(2, "Rabu");
		hari.put(3, "Kamis");
		hari.put(4, "Jumat");
		hari.put(5, "Sabtu");
		
		for (int ulang = 0; ulang < hari.size(); ulang++) {
			jual = (sega.getGalon()*sega.getHarga())+(ron.getGalon()*ron.getHarga())+(leman.getGalon()*leman.getHarga());
			untung = untung + jual;
			if (ulang > 1) {
				galon = galon + leman.getGalon();
			}
		}
		System.out.println("Keuntungan penjualan dalam Seminggu adalah Rp. "+untung);
		System.out.println("Banyak galon Le Man dari rabu - minggu adalah "+galon+" Galon");
	}

}
