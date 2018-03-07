public class jawabanSoal6 {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 0, batas = 1000;

		int [] bilFibonacci = new int [0];
		int [] bilPrima = new int [0];
		int [] bilHabisBagi = new int [0];

		int indeks = 2, counter = 2;

		boolean prima;

		// Menentukan banyak bilangan fibonacci
		for (int i = 2; n3 < batas; i++) {
			n3 = n1 + n2;

			if (n3 < batas) {
				counter++;
			}

			n1 = n2;
			n2 = n3;
		}

		bilFibonacci = new int [counter];
		n1 = 0; n2 = 1; n3 = 0; // reset n1 n2 n3 kembali ke awal untuk memasukkan nilai

		// Memasukkan bilangan fibonacci kedalam array fibonacci
		bilFibonacci[0] = 0;
		bilFibonacci[1] = 1;

		for (int i = 2; n3 < batas; i++) {
			n3 = n1 + n2;

			if (n3 < batas) {
				bilFibonacci[indeks] = n3;
				indeks++;
			}

			n1 = n2;
			n2 = n3;
		}

		counter = 0; // reset counter dan indeks untuk mencari bilangan prima
		indeks = 0;

		// Mencari banyak bilangan prima
		for (int i = 0; i < bilFibonacci.length; i++) { // Pengulangan i hingga batas
			prima = true;
			for (int j = 2; j < bilFibonacci[i]; j++) { // Pengulangan pembagi
				if (bilFibonacci[i] % j == 0) {
					prima = false;
					break;
				}
			}
			if (prima == true) { // Kondisi apabila bilangan tersebut bil. prima
				counter++;
			}
		}

		bilPrima = new int [counter];

		// Memasukkan nilai bilangan prima
		for (int i = 0; i < bilFibonacci.length; i++) { // Pengulangan i hingga batas
			prima = true;
			for (int j = 2; j < bilFibonacci[i]; j++) { // Pengulangan pembagi
				if (bilFibonacci[i] % j == 0) {
					prima = false;
					break;
				}
			}
			if (prima == true) { // Kondisi apabila bilangan tersebut bil. prima
				bilPrima[indeks] = bilFibonacci[i];
				indeks++;
			}
		}

		counter = 0; // reset counter dan indeks untuk memasukkan bilangan selain prima
		indeks = 0;

		bilHabisBagi = new int [bilFibonacci.length - bilPrima.length]; // menentukan panjang bilHabisBagi

		// Memasukkan nilai selain bilangan prima
		for (int i = 0; i < bilFibonacci.length; i++) { // Pengulangan i hingga batas
			prima = true;
			for (int j = 2; j < bilFibonacci[i]; j++) { // Pengulangan pembagi
				if (bilFibonacci[i] % j == 0) {
					prima = false;
					break;
				}
			}
			if (prima == false) { // Kondisi apabila bilangan tersebut bil. prima
				bilHabisBagi[indeks] = bilFibonacci[i];
				indeks++;
			}
		}

		// Menampilkan ketiga array
		System.out.print("Array Fibonacci : ");
		for (int f : bilFibonacci) {
			System.out.print(f + " ");
		}

		System.out.print("\nArray Bil. Prima : ");
		for (int p : bilPrima) {
			System.out.print(p + " ");
		}

		System.out.print("\nArray Bil. Habis Bagi : ");
		for (int h : bilHabisBagi) {
			System.out.print(h + " ");
		}
	}
}