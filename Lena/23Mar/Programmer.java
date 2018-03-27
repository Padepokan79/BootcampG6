package quizOOP;

public class Programmer extends Karyawan implements InterfaceBonus{
	public double jumlahUntukDapatBonus;
	
	//===========================================Constructor overloading================================================
	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	public Programmer(String nama, String nik, String posisiJabatan, String tingkatanJabatan, double lamaKerja,
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
		double total = bonusFixingBug * jumlahUntukDapatBonus;
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
