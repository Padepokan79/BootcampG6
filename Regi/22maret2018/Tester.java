package Karyawan;

public class Tester extends Karyawan implements Bonus {
	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public Tester(Karyawan karyawan) {
		super(karyawan);
		// TODO Auto-generated constructor stub
		System.out.println(toString());
	}
	
	@Override
	public void bonus(int testCase) {
		// TODO Auto-generated method stub
		if (testCase <= 20) {
			bonus = Bonus.bonusTester * testCase;
		}
		else if (testCase > 20) {
			bonus = Bonus.bonusTester * 20;
		}
	}

	@Override
	public void gajiPokok() {
		// TODO Auto-generated method stub
		double gajiPokok = 0;
		
		if (level.equalsIgnoreCase("junior")) {
			if (lamaKerja <= 1) {
				gajiPokok = 1.1 * getUmk();
			}
			else if (lamaKerja >= 2 && lamaKerja <= 3) {
				gajiPokok = 1.2 * getUmk();
			}
			else if (lamaKerja > 3) {
				gajiPokok = 1.5 * getUmk();
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
				gajiPokok = 2.1 * getUmk();
			}
		}
		else if (level.equalsIgnoreCase("senior")) {
			if (lamaKerja <= 2) {
				gajiPokok = 2.6 * getUmk();
			}
			else if (lamaKerja >= 3 && lamaKerja <= 4) {
				gajiPokok = 2.7 * getUmk();
			}
			else if (lamaKerja > 4) {
				gajiPokok = 2.8 * getUmk();
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
