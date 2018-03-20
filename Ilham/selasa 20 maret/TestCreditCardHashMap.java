import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;;

public class TestCreditCardHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard creditAyah = new CreditCard("Ayah", "Master Worldmiles", "Visa Platinum");
		CreditCard creditIbu = new CreditCard("Ibu", "Visa Gold", "Visa Platinum");
		CreditCard creditAnak = new CreditCard("Anak", "Master Titanium");

		HashMap<String, Double> besarIuranPertahun = new HashMap<String, Double>();
	
		
		long besarIuranKeluargaLimaTahun = 0;
		
		for (int tahun = 1; tahun <= 5; tahun++) {
			double totalIuranSemuaKeluargaSetahun = 0;
			if (tahun == 3) {
				totalIuranSemuaKeluargaSetahun += creditAyah.getBesaranIuranSetahun() - (creditAyah.getBesaranIuranSetahun() * creditAyah.getPotongan());
				totalIuranSemuaKeluargaSetahun += creditIbu.getBesaranIuranSetahun() - (creditIbu.getBesaranIuranSetahun() * creditIbu.getPotongan());
				totalIuranSemuaKeluargaSetahun += creditAnak.getBesaranIuranSetahun() - (creditAnak.getBesaranIuranSetahun() * creditAnak.getPotongan());
				besarIuranPertahun.put("tahunKe"+tahun, totalIuranSemuaKeluargaSetahun);
			} 
			else {
				totalIuranSemuaKeluargaSetahun += creditAyah.getBesaranIuranSetahun();
				totalIuranSemuaKeluargaSetahun += creditIbu.getBesaranIuranSetahun();
				totalIuranSemuaKeluargaSetahun += creditAnak.getBesaranIuranSetahun();
				besarIuranPertahun.put("tahunKe"+tahun, totalIuranSemuaKeluargaSetahun);
			}
		}
		
		for (Map.Entry besarIuran : besarIuranPertahun.entrySet()) {
			besarIuranKeluargaLimaTahun += (Double) besarIuran.getValue();
			System.out.println("Iuran di bayar pada " + besarIuran.getKey() + " Sebesar Rp." + besarIuran.getValue());
		}
		System.out.println("Total Iuran Tahunan yang harus di bayar dalam 5 tahun Sebesar Rp." + besarIuranKeluargaLimaTahun);
		
		/*
		for (int tahun = 1; tahun <= 5; tahun++) {
			System.out.println("Besar iuran pertahun pada tahun " + tahun + " yang harus dibayar oleh ayah adalah Rp." + besarIuranPerTahunAyah.get(tahun-1));
			System.out.println("Besar iuran pertahun pada tahun " + tahun + " yang harus dibayar oleh ibu adalah Rp." + besarIuranPerTahunIbu.get(tahun-1));
			System.out.println("Besar iuran pertahun pada tahun " + tahun + " yang harus dibayar oleh anak adalah Rp." + besarIuranPerTahunAnak.get(tahun-1));
			System.out.println("Besar iuran pertahun pada tahun " + tahun + " yang harus dibayar oleh anak adalah Rp." + besarIuranPerTahunAnak.get(tahun-1));
			besarIuranSetahunKeluarga = besarIuranPerTahunAyah.get(tahun-1) + besarIuranPerTahunIbu.get(tahun-1) + besarIuranPerTahunAnak.get(tahun-1);
			System.out.println("Besar iuran Seluruh Keluarga adalah Rp." + besarIuranSetahunKeluarga);
			besarIuranKeluargaLimaTahun += besarIuranSetahunKeluarga;
		}
		System.out.println("Besar iuran Seluruh Keluarga dari tahun ke 1 sampai 5 adalah Rp." + (besarIuranKeluargaLimaTahun));
		*/
	}

}
