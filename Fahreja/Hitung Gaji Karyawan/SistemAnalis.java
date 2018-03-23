
public class SistemAnalis extends Pegawai{
	
	public SistemAnalis(String nama, String nik, String penempatanKerja, String jenisPekerjaan, String jabatan,
			double lamaKerja, double jamLembur, double status) {
		super(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status);
	}
	
	public double getUmk() {
		umkKaryawan.put("bandung", 3091345.00);
		umkKaryawan.put("jakarta", 3648035.00);
		umkKaryawan.put("karawang", 3919291.00);
		return umkKaryawan.get(getPenempatanKerja());
	}
	public double getGapok() {
		if (jabatan.equalsIgnoreCase("junior")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return (getUmk()*1.2);
			}else if (lamaKerja <= 4) {
				return (getUmk() * 1.3);
			}else if (lamaKerja > 4) {
				return (getUmk() * 1.6);
			}
		}if (jabatan.equalsIgnoreCase("middle")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return (getUmk() * 1.8);
			}else if (lamaKerja <=4) {
				return (getUmk() * 1.9);
			}else if (lamaKerja > 4) {
				return (getUmk() * 2.2);
			}
		}if (jabatan.equalsIgnoreCase("senior")) {
			if (lamaKerja < 2 && lamaKerja >= 0) {
				return umk = (getUmk() * 2.7);
			}else if (lamaKerja <= 4) {
				return umk = (getUmk() * 2.9);
			}else if (lamaKerja > 4) {
				return umk = (getUmk() * 3);
			}
		}
		return getUmk();
	}
	@Override
	public double getTunjangan() {
			tunjanganKaryawan.put("junior", 200000.00);
			tunjanganKaryawan.put("middle", 300000.00);
			tunjanganKaryawan.put("senior", 500000.00);
			return tunjanganKaryawan.get(getJabatan());
	}
	
	@Override
	public double getBruto() {
		return bruto = lembur + getGapok()+getTunjangan()+ tunjanganKeluarga+tunjangJakarta;
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
