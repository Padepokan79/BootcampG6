
public class IntelAtom extends Atom {
	String seri = "N2000", clockSpeed = "1.8 Ghz", cache = "2 Mb", core = "2";
	int harga = 800000;

	void tambahIntelAtom(String seri, String clockSpeed, String cache, String core, int harga) {
		tambahAtom(massa);
		this.harga = harga;
		this.seri = seri;
		this.clockSpeed = clockSpeed;
		this.cache = cache;
		this.core = core;
	}
	
	void tampilIntelAtom() {
		System.out.println("Intel Atom");
		System.out.println("Seri : " + seri);
		System.out.println("Clock Speed " + clockSpeed);
		System.out.println("Cache : " + cache);
		System.out.println("Core : " + core);
		System.out.println("Harga : " + harga);
		tampilAtom();
	}
}
