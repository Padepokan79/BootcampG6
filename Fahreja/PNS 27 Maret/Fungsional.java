//author fahreja 26 maret 2017
//edit 27 maret 2017
public class Fungsional extends Pns{
	
	public Fungsional() {
		
	}
	//Contruct untuk memasukan data yang telah di tampung terlebih dahulu di class main
	public Fungsional(String nama, String nip, String gender, String golongan, String masaKerja, String statusNikah,
			String jumlahAnak, String jenisPNS, String nilaiTunjanganLain) {
		super(nama, nip, gender, golongan, masaKerja, statusNikah, jumlahAnak, jenisPNS, nilaiTunjanganLain);
		perHitungan();
		// TODO Auto-generated constructor stub
	}
	//Method mencari tunjangan pns
	public double cariTunjanganPns() {
		if (Integer.parseInt(getJenisPNS()) == 2) {
			return FUNGSIONAL;
		}return 0;
	}
	//Set nilai tunjangan pns
	public void setTunjanganJabatan() {
		this.tunjanganJabatan = cariTunjanganPns();
	}
	
}
