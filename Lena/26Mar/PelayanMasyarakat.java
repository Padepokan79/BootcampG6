/* @author : lenawidiani
 * @dibuat : 26 Maret 2018
 * 
 */

public class PelayanMasyarakat extends PegawaiPNS implements Tunjangan{
	public PelayanMasyarakat() {
		// TODO Auto-generated constructor stub
	}

	public PelayanMasyarakat(String nama, String nip, String gender, String golongan, int masaKerja, String statusNikah,
							 int jumlahAnak, String namaTunjanganLain, int besarTunjanganLain) {
		super(nama, nip, gender, golongan, masaKerja, statusNikah, jumlahAnak, namaTunjanganLain, besarTunjanganLain);
		// TODO Auto-generated constructor stub
		displayGaji();
	}
	
	//========================================override method===========================================================
	@Override
	public double setTunjanganFungsional() {
		// TODO Auto-generated method stub
		return BESAR_TUNJANGAN_FUNGSIONAL;
	}
	//==================================================================================================================
}
