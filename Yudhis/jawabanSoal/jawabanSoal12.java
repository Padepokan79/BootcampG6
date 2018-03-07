public class jawabanSoal12 {
	public static void main(String[] args) {
		int ket1 = 0, ket2 = 9;

		for (int i = 0; i < 6; i++) {

			if (ket1 == 0 && ket2 == 9) {
				System.out.print(" " + ket1 + " - " + " " + ket2 + " : ");	
			} else {
				System.out.print(ket1 + " - " + ket2 + " : ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* "); 	
			} 
			System.out.println();

			ket1 += 10;
			ket2 += 10;
		}

		System.out.println();

		for (int i = 0; i < 6; i++) {
			ket1 = 0; ket2 = 9;

			for (int j = 6-1; j > i; j--) {

				if (ket1 == 0 && ket2 == 9) {
					System.out.print("       ");	
					ket1 += 10; ket2 += 10;
				} else {
					System.out.print("        ");
				}
			}

			for (int k = 0; k <= i; k++) {

				if (ket1 == 0 && ket2 == 9) {
					System.out.print(" *     ");
					ket1 += 10; ket2 += 10;	
				} else {
					System.out.print(" *      ");
				}
			}

			System.out.println();
		}

		ket1 = 0; ket2 = 9;
		for (int i = 0; i < 6; i++) {
			System.out.print(ket1 + "-" + ket2 + "   ");

			ket1 += 10;
			ket2 += 10;
		}
	}
}