
public class Programmer extends Karyawan implements GajiPokok {
	private final double BONUSPERFIXINGBUG = 20000, MAKSIMALBONUS = 500000;
	private int jumlahFixingBug;
	
	public Programmer(String nama, String nik, String penempatanKerja, String statusTingkat, String pekerjaan,
			int lamaKerjaDalamSetahun, int jumlahJamLembur, boolean isBerkeluarga, int jumlahFixingBug) {
		super(nama, nik, penempatanKerja, statusTingkat, pekerjaan, lamaKerjaDalamSetahun, jumlahJamLembur, isBerkeluarga);
		this.jumlahFixingBug = jumlahFixingBug;
		lakukanProsesPerhitungan();
	}

	
	// Mendapatkan Gaji Pokok
	@Override
	protected void setGajiPokok() {
		this.gajiPokok = getUMK() * getPerhitunganGajiPokok();
	}
	@Override
	public double getPerhitunganGajiPokok() {
		double persenDariUMK = 0;
		if (this.statusTingkat.equalsIgnoreCase("Junior")) {
			if (this.lamaKerjaDalamSetahun <= 1) {
				persenDariUMK = JUNIORPG01;
			} else if (this.lamaKerjaDalamSetahun >= 2 && this.lamaKerjaDalamSetahun <= 3) {
				persenDariUMK = JUNIORPG23;
			} else if (this.lamaKerjaDalamSetahun > 3) {
				persenDariUMK = JUNIORPG3LEBIH;
			}
		}
		else if (this.statusTingkat.equalsIgnoreCase("Middle")) {
			if (this.lamaKerjaDalamSetahun <= 2) {
				persenDariUMK = MIDDLEPG02;
			} else if (this.lamaKerjaDalamSetahun >= 3 && this.lamaKerjaDalamSetahun <= 4) {
				persenDariUMK = MIDDLEPG34;
			} else if (this.lamaKerjaDalamSetahun > 4) {
				persenDariUMK = MIDDLEPG4LEBIH;
			}
		}
		else if (this.statusTingkat.equalsIgnoreCase("Senior")) {
			if (this.lamaKerjaDalamSetahun <= 2) {
				persenDariUMK = SENIORPG02;
			} else if (this.lamaKerjaDalamSetahun >= 3 && this.lamaKerjaDalamSetahun <= 4) {
				persenDariUMK = SENIORPG34;
			} else if (this.lamaKerjaDalamSetahun > 4) {
				persenDariUMK = SENIORPG4LEBIH;
			}
		}
		return persenDariUMK;
	}	

	@Override
	protected void setBonus() {
		if ((this.jumlahFixingBug * this.BONUSPERFIXINGBUG) > MAKSIMALBONUS) {
			this.bonus = MAKSIMALBONUS;
		} else {
			this.bonus = jumlahFixingBug * BONUSPERFIXINGBUG;
		}
	}
	
}
