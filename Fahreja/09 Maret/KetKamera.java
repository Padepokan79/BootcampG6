
public class KetKamera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kamera keterangan1=new Kamera("700D", "Cannon", "f. 2.0", 7000000);
		Kamera keterangan2=new Kamera();
		Kamera keterangan3=new Kamera();
		
		keterangan2.nama="A7";
		keterangan2.merk="Sony";
		keterangan2.lensa="f. 4.5";
		keterangan2.harga=10000000;
		
		keterangan3.kumpul("D31500", "NIKON", "f. 3.5", 5000000);
		
		keterangan1.tampil();
		keterangan2.tampil();
		keterangan3.tampil();
	}
}
