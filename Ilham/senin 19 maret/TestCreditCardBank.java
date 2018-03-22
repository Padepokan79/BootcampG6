import java.util.ArrayList;

public class TestCreditCardBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardBank karyawanAVisaGold = new CreditCardBank("A", "Visa Gold", 15);
		CreditCardBank karyawanAMasterPlatinum = new CreditCardBank("A", "Master Titanium", 8);
		CreditCardBank karyawanAVisaPlatinum = new CreditCardBank("A", "Visa Platinum", 17);
		CreditCardBank karyawanAMasterWorldmiler = new CreditCardBank("A", "Master Worldmiler", 4);
		
		ArrayList<Double> besarIntensifVisaGold = new ArrayList<Double>();
		ArrayList<Double> besarIntensifMasterTitanium = new ArrayList<Double>();
		ArrayList<Double> besarIntensifVisaPlatinum = new ArrayList<Double>();
		ArrayList<Double> besarIntensifMasterWorldmiles = new ArrayList<Double>();
		
		double besarIntensifPerbulan = 0, besarIntensifPertahun = 0;
		
		for (int bulan = 1; bulan <= 12; bulan++) {
			if (bulan == 3) {
				besarIntensifVisaGold.add(karyawanAVisaGold.getBesarIntensif() * karyawanAVisaGold.getJumlahCreditCardTerjual() - (karyawanAVisaGold.getBesarIntensif() * karyawanAVisaGold.getJumlahCreditCardTerjual() * karyawanAVisaGold.getPotongan()));
				besarIntensifMasterTitanium.add(karyawanAMasterPlatinum.getBesarIntensif() * karyawanAMasterPlatinum.getJumlahCreditCardTerjual() - (karyawanAMasterPlatinum.getBesarIntensif() * karyawanAMasterPlatinum.getJumlahCreditCardTerjual() * karyawanAMasterPlatinum.getPotongan()));
				besarIntensifVisaPlatinum.add(karyawanAVisaPlatinum.getBesarIntensif() * karyawanAVisaPlatinum.getJumlahCreditCardTerjual()  - (karyawanAVisaPlatinum.getBesarIntensif() * karyawanAVisaPlatinum.getJumlahCreditCardTerjual() * karyawanAVisaPlatinum.getPotongan()));
				besarIntensifMasterWorldmiles.add(karyawanAMasterWorldmiler.getBesarIntensif() * karyawanAMasterWorldmiler.getJumlahCreditCardTerjual()  - (karyawanAMasterWorldmiler.getBesarIntensif() * karyawanAMasterWorldmiler.getJumlahCreditCardTerjual() * karyawanAMasterWorldmiler.getPotongan()));
			} 
			else {
				besarIntensifVisaGold.add(karyawanAVisaGold.getBesarIntensif() * karyawanAVisaGold.getJumlahCreditCardTerjual());
				besarIntensifMasterTitanium.add(karyawanAMasterPlatinum.getBesarIntensif() * karyawanAMasterPlatinum.getJumlahCreditCardTerjual());
				besarIntensifVisaPlatinum.add(karyawanAVisaPlatinum.getBesarIntensif() * karyawanAVisaPlatinum.getJumlahCreditCardTerjual());
				besarIntensifMasterWorldmiles.add(karyawanAMasterWorldmiler.getBesarIntensif() * karyawanAMasterWorldmiler.getJumlahCreditCardTerjual());
			}
		}
		
		for (int bulanKe = 1; bulanKe <= 12; bulanKe++) {
			besarIntensifPerbulan = besarIntensifVisaGold.get(bulanKe-1) + besarIntensifMasterTitanium.get(bulanKe-1) + besarIntensifVisaPlatinum.get(bulanKe-1) + besarIntensifMasterWorldmiles.get(bulanKe-1);
			System.out.println("Besar Insentif yang didapat " + karyawanAMasterPlatinum.getNamaKaryawan() + " perbulan sebesar Rp." + besarIntensifPerbulan);
			besarIntensifPertahun += besarIntensifPerbulan;
		}
		System.out.println();
		System.out.println("Besar Insentif yang didapat " + karyawanAMasterPlatinum.getNamaKaryawan() + " pertahun sebesar Rp." + besarIntensifPertahun);
	}

}
