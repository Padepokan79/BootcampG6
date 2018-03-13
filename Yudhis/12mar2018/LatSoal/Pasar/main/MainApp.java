package main;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modern modern = new Modern();
		Tradisional tradisional = new Tradisional();
		Supermarket supermarket = new Supermarket();
		
		tradisional.namaPasar("Cicadas", "Bandung");
		tradisional.tradisional();
		
		modern.namaPasar("Batununggal", "Bandung");
		modern.modern();
		
		supermarket.namaPasar("Carrefour", "Bandung");
		supermarket.supermarket();
		
	}

}
