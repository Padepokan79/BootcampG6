/*author	: Regi Witanto
dibuat	: 26/03/2018 - 27/03/2018
*/

package GajiPNS;

public class PNSPejabat extends PNS implements Tunjangan {
	public PNSPejabat() {
		// TODO Auto-generated constructor stub
	}
	
	// Constructor Overload
	public PNSPejabat(PNS pns) {
		super(pns);
		
	}

	// Method Overide
	@Override
	public int setTunjanganStruktural() {
		// TODO Auto-generated method stub
		return tunjanganStruktural;
	}

}
