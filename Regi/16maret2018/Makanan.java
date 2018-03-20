package LatihanKartikaSari;

import java.util.Date;

public class Makanan {
	private String nama, rasa, warna, komposisi, expired;
	private int harga;
	private double berat;
	
	public Makanan(String nama, String rasa, String warna, String komposisi, int harga, double berat, String expired) {
		super();
		this.nama = nama;
		this.rasa = rasa;
		this.warna = warna;
		this.komposisi = komposisi;
		this.harga = harga;
		this.berat = berat;
		this.expired = expired;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public String getKomposisi() {
		return komposisi;
	}

	public void setKomposisi(String komposisi) {
		this.komposisi = komposisi;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public double getBerat() {
		return berat;
	}

	public void setBerat(double berat) {
		this.berat = berat;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

}
