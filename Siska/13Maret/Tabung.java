class Tabung extends BangunRuang{
	double menghitungVolume () {
		return pi*getjarijari()*getjarijari()*gettinggi();
	}
	double menghitungLuas () {
		return (2*pi*getjarijari()*getjarijari()) + (pi*(2*getjarijari()) *gettinggi());
	}
}
