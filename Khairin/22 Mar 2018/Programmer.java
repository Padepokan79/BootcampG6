
public class Programmer extends Karyawan {
	double fixingBug;

	//CONSTRUCTOR OVERLOADING
	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	public Programmer(Karyawan karyawan, double fixingBug) {
		super(karyawan);
		this.fixingBug = fixingBug;
	}

	public double getFixingBug() {
		return fixingBug;
	}

	public void setFixingBug(double fixingBug) {
		this.fixingBug = fixingBug;
	}
	
	//METHOD OVERRIDING
	@Override
	public void menghitungBonus() {
		double bonusProgrammer = fixingBug*20000;
		if(bonusProgrammer > 500000) {
			bonusProgrammer = 500000;
		}
		setBonus(bonusProgrammer);
		
	}
	
	
}
	