package soalPenjualanMartabak;

public class PenjualanMartabak {
	private String jenisMartabak;
	private String hari;
	private int harga;
	private int ratarataPenjualanMartabakManis, ratarataPenjualanMartabakTelor;
	private int penghasilan;
	
	public PenjualanMartabak(String jenisMartabak, int harga) {
		this.jenisMartabak = jenisMartabak;
		this.harga = harga;
	}
	
	//jenisMartabak
	String getjenisMartabak () {
		return jenisMartabak;
	}
	void setjenisMartabak() {
		this.jenisMartabak = jenisMartabak;
	}
	
	//harga
	int getharga() {
		return harga;
	}
	void setharga(int harga) {
		if (jenisMartabak.equalsIgnoreCase("Manis")) {
		}
		else if (jenisMartabak.equalsIgnoreCase("Telor")) {
		}
	}
	double getratarataPenjualanMartabakManis() {
		return ratarataPenjualanMartabakManis;
	}
	double getratarataPenjualanMartabakTelor() {
		return ratarataPenjualanMartabakTelor;
	}
	
	//hari
	String gethari() {
		return hari;
	}
	void sethari (String hari) {
		if (hari.equalsIgnoreCase("senin")) {
			ratarataPenjualanMartabakManis = 800;
			ratarataPenjualanMartabakTelor = 500;
		}
		else if (hari.equalsIgnoreCase("selasa")) {
			ratarataPenjualanMartabakManis = 800;
			ratarataPenjualanMartabakTelor = 500;
		}
		else if (hari.equalsIgnoreCase("rabu")) {
			ratarataPenjualanMartabakManis = 800;
			ratarataPenjualanMartabakTelor = 500;
		}
		else if (hari.equalsIgnoreCase("kamis")) {
			ratarataPenjualanMartabakManis = 800;
			ratarataPenjualanMartabakTelor = 500;
		}
		else if (hari.equalsIgnoreCase("jumat")) {
			ratarataPenjualanMartabakManis = 800;
			ratarataPenjualanMartabakTelor = 500;
		}
		else if (hari.equalsIgnoreCase("sabtu")) {
			ratarataPenjualanMartabakManis = 1200;
			ratarataPenjualanMartabakTelor = 750;
		}
		else if (hari.equalsIgnoreCase("minggu")) {
			ratarataPenjualanMartabakManis = 1120;
			ratarataPenjualanMartabakTelor = 700;
			
		}	
	}
	int getpenghasilanmanis () {
		return (harga*ratarataPenjualanMartabakManis);
	}
	int getpenghasilantelor () {
		return (harga*ratarataPenjualanMartabakTelor);
	}
}
