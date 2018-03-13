package eclipse;

public class TestObject2 {

	public static void main(String[] args) {
		Pohon pohon1= new Pohon();
		Rumah rumah1= new Rumah();
		Binatang binatang= new Binatang("Diana", "Kucing", "Anggora", "Jantan", "Oranye", "Meow", 4, 500);
		SayurMayur sayur= new SayurMayur();
		
		//POHON
		pohon1.namaPohon= "Mangga";
		pohon1.namaBuah= "Mangga";
		pohon1.bentukDaun= "Menyirip";
		pohon1.jenisBatang= "Berkambium, bercabang";
		pohon1.jenisAkar= "Tunggang";
		pohon1.jenisBiji= "Dikotil";
		pohon1.tinggiPohon= 4.5;
		
		pohon1.displayInfoPohon();
		
		//RUMAH
		rumah1.rumah("Rina", "Cokelat", "Jl. Jabung II NO.5", 4, 2, 10, 300, 500000000);
		rumah1.displayInfoRumah();
		// TODO Auto-generated method stub

		//BINATANG
		binatang.displayInfoBin();
		
		//SAYUR
		sayur.sayur("Kentang", "Cokelat", "-", "Bulat", 25);
		sayur.displayInfoSayur();
	}

}
