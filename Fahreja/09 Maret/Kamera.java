public class Kamera {
 String nama,merk,lensa;
 int harga;
 
	 Kamera(){
		 
	 }
	 Kamera(String nm, String id,String ln, int hrg){
		 nama = nm;
		 merk = id;
		 lensa = ln;
		 harga = hrg;
	 }
	 void kumpul(String nm, String id,String ln, int hrg) {
		 nama = nm;
		 merk = id;
		 lensa = ln;
		 harga = hrg;
	 }
	 
	 void tampil() {
		 System.out.println("Nama Kamera  : "+nama);
		 System.out.println("Merk Kamera  : "+merk);
		 System.out.println("Lensa Kamera : "+lensa);
		 System.out.println("Harga Kamera : "+harga);
		 System.out.println("");
	 }
}

	
