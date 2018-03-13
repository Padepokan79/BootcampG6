
class Kubus extends BangunRuang {
	
	@Override
	void inputData() {
		System.out.println("Masukkan panjang sisi kubus : "); setSisiKubus(input.nextInt());
	}
	
	public Kubus() {
		inputData();
		//LUAS KUBUS
		System.out.println("Luas kubus adalah : " + luas(getSisiKubus()));
		luas(getSisiKubus());
		//VOLUME KUBUS
		System.out.println("Volume kubus adalah : " + volum(getSisiKubus()));
		volum(getSisiKubus());
	}
	
}
