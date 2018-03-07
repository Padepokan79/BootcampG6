public class SoalNo6{
	public static void main(String[] args) {
		int [] arrTemp = new int [20];
		int [] bilFibonacci = new int[0];
		int [] bilPrima = new int[0];
		int [] bilHabisBagi = new int[0];

		int index=0, indexP=0, indexHB=0, panjangArrFibo=2, panjangArrPrima=0, panjangArrHB=0, counter;

		//inisialisasi awal untuk indeks ke-0 dan 1
		arrTemp[0]=1;
		arrTemp[1]=1;

		System.out.println("6. Buatlah array berisikan bilangan fibonacci dari 1-1000.");
		System.out.println("   - Lalu copy bilangan prima dari array yang tadi ke array baru.");
		System.out.println("   - Lalu copy bilangan selain prima dari array yang tadi ke array baru.\n");

		//menampung nilai fibonacci di array temp mulai dari indeks ke-2
		for(int i=2; i<arrTemp.length;i++){
			arrTemp[i] = arrTemp[i-1]+arrTemp[i-2];

			//mencari berapa jumlah bilangan fibonacci yang kurang dari 1000
			if(arrTemp[i] < 1000){
				panjangArrFibo++;
			}
		}

		//membuat array bilFibonacci yang memiliki panjang panjangArrFibo
		bilFibonacci = new int[panjangArrFibo];

		//copy nilai < 1000 dari arrTemp ke bilFibonacci 
		for (int bil : arrTemp) {
			if(bil < 1000){
				bilFibonacci[index]= bil;
				index++;
			}
		}

		//print bilangan fibonacci
		System.out.println("Bilangan fibonacci: ");
		for (int bil : bilFibonacci) {
			System.out.print(bil+" ");

			//mencari bilangan prima yang kurang dari 1000
			for (int i=1;i<=1000 ;i++ ) {
				counter = 0;

				for(int j = 1 ; j <= i ; j++){
					if(i%j == 0){
						counter++;
					}
				}

				//mencari berapa jumlah bilangan prima yang nilainya = nilai di fibonacci
				if(counter == 2 && i == bil){
					panjangArrPrima++;
				}
				//mencari berapa jumlah selain bilangan prima yang nilainya = nilai di fibonacci
				else if(counter !=2 && i==bil){
					panjangArrHB++;
				}
			}
		}

		//membuat array bilPrima, bilHabisBagi yang memiliki panjang panjangArrPrima, panjangArrHB
		bilPrima = new int[panjangArrPrima];
		bilHabisBagi = new int[panjangArrHB];

		//memasukkan nilai bilFibonacci ke array bilPrima dan bilHabisBagi
		for (int bil : bilFibonacci) {

			for (int i=1;i<=1000 ;i++ ) {
				counter = 0;

				for(int j = 1 ; j <= i ; j++){
					if(i%j == 0){
						counter++;
					}
				}

				if(counter == 2 && i == bil){
					bilPrima[indexP]=bil;
					indexP++;
				}
				else if(counter !=2 && i==bil){
					bilHabisBagi[indexHB]=bil;
					indexHB++;
				}
			}
		}

		System.out.println("\nBilangan Primanya:");
		for (int bil : bilPrima) {
			System.out.print(bil+" ");
		}

		System.out.println("\nSelain Bilangan Primanya:");
		for (int bil : bilHabisBagi) {
			System.out.print(bil+" ");
		}		
	}
}