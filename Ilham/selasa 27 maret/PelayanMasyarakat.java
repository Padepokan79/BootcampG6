// Ilham 26-03-2018

public class PelayanMasyarakat extends Karyawan {
	private final String namaTunjanganJabatan = "Tunjangan Funsional";
	private final double tunjanganJabatan = 500000;
	
	public PelayanMasyarakat(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan,
			int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya) {
		super(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya);
	}

	// overloading
	public PelayanMasyarakat(String nama, String nip, String jenisKelamin, int golongan, String kodeGolongan,
			int masaKerjaDalamTahun, String statusMenikah, int jumlahAnak, boolean tunjanganLainnya, String namaTunjanganLainnya, double besarTunjanganLainnya) {
		super(nama, nip, jenisKelamin, golongan, kodeGolongan, masaKerjaDalamTahun, statusMenikah, jumlahAnak, tunjanganLainnya, namaTunjanganLainnya, besarTunjanganLainnya);
	}
	
	// Tunjangan
	public double getTunjanganJabatan() {
		return tunjanganJabatan;
	}
	public String getNamaTunjanganJabatan() {
		return namaTunjanganJabatan;
	}

	@Override
	protected void setGajiKotor() {
		setGajiKotor(getGajiPokok() + getTunjanganIstri() + getTunjanganAnak() + getTunjanganBeras() + tunjanganJabatan + (isTunjanganLainnya() ? getBesarTunjanganLainnya() : 0));
	}
	@Override
	protected void setGajiKotor(double gajiKotor ,double pph) {
		setGajiKotor(gajiKotor + pph);	
	}
}
