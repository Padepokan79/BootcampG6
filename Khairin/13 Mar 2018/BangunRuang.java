import java.util.Scanner;

public class BangunRuang {
	Scanner input = new Scanner (System.in);
	int panjang, lebar, tinggi, sisi;
	double jariJari; 
	final double phi= 3.14; //TIDAK BISA DIUBAH NILAINYA
	
	void inputData() {
		System.out.println("Masukkan nilai : "); input.nextInt();
	}
	
	public void setSisiKubus (int sisi) {
		this.sisi = sisi;
	}
	
	public int getSisiKubus () {
		return sisi;
	}
	
	public void setPanjang (int panjang) {
		this.panjang = panjang;
	}
	
	public int getPanjang () {
		return panjang;
	}
	
	public void setLebar (int lebar) {
		this.lebar = lebar;
	}
	
	public int getLebar () {
		return lebar;
	}
	
	public void setTinggi (int tinggi) {
		this.tinggi = tinggi;
	}
	
	public int getTinggi () {
		return tinggi;
	}
	
	public void setJariJari (double jariJari) {
		this.jariJari = jariJari;
	}
	
	public double getJariJari () {
		return jariJari;
	}
	
	//LUAS KUBUS
	 int luas (int si) {
		return 6*sisi*sisi;
	 }
	 
	 //LUAS BALOK
	 
	 int luas (int panjang, int lebar, int tinggi) {
		 return 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
	 }
	 
	 //LUAS PERMUKAAN TABUNG
	 
	 double luas (double jariJari, int tinggi) {
		 return 2 * phi * jariJari*jariJari + phi * (jariJari+jariJari) * tinggi;  
	 }
	 
	 
	 //VOLUME KUBUS
	 int volum (int si) {
		 return sisi*sisi*sisi;
	 }
	 
	 //VOLUME BALOK
	 int volum (int panjang, int lebar, int tinggi) {
		 return panjang*lebar*tinggi;
	 }
	 
	 //VOLUME TABUNG
	 double volum (double jariJari, int tinggi) {
		 return phi*jariJari*jariJari;
	 }
	 
}

	 