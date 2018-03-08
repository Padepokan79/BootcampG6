public class NomberEmpat{
	public static void main(String[] args) {
		//Fahreja
		int tinggi = 5;

		for (int baris = 1; baris < tinggi ; baris++) {
			for(int spasi = 1; spasi < tinggi-baris; spasi++){
				System.out.print(" ");
			}
			for (int kata = 1; kata <= baris+baris-1 ; kata++) {
				if (kata == 1 || kata == baris+baris-1 ) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		for (int baris = 4; baris >= 1 ; baris--) {
			for(int spasi = 3; spasi >= baris; spasi--){
				System.out.print(" ");
			}
			for (int kata = baris+baris-1; kata >= 1 ; kata--) {
				if (kata == 1 || kata == baris+baris-1 ) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
