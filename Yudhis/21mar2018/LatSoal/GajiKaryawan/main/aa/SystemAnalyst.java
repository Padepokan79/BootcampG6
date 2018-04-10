package main;

public class SystemAnalyst extends Karyawan {
		
	public SystemAnalyst() {
		// TODO Auto-generated constructor stub
	}
	
	public SystemAnalyst(Karyawan karyawan) {
		// TODO Auto-generated constructor stub
		super(karyawan);
		System.out.println("\nSLIP GAJI");
		System.out.println("PROGRAMMER");
		System.out.println(toString());
	}
	
	// Override method
	@Override
	public void hitungBonus(int fixBug) {
		// TODO Auto-generated constructor stub
		setBonusLembur(0);
	}
	
	// Override method
	@Override
	public void hitungGajiPokok() {
		// TODO Auto-generated method stub
		double gajiPokok = 0;
		
		switch (getTingkatan()) {
			case "Junior":
				if (getLamaKerja() <= 1) {
					gajiPokok = 1.2 * getUmk();
				} else if (getLamaKerja() >= 2 && getLamaKerja() <= 3) {
					gajiPokok = 1.3 * getUmk();
				} else if (getLamaKerja() >= 3) {
					gajiPokok = 1.6 * getUmk();
				}
				
				break;
	
			case "Middle":
				if (getLamaKerja() <= 2) {
					gajiPokok = 1.8 * getUmk();
				} else if (getLamaKerja() >= 3 && getLamaKerja() <= 4) {
					gajiPokok = 1.9 * getUmk();
				} else if (getLamaKerja() >= 4) {
					gajiPokok = 2.2 * getUmk();
				}
				
				break;
				
			case "Senior":
				if (getLamaKerja() <= 2) {
					gajiPokok = 2.7 * getUmk();
				} else if (getLamaKerja() >= 3 && getLamaKerja() <= 4) {
					gajiPokok = 2.9 * getUmk();
				} else if (getLamaKerja() >= 4) {
					gajiPokok = 3 * getUmk();
				}
				
				break;
		}
		
		setGajiPokok((int) gajiPokok);
	}

	// Override method
	@Override
	public void hitungGajiKotor() {
		// TODO Auto-generated method stub
		setGajiKotor(getGajiPokok() + getTunjanganPegawai() + getTunjanganTransportasi() + getBonusLembur() + getTunjanganKeluarga());
	}

}
