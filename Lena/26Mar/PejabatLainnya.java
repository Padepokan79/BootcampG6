/* @author : lenawidiani
 * @dibuat : 26 Maret 2018
 * 
 */

import java.util.Map;

public class PejabatLainnya extends PegawaiPNS implements Tunjangan{
	public PejabatLainnya() {
		// TODO Auto-generated constructor stub
	}

	public PejabatLainnya(String nama, String nip, String gender, String golongan, int masaKerja, String statusNikah,
						  int jumlahAnak, String namaTunjanganLain, int besarTunjanganLain) {
		super(nama, nip, gender, golongan, masaKerja, statusNikah, jumlahAnak, namaTunjanganLain, besarTunjanganLain);
		// TODO Auto-generated constructor stub
		displayGaji();
	}
	
	//========================================override method===========================================================
	@Override
	public double setTunjanganUmum() {
		// TODO Auto-generated method stub
		double biaya = 0;
		
		insertToAddHashMap(mapTunjanganUmum, BESAR_TUNJANGAN_UMUM);
		
		for(Map.Entry map : mapTunjanganUmum.entrySet()) {
			if(Integer.parseInt(getGolongan().substring(0, 1)) == (int) map.getKey()) {
				biaya = (int) map.getValue();
			}
		}
		return biaya;
	}
	//==================================================================================================================

}