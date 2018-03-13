
public class MacamMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor jm1 = new Motor();
		Motor jm2 = new Motor();
		Motor jm3 = new Motor("2015", "HUNDA", "WEKWEK", "HITAM", 12000000);
		
		jm2.tahun="2012";
		jm2.merk="KAWABIJI";
		jm2.jenis="SEPROT";
		jm2.warna="PUTIH ABU";
		jm2.harga= 35000000;
		
		jm1.kumpul("2018", "YAMURD", "MANCIS", "MERAH", 17000000);
		
		jm1.tampil();
		jm2.tampil();
		jm3.tampil();
	}

}
