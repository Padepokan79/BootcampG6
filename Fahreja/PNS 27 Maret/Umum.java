//author fahreja 26 maret 2017
//edit 27 maret 2017
public class Umum extends Pns{
	
	public Umum() {
		
	}
	//Contruct untuk memasukan data yang telah di tampung terlebih dahulu di class main
	public Umum(String nama, String nip, String gender, String golongan, String masaKerja, String statusNikah,
			String jumlahAnak, String jenisPNS, String nilaiTunjanganLain) {
		super(nama, nip, gender, golongan, masaKerja, statusNikah, jumlahAnak, jenisPNS, nilaiTunjanganLain);
		perHitungan();
		// TODO Auto-generated constructor stub
	}
	//Method mencari tunjangan pns
	public double cariTunjanganPns() {
		if (Integer.parseInt(getJenisPNS()) == 3) {
			if (getGolongan().substring(0,1).equalsIgnoreCase("1")) {
				return UMUMGol1;
			}if (getGolongan().substring(0,1).equalsIgnoreCase("2")) {
				return UMUMGol2;
			}if (getGolongan().substring(0,1).equalsIgnoreCase("3")) {
				return UMUMGol3;
			}if (getGolongan().substring(0,1).equalsIgnoreCase("4")) {
				return UMUMGol4;
			}
		}
		return 0;
	}
	//Set nilai tunjangan pns
	public void setTunjanganJabatan() {
		this.tunjanganJabatan = cariTunjanganPns();
	}
}
