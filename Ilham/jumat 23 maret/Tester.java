
public class Tester extends Karyawan implements GajiPokok {
	private double BONUSPER100TESTCASE = 25000, MAKSIMALBONUS = 500000;
	private int jumlahTestcase;
	
	public Tester(String nama, String nik, String penempatanKerja, String statusTingkat, String pekerjaan,
			int lamaKerjaDalamSetahun, int jumlahJamLembur, boolean isBerkeluarga, int jumalahTestcase) {
		super(nama, nik, penempatanKerja, statusTingkat, pekerjaan, lamaKerjaDalamSetahun, jumlahJamLembur, isBerkeluarga);
		this.jumlahTestcase = jumalahTestcase;
		lakukanProsesPerhitungan();
	}
	
	// Mendapatkan Gaji Pokok
	@Override
	public void setGajiPokok() {
		this.gajiPokok = getUMK() * getPerhitunganGajiPokok();
	}
	@Override
	public double getPerhitunganGajiPokok() {
		double persenDariUMK = 0;
		if (this.statusTingkat.equalsIgnoreCase("Junior")) {
			if (this.lamaKerjaDalamSetahun <= 1) {
				persenDariUMK = JUNIORTS01;
			} else if (this.lamaKerjaDalamSetahun >= 2 && this.lamaKerjaDalamSetahun <= 3) {
				persenDariUMK = JUNIORTS23;
			} else if (this.lamaKerjaDalamSetahun > 3) {
				persenDariUMK = JUNIORTS3LEBIH;
			}
		}
		else if (this.statusTingkat.equalsIgnoreCase("Middle")) {
			if (this.lamaKerjaDalamSetahun <= 2) {
				persenDariUMK = MIDDLETS02;
			} else if (this.lamaKerjaDalamSetahun >= 3 && this.lamaKerjaDalamSetahun <= 4) {
				persenDariUMK = MIDDLETS34;
			} else if (this.lamaKerjaDalamSetahun > 4) {
				persenDariUMK = MIDDLETS4LEBIH;
			}
		}
		else if (this.statusTingkat.equalsIgnoreCase("Senior")) {
			if (this.lamaKerjaDalamSetahun <= 2) {
				persenDariUMK = SENIORTS02;
			} else if (this.lamaKerjaDalamSetahun >= 3 && this.lamaKerjaDalamSetahun <= 4) {
				persenDariUMK = SENIORTS34;
			} else if (this.lamaKerjaDalamSetahun > 4) {
				persenDariUMK = SENIORTS4LEBIH;
			}
		}
		return persenDariUMK;
	}	

	@Override
	protected void setBonus() {
		int jumlahYangTercapai = jumlahTestcase / 100;
		if ((jumlahYangTercapai * BONUSPER100TESTCASE) > MAKSIMALBONUS) {
			this.bonus = MAKSIMALBONUS;
		} else {
			this.bonus = jumlahYangTercapai * BONUSPER100TESTCASE;		
		}
	}

}
