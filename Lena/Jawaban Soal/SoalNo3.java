public class SoalNo3{
	public static void main(String[] args) {
		int [] arrRandom = new int [9];

		for(int i = 0 ; i < 9 ; i++){
			arrRandom[i] = (int) (10 * Math.random());

			System.out.print(arrRandom[i] +" ");
			if((i+1) % 3 == 0){
				System.out.println("");
			}

		}
	}
}