public class TesArray1Irin {

	public static void main( String[] args) {
		int[] number = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int totNum = 0;

		for ( int num : number) { 
			totNum = totNum + num;
			System.out.print(num + " ");
		}
		System.out.println("\n" + "= " + totNum);

		System.out.println("\nNilai rata-rata adalah: " + (totNum/number.length));

		for ( int index=0; index < number.length; index++){
			System.out.print(number[index] + " ");
		}
	}
}