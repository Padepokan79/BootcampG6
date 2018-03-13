package eclipse;

public class SayurMayur {
	String namaSayur, warnaSayur, manfaat, bentukSayur;
	int berat;
	
	public SayurMayur() {
		// TODO Auto-generated constructor stub
	}
	
	SayurMayur(String nama, String warna, String benef, String bentuk, int weigh){
		namaSayur= nama;
		warnaSayur= warna;
		manfaat= benef;
		bentukSayur= bentuk;
		berat = weigh;
	}
	
	void sayur(String nama, String warna, String benef, String bentuk, int weigh){
		namaSayur= nama;
		warnaSayur= warna;
		manfaat= benef;
		bentukSayur= bentuk;
		berat = weigh;
	}
	
	void displayInfoSayur () {
		System.out.println("NAMA SAYUR : " + namaSayur);
		System.out.println("WARNA SAYUR : " + warnaSayur);
		System.out.println("MANFAAT : " + manfaat);
		System.out.println("BENTUK SAYUR : " + bentukSayur);
		System.out.println("BERAT SAYUR (dalam gram) : " + berat + " gram");
		System.out.println();
	}
}
