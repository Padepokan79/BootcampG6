package SoalPomBensin;

public class PomBensin {
	private String jenisBensin;
	private String hari;
	private int harga;
	private int premium, pertalite, keuntungan;
	
	
	PomBensin(String jenisBensin, int harga ) {
		this.jenisBensin = jenisBensin;
		this.harga = harga;
	}
	//jenis bensin
	String jenisBensin () {
		return jenisBensin;
	}
	void setjenisBensin (String jenisBensin) {
		this.jenisBensin = jenisBensin;
	}
	//harga
	int getharga() {
		return harga;
	}
	void setharga(int harga) {
		if (jenisBensin.equalsIgnoreCase("Premium")) {
		}
		else if (jenisBensin.equalsIgnoreCase("Pertalite")) {
		}
	}
	int getpremium () {
		return premium;
	}
	
	int getpertalite () {
		return pertalite;
	}
	//hari
	String gethari() {
		return hari;
	}
	void sethari (String hari) {
		if (hari.equalsIgnoreCase("senin")) {
			premium = 120 ;
			pertalite = 50;
		}
		else if (hari.equalsIgnoreCase("selasa")){
			premium = 100 ;
			pertalite = 15;
		}
		else if (hari.equalsIgnoreCase("rabu")){
			premium = 50 ;
			pertalite = 13;
		}
		else if (hari.equalsIgnoreCase("kamis")){
			premium = 30 ;
			pertalite = 4;
		}
		else if (hari.equalsIgnoreCase("jumat")){
			premium = 20 ;
			pertalite = 20;
		}
		else if (hari.equalsIgnoreCase("sabtu")){
			premium = 150 ;
			pertalite = 55;
		}
		else if (hari.equalsIgnoreCase("minggu")){
			premium = 110 ;
			pertalite = 60;
		}
	}
		
	int getkeuntunganPremium () {
		return (harga*premium);
		}
	int getkeuntunganPertalite() {
		return (harga * pertalite);
	}
	
	}
