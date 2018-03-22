import java.util.ArrayList;

public class GajiPekerja {
	public static void main(String[] args) {
		long hitungGaji = 0;
		int seminggu =0;
		
		Pekerja karyawan = new Pekerja("Ilham", "Bos",12000);
		
		ArrayList<String> hari = new ArrayList<String>();
		hari.add("Senin");
		hari.add("Selasa");
		hari.add("Rabu");
		hari.add("Kamis");
		hari.add("Jumat");
		hari.add("Sabtu");
		hari.add("Minggu");
		
			for (int ulangSetahun = 0; ulangSetahun < 328 ; ulangSetahun++) {
				if (seminggu > 6) {
					seminggu = 0;
				}
				if (hari.get(seminggu).equalsIgnoreCase("jumat")) {
					karyawan.setGaji(80000);
				}else {
					karyawan.setGaji(120000);
				}
				hitungGaji = hitungGaji + karyawan.getGaji();
				seminggu ++;
		}
			System.out.println("Gaji pegawai selama 10 bulan 24 hari adalah Rp."+hitungGaji);
	}
}
