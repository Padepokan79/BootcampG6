package main;

public class Programmer extends Karyawan implements BonusKaryawan {
	
	public Programmer() {
		// TODO Auto-generated constructor stub
	}
	
	public Programmer(Karyawan karyawan) {
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
		if (fixBug <= 25) {
			setBonus(fixBug * bonusBugFixing);
		} else {
			setBonus(25 * bonusBugFixing);
		}
	}
	
	// Override method
	@Override
	public void hitungGajiPokok() {
		// TODO Auto-generated method stub
		double gajiPokok = 0;
		
		switch (getTingkatan()) {
			case "Junior":
				if (getLamaKerja() <= 1) {
					gajiPokok = getUmk();
				} else if (getLamaKerja() >= 2 && getLamaKerja() <= 3) {
					gajiPokok = 1.2 * getUmk();
				} else if (getLamaKerja() >= 3) {
					gajiPokok = 1.5 * getUmk();
				}
				
				break;
	
			case "Middle":
				if (getLamaKerja() <= 2) {
					gajiPokok = 1.7 * getUmk();
				} else if (getLamaKerja() >= 3 && getLamaKerja() <= 4) {
					gajiPokok = 1.8 * getUmk();
				} else if (getLamaKerja() >= 4) {
					gajiPokok = 2.1 * getUmk();
				}
				
				break;
				
			case "Senior":
				if (getLamaKerja() <= 2) {
					gajiPokok = 2.5 * getUmk();
				} else if (getLamaKerja() >= 3 && getLamaKerja() <= 4) {
					gajiPokok = 2.7 * getUmk();
				} else if (getLamaKerja() >= 4) {
					gajiPokok = 2.8 * getUmk();
				}
				
				break;
		}
		
		setGajiPokok((int) gajiPokok);
	}

	// Override method
	@Override
	public void hitungGajiKotor() {
		// TODO Auto-generated method stub
		setGajiKotor(getGajiPokok() + getTunjanganPegawai() + getTunjanganTransportasi() + getLembur() + getTunjanganKeluarga() + getBonus());
	}

}
