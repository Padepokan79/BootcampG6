import java.util.ArrayList;

public class TestCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard creditAyah = new CreditCard("Ayah", "Master Worldmiles", "Visa Platinum");
		CreditCard creditIbu = new CreditCard("Ibu", "Visa Gold", "Visa Platinum");
		CreditCard creditAnak = new CreditCard("Anak", "Master Titanium");
		
		ArrayList<Double> besarIuranPerTahunAyah = new ArrayList<Double>();
		ArrayList<Double> besarIuranPerTahunIbu = new ArrayList<Double>();
		ArrayList<Double> besarIuranPerTahunAnak = new ArrayList<Double>();
		
		double besarIuranSetahunKeluarga = 0, besarIuranKeluargaLimaTahun = 0;
		
		for (int tahun = 1; tahun <= 5; tahun++) {
			if (tahun == 3) {
				besarIuranPerTahunAnak.add(creditAnak.getBesaranIuranSetahun() - (creditAnak.getBesaranIuranSetahun() * creditAnak.getPotongan()));
				besarIuranPerTahunAyah.add(creditAyah.getBesaranIuranSetahun() - (creditAyah.getBesaranIuranSetahun() * creditAyah.getPotongan()));
				besarIuranPerTahunIbu.add(creditIbu.getBesaranIuranSetahun() - (creditIbu.getBesaranIuranSetahun() * creditIbu.getPotongan()));
			} 
			else {
				besarIuranPerTahunAnak.add(creditAnak.getBesaranIuranSetahun());
				besarIuranPerTahunAyah.add(creditAyah.getBesaranIuranSetahun());
				besarIuranPerTahunIbu.add(creditIbu.getBesaranIuranSetahun());
			}
		}
		
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

	}

}
