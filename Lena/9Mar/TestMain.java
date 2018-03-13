
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kucing kucing = new Kucing("Goro", "Eri", "Russian Blue", "abu-abu", "biru", "jantan", 1, 4);
		Superhero superhero = new Superhero("Batman", "Bruce Wayne", "male", "uang, ganteng, bela diri", "takut kelelawar", "Joker", "Robin", 40);
		Kereta kereta = new Kereta("Argo Parahyangan", "Kota Bandung", "Gambir", "15 Juni 2018", "04:00 AM", "07.00 AM", 3, 300, "Eks", 1, "1A");
		
		kucing.display();
		superhero.display();
		kereta.display();
		
	}

}
