
public class Balok extends BangunRuang {
	
	public Balok() {
		// TODO Auto-generated constructor stub
	}
	
	public double volume() {
		return (getPanjang()*getLebar()*getTinggi());
	}
	
	public double luas() {
		return (2*((getPanjang()*getLebar())+(getLebar()*getTinggi())+(getTinggi()*getPanjang())));
	}
	
}