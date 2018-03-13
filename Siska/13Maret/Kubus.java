class Kubus extends BangunRuang{
	
	double menghitungVolume () {
		return getsisi() * getsisi() * getsisi();
	}
	double menghitungLuas () {
		return 6*(getsisi()*getsisi());
	}
}
