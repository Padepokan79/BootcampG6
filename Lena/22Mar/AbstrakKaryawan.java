package quizOOP;

public abstract class AbstrakKaryawan {
	public String nama, nik, posisiJabatan, tingkatanJabatan, penempatanKerja, statusPerkawinan;
	public double lamaKerja, jumlahJamLembur;
	
	public abstract void mencariGajiPokok();
	public abstract void mencariTunjanganMenikah();
	public abstract double mencariUangLembur();
	public abstract double mencariGajiKotor();
	public abstract double mencariBiayaJabatan();
	public abstract double mencariGajiBersihSetahun();
	public abstract double mencariPKP();
	public abstract double mencariPotonganBPJSKesehatan();
	public abstract double mencariPotonganBPJSKetenagakerjaan();
	public abstract double mencariTotalPotongan();
	public abstract double mencariTakeHomePay();
	public abstract void displaySlipGaji();
}
