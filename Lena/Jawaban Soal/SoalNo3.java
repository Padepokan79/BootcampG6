public class SoalNo3{
	public static void main(String[] args) {
		int [] arrRandom = new int [9];

		System.out.println("3. Buatlah program untuk menampilkan isi array dalam bentuk persegi 3*3, \n   isi array random (0-9), panjang array 9!\n");
		for(int i = 0 ; i < 9 ; i++){
			arrRandom[i] = (int) (10 * Math.random());

			System.out.print(arrRandom[i] +" ");
			if((i+1) % 3 == 0){
				System.out.println("");
			}

		}
	}
}