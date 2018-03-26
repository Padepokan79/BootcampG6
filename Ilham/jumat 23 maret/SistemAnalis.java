
public class SistemAnalis extends Karyawan implements GajiPokok {

	public SistemAnalis(String nama, String nik, String penempatanKerja, String statusTingkat, String pekerjaan,
			int lamaKerjaDalamSetahun, int jumlahJamLembur, boolean isBerkeluarga) {
		super(nama, nik, penempatanKerja, statusTingkat, pekerjaan, lamaKerjaDalamSetahun, jumlahJamLembur, isBerkeluarga);
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
				persenDariUMK = JUNIORSA01;
			} else if (this.lamaKerjaDalamSetahun >= 2 && this.lamaKerjaDalamSetahun <= 3) {
				persenDariUMK = JUNIORSA23;
			} else if (this.lamaKerjaDalamSetahun > 3) {
				persenDariUMK = JUNIORSA3LEBIH;
			}
		}
		else if (this.statusTingkat.equalsIgnoreCase("Middle")) {
			if (this.lamaKerjaDalamSetahun <= 2) {
				persenDariUMK = MIDDLESA02;
			} else if (this.lamaKerjaDalamSetahun >= 3 && this.lamaKerjaDalamSetahun <= 4) {
				persenDariUMK = MIDDLESA34;
			} else if (this.lamaKerjaDalamSetahun > 4) {
				persenDariUMK = MIDDLESA4LEBIH;
			}
		}
		else if (this.statusTingkat.equalsIgnoreCase("Senior")) {
			if (this.lamaKerjaDalamSetahun <= 2) {
				persenDariUMK = SENIORSA02;
			} else if (this.lamaKerjaDalamSetahun >= 3 && this.lamaKerjaDalamSetahun <= 4) {
				persenDariUMK = SENIORSA34;
			} else if (this.lamaKerjaDalamSetahun > 4) {
				persenDariUMK = SENIORSA4LEBIH;
			}
		}
		return persenDariUMK;
	}	

	@Override
	protected void setBonus() {
		this.bonus = 0;
	}

}
