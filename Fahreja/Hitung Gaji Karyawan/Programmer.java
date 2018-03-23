
public class Programmer extends Pegawai implements Bonus{
	double bonus;
	
	public Programmer(String nama, String nik, String penempatanKerja, String jenisPekerjaan, String jabatan,
			double lamaKerja, double jamLembur, double status, double bonus) {
		super(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status);
		this.bonus = bonus;
	}
	
	public double getUmk() {
		umkKaryawan.put("bandung", 3091345.00);
		umkKaryawan.put("jakarta", 3648035.00);
		umkKaryawan.put("karawang", 3919291.00);
		return umkKaryawan.get(getPenempatanKerja());
	}
	@Override
	public double getTunjangan() {
		if (getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			tunjanganKaryawan.put("junior", 1200000.00);
			tunjanganKaryawan.put("middle", 1300000.00);
			tunjanganKaryawan.put("senior", 1500000.00);
			return tunjanganKaryawan.get(getJabatan());
		}else {
			tunjanganKaryawan.put("junior", 200000.00);
			tunjanganKaryawan.put("middle", 300000.00);
			tunjanganKaryawan.put("senior", 500000.00);
			return tunjanganKaryawan.get(getJabatan());
		}
	}
	
	public double getGapok() {
		if (jabatan.equalsIgnoreCase("junior")) {
			if (lamaKerja < 1 && lamaKerja >= 0) {
				return getUmk();
			}else if (lamaKerja <= 4) {
				return (getUmk() * 1.2);
			}else if (lamaKerja > 4) {
				return (getUmk() * 1.5);
			}
		}if (jabatan.equalsIgnoreCase("middle")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return (getUmk() * 1.7);
			}else if (lamaKerja <= 4) {
				return (getUmk() * 1.8);
			}else if (lamaKerja > 4) {
				return (getUmk() * 2.1);
			}
		}if (jabatan.equalsIgnoreCase("senior")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return (getUmk() * 2.5);
			}else if (lamaKerja <= 4) {
				return (getUmk() * 2.7);
			}else if (lamaKerja > 4) {
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
	public double getBruto() {
		return bruto = lembur + bonus + getGapok()+getTunjangan()+ tunjanganKeluarga+tunjangJakarta;
	}
	
	@Override
	public double getLembur() {
		return lembur = jamLembur * rumuslembur *(getGapok()+getTunjangan());
	}
	@Override
	public double cariTunjangan() {
		transport.add(1000000.00);
		if (penempatanKerja.equalsIgnoreCase("jakarta")) {
			return tunjangJakarta = transport.get(1);
		}return tunjangJakarta;
	}
	
}
