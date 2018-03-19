package main;

public class Nilai {

	private int rataRataNilai;

	public Nilai() {
		super();
	}

	public Nilai(String nama, int nilai1, int nilai2, int nilai3, int nilai4) {
		super();
		setRataRataNilai(hitungRataRata(nilai1, nilai2, nilai3, nilai4));
		System.out.println("Rata-rata nilai " + nama + " = " + getRataRataNilai());
		
	}

	public int getRataRataNilai() {
		return rataRataNilai;
	}

	public void setRataRataNilai(int rataRataNilai) {
		this.rataRataNilai = rataRataNilai;
	}
	
	public int hitungRataRata (int nilai1, int nilai2, int nilai3, int nilai4) {
		return (nilai1 + nilai2 + nilai3 + nilai4) / 4;
	}
}
