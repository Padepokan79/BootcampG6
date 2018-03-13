package main;

public class MainApp {
	
	public static void main(String[] args) {
		Fabel fabel = new Fabel();
		Legenda legenda = new Legenda();
		Fiksi fiksi = new Fiksi();
		
		fabel.judulDongeng("Si Kancil");
		fabel.fabel();
		
		legenda.judulDongeng("Legenda Raja Matahari");
		legenda.legenda();
		
		fiksi.judulDongeng("30 Detik Menuju Mars");
		fiksi.fiksi();
	}
	
}
