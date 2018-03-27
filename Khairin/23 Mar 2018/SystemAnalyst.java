
public class SystemAnalyst extends Karyawan {
	
	//CONSTRUCTOR OVERLOADING
	public SystemAnalyst() {
		// TODO Auto-generated constructor stub
	}
	
	public SystemAnalyst(Karyawan karyawan) {
		super(karyawan);
	}

	//METHOD OVERRIDING
	@Override
	public void	menghitungBonus() {
		setBonus(0);
	}
	
}
		