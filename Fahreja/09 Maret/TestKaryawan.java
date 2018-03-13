
public class TestKaryawan {
	public static void main(String[] args) {
		Karyawan karyawan1 = new Karyawan();
		Karyawan karyawan2 = new Karyawan();
		Karyawan karyawan3 = new Karyawan();
		
		karyawan1.input(1029,"Arman",450000);
		karyawan2.input(1030,"Badun",300000);
		karyawan3.input(1031,"Caca",500000);
		
		karyawan1.tampil();
		karyawan2.tampil();
		karyawan3.tampil();
		
		
		
	}

}

