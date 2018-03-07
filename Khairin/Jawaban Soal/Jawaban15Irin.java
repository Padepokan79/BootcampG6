/*SOAL 15
Tampilkan hanya bilangan negatif!
int[] numbers = {3, -4, 2, 1, 0, -8, -12, 11, 200, -34, 21};*/

public class Jawaban15Irin {
	public static void main( String[] args ) {
		int[] numbers = {3,-4,2,1,0,-8,-12,11,200,-34,21};
		int[] negatif;
		
		System.out.print("Bilangan pada arr1 adalah: ");
		for ( int num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println("\nBilangan negatif pada arr1 adalah : ");
		for ( int index=0; index < numbers.length; index++){
			if (numbers[index] < 0){
				System.out.print(numbers[index] + " ");
			}
		}
	}		
}