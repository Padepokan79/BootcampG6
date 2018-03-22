
public class Programmer extends Karyawan implements InterfaceBonus{
	private double bonus;
	
	//===========================================Constructor overloading================================================
	public Programmer() {
		// TODO Auto-generated constructor stub
	}
	public Programmer(String nama, String nik, double gapok, String penempatan, double lembur, double bonus) {
		super(nama, nik, gapok, penempatan, lembur);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}
	//==================================================================================================================
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//================================================override method===================================================
	@Override
	public double mencariBonus(String nilai) {
		// TODO Auto-generated method stub
		double total = bonusFixingBug * Double.parseDouble(nilai);
		if(total > 500000) {
			total = 500000;
		}
		
		return total;
	}
	
	@Override
	public double mencariGajiKotor(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return super.mencariGajiKotor(tingkatan, penempatan, status)+bonus;
	}
	//==================================================================================================================
	
}
