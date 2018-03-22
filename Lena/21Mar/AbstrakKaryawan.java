
public abstract class AbstrakKaryawan {
	public String nama, nik, penempatanKerja;
	private double gajiPokok;
	
	public double getGajiPokok() {
		return gajiPokok;
	}
	public void setGajiPokok(double gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	
	public abstract double mencariGajiPokok(String posisi, String tingkatan, String lamaKerja, String penempatan);
	public abstract double mencariGajiSebulan(String tingkatan);
	public abstract double mencariUangLembur(String jumlahJam, String tingkatan);
	public abstract double mencariTunjanganKeluarga(String tingkatan, String status);
	public abstract double mencariGajiKotor(String tingkatan, String penempatan, String status);
	public abstract double mencariBiayaJabatan(String tingkatan, String penempatan, String status);
	public abstract double mencariGajiBersih(String tingkatan, String penempatan, String status);
	public abstract double mencariGajiBersihSetahun(String tingkatan, String penempatan, String status);
	public abstract double mencariPKP(String tingkatan, String penempatan, String status);
	public abstract double mencariPotonganBPJSKesehatan(String tingkatan, String penempatan, String status);
	public abstract double mencariPotonganBPJSKetenagakerjaan(String tingkatan, String penempatan, String status);
	public abstract double mencariTotalPotongan(String tingkatan, String penempatan, String status);
	public abstract double mencariTakeHomePay(String tingkatan, String penempatan, String status);
	public abstract void displaySlipGaji(String posisi, String tingkatan, String status);
	
}
