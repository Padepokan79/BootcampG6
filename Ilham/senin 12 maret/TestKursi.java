
public class TestKursi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kursi kursiIlham = new Kursi();
		Kursi kursiFahreja= new Kursi();
		
		kursiIlham.tambahKursi("Lembut", "Side Chair", "Biru", 123456);
		kursiFahreja.tambahKursi("Kayu", "Bench", "Coklat",  123456);
		
		kursiIlham.tampilKursi();
		kursiFahreja.tampilKursi();

	}

}
