package quizOOP;

public class Tester extends Karyawan implements InterfaceBonus{
	private double jumlahUntukDapatBonus;
	
	//===========================================Constructor overloading================================================
	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public Tester(String nama, String nik, String posisiJabatan, String tingkatanJabatan, double lamaKerja,
			      String penempatanKerja, String statusPerkawinan, double jumlahJamLembur, double jumlahUntukDapatBonus) {
		super(nama, nik, posisiJabatan, tingkatanJabatan, lamaKerja, penempatanKerja, statusPerkawinan, jumlahJamLembur);
		// TODO Auto-generated constructor stub
		this.jumlahUntukDapatBonus = jumlahUntukDapatBonus;
	}
	//==================================================================================================================
	
	//================================================override method===================================================
	@Override
	public double mencariBonus() {
		// TODO Auto-generated method stub
		int jumlah= (int)jumlahUntukDapatBonus/100;
		double total= (double) jumlah * bonusTestCase;
		if(total > 500000) {
			total = 500000;
		}
		return total;
	}
	
	@Override
	public double mencariGajiKotor() {
		// TODO Auto-generated method stub
		return super.mencariGajiKotor()+mencariBonus();
	}
	//==================================================================================================================
}
