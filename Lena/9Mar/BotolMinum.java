
public class BotolMinum {
	String namaPemilik, merkBotol, warnaBotol;
	int ukuran;
	
	public BotolMinum() {
		// TODO Auto-generated constructor stub
	}
	
	BotolMinum(String nama, String merk, String warna, int uk){
		namaPemilik = nama;
		merkBotol = merk;
		warnaBotol = warna;
		ukuran = uk;
	}
	
	void insertRecord(String nama, String merk, String warna, int uk){
		namaPemilik = nama;
		merkBotol = merk;
		warnaBotol = warna;
		ukuran = uk;
	}
	
	void display() {
		System.out.println("Botol minum "+merkBotol+" warna "+warnaBotol+" ukuran "+ukuran+" ml adalah milik "+namaPemilik);
	}
}
