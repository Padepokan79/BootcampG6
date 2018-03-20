package SoalIntensifCreditCard;

import java.util.*;
public class IntensifCreditCard {
	String id;
	String kategorikartu;
	private double intensif;
	int penjualan;
	int bulan;
	
	
	public IntensifCreditCard(String id, String kategorikartu, int intensif) {
		this.id = id;
		this.kategorikartu = kategorikartu;
		this.intensif = intensif;
		
	}
	//kategori
	String getkategorikartu() {
		return kategorikartu;
	}
	//intensif
	double getintensif() {
		
		if (bulan ==3) {
			double pajak =  (0.2*intensif);
		return  intensif - pajak;
		}
		else return  intensif;
	}
	void setbulan (int bulan) {
		this.bulan = bulan;
	}
}

	
	
	