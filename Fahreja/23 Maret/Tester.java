
public class Tester extends Pegawai implements Bonus{
	
	public Tester(String nama, String nik, String penempatanKerja, String jenisPekerjaan, String jabatan,
			double lamaKerja, double jamLembur, double status, double bonus) {
		super(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status);
		this.bonus = bonus;
		hitungSemua();
	}
	
	public double getUmk() {
		umkKaryawan.put("bandung", 3091345.00);
		umkKaryawan.put("jakarta", 3648035.00);
		umkKaryawan.put("karawang", 3919291.00);
		return umkKaryawan.get(getPenempatanKerja());
	}

	
	public double hitungGapok() {
		if (getJabatan().equalsIgnoreCase("junior")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return getUmk()* 1.1;
			}else if (lamaKerja < 4) {
				return (getUmk() * 1.2);
			}else if (lamaKerja >3) {
				return (getUmk() * 1.5);
			}
		}if (getJabatan().equalsIgnoreCase("middle")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return (getUmk() * 1.8);
			}else if (lamaKerja < 4) {
				return (getUmk() * 1.9);
			}else if (lamaKerja >3) {
				return (getUmk() * 2.1);
			}
		}if (getJabatan().equalsIgnoreCase("senior")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return (getUmk() * 2.6);
			}else if (lamaKerja < 4) {
				return (getUmk() * 2.7);
			}else if (lamaKerja >3) {
				return (getUmk() * 2.8);
			}
		}
		return getUmk();
	}
	@Override
	public double cariBonus() {
		bonus = ((int) bonus / 100) * testCase;
		if (bonus > 500000) {
			return bonus = 500000;
		}
		return bonus;
	}

	@Override
	public void setGapok() {
		this.gapok = hitungGapok();
		
	}
	public void setBonus() {
		this.bonus = cariBonus();
	}
	
	
}
