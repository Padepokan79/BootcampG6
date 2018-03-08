import java.util.Scanner;

public class NomberTigaBelas{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		//Fahreja
		String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String kata;
		int sampingKiri;

		System.out.println("Nilai array :");
		for (String satuan : alphabet) {
			System.out.print(satuan +" ");
		}

		System.out.println();
		System.out.print("Masukan kata apa saja : ");
		kata = nilai.next();
		System.out.print("Jumlah geser ke kiri : ");
		sampingKiri = nilai.nextInt();

		for (int panjangKata = 0; panjangKata < kata.length() ; panjangKata++ ) {
			for (int huruf = 0; huruf < alphabet.length ; huruf++ ) {
				if (alphabet[huruf].equalsIgnoreCase(kata.substring(panjangKata,panjangKata+1))) {
					if (huruf - sampingKiri < 0) {
						System.out.print(alphabet[alphabet.length + huruf - sampingKiri]+ " ");
					}else {
						System.out.print(alphabet[huruf - sampingKiri] + " ");
					}
				}
			}
		}
	}
}