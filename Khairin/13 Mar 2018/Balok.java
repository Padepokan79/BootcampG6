
class Balok extends BangunRuang {
	
	@Override
	void inputData() {
		System.out.println("Masukkan panjang Balok : "); setPanjang(input.nextInt());
		System.out.println("Masukkan lebar Balok : "); setLebar(input.nextInt());
		System.out.println("Masukkan tinggi Balok : "); setTinggi(input.nextInt());
	}
	
	public Balok() {
		inputData();
		//LUAS BALOK
		System.out.println("Luas balok adalah : " + luas(getPanjang(), getLebar(), getTinggi()));
		luas(getPanjang(), getLebar(), getTinggi());
		//VOLUME BALOK
		System.out.println("Volume kubus adalah : " + volum(getPanjang(), getLebar(), getTinggi()));
		volum(getPanjang(), getLebar(), getTinggi());
	}
	
}
