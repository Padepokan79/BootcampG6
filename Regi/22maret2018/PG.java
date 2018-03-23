package Karyawan;

public class PG extends Karyawan implements Bonus {
	public PG() {
		// TODO Auto-generated constructor stub
	}

	public PG(Karyawan karyawan) {
		super(karyawan);
		// TODO Auto-generated constructor stub
		System.out.println(toString());
	}

	@Override
	public void bonus(int fixingBug) {
		// TODO Auto-generated method stub
		if (fixingBug <= 25) {
			bonus = Bonus.bonusProgrammer * fixingBug;
		}
		else if (fixingBug > 25) {
			bonus = Bonus.bonusProgrammer * 25;
		}
	}

	@Override
	public void gajiPokok() {
		// TODO Auto-generated method stub
		double gajiPokok = 0;
		
		if (level.equalsIgnoreCase("junior")) {
			if (lamaKerja <= 1) {
				gajiPokok = getUmk();
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
				gajiPokok = 1.7 * getUmk();
			}
			else if (lamaKerja >= 3 && lamaKerja <= 4) {
				gajiPokok = 1.8 * getUmk();
			}
			else if (lamaKerja > 4) {
				gajiPokok = 2.1 * getUmk();
			}
		}
		else if (level.equalsIgnoreCase("senior")) {
			if (lamaKerja <= 2) {
				gajiPokok = 2.5 * getUmk();
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
		gajiKotor = getGajiPokok() + lembur + bonus + tunjanganPegawai + tunjanganKeluarga + tunjanganTransport;
		
	}

}
