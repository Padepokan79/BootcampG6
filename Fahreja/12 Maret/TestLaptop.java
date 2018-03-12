
public class TestLaptop {
	public static void main(String[] args) {
		Gaming laptop1 = new Gaming();
		Harian laptop2 = new Harian();
		Touch laptop3 = new Touch ();
		
		laptop1.game();
		laptop1.kumpul("SUSA", "16 inc", "MERAH HITAM", "INTEL i7-7820HQ, GeForce 1080, Windows 10", 60299000);
		laptop1.tampil();
		
		laptop2.biasa();
		laptop2.kumpul("RECA", "11,4 inc", "BIRU", "INTEL ATOM, GMA, Windows 7 Ultimate", 2500000);
		laptop2.tampil();
		
		laptop3.sentuh();
		laptop3.kumpul("LENUVO", "11,4 inc", "HITAM", "INTEL CELERON N3350, GMA, Windows 10", 4399000);
		laptop3.tampil();
	}
}
