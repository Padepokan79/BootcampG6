import java.util.Scanner;
public class FengShuiFahreja {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int awal,akhir=0;
		String nomber,satuan;

		System.out.print("Masukan Nomber Anda : ");
		nomber = keyboard.next();

		for (awal = 0; awal < nomber.length(); awal++ ) {
			akhir = akhir + 1;
			System.out.print(nomber.substring(awal,akhir));
			satuan= nomber.substring(awal,akhir);
			if (satuan.equals("0") ) {
				System.out.println(" khusus, special, langka,");
			} else if (satuan.equals("1") ) {
				System.out.println(" satu, satu-satunya, diri sendiri,");
			}else if (satuan.equals("2") ) {
				System.out.println(" mudah, gampang, tidak sulit");
			}else if (satuan.equals("3") ) {
				System.out.println(" menemukan, mendapatkan, hidup,");
			}else if (satuan.equals("4") ) {
				System.out.println(" mati, miskin, susah,");
			}else if (satuan.equalsIgnoreCase("5") ) {
				System.out.println(" Tidak akan, tidak pernah, tidak bisa");
			}else if (satuan.equalsIgnoreCase("6") ) {
				System.out.println(" Menuju, akan");
			}else if (satuan.equalsIgnoreCase("7") ) {
				System.out.println(" Tepat, hoki, atau bisa disebut juga ketuhanan");
			}else if (satuan.equalsIgnoreCase("8") ) {
				System.out.println(" Makmur");
			}else {
				System.out.println(" Sukses");
			}
		}

	}
	
}