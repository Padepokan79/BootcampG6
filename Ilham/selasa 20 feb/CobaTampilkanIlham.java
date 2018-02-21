public class CobaTampilkanIlham {
	public static void main(String[] args) {
		System.out.println("Bilangan genap antara 1 s/d 20: ");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("\nBilangan ganjil antara 20 s/d 40: ");
		for (int j = 20; j <= 40; j++) {
			if (j % 2 == 1) {
				System.out.println(j);			
			}
		}

		System.out.println("\nBilangan yang habis dibagi 3 dan habis dibagi 5");
		System.out.println("dari 30 sampai dengan 90.");
		for (int k = 30; k <= 90 ; k++) {
			if (k % 3 == 0 && k % 5 == 0) {
				System.out.println(k);				
			} 
		}
	}
}