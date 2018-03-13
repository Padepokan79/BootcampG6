
public class AlatMakanDanSeranggaMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlatMakanDewasa dewasa = new AlatMakanDewasa();
		AlatMakanAnak anak = new AlatMakanAnak();
		
		SeranggaBerbahaya serangga1 = new SeranggaBerbahaya();
		SeranggaTidakBerbahaya serangga2 = new SeranggaTidakBerbahaya();
		
		dewasa.insertAlatMakan("Sumpit", "Ebara", "Coklat Muda", "Bambu", "Ambil Makanan", 45000);
		dewasa.asal="Jepang, Cina, Korea";
		dewasa.caraMenggunakan ="Pegang sumpit pake tangan";
		dewasa.displayPenggunaan();
		
		anak.insertAlatMakan("Sumpit", "Disney", "Random", "plastik", "Ambil Makanan", 75000);
		anak.asal="Jepang, Cina, Korea";
		anak.caraMenggunakan ="Pegang sumpit pake tangan";
		anak.displayPenggunaan();
		

		serangga1.insertSerangga("Lebah Madu", "Kuning garis-garis hitam", "lokasi pemukiman, alam bebas", "Serbuk sari, nektar, madu", "menghasilkan madu");
		serangga1.ordo="Hymenoptera";
		serangga1.serangan="menyengat korban di titik vital";
		serangga1.displaySeranggaBerbahaya();
		
		
		serangga2.insertSerangga("Kumbang", "Hitam/Coklat Tua", "Semak-semak, pepohonan", "Bangkai jenis tertentu", "Menghancurkan jaringan tumbuhan dan hewan yang mati");
		serangga2.ordo="Coleopetra";
		serangga2.pertahanan="tubuh yang keras";
		serangga2.displaySeranggaTidakBerbahaya();
	}

}
