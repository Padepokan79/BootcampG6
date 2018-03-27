
public class Tester extends Karyawan {
	double bonusTester, testCase;
	
	//CONSTRUCTOR OVERLOADING
	public Tester() {
		// TODO Auto-generated constructor stub
	}
	
	public Tester(Karyawan karyawan, double testCase) {
		super(karyawan);
		this.testCase = testCase;
	}

	public double getTestCase() {
		return testCase;
	}

	public void setTestCase(double testCase) {
		this.testCase = testCase;
	}
	
	//METHOD OVERRIDING
	@Override
	public void menghitungBonus() {
			bonusTester = ((int) testCase/100)*25000;
			if (bonusTester > 500000) {
				bonusTester = 500000;
		}// TODO Auto-generated method stub
			setBonus(bonusTester);
		
	}

}
