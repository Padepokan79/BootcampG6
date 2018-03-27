// Ilham 26-03-2018

public class PegawaiUmum extends Karyawan {
	private final String namaTunjanganJabatan = "Tunjangan Umum";
	private double tunjanganJabatanGol1 = 175000, tunjanganJabatanGol2 = 180000, tunjanganJabatanGol3 = 185000, tunjanganJabatanGol4 = 190000;
	
	public PegawaiUmum(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan,
			int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya) {
		super(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya);
	}

	// overloading
	public PegawaiUmum(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan,
			int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya, String namaTunjanganLainnya, double besarTunjanganLainnya) {
		super(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya, namaTunjanganLainnya, besarTunjanganLainnya);
	}
	
	@Override
	protected void setGajiKotor() {
		setGajiKotor(getGajiPokok() + getTunjanganIstri() + getTunjanganAnak() + getTunjanganBeras() + getTunjanganJabatan() + (isTunjanganLainnya() ? getBesarTunjanganLainnya() : 0));
	}
	@Override
	protected void setGajiKotor(double gajiKotor ,double pph) {
		setGajiKotor(gajiKotor + pph);	
	}

	// Tunjangan Jabatan
	@Override
	public String getNamaTunjanganJabatan() {
		// TODO Auto-generated method stub
		return namaTunjanganJabatan;
	}
	@Override
	public double getTunjanganJabatan() {
		if (getGolongan() == 1) {
			return tunjanganJabatanGol1;
		}
		else if (getGolongan() == 2) {
			return tunjanganJabatanGol2;
		}
		else if (getGolongan() == 3) {
			return tunjanganJabatanGol3;
		}
		else {
			return tunjanganJabatanGol4;
		}
	}
}
