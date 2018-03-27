/*author	: Regi Witanto
dibuat	: 26/03/2018 - 27/03/2018
*/

package GajiPNS;

import java.util.Map.Entry;

public class PNSUmum extends PNS implements Tunjangan {
	public PNSUmum() {
		// TODO Auto-generated constructor stub
	}
	
	// Constructor Overload
	public PNSUmum(PNS pns) {
		super(pns);
		
	}

	// Method Overide
	@Override
	public int setTunjanganUmum() {
		// TODO Auto-generated method stub
		int tjUmum = 0;
		// Input HashMap
		insertHashMap(mapTunjanganUmum, tunjanganUmumArr);	
		for(Entry<Integer, Integer> map : mapTunjanganUmum.entrySet()) {
			if(Integer.parseInt(getGolongan().substring(0, 1)) == (int) map.getKey()) {
				tjUmum = (int) map.getValue();
			}
		}
		return tjUmum;
	}
	
}
