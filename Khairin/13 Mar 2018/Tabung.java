
class Tabung extends BangunRuang {
	
	@Override
	void inputData() {
		System.out.println("Masukkan tinggi Tabung : "); setTinggi(input.nextInt());
		System.out.println("Masukkan jari-jari Tabung : "); setJariJari(input.nextDouble());
	}
	
	public Tabung() {
		inputData();
		//LUAS TABUNG
		System.out.println("Luas Tabung adalah : " + luas(getJariJari(), getTinggi()));
		luas(getJariJari(), getTinggi());
		//VOLUME TABUNG
		System.out.println("Volume Tabung adalah : " + volum(getJariJari(), getTinggi()));
		volum(getJariJari(), getTinggi());
	}
	
}
