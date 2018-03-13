
public class Tabung extends BangunRuang {
	
	public Tabung() {
		// TODO Auto-generated constructor stub
	}
	
	public double volume() {
		return (getPhi()*getJariJari()*getJariJari()*getTinggi());
	}
	
	public double luas() {
		return ((2*getPhi()*getJariJari()*getJariJari())+(getPhi()*(2*getJariJari())*getTinggi()));
	}
}
