import java.util.Scanner;

public class NoFengShuiIlham {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String noHp,primbon;
		int awal;

		System.out.print("Masukkan No HP Anda: ");
		noHp = keyboard.next();
		System.out.println();

		for (awal = 0; awal < noHp.length(); awal++) {
			switch (noHp.substring(awal,awal+1)) {
				case "0": primbon = "khusus, spesial, langka";
						break;
				case "1": primbon = "satu, satu-satunya, diri sendiri";
						break;
				case "2": primbon = "mudah, gampang, tidak sulit";
						break;
				case "3": primbon = "menemukan, mendapatkan, hidup";
						break;
				case "4": primbon = "mati, miskin, susah";
						break;
				case "5": primbon = "Tidak akan, tidak pernah, tidak bisa";
						break;
				case "6": primbon = "Menuju, akan";
						break;
				case "7": primbon = "Tepat, hoki, atau bisa disebut juga ketuhanan";
						break;
				case "8": primbon = "Makmur";
						break;
				case "9": primbon = "Sukses";
						break;												
				default: primbon = "error";
						break;		
			}
			System.out.println(noHp.substring(awal,awal+1) + " " + primbon);
		}
	}
}