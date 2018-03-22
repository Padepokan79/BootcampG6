package Karyawan;

public class SA extends Karyawan {
	public SA() {
		// TODO Auto-generated constructor stub
	}

	public SA(Karyawan karyawan) {
		super(karyawan);
		// TODO Auto-generated constructor stub
		System.out.println(toString());
	}

	@Override
	public void bonus(int tidakAdaBonus) {
		// TODO Auto-generated method stub
		bonus = 0;
	}
	
	@Override
	public void gajiPokok() {
		// TODO Auto-generated method stub
		double gajiPokok = 0;
		
		if (level.equalsIgnoreCase("junior")) {
			if (lamaKerja <= 1) {
				gajiPokok = 1.2 * getUmk();
			}
			else if (lamaKerja >= 2 && lamaKerja <= 3) {
				gajiPokok = 1.3 * getUmk();
			}
			else if (lamaKerja > 3) {
				gajiPokok = 1.6 * getUmk();
			}
		}
		else if (level.equalsIgnoreCase("middle")) {
			if (lamaKerja <= 2) {
				gajiPokok = 1.8 * getUmk();
			}
			else if (lamaKerja >= 3 && lamaKerja <= 4) {
				gajiPokok = 1.9 * getUmk();
			}
			else if (lamaKerja > 4) {
				gajiPokok = 2.2 * getUmk();
			}
		}
		else if (level.equalsIgnoreCase("senior")) {
			if (lamaKerja <= 2) {
				gajiPokok = 2.7 * getUmk();
			}
			else if (lamaKerja >= 3 && lamaKerja <= 4) {
				gajiPokok = 2.9 * getUmk();
			}
			else if (lamaKerja > 4) {
				gajiPokok = 3 * getUmk();
			}
		}
		setGajiPokok((int) gajiPokok);
		
	}

	@Override
	public void gajiKotor() {
		// TODO Auto-generated method stub
		gajiKotor = getGajiPokok() + lembur + tunjanganPegawai + bonus + tunjanganKeluarga + tunjanganTransport;
		
	}
	
}
