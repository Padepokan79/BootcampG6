
public class Programmer extends Pegawai implements Bonus{
	
	public Programmer(String nama, String nik, String penempatanKerja, String jenisPekerjaan, String jabatan,
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
			if (getLamaKerja() < 2 && getLamaKerja() >= 0) {
				return getUmk();
			}else if (getLamaKerja() <= 4) {
				return (getUmk() * 1.2);
			}else if (getLamaKerja() > 4) {
				return (getUmk() * 1.5);
			}
		}if (getJabatan().equalsIgnoreCase("middle")) {
			if (getLamaKerja() < 2 && getLamaKerja() >= 0) {
				return (getUmk() * 1.7);
			}else if (getLamaKerja() <= 4) {
				return (getUmk() * 1.8);
			}else if (getLamaKerja() > 4) {
				return (getUmk() * 2.1);
			}
		}if (getJabatan().equalsIgnoreCase("senior")) {
			if (getLamaKerja() < 2 && getLamaKerja() >= 0) {
				return (getUmk() * 2.5);
			}else if (getLamaKerja() <= 4) {
				return (getUmk() * 2.7);
			}else if (getLamaKerja() > 4) {
				return (getUmk() * 2.8);
			}
		}
		return getUmk();
	}
	
	@Override
	public double cariBonus() {
		bonus = bonus * fixBug;
		if (bonus > 500000) {
			return bonus = 500000;
		}
		return bonus;
	}
	
	@Override
	public double cariTunjangan() {
		transport.add(1000000.00);
		if (getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			return transport.get(1);
		}return getTunjangJakarta();
	}

	@Override
	public void setGapok() {
		this.gapok = hitungGapok();
		
	}
	public void setBonus() {
		this.bonus = cariBonus();
	}
	
}
