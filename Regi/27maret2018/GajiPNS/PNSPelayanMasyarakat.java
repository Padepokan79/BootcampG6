/*author	: Regi Witanto
dibuat	: 26/03/2018 - 27/03/2018
*/

package GajiPNS;

public class PNSPelayanMasyarakat extends PNS implements Tunjangan {
	public PNSPelayanMasyarakat() {
		// TODO Auto-generated constructor stub
	}
	
	// Constructor Overload
	public PNSPelayanMasyarakat(PNS pns) {
		super(pns);
		
	}

	// Method Overide
	@Override
	public int setTunjanganFungsional() {
		// TODO Auto-generated method stub
		return tunjanganFungsional;
	}

}
