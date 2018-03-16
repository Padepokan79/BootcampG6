package main;

public class Executive extends Kereta implements HargaTiket {
	
	public Executive(int hari, int penumpang) {
		// TODO Auto-generated constructor stub
		setHari(hari);
		setPenumpang(penumpang);
		setHarga(hargaExecutive);
		
		totalPemasukan();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Kereta Executive, hari ke-" + getHari() + " penumpang sebanyak " 
				+ getPenumpang() + " orang. Pemasukan = " + totalPemasukan();
	}

	@Override
	public int totalPemasukan() {
		// TODO Auto-generated method stub
		return getPenumpang() * getHarga();
	}
	
}
