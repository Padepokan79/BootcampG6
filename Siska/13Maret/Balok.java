class Balok extends BangunRuang{
	double menghitungVolume (){
		return getpanjang() * getlebar() * gettinggi() ;
	}
	double menghitungLuas () {
		return  2* ((getpanjang()*getlebar()) + (getlebar()*gettinggi()) + (getpanjang()*gettinggi()));
	}
}
