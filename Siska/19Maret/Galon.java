package SoalGalon;

public class Galon {
	private String jenisGalon;
	private String hari;
	private int harga;
	private int sega, ron89, leman,keuntungan;
	
	
	Galon(String jenisGalon, int harga ) {
		this.jenisGalon = jenisGalon;
		this.harga = harga;
	}
	//jenis bensin
	String jenisGalon () {
		return jenisGalon;
	}
	void setjenisGalon (String jenisGalon) {
		this.jenisGalon = jenisGalon;
	}
	//harga
	int getharga() {
		return harga;
	}
	void setharga(int harga) {
		if (jenisGalon.equalsIgnoreCase("sega")) {
		}
		else if (jenisGalon.equalsIgnoreCase("ron89")) {
		}
		else if (jenisGalon.equalsIgnoreCase("leman")) {
		}
	}
	int getsega () {
		return sega;
	}
	
	int getron89 () {
		return ron89;
	}
	int getleman () {
		return leman;
	}
	//hari
	String gethari() {
		return hari;
	}
	void sethari (String hari) {
		if (hari.equalsIgnoreCase("senin")) {
			sega = 12 ;
			leman = 17;
			ron89 = 8;
			
		}
		else if (hari.equalsIgnoreCase("selasa")){
			sega = 12 ;
			leman = 17;
			ron89 = 8;
			
		}
		else if (hari.equalsIgnoreCase("rabu")){
			sega = 12 ;
			leman = 17 ;
			ron89 = 8;
			
		}
		else if (hari.equalsIgnoreCase("kamis")){
			sega = 12 ;
			ron89 = 8;
			leman = 17 ;
		}
		else if (hari.equalsIgnoreCase("jumat")){
			sega = 12 ;
			ron89 = 8;
			leman = 17 ;
		}
		else if (hari.equalsIgnoreCase("sabtu")){
			sega = 12 ;
			ron89 = 8;
			leman = 17 ;
		}
		else if (hari.equalsIgnoreCase("minggu")){
			sega = 0 ;
			ron89 = 0;
			leman = 0 ;
		}
	}
		
	int getkeuntungansega () {
		return (harga*sega);
		}
	int getkeuntunganron89() {
		return (harga * ron89);
	}
	int getkeuntunganleman() {
		return (harga * leman);
	}
}
